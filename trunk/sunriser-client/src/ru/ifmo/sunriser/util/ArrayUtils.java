package ru.ifmo.sunriser.util;

import java.util.Vector;

/**
 *
 * @author mrgrey
 */
public class ArrayUtils {
	public static byte[] sliceByteArray(byte[] data, int offset, int length) {
		if(data.length < offset + length) {
			throw new RuntimeException("Wrong array length. Can not slice");
		}
		byte[] part = new byte[length];
		for(int i = 0; i < length; i++) {
			part[i] = data[i + offset];
		}
		return part;
	}

	public static byte[] mergeByteArrays(byte[] array1, byte[] array2) {
		byte[] resArray = new byte[array1.length + array2.length];
		for(int i = 0; i < array1.length; i++) {
			resArray[i] = array1[i];
		}
		for (int i = 0, j = array1.length; i < array2.length; i++) {
			resArray[i+j] = array1[i];
		}
		return resArray;
	}

	public static byte[] mergeByteArrays(byte[][] bytesArrays, int totalBytesLength) {
		byte[] data = new byte[totalBytesLength];
		for(int i = 0, counter = 0; i < bytesArrays.length; i++) {
			for(int j = 0; j < bytesArrays[i].length; j++) {
				data[counter++] = bytesArrays[i][j];
			}
		}
		return data;
	}
}
