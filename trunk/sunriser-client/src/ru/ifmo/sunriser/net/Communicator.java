package ru.ifmo.sunriser.net;

import ru.ifmo.sunriser.net.model.ActionType;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import ru.ifmo.sunriser.util.ArrayUtils;

/**
 * Класс предоставляет методы взаимодействия с сервером
 * @author mrgrey
 */
public class Communicator {
	private final static String serverIp = "92.100.224.138";
	private final static String serverUrl = "http://" + serverIp + ":52344";

	private HttpConnection connection;

	private byte[] getData(byte[] data) throws CommunicationException {
		try {
			connection = (HttpConnection)Connector.open(serverUrl);
			connection.setRequestMethod(connection.POST);
			final DataOutputStream requestStream = connection.openDataOutputStream();
			for(int i = 0; i < data.length; i++) {
				requestStream.writeByte(data[i]);
			}
			requestStream.close();
			final DataInputStream inputStream = connection.openDataInputStream();
			byte[] recievedData = new byte[inputStream.available()];
			inputStream.readFully(recievedData);
			inputStream.close();
			connection.close();
			return recievedData;
		} catch(Exception e) {
			throw new CommunicationException("Error while request to server.", e);
		}
	}

	private byte[] getData(final String data) throws CommunicationException {
		return getData(data.getBytes());
	}

	public byte[] doPublicAction(final ActionType actionType, byte[] data) throws CommunicationException {
		return getData(ArrayUtils.mergeByteArrays(actionType.toByteArray(), data));
	}


}
