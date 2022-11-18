package com.example.outputs;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class PojoOutput {

	private final Date value;
	private final Integer length;

	public PojoOutput(Date value, Integer length) {
		this.value = value;
		this.length = length;
	}

	public Date getValue() {
		return value;
	}

	public Integer getLength() {
		return length;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PojoOutput that = (PojoOutput) o;
		return Objects.equals(value, that.value) && Objects.equals(length, that.length);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value, length);
	}

	public static void main(String[] args) {

		HashMap<PojoOutput, Integer> map = new HashMap();
		PojoOutput key = new PojoOutput(new Date(), 3);

		map.put(key, 1);
		key.getValue().setTime(123);
		Integer result = map.get(key);

		System.out.println(result);
	}

}
