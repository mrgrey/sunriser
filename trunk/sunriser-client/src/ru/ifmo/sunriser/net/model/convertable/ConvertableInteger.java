package ru.ifmo.sunriser.net.model.convertable;

import ru.ifmo.sunriser.net.model.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author mrgrey
 */
public class ConvertableInteger extends AbstractConvertable {

	private Integer data;

	public ConvertableInteger() {
		this(new Integer(0));
	}

	public ConvertableInteger(Integer value) {
		data = value;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Integer getData() {
		return data;
	}

	public byte[] toByteArray() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
		DataOutputStream dataOutputStream = new DataOutputStream(baos);
		dataOutputStream.writeInt(data.intValue());
		dataOutputStream.close();
		baos.close();
		return baos.toByteArray();
	}

	public int getBytesCount() {
		return DataType.INT32.getBytesCount();
	}

	public DataType getDataType() {
		return DataType.INT32;
	}

	public void initFromByteArray(byte[] data) {
		this.data = new Integer(data[0] << 24 | data[1] << 16 | data[2] << 8 | data[3]);
	}
}
