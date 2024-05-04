package org.csystem.util.string;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class StringUtilPadLeadingNullPointerExceptionForDefaultChTest
{
    @Test
    public void test()
    {
        assertThrows(NullPointerException.class, () -> StringUtil.padLeading(null, 2));
    }
}
