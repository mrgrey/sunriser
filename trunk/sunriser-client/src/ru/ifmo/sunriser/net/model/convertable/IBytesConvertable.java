package ru.ifmo.sunriser.net.model.convertable;

import java.io.IOException;
import ru.ifmo.sunriser.net.model.DataType;

/**
 *
 * @author mrgrey
 */
public interface IBytesConvertable {
	DataType getDataType();
	int getBytesCount();
	byte[] toByteArray() throws IOException;
	void initFromByteArray(byte[] data);
	IBytesConvertable fluentInitFromByteArray(byte[] data);
}
