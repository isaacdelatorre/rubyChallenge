package com.cabify.store.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.springframework.stereotype.Component;

@Component
public class CabifyStoreDecimalFormat extends DecimalFormat {

	private static final long serialVersionUID = 1L;

	public CabifyStoreDecimalFormat() {
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
		decimalFormatSymbols.setDecimalSeparator('.');
		setDecimalFormatSymbols(decimalFormatSymbols);
		setMinimumFractionDigits(2);
		setMaximumFractionDigits(2);
	}

}
