package com.example;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class FooTest {
    @Test
    public void doingFooDoesNothing() {
        Foo foo = new Foo();

        assertThat(foo.doFoo(null), is(nullValue()));
    }
}
