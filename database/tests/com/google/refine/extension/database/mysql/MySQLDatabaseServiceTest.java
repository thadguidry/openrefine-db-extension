
package com.google.refine.extension.database.mysql;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MySQLDatabaseServiceTest {

    @BeforeTest
    public void beforeTest() {
    }

    @Test
    public void testGetInstance() {

        MySQLDatabaseService instance = MySQLDatabaseService.getInstance();
        Assert.assertNotNull(instance, "Instance Cannot cbe Null");
    }

    @Test
    public void testTestConnection() {

    }
    @Test
    public void testConnect() {

    }
    @Test
    public void testExecuteQuery() {

    }
    @Test
    public void testBuildLimitQuery() {

    }
    @Test
    public void testGetColumns() {

    }
    @Test
    public void testGetRows() {

    }
    @Test
    public void getDatabaseUrl() {

    }

}
