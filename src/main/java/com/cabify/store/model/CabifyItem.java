package com.cabify.store.model;

import com.cabify.store.rules.item.ItemDiscountRule;

public class CabifyItem {

	private double price;
	private ItemDiscountRule itemDiscountRule;

	public CabifyItem(final double price, final ItemDiscountRule itemDiscountRule) {
		this.price = price;
		this.itemDiscountRule = itemDiscountRule;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscountPrice(final Integer amount) {
		return itemDiscountRule.applyRule(price, amount);
	}

}
