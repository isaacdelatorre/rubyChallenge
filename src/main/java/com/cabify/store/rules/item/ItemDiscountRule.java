package com.cabify.store.rules.item;

public interface ItemDiscountRule {

	double applyRule(final double price, final Integer amount);

}
