package br.com.selecao.s2it;

import java.util.Arrays;
import java.util.stream.Stream;

public final class Questao8 {

	static void executar() {

		Integer numeroA = Integer.valueOf(123456);
		Integer numeroB = Integer.valueOf(789);

		gerarNumeroC(numeroA, numeroB);

	}

	private static void gerarNumeroC(Integer numeroA, Integer numeroB) {
		
		int[] arrayA = Stream.of(numeroA.toString().split("")).mapToInt(Integer::parseInt).toArray();
		int[] arrayB = Stream.of(numeroB.toString().split("")).mapToInt(Integer::parseInt).toArray();

		merge(arrayA, arrayB);

	}

	public static int[] merge(int[] list1, int[] list2) {
	    int[] list3 = new int[list1.length + list2.length];
	    // Both p and i increment, and list 3 is assigned the user defined integers from both list 1 and 2
	    for (int i = 0, p = 0; i < list1.length || i < list2.length; i++) {
	        if (i < list1.length) {
	            list3[p++] = list1[i];
	        }
	        if (i < list2.length) {
	            list3[p++] = list2[i];
	        }
	    }
	    
	    for (int i = 0; i < list3.length; i++) {

			System.out.print(list3[i]);
		}
	    
	    return list3;
	}
}
