package com.cg.customer.util;

import com.cg.customer.exceptions.*;

public class ValidationUtil {

	public static void checkArgumentNotNull(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("Argument can't be null");
		}
	}

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidCustomerNameException("Name is not valid");
		}

	}

}
