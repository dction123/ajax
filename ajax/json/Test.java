package com.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.asm.Type;
public class Test {
//	private static List<Person> listOfPersons = new ArrayList<Person>();
	private static List list1 = new ArrayList();
	
	public static void setUp() {
//	    listOfPersons.add(new Person(15, "John Doe", new Date()));
//	    listOfPersons.add(new Person(20, "Janette Doe", new Date()));
	    list1.add(new Person(15, "John Doe", new Date()));
//	    list1.add(new Person(20, "Janette Doe", new Date()));
	    
	}
	public static void whenJavaList_thanConvertToJsonCorrect() {
		
//	    String jsonOutput= JSON.toJSONString(listOfPersons);
	    String jsonOutput= JSON.toJSONString(list1);
	   
	    System.out.println(jsonOutput);
	}
	
	
	public static void  whenGenerateJson_thanGenerationCorrect() {
		JSONArray jsonArray = new JSONArray();
		for(int i=0;i<2;i++) {
			JSONObject jsonObject = new JSONObject();
	        jsonObject.put("AGE", 10);
	        jsonObject.put("FULL NAME", "Doe " + i);
	        jsonObject.put("DATE OF BIRTH", "2016/12/12 12:12:12");
	        jsonArray.add(jsonObject);
		}
		String jsonString = jsonArray.toString();
		System.out.println(jsonString);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		setUp();
//		whenJavaList_thanConvertToJsonCorrect();
		whenGenerateJson_thanGenerationCorrect();
	}
}
