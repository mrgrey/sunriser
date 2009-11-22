package ru.ifmo.sunriser.net.model.convertable;

/**
 *
 * @author mrgrey
 */
public abstract  class AbstractConvertable implements IBytesConvertable {
	public IBytesConvertable fluentInitFromByteArray(byte[] data) {
		initFromByteArray(data);
		return this;
	}

	public static IBytesConvertable createFromByteArray(byte[] data, Class type) {
		Object instance = null;
		try {
			instance = type.newInstance();
		} catch(Exception e) {
			throw new RuntimeException("Can not create valid IBytesConvertable from input type");
		}
		if(!(instance instanceof IBytesConvertable)) {
			throw new RuntimeException("Can not create valid IBytesConvertable from input type");
		}
		return ((IBytesConvertable)instance).fluentInitFromByteArray(data);
	}
}
