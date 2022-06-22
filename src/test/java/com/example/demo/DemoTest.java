package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {
Demo demo = new Demo();
@Test
    void sumTest(){
    int a = 5;
    int b = 6;
    int expected = 11;
    int result = demo.sum(a,b);
    assertEquals(expected, result);
}
}
