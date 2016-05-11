package com.curso.maven.unitarias;

import static org.junit.Assert.*;

import org.junit.Test;

import com.curso.maven.ErrorAnalisisEstaticoProvocado;

public class TestAnalisisEstaticoProvocado {

	@Test
	public void test() {
		ErrorAnalisisEstaticoProvocado sut = new ErrorAnalisisEstaticoProvocado();
		
		sut.metodo();
		
	}

}
