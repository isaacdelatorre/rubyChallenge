package com.cabify.store.model;

import com.cabify.store.rules.item.TshirtDiscountRule;

public class Tshirt extends CabifyItem {

	public Tshirt() {
		super(20, new TshirtDiscountRule());
	}

}
