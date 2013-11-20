package com.htyuan.test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.rc4.RC4;


public class RC4Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String data = "《爱帮王》";
		String key = "123";
		String encodedXml = RC4.encry_RC4_string(data, key);
		System.out.println(encodedXml);
		String decodedXml = RC4.decry_RC4(encodedXml, key);
		System.out.println(decodedXml);
		
		assertEquals(data, decodedXml);
	}

}
