package org.jnode.fs.xfs;

import java.nio.ByteBuffer;

import org.jmock.Expectations;
import org.jmock.api.Invocation;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.jmock.lib.action.CustomAction;
import org.jnode.driver.block.FSBlockDeviceAPI;
import org.jnode.partitions.PartitionTableEntry;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class XfsFileSystemTypeTest
{
    @Rule
    public final JUnitRuleMockery mockery = new JUnitRuleMockery();

    @Mock
    FSBlockDeviceAPI fsBlockDeviceAPI;

    @Mock
    PartitionTableEntry partitionTableEntry;

    @Test
    public void testSupports() throws Exception
    {
        mockery.checking(new Expectations()
        {{
            oneOf(fsBlockDeviceAPI).read(with(any(long.class)), with(any(ByteBuffer.class)));
            will(new CustomAction("read data from file")
            {
                @Override
                public Object invoke(Invocation invocation) throws Throwable
                {
                    Long offset = (Long) invocation.getParameter(0);
                    ByteBuffer buffer = (ByteBuffer) invocation.getParameter(1);

                    // TODO: actually read data from the file and pass to buffer
                    assertThat(offset, is(0L));
                    buffer.putInt((int) Superblock.XFS_SUPER_MAGIC);

                    return null;
                }
            });
        }});

        XfsFileSystemType type = new XfsFileSystemType();
        byte[] buffer = new byte[512];
        assertThat(type.supports(partitionTableEntry, buffer, fsBlockDeviceAPI), is(true));
    }

}