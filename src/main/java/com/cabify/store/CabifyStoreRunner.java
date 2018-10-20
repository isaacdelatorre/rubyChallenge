package com.cabify.store;

import java.text.DecimalFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cabify.store.checkout.Checkout;

@Component
public class CabifyStoreRunner implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(CabifyStoreRunner.class);

	@Autowired
	private Checkout checkout;

	@Autowired
	private DecimalFormat decimalFormat;

	@Override
	public void run(String... args) {
		checkout.scan("VOUCHER");
		checkout.scan("TSHIRT");
		checkout.scan("VOUCHER");
		checkout.scan("VOUCHER");
		checkout.scan("MUG");
		checkout.scan("TSHIRT");
		checkout.scan("TSHIRT");
		logger.info("####################");
		logger.info("Total: " + decimalFormat.format(checkout.total()) + "€");
		logger.info("####################");
	}

}
