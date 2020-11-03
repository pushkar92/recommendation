package com.relayr.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relayr.model.PricingModel;

@RestController
public class RecommendationService {
	 
	@PostMapping("/recommend")
	public List<PricingModel> findByProductandCategoryRanked(@RequestBody List<PricingModel> pricingModel) {
		System.out.println("Hello");
		Collections.sort(pricingModel);
		return pricingModel;	
	}
}
