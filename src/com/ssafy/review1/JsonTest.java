package com.ssafy.review1;

import java.io.File;
import java.io.FileReader;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonTest {
	private static final File json = new File("./res/관광.json");
	
	private static void jackson() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		//TripInfo info = mapper.convertValue(mapper.readTree(json), TripInfo.class);
		// 코드 완성
		JsonNode node= mapper.readTree(json);
		node = node.get("response");
		node = node.get("body");
		node = node.get("items");

		List<TripDto> list = mapper.convertValue(
				node, new TypeReference<List<TripDto>>() {
		});
		for (TripDto dto : list) {
			System.out.println(dto);
		}
	}
	/*
	private static void gson() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		gson.fromJson(new FileReader(json), TripInfo.class);
		
		TripInfo info = gson.convertValue(gson.readTree(json), TripInfo.class);
		List<TripDto> list = info.getResponse().getBody().getItems();
		// 코드 완성
		//JsonNode node= mapper.readTree(json);
		
		for (TripDto dto : list) {
			System.out.println(dto);
	}
	*/
	
	private static void urlJson() throws Exception {
		
	}
	public static void main(String[] args) {
		try {
			jackson();
			//gson();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
