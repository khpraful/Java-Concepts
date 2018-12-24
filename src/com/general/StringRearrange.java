package com.general;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class StringRearrange {
	public static void main(String args[]) {
		String baseString = "connecticut";
		int len = baseString.length();
		ArrayList<Character> arrlst = new ArrayList<Character>();
		char c;
		int i;
		for (i = 0; i < len; i++) {
			c = baseString.charAt(i);
			arrlst.add(c);
		}
		System.out.println(arrlst);
		HashSet<Character> uniq = new HashSet<Character>(arrlst);
		ArrayList<Integer> freq = new ArrayList<Integer>();
		System.out.println(uniq);
		Iterator<Character> itr = uniq.iterator();
		while (itr.hasNext()) {
			int count = 0;
			char x = itr.next();
			for (Character y : arrlst) {
				if (x == y) {
					count++;
				}
				
			}
			freq.add(count);
			
		}
		System.out.println(freq);
		//int max = Collections.max(freq);
		//int ind = freq.indexOf(max);
		//System.out.println(ind);
		ArrayList<ArrayList<Object>> arrlst1 = new ArrayList<ArrayList<Object>>();
		ArrayList<Object> arrlst2 = new ArrayList<Object>();
		int j;
		char z;
		int k;
		
			
		}
		
		
		
				
		

	}

