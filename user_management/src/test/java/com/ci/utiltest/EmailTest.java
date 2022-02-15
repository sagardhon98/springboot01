package com.ci.utiltest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.util.EmailUtil;

@SpringBootTest
class EmailTest {

	@Autowired
	private EmailUtil emailUtil;

	@Test
	public void testEmail() {
		boolean sendEmail = emailUtil.sendEmail("sagardhon98@gmail.com", "Welcome", "Hello Everyone.");
		assertTrue(sendEmail);
	}

}
