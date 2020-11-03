package com.cg.customerjparest.util;

import com.cg.customerjparest.exceptions.*;

public class ValidationUtil {

	public static void checkArgumentNotNull(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidCustomerNameException("name is not valid");
		}

	}


}
