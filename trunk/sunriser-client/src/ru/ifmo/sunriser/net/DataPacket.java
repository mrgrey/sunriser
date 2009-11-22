package ru.ifmo.sunriser.net;

/**
 *
 * @author mrgrey
 */
public class DataPacket {
	private byte[] data;

	public byte[] getData() {
		return data;
	}

	public DataPacket(byte[] data) {
		this.data = data;
	}

	public String toString() {
		return new String(data);
	}
}