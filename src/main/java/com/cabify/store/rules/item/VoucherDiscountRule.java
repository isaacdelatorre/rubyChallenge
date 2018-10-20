package com.cabify.store.rules.item;

import org.springframework.stereotype.Component;

@Component
public class VoucherDiscountRule implements ItemDiscountRule {

	@Override
	public double applyRule(final double price, final Integer amount) {
		return price * Math.ceil(Double.valueOf(amount) / 2);
	}

}
