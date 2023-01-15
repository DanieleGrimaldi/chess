package net.querz.nbt;

import java.lang.reflect.Array;

public abstract class ArrayTag<T> extends Tag<T> {

	public ArrayTag() {}

	public ArrayTag(T value) {
		super(value);
	}

	public int length() {
		return Array.getLength(getValue());
	}

	@Override
	public T getValue() {
		return super.getValue();
	}

	@Override
	public void setValue(T value) {
		super.setValue(checkNull(value));
	}

	@Override
	public String valueToString(int depth) {
		return arrayToString(getValue(), "", "");
	}

	@Override
	public int compareTo(Tag<T> other) {
		if (!(other instanceof ArrayTag) || this.getClass() != other.getClass()) {
			throw new IllegalArgumentException("array types are incompatible");
		}
		return Integer.compare(Array.getLength(getValue()), Array.getLength(other.getValue()));
	}

	protected String arrayToString(T array, String prefix, String suffix) {
		if (array == null || !array.getClass().isArray()) {
			throw new UnsupportedOperationException("cannot convert non-array to String");
		}

		StringBuilder sb = new StringBuilder("[").append(prefix).append("".equals(prefix) ? "" : ";");
		for (int i = 0; i < length(); i++) {
			sb.append(i == 0 ? "" : ",").append(Array.get(array, i)).append(suffix);
		}
		sb.append("]");
		return sb.toString();
	}
}
