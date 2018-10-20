package com.cabify.store.rules;

import com.cabify.store.checkout.Checkout;

public interface PricingRules {

	double applyRules(final Checkout checkout);

}
