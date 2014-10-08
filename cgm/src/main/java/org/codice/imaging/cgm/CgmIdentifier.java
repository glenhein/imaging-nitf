/*
 * Copyright (c) 2014, Codice
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.codice.imaging.cgm;

/**
 */
public enum CgmIdentifier {
    UNKNOWN(CgmClass.PSEUDO, -1, "UNKNOWN"),
    
    // These can only appear in the METAFILE ELEMENTS LIST
    DRAWING_SET(CgmClass.PSEUDO, 0, "DRAWING SET"),
    DRAWING_PLUS_CONTROL_SET(CgmClass.PSEUDO, 1, "DRAWING SET PLUS CONTROL SET"),
    VERSION_2_SET(CgmClass.PSEUDO, 2, "VERSION 2 SET"),
    EXTENDED_PRIMITIVES_SET(CgmClass.PSEUDO, 3, "EXTENDED PRIMITIVES SET"),
    VERSION_2_GKSM_SET(CgmClass.PSEUDO, 4, "VERSION 2 GKSM SET"),
    VERSION_3_SET(CgmClass.PSEUDO, 5, "VERSION 3 SET"),
    VERSION_4_SET(CgmClass.PSEUDO, 6, "VERSION 4 SET"),

    // Beginning of real elements
    NO_OP(CgmClass.DELIMITER, 0, "no_op"),
    BEGIN_METAFILE(CgmClass.DELIMITER, 1, "BEGIN METAFILE"),
    END_METAFILE(CgmClass.DELIMITER, 2, "END METAFILE"),
    BEGIN_PICTURE(CgmClass.DELIMITER, 3, "BEGIN PICTURE"),
    BEGIN_PICTURE_BODY(CgmClass.DELIMITER, 4, "BEGIN PICTURE BODY"),
    END_PICTURE(CgmClass.DELIMITER, 5, "END PICTURE"),
    BEGIN_SEGMENT(CgmClass.DELIMITER, 6, "BEGIN SEGMENT"),
    END_SEGMENT(CgmClass.DELIMITER, 7, "END SEGMENT"),
    BEGIN_FIGURE(CgmClass.DELIMITER, 8, "BEGIN FIGURE"),
    END_FIGURE(CgmClass.DELIMITER, 9, "END FIGURE"),

    METAFILE_VERSION(CgmClass.METAFILE_DESCRIPTOR, 1, "METAFILE VERSION"),
    METAFILE_DESCRIPTION(CgmClass.METAFILE_DESCRIPTOR, 2, "METAFILE DESCRIPTION"),
    VDC_TYPE(CgmClass.METAFILE_DESCRIPTOR, 3, "VDC TYPE"),
    INTEGER_PRECISION(CgmClass.METAFILE_DESCRIPTOR, 4, "INTEGER PRECISION"),
    REAL_PRECISION(CgmClass.METAFILE_DESCRIPTOR, 5, "REAL PRECISION"),
    COMPLEX_PRECISION(CgmClass.METAFILE_DESCRIPTOR, 6, "COMPLEX PRECISION"),
    COLOUR_PRECISION(CgmClass.METAFILE_DESCRIPTOR, 7, "COLOUR PRECISION"),
    COLOUR_INDEX_PRECISION(CgmClass.METAFILE_DESCRIPTOR, 8, "COLOUR INDEX PRECISION"),
    MAXIMUM_COLOUR_INDEX(CgmClass.METAFILE_DESCRIPTOR, 9, "MAXIMUM COLOUR INDEX"),
    COLOUR_VALUE_EXTENT(CgmClass.METAFILE_DESCRIPTOR, 10, "COLOUR VALUE EXTENT"),
    METAFILE_ELEMENT_LIST(CgmClass.METAFILE_DESCRIPTOR, 11, "METAFILE ELEMENT LIST"),
    METAFILE_DEFAULTS_REPLACEMENT(CgmClass.METAFILE_DESCRIPTOR, 12, "METAFILE DEFAULTS REPLACEMENT"),
    FONT_LIST(CgmClass.METAFILE_DESCRIPTOR, 13, "FONT LIST"),
    
    SCALING_MODE(CgmClass.PICTURE_DESCRIPTOR, 1, "SCALING MODE"),
    COLOUR_SELECTION_MODE(CgmClass.PICTURE_DESCRIPTOR, 2, "COLOUR SELECTION MODE"),
    LINE_WIDTH_SPECIFICATION_MODE(CgmClass.PICTURE_DESCRIPTOR, 3, "LINE WIDTH SPECIFICATION MODE"),
    MARKER_SIZE_SPECIFICATION_MODE(CgmClass.PICTURE_DESCRIPTOR, 4, "MARKER SIZE SPECIFICATION MODE"),
    EDGE_WIDTH_SPECIFICATION_MODE(CgmClass.PICTURE_DESCRIPTOR, 5, "EDGE WIDTH SPECIFICATION MODE"),
    VDC_EXTENT(CgmClass.PICTURE_DESCRIPTOR, 6, "VDC EXTENT"),
    BACKGROUND_COLOUR(CgmClass.PICTURE_DESCRIPTOR, 7, "BACKGROUND COLOUR"),
    DEVICE_VIEWPORT(CgmClass.PICTURE_DESCRIPTOR, 8, "DEVICE VIEWPORT"),
    DEVICE_VIEWPORT_SPECIFICATION_MODE(CgmClass.PICTURE_DESCRIPTOR, 9, "DEVICE VIEWPORT SPECIFICATION MODE"),
    DEVICE_VIEWPORT_MAPPING(CgmClass.PICTURE_DESCRIPTOR, 10, "DEVICE VIEWPORT MAPPING"),
    LINE_REPRESENTATION(CgmClass.PICTURE_DESCRIPTOR, 11, "LINE REPRESENTATION"),
    MARKER_REPRESENTATION(CgmClass.PICTURE_DESCRIPTOR, 12, "MARKER REPRESENTATION"),
    TEXT_REPRESENTATION(CgmClass.PICTURE_DESCRIPTOR, 13, "TEXT REPRESENTATION"),
    FILL_REPRESENTATION(CgmClass.PICTURE_DESCRIPTOR, 14, "FILL REPRESENTATION"),
    EDGE_REPRESENTATION(CgmClass.PICTURE_DESCRIPTOR, 15, "EDGE REPRESENTATION"),
    INTERIOR_STYLE_REPRESENTATION_MODE(CgmClass.PICTURE_DESCRIPTOR, 16, "INTERIOR STYLE REPRESENTATION MODE"),
    LINE_AND_EDGE_TYPE_DEFINITION(CgmClass.PICTURE_DESCRIPTOR, 17, "LINE AND EDGE TYPE DEFINITION"),
    HATCH_STYLE_DEFINITION(CgmClass.PICTURE_DESCRIPTOR, 18, "HATCH STYLE DEFINITION"),
    GEOMETRIC_PATTERN_DEFINITION(CgmClass.PICTURE_DESCRIPTOR, 19, "GEOMETRIC PATTERN DEFINITION"),
    APPLICATION_STRUCTURE_DIRECTORY(CgmClass.PICTURE_DESCRIPTOR, 20, "APPLICATION STRUCTURE DIRECTORY"),
    
    POLYLINE(CgmClass.GRAPHICAL_PRIMITIVE, 1, "POLYLINE"),
    DISJOINT_POLYLINE(CgmClass.GRAPHICAL_PRIMITIVE, 2, "DISJOINT POLYLINE"),
    POLYMARKER(CgmClass.GRAPHICAL_PRIMITIVE, 3, "POLYMARKER"),
    TEXT(CgmClass.GRAPHICAL_PRIMITIVE, 4, "TEXT"),
    RESTRICTED_TEXT(CgmClass.GRAPHICAL_PRIMITIVE, 5, "RESTRICTED TEXT"),
    APPEND_TEXT(CgmClass.GRAPHICAL_PRIMITIVE, 6, "APPEND TEXT"),

    LINE_BUNDLE_INDEX(CgmClass.ATTRIBUTE, 1, "LINE BUNDLE INDEX"),
    LINE_TYPE(CgmClass.ATTRIBUTE, 2, "LINE TYPE"),
    LINE_WIDTH(CgmClass.ATTRIBUTE, 3, "LINE WIDTH"),
    LINE_COLOUR(CgmClass.ATTRIBUTE, 4, "LINE COLOUR"),
    MARKER_BUNDLE_INDEX(CgmClass.ATTRIBUTE, 5, "MARKER BUNDLE INDEX"),
    MARKER_TYPE(CgmClass.ATTRIBUTE, 6, "MARKER TYPE"),
    MARKER_SIZE(CgmClass.ATTRIBUTE, 7, "MARKER SIZE"),
    MARKER_COLOUR(CgmClass.ATTRIBUTE, 8, "MARKER COLOUR"),
    TEXT_BUNDLE_INDEX(CgmClass.ATTRIBUTE, 9, "TEXT BUNDLE INDEX"),
    TEXT_FONT_INDEX(CgmClass.ATTRIBUTE, 10, "TEXT FONT INDEX"),
    TEXT_PRECISION(CgmClass.ATTRIBUTE, 11, "TEXT PRECISION"),
    CHARACTER_EXPANSION_FACTOR(CgmClass.ATTRIBUTE, 12, "CHARACTER EXPANSION FACTOR"),
    CHARACTER_SPACING(CgmClass.ATTRIBUTE, 13, "CHARACTER SPACING"),
    TEXT_COLOUR(CgmClass.ATTRIBUTE, 14, "TEXT COLOUR"),
    CHARACTER_HEIGHT(CgmClass.ATTRIBUTE, 15, "CHARACTER HEIGHT"),
    CHARACTER_ORIENTATION(CgmClass.ATTRIBUTE, 16, "CHARACTER ORIENTATION"),
    TEXT_PATH(CgmClass.ATTRIBUTE, 17, "TEXT PATH"),
    TEXT_ALIGNMENT(CgmClass.ATTRIBUTE, 18, "TEXT ALIGNMENT");

    private final CgmClass classId;
    private final int id;
    private final String friendlyName;
    // clear text encoding?

    /**
     * Constructor
     */
     CgmIdentifier(final CgmClass classIdentifier, final int identifier, final String label) {
        classId = classIdentifier;
        id = identifier;
        friendlyName = label;
    }

    static CgmIdentifier findIdentifier(int elementClass, int elementId) {
        for (CgmIdentifier cgmIdentifier : values()) {
            if ((cgmIdentifier.classId.getClassIdentifier() == elementClass) && (cgmIdentifier.id == elementId)) {
                return cgmIdentifier;
            }
        }
        return UNKNOWN;
    }

    CgmClass getClassIdentifier() {
        return classId;
    }

    int getElementIdentifier() {
        return id;
    }

    String getFriendlyName() {
        return friendlyName;
    }

}
