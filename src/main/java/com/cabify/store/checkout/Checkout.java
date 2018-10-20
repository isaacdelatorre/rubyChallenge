package com.cabify.store.checkout;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.cabify.store.model.CabifyItem;
import com.cabify.store.rules.PricingRules;
import com.cabify.store.util.CabifyItemEnum;

@Component
public class Checkout extends HashMap<CabifyItem, Integer> {

	private static final long serialVersionUID = 1L;

	private PricingRules pricingRules;

	// No need to instantiate this because Spring will do it for us. Spring will find a DiscountRules object
	// (which is a PricingRules object as well) in its context and use it here.
	public Checkout(final PricingRules pricingRules) {
		this.pricingRules = pricingRules;
	}

	public Integer scan(final String cabifyItemName) {
		CabifyItem cabifyItem = CabifyItemEnum.getCabifyItem(cabifyItemName);
		Integer amount = get(cabifyItem);
		if (amount == null) {
			put(cabifyItem, 1);
		} else {
			amount++;
			put(cabifyItem, amount);
			// put(cabifyItem, ++amount) is bad practice.
		}
		return amount;
	}

	public double total() {
		return pricingRules.applyRules(this);
	}

}
