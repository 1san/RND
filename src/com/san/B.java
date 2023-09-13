package com.san;

import java.util.HashMap;
import java.util.Map;

public class B {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6,3,2};
		Map<Integer,Long> map=new HashMap<Integer,Long>();
		 for (int i: arr) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}else {
				map.put(i,1l);
			}
			if(map.containsKey(i) && map.get(i)>1) {
				System.out.print(i);
				break;
			}
		}
	}
	
}
