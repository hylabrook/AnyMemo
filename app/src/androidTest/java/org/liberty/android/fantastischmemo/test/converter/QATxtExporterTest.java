package org.liberty.android.fantastischmemo.test.converter;

import org.liberty.android.fantastischmemo.converter.Converter;
import org.liberty.android.fantastischmemo.converter.QATxtExporter;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class QATxtExporterTest extends AbstractConverterTest {

    @Override
    protected Converter getConverter() {
        return new QATxtExporter();
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
