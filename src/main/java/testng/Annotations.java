package testng;

import org.testng.annotations.*;

/**
 * Created by admin on 2017/3/13.
 */
public class Annotations {
    @BeforeSuite
    public void suiteLevelb(){System.out.println("Before Suite Run");}

    @BeforeTest
    public void testLevelb(){System.out.println("Before Test Run");}

    @BeforeClass
    public void classLevelb(){System.out.println("Before Class Run");}

    @BeforeMethod
    public void methodLevelb(){System.out.println("Before Method Run");}

    @Test(groups = {"test"})
    public void methodBase(){System.out.println("Annotations Method Running");}

    @AfterMethod
    public void methodLevela(){System.out.println("After Method Run");}

    @AfterClass
    public void classLevela(){System.out.println("After Class Run");}

    @AfterTest
    public void testLevela(){System.out.println("After Test Run");}

    @AfterSuite
    public void suiteLevela(){System.out.println("After Suite Run");}

    @BeforeGroups(groups= {"test"})
    public void groupLevelb(){System.out.println("Before Group Run");}

    @AfterGroups(groups = {"test"})
    public void groupLevela(){System.out.println("After Group Run");}
}
