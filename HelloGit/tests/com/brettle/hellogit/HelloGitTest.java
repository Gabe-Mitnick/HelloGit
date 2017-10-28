package com.brettle.hellogit;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloGitTest {

	@Test
	public void test() {
		HelloGit hg = new HelloGit();
		assertEquals("Hello Git!", hg.getMessage());
		assertEquals(4, 2 + 2);
		assertEquals(2, 1 + 1);
	}

}
