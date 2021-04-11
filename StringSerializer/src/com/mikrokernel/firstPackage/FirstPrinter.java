package com.mikrokernel.firstPackage;
import com.example.Microkernel.api.Printer;

public class FirstPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("--External Jar: Printer 1 --");
	}

}
