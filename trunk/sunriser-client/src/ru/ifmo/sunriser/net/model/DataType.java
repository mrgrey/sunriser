package ru.ifmo.sunriser.net.model;

/**
 *
 * @author mrgrey
 */
public class DataType {
	public final static DataType INT32 = new DataType(4);
	public final static DataType LONG = new DataType(8);
	public final static DataType FLOAT = new DataType(4);
	public final static DataType DOUBLE = new DataType(8);
	public final static DataType STRING = new DataType(null);
	public final static DataType COLLECTION = new DataType(null);

	private DataType(int bytesCount) {
		this(new Integer(bytesCount));
	}

	private DataType(Integer bytesCount) {
		this.bytesCount = bytesCount;
	}

	public boolean isSetBytesCount() {
		return bytesCount == null;
	}

	private Integer bytesCount = null;
	public int getBytesCount() {
		if(!isSetBytesCount()) {
			throw new RuntimeException("Bytes count not set");
		}
		return bytesCount.intValue();
	}

	public void setBytesCount(int bytesCount) {
		if(isSetBytesCount()) {
			throw new RuntimeException("BytesCount has already set");
		}
		this.bytesCount = new Integer(bytesCount);
	}

	public DataType fluentSetBytesCount(int bytesCount) {
		setBytesCount(bytesCount);
		return this;
	}
}
