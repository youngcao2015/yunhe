package test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BelongToRegionFunctionTestCase {

    @Before
    public void setUp() {
        System.out.println("------------");
    }

    @After
    public void tearDown() {
        System.out.println("------------");
    }

    @Parameterized.Parameters
    public static Collection prepareData1() {
        return Arrays.asList(
                new Object[]{true, 15, 8},
                new Object[]{true, 105, 8},
                new Object[]{false, 2, 8}
        );
    }

    public BelongToRegionFunctionTestCase(boolean expected, int regionId, int parentRegionId) {
    }

    @Test
    public void testOldRegion() throws IOException {
        String filePath = "test1";
        System.out.println(filePath);
    }

//    @Test
//    public void testNewRegion() throws IOException {
//        String filePath = this.getClass().getClassLoader().getResource("Region-000000000000000000000008-top100-top100-top100-merge").getFile();
//        Assert.assertEquals(expected, function.evaluate(regionId,parentRegionId, filePath));
//    }

}