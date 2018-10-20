package com.cabify.store.model;

import com.cabify.store.rules.item.VoucherDiscountRule;

public class Voucher extends CabifyItem {

	public Voucher() {
		super(5, new VoucherDiscountRule());
	}

}
