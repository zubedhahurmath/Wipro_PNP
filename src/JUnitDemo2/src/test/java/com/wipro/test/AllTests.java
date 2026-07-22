package com.wipro.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    TestCheckPresence.class,
    TestSort.class,
    TestStringConcat.class
})
public class AllTests {
}