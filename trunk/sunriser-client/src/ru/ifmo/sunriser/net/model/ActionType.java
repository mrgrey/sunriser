package ru.ifmo.sunriser.net.model;

import ru.ifmo.sunriser.net.model.convertable.ConvertableInteger;

/**
 *
 * @author mrgrey
 */
public class ActionType {
	public final static ActionType REGISTER = new ActionType(1);
	public final static ActionType LOGIN = new ActionType(2);

	private ActionType(int value) {
		this.value = new ConvertableInteger(new Integer(value));
	}

	private ConvertableInteger value;
	public int getIntValue() {
		return value.getData().intValue();
	}
	public byte[] toByteArray() {
		try {
			return value.toByteArray();
		} catch(Exception e) {
			throw new RuntimeException("Can not convert ActionType to byte[]");
		}
	}
}
