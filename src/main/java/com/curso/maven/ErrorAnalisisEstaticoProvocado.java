package com.curso.maven;

import java.util.concurrent.atomic.AtomicInteger;

public class ErrorAnalisisEstaticoProvocado {
	public void metodo() {
		AtomicInteger aInt1 = new AtomicInteger(0);
		AtomicInteger aInt2 = new AtomicInteger(0);

		if (aInt1.equals(aInt2)) {
			
		}
	}
}
