package com.cabify.store.rules.item;

import org.springframework.stereotype.Component;

@Component
public class NoDiscountItemDiscountRule implements ItemDiscountRule {

	@Override
	public double applyRule(final double price, final Integer amount) {
		return price * amount;
	}

}
