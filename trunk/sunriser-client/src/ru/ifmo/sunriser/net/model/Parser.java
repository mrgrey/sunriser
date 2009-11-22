package ru.ifmo.sunriser.net.model;

import ru.ifmo.sunriser.net.model.convertable.IBytesConvertable;
import ru.ifmo.sunriser.util.ArrayUtils;

/**
 *
 * @author mrgrey
 */
public class Parser {
	byte[] data;
	int offset;

	public Parser(byte[] inputArray) {
		data = inputArray;
		offset = 0;
	}

	public void parse(final IBytesConvertable out) {
		int bytesToRead = out.getDataType().getBytesCount();
		out.initFromByteArray(ArrayUtils.sliceByteArray(data, offset, bytesToRead));
		offset += bytesToRead;
	}
}
