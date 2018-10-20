package com.cabify.store.util;

import java.util.Arrays;

import com.cabify.store.model.CabifyItem;
import com.cabify.store.model.Mug;
import com.cabify.store.model.Tshirt;
import com.cabify.store.model.Voucher;

public enum CabifyItemEnum {

	VOUCHER("VOUCHER", new Voucher()),
	TSHIRT("TSHIRT", new Tshirt()),
	MUG("MUG", new Mug());

	private String name;
	private CabifyItem cabifyItem;

	CabifyItemEnum(final String name, final CabifyItem cabifyItem) {
		this.name = name;
		this.cabifyItem = cabifyItem;
	}

	public String getName() {
		return name;
	}

	public CabifyItem getCabifyItem() {
		return cabifyItem;
	}

	public static CabifyItem getCabifyItem(final String cabifyItemName) {
		return Arrays.asList(CabifyItemEnum.values()).stream()
				.filter(cabifyItemEnum -> cabifyItemEnum.getName().equals(cabifyItemName)).findFirst().get()
				.getCabifyItem();
	}

}
