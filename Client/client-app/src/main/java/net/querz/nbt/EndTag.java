package net.querz.nbt;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class EndTag extends Tag<Void> {

	static final EndTag INSTANCE = new EndTag();

	private EndTag() {}

	@Override
	public byte getID() {
		return 0;
	}

	@Override
	protected Void getEmptyValue() {
		return null;
	}

	@Override
	public void serializeValue(DataOutputStream dos, int depth) {
		//nothing to do
	}

	@Override
	public void deserializeValue(DataInputStream dis, int depth) {
		//nothing to do
	}

	@Override
	public String valueToString(int depth) {
		return "\"end\"";
	}

	@Override
	public String valueToTagString(int depth) {
		throw new UnsupportedOperationException("EndTag cannot be turned into a String");
	}

	@Override
	public int compareTo(Tag<Void> o) {
		return 0;
	}

	@Override
	protected EndTag clone() {
		return INSTANCE;
	}
}
