package com.cabify.store.rules;

import org.springframework.stereotype.Component;

import com.cabify.store.checkout.Checkout;

@Component
public class DiscountRules implements PricingRules {

	@Override
	public double applyRules(final Checkout checkout) {
		return checkout.entrySet().stream().map(entrySet -> entrySet.getKey().getDiscountPrice(entrySet.getValue()))
				.mapToDouble(doubleValue -> doubleValue.doubleValue()).sum();
	}

}
