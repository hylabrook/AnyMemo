package org.liberty.android.fantastischmemo.test.converter;

import org.liberty.android.fantastischmemo.converter.Converter;
import org.liberty.android.fantastischmemo.converter.MnemosyneXMLExporter;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class MnemosyneXMLExporterTest extends AbstractConverterTest {

    @Override
    protected Converter getConverter() {
        return new MnemosyneXMLExporter();
    }

    @Override
    protected String getFileNamePrefix() {
        return "french-body-parts";
    }

    @Override
    protected void verify(String destFilePath) throws Exception {
        assertTrue(new File(destFilePath).length() > 0);
    }

}
