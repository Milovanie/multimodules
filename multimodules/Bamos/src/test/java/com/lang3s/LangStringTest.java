package com.lang3s;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LangStringTest {
	
private LangString langString;
	@BeforeAll
	  void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		langString = new LangString();
	}

	@Test
	public void whenCalledisBlank_thenCorrect() {
	    assertThat(StringUtils.isBlank(" ")).isTrue();
	    assertThat(langString.isBlanks(" ")).isTrue();
	}
	    
	@Test
	public void whenCalledisEmpty_thenCorrect() {
	    assertThat(StringUtils.isEmpty("")).isTrue();
	}
	    
	@Test
	public void whenCalledisAllLowerCase_thenCorrect() {
	    assertThat(StringUtils.isAllLowerCase("abd")).isTrue();
	}
	    
	@Test
	public void whenCalledisAllUpperCase_thenCorrect() {
	    assertThat(StringUtils.isAllUpperCase("ABC")).isTrue();
	}
	    
	@Test
	public void whenCalledisMixedCase_thenCorrect() {
	    assertThat(StringUtils.isMixedCase("abC")).isTrue();
	}
	    
	@Test
	public void whenCalledisAlpha_thenCorrect() {
	    assertThat(StringUtils.isAlpha("abc")).isTrue();
	}
	    
	@Test
	public void whenCalledisAlphanumeric_thenCorrect() {
	    assertThat(StringUtils.isAlphanumeric("abc123")).isTrue();
	}
}
