package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

    DailyTasks dt = new DailyTasks();

    @Test
    void testDoStringConcat() {
        assertEquals("Hello World", dt.doStringConcat("Hello", "World"));
    }
}