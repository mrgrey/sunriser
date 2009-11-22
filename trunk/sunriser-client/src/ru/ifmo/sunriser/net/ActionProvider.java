package ru.ifmo.sunriser.net;

import ru.ifmo.sunriser.net.model.ActionType;
import ru.ifmo.sunriser.net.model.IActionProvider;
import ru.ifmo.sunriser.net.model.convertable.AbstractConvertable;
import ru.ifmo.sunriser.net.model.convertable.ConvertableInteger;
import ru.ifmo.sunriser.net.model.convertable.ConvertableString;
import ru.ifmo.sunriser.net.model.convertable.IBytesConvertable;
import ru.ifmo.sunriser.util.ArrayUtils;
import ru.ifmo.sunriser.util.ByteUtil;

/**
 *
 * @author mrgrey
 */
public class ActionProvider implements IActionProvider {
	final Communicator communicator = new Communicator();
	final ByteUtil byteUtil = new ByteUtil();

	public String login(final String login, final String pass) {
		byteUtil.clear();
		byteUtil.putConvertable(new ConvertableString(login));
		byteUtil.putConvertable(new ConvertableString(pass));
		try {
			byte[] recievedData = communicator.doPublicAction(ActionType.REGISTER, byteUtil.toByteArray());
			ConvertableInteger answerCode = new ConvertableInteger();
			answerCode.initFromByteArray(ArrayUtils.sliceByteArray(recievedData, 0, 4));
			if(answerCode.getData().intValue() == 7) {
				ConvertableInteger sidLength = new ConvertableInteger();
				sidLength.initFromByteArray(ArrayUtils.sliceByteArray(recievedData, 4, 4));
				ConvertableString sid = new ConvertableString();
				sid.initFromByteArray(ArrayUtils.sliceByteArray(recievedData, 8, sidLength.getData().intValue()));
				return sid.getData();
			} else {
				//TODO: report exception
				return "Can not login";
			}
		} catch(CommunicationException ce) {
			//TODO: report exception
			return new String(ce.getMessage());
		}
	}

}
