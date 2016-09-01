/*
 * $Id$
 *
 * Copyright (C) 2003-2015 JNode.org
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public 
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; If not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
 
package org.jnode.awt;

import org.jnode.driver.video.HardwareCursor;
import org.jnode.driver.video.HardwareCursorImage;

/**
 * @author Ewout Prangsma (epr@users.sourceforge.net)
 */
public class JNodeCursors {

    private static final String ARROW_IMAGE_16x16 =
        "BBTTTTTTTTTTTTTT" +
            "BWBTTTTTTTTTTTTT" +
            "BWWBTTTTTTTTTTTT" +
            "BWWWBTTTTTTTTTTT" +
            "BWWWWBTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTT" +
            "BWWWWWWBTTTTTTTT" +
            "BWWWWWWWBTTTTTTT" +
            "BWWWWWWWWBTTTTTT" +
            "BWWWWWWWWWBTTTTT" +
            "BWWWWWBBBBBTTTTT" +
            "BWWBWWWBTTTTTTTT" +
            "BWBTBWWBTTTTTTTT" +
            "BBTTBWWWBTTTTTTT" +
            "TTTTTBWWBTTTTTTT" +
            "TTTTTBBBTTTTTTTT";

    private static HardwareCursorImage ARROW_16x16 = new HardwareCursorImage(16, 16, ARROW_IMAGE_16x16, 0, 0);

    private static final String ARROW_IMAGE_20x20 =
        "BTTTTTTTTTTTTTTTTTTT" +
            "BBTTTTTTTTTTTTTTTTTT" +
            "BWBTTTTTTTTTTTTTTTTT" +
            "BWWBTTTTTTTTTTTTTTTT" +
            "BWWWBTTTTTTTTTTTTTTT" +
            "BWWWWBTTTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTT" +
            "BWWWWWWWBTTTTTTTTTTT" +
            "BWWWWWWWWBTTTTTTTTTT" +
            "BWWWWWWWWWBTTTTTTTTT" +
            "BWWWWWWWWWWBTTTTTTTT" +
            "BWWWWWWBBBBBTTTTTTTT" +
            "BWWWBWWBTTTTTTTTTTTT" +
            "BWWBTBWWBTTTTTTTTTTT" +
            "BWBTTBWWBTTTTTTTTTTT" +
            "BBTTTTBWWBTTTTTTTTTT" +
            "TTTTTTBWWBTTTTTTTTTT" +
            "TTTTTTTBBTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage ARROW_20x20 = new HardwareCursorImage(20, 20, ARROW_IMAGE_20x20, 0, 0);

    private static final String ARROW_IMAGE_32x32 =
        "BTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BBTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWBTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWBTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWBTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWBTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWBTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWBTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWBBBBBTTTTTTTTTTTTTTTTTTTT" +
            "BWWWBWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWBTBWWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWBTTBWWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "BBTTTTBWWBTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWWBTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTBBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";
    private static HardwareCursorImage ARROW_32x32 = new HardwareCursorImage(32, 32, ARROW_IMAGE_32x32, 0, 0);
    public static HardwareCursor ARROW =
        new HardwareCursor(new HardwareCursorImage[]{ARROW_16x16, ARROW_20x20, ARROW_32x32});

/*
    private static final String ARROW_IMAGE_16x16 =
            "BTTTTTTTTTTTTTTT" +
            "BBTTTTTTTTTTTTTT" +
            "BWBTTTTTTTTTTTTT" +
            "BWWBTTTTTTTTTTTT" +
            "BWWWBTTTTTTTTTTT" +
            "BWWWWBTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTT" +
            "BWWWWWWBTTTTTTTT" +
            "BWWWWWWWBTTTTTTT" +
            "BWWWWBBBBTTTTTTT" +
            "BWWBWBTTTTTTTTTT" +
            "BWBTBWBTTTTTTTTT" +
            "BBTTBWBTTTTTTTTT" +
            "TTTTTBWBTTTTTTTT" +
            "TTTTTBWBTTTTTTTT" +
            "TTTTTTBTTTTTTTTT";

    private static final String ARROW_IMAGE_32x32 =
        "BTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
        "BBTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
        "BWBTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
        "BWWBTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
        "BWWWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
        "BWWWWBTTTTTTTTTTTTTTTTTTTTTTTTTT" +
        "BWWWWWBTTTTTTTTTTTTTTTTTTTTTTTTT" +
        "BWWWWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
        "BWWWWWWWBTTTTTTTTTTTTTTTTTTTTTTT" +
        "BWWWWWWWWBTTTTTTTTTTTTTTTTTTTTTT" +
        "BWWWWWWWWWBTTTTTTTTTTTTTTTTTTTTT" +
        "BWWWWWWWWWWBTTTTTTTTTTTTTTTTTTTT" +
        "BWWWWWWWWWWWBTTTTTTTTTTTTTTTTTTT" +
        "BWWWWWWWWWWWWBTTTTTTTTTTTTTTTTTT" +
        "BWWWWWWWWWWWWWBTTTTTTTTTTTTTTTTT" +
        "BWWWWWWWWWWWWWWBTTTTTTTTTTTTTTTT" +
        "BWWWWWWWWWWWWWWWBTTTTTTTTTTTTTTT" +
        "BWWWWWWWWWWWWWWWWBTTTTTTTTTTTTTT" +
        "BWWWWWWWWWWWWWWWWWBTTTTTTTTTTTTT" +
        "BWWWWWWWWWWWWWWWWWWBTTTTTTTTTTTT" +
        "BWWWWWWWWWWWWWWWWWWWBTTTTTTTTTTT" +
        "BWWWWWWWWWWWWWWWWWWWWBTTTTTTTTTT" +
        "BWWWWWWWWWWWWWWWWWWWWWBTTTTTTTTT" +
        "BWWWWWWWWWWWWWBBBBBBBBBBTTTTTTTT" +
        "BWWWWWBBWWWWWWWBTTTTTTTTTTTTTTTT" +
        "BWWWWBTBWWWWWWWBTTTTTTTTTTTTTTTT" +
        "BWWWBTTTBWWWWWWWBTTTTTTTTTTTTTTT" +
        "BWWBTTTTBWWWWWWWBTTTTTTTTTTTTTTT" +
        "BWBTTTTTTBWWWWWWWBTTTTTTTTTTTTTT" +
        "BBTTTTTTTBWWWWWWWBTTTTTTTTTTTTTT" +
        "BTTTTTTTTTBWWWWBBBBTTTTTTTTTTTTT" +
        "TTTTTTTTTTBBBBBBTTTTTTTTTTTTTTTT";
    */
/*
    private static final String ARROW_IMAGE_16x16 =
        "BBTTTTTTTTTTTTTT" +
            "BWBTTTTTTTTTTTTT" +
            "BWWBTTTTTTTTTTTT" +
            "BWWWBTTTTTTTTTTT" +
            "BWWWWBTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTT" +
            "BWWWWWWBTTTTTTTT" +
            "BWWWWWWWBTTTTTTT" +
            "BWWWWWWWWBTTTTTT" +
            "BWWWWWWWWWBTTTTT" +
            "BWWBWWWBBBBBTTTT" +
            "BWBTBWWBTTTTTTTT" +
            "BBTTTBWWBTTTTTTT" +
            "TTTTTTBWWBTTTTTT" +
            "TTTTTTTBWWBTTTTT" +
            "TTTTTTTTBBBTTTTT";

    private static final String ARROW_IMAGE_32x32 =
        "BTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BBTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWBTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWBTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWBTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWBTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWBTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWBTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWBTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWBTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWBTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWWBTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWWWBTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWWWWBTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWWWWWBTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWWWWWWBTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWWWWWWWBTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWWWWWWWWBTTTTTTTTTT" +
            "BWWWWWWWWWWWWWWWWWWWWWBTTTTTTTTT" +
            "BWWWWWWBWWWWWWBBBBBBBBBBTTTTTTTT" +
            "BWWWWWBTBWWWWWWBTTTTTTTTTTTTTTTT" +
            "BWWWWBTTTBWWWWWWBTTTTTTTTTTTTTTT" +
            "BWWWBTTTTTBWWWWWWBTTTTTTTTTTTTTT" +
            "BWWBTTTTTTTBWWWWWWBTTTTTTTTTTTTT" +
            "BWBTTTTTTTTTBWWWWWWBTTTTTTTTTTTT" +
            "BBTTTTTTTTTTTBWWWWWWBTTTTTTTTTTT" +
            "BTTTTTTTTTTTTTBWWWWWWBTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTBBBBBBBBTTTTTTTTT";
*/
    /*
    private static final String ARROW_IMAGE_16x16 =
        "BBTTTTTTTTTTTTTT" +
        "BWBTTTTTTTTTTTTT" +
        "BWBTTTTTTTTTTTTT" +
        "BWWBTTTTTTTTTTTT" +
        "BWWBTTTTTTTTTTTT" +
        "BWWWBTTTTTTTTTTT" +
        "BWWWBTTTTTTTTTTT" +
        "BWWWWBTTTTTTTTTT" +
        "BWWWWBTTTTTTTTTT" +
        "BWWWBTTTTTTTTTTT" +
        "BWWBTTTTTTTTTTTT" +
        "BWWBTTTTTTTTTTTT" +
        "TBWWBTTTTTTTTTTT" +
        "TBWWBTTTTTTTTTTT" +
        "TTBWBTTTTTTTTTTT" +
        "TTBBTTTTTTTTTTTT";

    private static final int[] ARROW_IMAGE_32x32 = {
        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT,
        BTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT,
        BBTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT,
        BWBTTTTTTTTTTTTTTTTTTTTTTTTTTTTT,
        BWWBTTTTTTTTTTTTTTTTTTTTTTTTTTTT,
        BWWWBTTTTTTTTTTTTTTTTTTTTTTTTTTT,
        BWWWWBTTTTTTTTTTTTTTTTTTTTTTTTTT,
        BWWWWWBTTTTTTTTTTTTTTTTTTTTTTTTT,
        BWWWWWWBTTTTTTTTTTTTTTTTTTTTTTTT,
        BWWWWWWWBTTTTTTTTTTTTTTTTTTTTTTT,
        BWWWWWWWWBTTTTTTTTTTTTTTTTTTTTTT,
        BWWWWWWWWWBTTTTTTTTTTTTTTTTTTTTT,
        BWWWWWWWWWWBTTTTTTTTTTTTTTTTTTTT,
        BWWWWWWWWWWWBTTTTTTTTTTTTTTTTTTT,
        BWWWWWWWWWWWWBTTTTTTTTTTTTTTTTTT,
        BWWWWWWWWWWWWWBTTTTTTTTTTTTTTTTT,
        BWWWWWWWWWWWWWWBTTTTTTTTTTTTTTTT,
        BWWWWWWWWWWWWWWWBTTTTTTTTTTTTTTT,
        BWWWWWWWWBBBBBBBBBTTTTTTTTTTTTTT,
        BWWWWBWWWBTTTTTTTTTTTTTTTTTTTTTT,
        BWWWBTBWWWBTTTTTTTTTTTTTTTTTTTTT,
        BWWBTTBWWWBTTTTTTTTTTTTTTTTTTTTT,
        BWBTTTTBWWWBTTTTTTTTTTTTTTTTTTTT,
        BBTTTTTBWWWBTTTTTTTTTTTTTTTTTTTT,
        BTTTTTTTBWWWBTTTTTTTTTTTTTTTTTTT,
        TTTTTTTTBWWWBTTTTTTTTTTTTTTTTTTT,
        TTTTTTTTTBWWWBTTTTTTTTTTTTTTTTTT,
        TTTTTTTTTBWWWBTTTTTTTTTTTTTTTTTT,
        TTTTTTTTTTBWWWBTTTTTTTTTTTTTTTTT,
        TTTTTTTTTTBWWWBTTTTTTTTTTTTTTTTT,
        TTTTTTTTTTTBBBTTTTTTTTTTTTTTTTTT,
        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT,
    };
    */


    private static final String HAND_IMAGE_20x20 =
        "TTTTTBBTTTTTTTTTTTTT" +
            "TTTTBWWBTTTTTTTTTTTT" +
            "TTTTBWWBTTTTTTTTTTTT" +
            "TTTTBWWBTTTTTTTTTTTT" +
            "TTTTBWWBTTTTTTTTTTTT" +
            "TTTTBWWBBBTTTTTTTTTT" +
            "TTTTBWWBWWBBBTTTTTTT" +
            "TTTTBWWBWWBWWBBTTTTT" +
            "TTTTBWWBWWBWWBWBTTTT" +
            "TBBTBWWBWWBWWBWWBTTT" +
            "BWWBBWWBWWBWWBWWBTTT" +
            "BWWWBWWBWWBWWBWWBTTT" +
            "TBWWBWWWWWWWWBWWBTTT" +
            "TTBWWWWWWWWWWWWWBTTT" +
            "TTBWWWWWWWWWWWWWBTTT" +
            "TTBWWWWWWWWWWWWBTTTT" +
            "TTTBWWWWWWWWWWWBTTTT" +
            "TTTBWWWWWWWWWWBTTTTT" +
            "TTTTBWWWWWWWWWBTTTTT" +
            "TTTTBBBBBBBBBBBTTTTT";

    private static HardwareCursorImage HAND_20x20 = new HardwareCursorImage(20, 20, HAND_IMAGE_20x20, 5, 0);

    private static final String HAND_IMAGE_32x32 =
        "TTTTTBBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWWBBBTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWWBWWBBBTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWWBWWBWWBBTTTTTTTTTTTTTTTTT" +
            "TTTTBWWBWWBWWBWBTTTTTTTTTTTTTTTT" +
            "TBBTBWWBWWBWWBWWBTTTTTTTTTTTTTTT" +
            "BWWBBWWBWWBWWBWWBTTTTTTTTTTTTTTT" +
            "BWWWBWWBWWBWWBWWBTTTTTTTTTTTTTTT" +
            "TBWWBWWWWWWWWBWWBTTTTTTTTTTTTTTT" +
            "TTBWWWWWWWWWWWWWBTTTTTTTTTTTTTTT" +
            "TTBWWWWWWWWWWWWWBTTTTTTTTTTTTTTT" +
            "TTBWWWWWWWWWWWWBTTTTTTTTTTTTTTTT" +
            "TTTBWWWWWWWWWWWBTTTTTTTTTTTTTTTT" +
            "TTTBWWWWWWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTBWWWWWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTBBBBBBBBBBBTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage HAND_32x32 = new HardwareCursorImage(32, 32, HAND_IMAGE_32x32, 5, 0);
    public static HardwareCursor HAND = new HardwareCursor(new HardwareCursorImage[]{HAND_20x20, HAND_32x32});

    private static final String RESIZE_HORIZONTAL_IMAGE_16x16 =
        "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTBBTTTTTTBBTTT" +
            "TTBWBTTTTTTBWBTT" +
            "TBWWBBBBBBBBWWBT" +
            "BWWWWWWWWWWWWWWB" +
            "TBWWBBBBBBBBWWBT" +
            "TTBWBTTTTTTBWBTT" +
            "TTTBBTTTTTTBBTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT";

    private static HardwareCursorImage RESIZE_HORIZONTAL_16x16 =
        new HardwareCursorImage(16, 16, RESIZE_HORIZONTAL_IMAGE_16x16, 7, 7);

    private static final String RESIZE_HORIZONTAL_IMAGE_20x20 =
        "TTTTTBBTTTTTBBTTTTTT" +
            "TTTTBWBTTTTTBWBTTTTT" +
            "TTTBWWBTTTTTBWWBTTTT" +
            "TTBWWWBBBBBBBWWWBTTT" +
            "TBWWWWWWWWWWWWWWWBTT" +
            "BWWWWWWWWWWWWWWWWWBT" +
            "TBWWWWWWWWWWWWWWWBTT" +
            "TTBWWWBBBBBBBWWWBTTT" +
            "TTTBWWBTTTTTBWWBTTTT" +
            "TTTTBWBTTTTTBWBTTTTT" +
            "TTTTTBBTTTTTBBTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage RESIZE_HORIZONTAL_20x20 =
        new HardwareCursorImage(20, 20, RESIZE_HORIZONTAL_IMAGE_20x20, 9, 5);

    private static final String RESIZE_HORIZONTAL_IMAGE_32x32 =
        "TTTTTBBTTTTTBBTTTTTTTTTTTTTTTTTT" +
            "TTTTBWBTTTTTBWBTTTTTTTTTTTTTTTTT" +
            "TTTBWWBTTTTTBWWBTTTTTTTTTTTTTTTT" +
            "TTBWWWBBBBBBBWWWBTTTTTTTTTTTTTTT" +
            "TBWWWWWWWWWWWWWWWBTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWWWWWBTTTTTTTTTTTTT" +
            "TBWWWWWWWWWWWWWWWBTTTTTTTTTTTTTT" +
            "TTBWWWBBBBBBBWWWBTTTTTTTTTTTTTTT" +
            "TTTBWWBTTTTTBWWBTTTTTTTTTTTTTTTT" +
            "TTTTBWBTTTTTBWBTTTTTTTTTTTTTTTTT" +
            "TTTTTBBTTTTTBBTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage RESIZE_HORIZONTAL_32x32 =
        new HardwareCursorImage(32, 32, RESIZE_HORIZONTAL_IMAGE_32x32, 9, 5);
    public static HardwareCursor RESIZE_HORIZONTAL = new HardwareCursor(
        new HardwareCursorImage[]{RESIZE_HORIZONTAL_16x16, RESIZE_HORIZONTAL_20x20, RESIZE_HORIZONTAL_32x32});

    private static final String RESIZE_VERTICAL_IMAGE_20x20 =
        "TTTTTBTTTTTTTTTTTTTT" +
            "TTTTBWBTTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTT" +
            "TTBWWWWWBTTTTTTTTTTT" +
            "TBWWWWWWWBTTTTTTTTTT" +
            "BWWWWWWWWWBTTTTTTTTT" +
            "BBBBWWWBBBBTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTT" +
            "BBBBWWWBBBBTTTTTTTTT" +
            "BWWWWWWWWWBTTTTTTTTT" +
            "TBWWWWWWWBTTTTTTTTTT" +
            "TTBWWWWWBTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTT" +
            "TTTTBWBTTTTTTTTTTTTT" +
            "TTTTTBTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage RESIZE_VERTICAL_20x20 =
        new HardwareCursorImage(20, 20, RESIZE_VERTICAL_IMAGE_20x20, 5, 9);

    private static final String RESIZE_VERTICAL_IMAGE_32x32 =
        "TTTTTBTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWWWWWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TBWWWWWWWBTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWBTTTTTTTTTTTTTTTTTTTTT" +
            "BBBBWWWBBBBTTTTTTTTTTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BBBBWWWBBBBTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWBTTTTTTTTTTTTTTTTTTTTT" +
            "TBWWWWWWWBTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWWWWWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTBWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTBTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage RESIZE_VERTICAL_32x32 =
        new HardwareCursorImage(32, 32, RESIZE_VERTICAL_IMAGE_32x32, 5, 9);
    public static HardwareCursor RESIZE_VERTICAL =
        new HardwareCursor(new HardwareCursorImage[]{RESIZE_VERTICAL_20x20, RESIZE_VERTICAL_32x32});


    private static final String RESIZE_NORTHWEST_IMAGE_20x20 =
        "BBBBBBBBBTTTTTTTTTTT" +
            "BWWWWWWWBTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTT" +
            "BWWWWWWWBTTTTTTTTTTT" +
            "BWWBWWWWWBTTTBBTTTTT" +
            "BWBTBWWWWWBTBWBTTTTT" +
            "BBTTTBWWWWWBWWBTTTTT" +
            "TTTTTTBWWWWWWWBTTTTT" +
            "TTTTTTTBWWWWWWBTTTTT" +
            "TTTTTTTTBWWWWWBTTTTT" +
            "TTTTTTTBWWWWWWBTTTTT" +
            "TTTTTTBWWWWWWWBTTTTT" +
            "TTTTTTBBBBBBBBBTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage RESIZE_NORTHWEST_20x20 =
        new HardwareCursorImage(20, 20, RESIZE_NORTHWEST_IMAGE_20x20, 7, 7);

    private static final String RESIZE_NORTHWEST_IMAGE_32x32 =
        "BBBBBBBBBTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWBWWWWWBTTTBBTTTTTTTTTTTTTTTTT" +
            "BWBTBWWWWWBTBWBTTTTTTTTTTTTTTTTT" +
            "BBTTTBWWWWWBWWBTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWWWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTTTTBWWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTBWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTTTTBWWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWWWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTTTBBBBBBBBBTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage RESIZE_NORTHWEST_32x32 =
        new HardwareCursorImage(32, 32, RESIZE_NORTHWEST_IMAGE_32x32, 7, 7);
    public static HardwareCursor RESIZE_NORTHWEST =
        new HardwareCursor(new HardwareCursorImage[]{RESIZE_NORTHWEST_20x20, RESIZE_NORTHWEST_32x32});

    private static final String RESIZE_NORTHEAST_IMAGE_20x20 =
        "TTTTTTBBBBBBBBBTTTTT" +
            "TTTTTTBWWWWWWWBTTTTT" +
            "TTTTTTTBWWWWWWBTTTTT" +
            "TTTTTTTTBWWWWWBTTTTT" +
            "TTTTTTTBWWWWWWBTTTTT" +
            "TTTTTTBWWWWWWWBTTTTT" +
            "BBTTTBWWWWWBWWBTTTTT" +
            "BWBTBWWWWWBTBWBTTTTT" +
            "BWWBWWWWWBTTTBBTTTTT" +
            "BWWWWWWWBTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTT" +
            "BWWWWWWWBTTTTTTTTTTT" +
            "BBBBBBBBBTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage RESIZE_NORTHEAST_20x20 =
        new HardwareCursorImage(20, 20, RESIZE_NORTHEAST_IMAGE_20x20, 7, 7);

    private static final String RESIZE_NORTHEAST_IMAGE_32x32 =
        "TTTTTTBBBBBBBBBTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWWWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTTTTBWWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTBWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTTTTBWWWWWWBTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWWWWWWWBTTTTTTTTTTTTTTTTT" +
            "BBTTTBWWWWWBWWBTTTTTTTTTTTTTTTTT" +
            "BWBTBWWWWWBTBWBTTTTTTTTTTTTTTTTT" +
            "BWWBWWWWWBTTTBBTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWBTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "BBBBBBBBBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage RESIZE_NORTHEAST_32x32 =
        new HardwareCursorImage(32, 32, RESIZE_NORTHEAST_IMAGE_32x32, 7, 7);
    public static HardwareCursor RESIZE_NORTHEAST =
        new HardwareCursor(new HardwareCursorImage[]{RESIZE_NORTHEAST_20x20, RESIZE_NORTHEAST_32x32});

    private static final String TEXT_IMAGE_20x20 =
        "BBBBBBBTTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTT" +
            "BBBWBBBTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTT" +
            "BBBWBBBTTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTT" +
            "BBBBBBBTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage TEXT_20x20 = new HardwareCursorImage(20, 20, TEXT_IMAGE_20x20, 3, 7);

    private static final String TEXT_IMAGE_32x32 =
        "BBBBBBBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BBBWBBBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTBWBTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BBBWBBBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BWWWWWBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "BBBBBBBTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage TEXT_32x32 = new HardwareCursorImage(32, 32, TEXT_IMAGE_32x32, 3, 7);
    public static HardwareCursor TEXT = new HardwareCursor(new HardwareCursorImage[]{TEXT_20x20, TEXT_32x32});

    private static final String CROSSHAIR_IMAGE_20x20 =
        "TTTTTTBBBTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTT" +
            "BBBBBBBWBBBBBBBTTTTT" +
            "BWWWWWWWWWWWWWBTTTTT" +
            "BBBBBBBWBBBBBBBTTTTT" +
            "TTTTTTBWBTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTT" +
            "TTTTTTBBBTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage CROSSHAIR_20x20 = new HardwareCursorImage(20, 20, CROSSHAIR_IMAGE_20x20, 7, 7);

    private static final String CROSSHAIR_IMAGE_32x32 =
        "TTTTTTBBBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "BBBBBBBWBBBBBBBTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWBTTTTTTTTTTTTTTTTT" +
            "BBBBBBBWBBBBBBBTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBBBTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage CROSSHAIR_32x32 = new HardwareCursorImage(32, 32, CROSSHAIR_IMAGE_32x32, 7, 7);
    public static HardwareCursor CROSSHAIR =
        new HardwareCursor(new HardwareCursorImage[]{CROSSHAIR_20x20, CROSSHAIR_32x32});

    private static final String MOVE_IMAGE_20x20 =
        "TTTTTTTTTBTTTTTTTTTT" +
            "TTTTTTTTBWBTTTTTTTTT" +
            "TTTTTTTBWWWBTTTTTTTT" +
            "TTTTTTBWWWWWBTTTTTTT" +
            "TTTTTTBBBWBBBTTTTTTT" +
            "TTTTTTTTBWBTTTTTTTTT" +
            "TTTBBTTTBWBTTTBBTTTT" +
            "TTBWBTTTBWBTTTBWBTTT" +
            "TBWWBBBBBWBBBBBWWBTT" +
            "BWWWWWWWWWWWWWWWWWBT" +
            "TBWWBBBBBWBBBBBWWBTT" +
            "TTBWBTTTBWBTTTBWBTTT" +
            "TTTBBTTTBWBTTTBBTTTT" +
            "TTTTTTTTBWBTTTTTTTTT" +
            "TTTTTTBBBWBBBTTTTTTT" +
            "TTTTTTBWWWWWBTTTTTTT" +
            "TTTTTTTBWWWBTTTTTTTT" +
            "TTTTTTTTBWBTTTTTTTTT" +
            "TTTTTTTTTBTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage MOVE_20x20 = new HardwareCursorImage(20, 20, MOVE_IMAGE_20x20, 9, 9);

    private static final String MOVE_IMAGE_32x32 =
        "TTTTTTTTTBTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTBWBTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTBWWWBTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWWWWWBTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBBBWBBBTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTBWBTTTTTTTTTTTTTTTTTTTTT" +
            "TTTBBTTTBWBTTTBBTTTTTTTTTTTTTTTT" +
            "TTBWBTTTBWBTTTBWBTTTTTTTTTTTTTTT" +
            "TBWWBBBBBWBBBBBWWBTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWWWWWBTTTTTTTTTTTTT" +
            "TBWWBBBBBWBBBBBWWBTTTTTTTTTTTTTT" +
            "TTBWBTTTBWBTTTBWBTTTTTTTTTTTTTTT" +
            "TTTBBTTTBWBTTTBBTTTTTTTTTTTTTTTT" +
            "TTTTTTTTBWBTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBBBWBBBTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTBWWWWWBTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTBWWWBTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTBWBTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTBTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage MOVE_32x32 = new HardwareCursorImage(32, 32, MOVE_IMAGE_32x32, 9, 9);
    public static HardwareCursor MOVE = new HardwareCursor(new HardwareCursorImage[]{MOVE_20x20, MOVE_32x32});

    private static final String WAIT_IMAGE_20x20 =
        "TBBBBBBBBBBBBBTTTTTT" +
            "BWWWWWWWWWWWWWBTTTTT" +
            "TBWWWWWWWWWWWBTTTTTT" +
            "TBWWWWWWWWWWWBTTTTTT" +
            "TTBWWWWWWWWWBTTTTTTT" +
            "TTBWBWBWBWBWBTTTTTTT" +
            "TTTBWBWBWBWBTTTTTTTT" +
            "TTTTBWBWBWBTTTTTTTTT" +
            "TTTTTBBWBBTTTTTTTTTT" +
            "TTTTBWWBWWBTTTTTTTTT" +
            "TTTBWWWBWWWBTTTTTTTT" +
            "TTBWWWBWBWWWBTTTTTTT" +
            "TTBWWBWBWBWWBTTTTTTT" +
            "TBWWBWBWBWBWWBTTTTTT" +
            "TBWBWBWBWBWBWBTTTTTT" +
            "BWBWBWBWBWBWBWBTTTTT" +
            "TBBBBBBBBBBBBBTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage WAIT_20x20 = new HardwareCursorImage(20, 20, WAIT_IMAGE_20x20, 7, 8);

    private static final String WAIT_IMAGE_32x32 =
        "TBBBBBBBBBBBBBTTTTTTTTTTTTTTTTTT" +
            "BWWWWWWWWWWWWWBTTTTTTTTTTTTTTTTT" +
            "TBWWWWWWWWWWWBTTTTTTTTTTTTTTTTTT" +
            "TBWWWWWWWWWWWBTTTTTTTTTTTTTTTTTT" +
            "TTBWWWWWWWWWBTTTTTTTTTTTTTTTTTTT" +
            "TTBWBWBWBWBWBTTTTTTTTTTTTTTTTTTT" +
            "TTTBWBWBWBWBTTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWBWBWBTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTBBWBBTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTBWWBWWBTTTTTTTTTTTTTTTTTTTTT" +
            "TTTBWWWBWWWBTTTTTTTTTTTTTTTTTTTT" +
            "TTBWWWBWBWWWBTTTTTTTTTTTTTTTTTTT" +
            "TTBWWBWBWBWWBTTTTTTTTTTTTTTTTTTT" +
            "TBWWBWBWBWBWWBTTTTTTTTTTTTTTTTTT" +
            "TBWBWBWBWBWBWBTTTTTTTTTTTTTTTTTT" +
            "BWBWBWBWBWBWBWBTTTTTTTTTTTTTTTTT" +
            "TBBBBBBBBBBBBBTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";

    private static HardwareCursorImage WAIT_32x32 = new HardwareCursorImage(32, 32, WAIT_IMAGE_32x32, 7, 8);
    public static HardwareCursor WAIT = new HardwareCursor(new HardwareCursorImage[]{WAIT_20x20, WAIT_32x32});

    // --- Templates ---
    /*
    private static final String EMPTY_IMAGE_16x16 =
        "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTT";

    private static final String EMPTY_IMAGE_20x20 =
        "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTT";

    private static final String EMPTY_IMAGE_32x32 =
        "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";
    */
}
