package com.cabify.store.model;

import com.cabify.store.rules.item.NoDiscountItemDiscountRule;

public class Mug extends CabifyItem {

	public Mug() {
		super(7.5, new NoDiscountItemDiscountRule());
	}

}
