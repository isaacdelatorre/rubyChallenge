package com.cabify.store.rules.item;

import org.springframework.stereotype.Component;

@Component
public class TshirtDiscountRule implements ItemDiscountRule {

	@Override
	public double applyRule(final double price, final Integer amount) {
		double discountPrice;
		if (amount < 3) {
			discountPrice = price * amount;
		} else {
			discountPrice = (price - 1) * amount;
		}
		return discountPrice;
	}

}
