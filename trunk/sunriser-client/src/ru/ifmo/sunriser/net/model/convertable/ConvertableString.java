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
public class ConvertableString extends AbstractConvertable {
	private String data;

	public ConvertableString() {
		this(new String());
	}

	public ConvertableString(String value) {
		data = value;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public byte[] toByteArray() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(data.length() + 4);
		DataOutputStream dataOutputStream = new DataOutputStream(baos);
		dataOutputStream.writeInt(data.length());
		dataOutputStream.writeUTF(data);
		dataOutputStream.close();
		baos.close();
		return baos.toByteArray();
	}

	public int getBytesCount() {
		return data.length();
	}

	public DataType getDataType() {
		return DataType.STRING.fluentSetBytesCount(getBytesCount());
	}

	public void initFromByteArray(byte[] data) {
		this.data = new String(data);
	}
}
