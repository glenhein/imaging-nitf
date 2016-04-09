/*
 * Copyright (c) Codice Foundation
 *
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 *
 */
package org.codice.imaging.nitf.core.tre;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.List;
import org.codice.imaging.nitf.core.SlottedParseStrategy;
import org.codice.imaging.nitf.core.common.NitfFormatException;
import org.codice.imaging.nitf.core.common.NitfInputStreamReader;
import org.codice.imaging.nitf.core.common.NitfReader;
import org.codice.imaging.nitf.core.header.NitfHeader;
import org.codice.imaging.nitf.core.header.NitfParser;
import org.codice.imaging.nitf.core.image.ImageSegment;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * This checks the parsing of ENGRDA TRE.
 */
public class ENGRDA_Test {

    public ENGRDA_Test() {
    }

    @Test
    public void testGreen2007Parse() throws NitfFormatException {
        SlottedParseStrategy parseStrategy = new SlottedParseStrategy();
        NitfReader reader = new NitfInputStreamReader(new BufferedInputStream(getInputStream()));
        NitfParser.parse(reader, parseStrategy);

        NitfHeader nitfHeader = parseStrategy.getNitfHeader();
        assertEquals(1, parseStrategy.getDataSource().getImageSegments().size());
        assertEquals(0, parseStrategy.getDataSource().getGraphicSegments().size());
        assertEquals(0, parseStrategy.getDataSource().getSymbolSegments().size());
        assertEquals(0, parseStrategy.getDataSource().getLabelSegments().size());
        assertEquals(0, parseStrategy.getDataSource().getTextSegments().size());
        assertEquals(0, parseStrategy.getDataSource().getDataExtensionSegments().size());

        assertEquals(0, nitfHeader.getTREsRawStructure().getUniqueNamesOfTRE().size());

        ImageSegment imageSegment = parseStrategy.getDataSource().getImageSegments().get(0);
        assertEquals(2, imageSegment.getTREsRawStructure().getTREs().size());

        List<Tre> engrdaTres = imageSegment.getTREsRawStructure().getTREsWithName("ENGRDA");
        assertEquals(1, engrdaTres.size());
        Tre engrdaTre = engrdaTres.get(0);
        // Check it parsed - raw data only used for unparsed TREs.
        assertNull(engrdaTre.getRawData());
        // Check values
        assertEquals("ENGRDA", engrdaTre.getName());
        assertEquals(3, engrdaTre.getEntries().size());
        assertEquals("LAIR                ", engrdaTre.getFieldValue("RESRC"));
        assertEquals(16, engrdaTre.getIntValue("RECNT"));
        assertEquals(16, engrdaTre.getEntry("RECORDS").getGroups().size());
        TreGroup group15 = engrdaTre.getEntry("RECORDS").getGroups().get(15);
        assertEquals("milliseconds", group15.getFieldValue("ENGLBL"));
        assertEquals(3, group15.getIntValue("ENGMTXC"));
        assertEquals(1, group15.getIntValue("ENGMTXR"));
        assertEquals("A", group15.getFieldValue("ENGTYP"));
        assertEquals(1, group15.getIntValue("ENGDTS"));
        assertEquals("NA", group15.getFieldValue("ENGDTU"));
        assertEquals("170", group15.getFieldValue("ENGDATA"));
    }

    private InputStream getInputStream() {
        final String greenFile = "/Green2007/TimeStep103243.ntf.r0";

        assertNotNull("Test file missing", getClass().getResource(greenFile));

        return getClass().getResourceAsStream(greenFile);
    }

}