package ru.ifmo.sunriser.util;

import com.sun.j2me.global.DebugHelper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import ru.ifmo.sunriser.net.model.convertable.IBytesConvertable;

/**
 *
 * @author mrgrey
 */
public class ByteUtil {
	int bytesTotalLength;
	private final Vector data;

	public ByteUtil() {
		bytesTotalLength = 0;
		data = new Vector();
	}

	public void clear() {
		bytesTotalLength = 0;
		data.setSize(0);
	}

	public byte[] toByteArray() {
		byte[] res = new byte[bytesTotalLength];
		for (int i = 0, counter = 0, limit = data.size(); i < limit; i++) {
			try {
				byte[] currentBytes = ((IBytesConvertable)data.elementAt(i)).toByteArray();
				for(int j = 0; j < currentBytes.length; j++) {
					res[counter++] = currentBytes[j];
				}
			} catch(IOException e) {
				//maybe it possible to just skip exception and continue loop execution
				throw new RuntimeException("Can not convert to byte[] representation");
			}
		}
		return res;
	}

	public void putConvertable(final IBytesConvertable convertable) {
		bytesTotalLength += convertable.getBytesCount();
		data.addElement(convertable);
	}
}
