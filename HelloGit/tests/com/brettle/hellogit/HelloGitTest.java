package com.brettle.hellogit;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloGitTest {

	@Test
	public void test() {
		HelloGit hg = new HelloGit();
		assertEquals("Hello Git!", hg.getMessage());
<<<<<<< HEAD
		assertEquals(4, 2 + 2);
=======
>>>>>>> branch 'master' of https://github.com/Gabe-Mitnick/HelloGit.git
		assertEquals(2, 1 + 1);
	}

}
