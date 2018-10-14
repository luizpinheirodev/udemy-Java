package aula193.util;

import java.util.function.Function;

import aula193.entities.Product;

public class UpperCaseName implements Function<Product,	String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
