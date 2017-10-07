package com.bottomup.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class UserTokenPwdCallback implements CallbackHandler {

	private Map<String, String> credentials = new HashMap<String, String>();

	public UserTokenPwdCallback() {
		credentials.put("Tim", "Tom");
		credentials.put("Jim", "Jam");
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

		for (int i = 0; i < callbacks.length; i++) {

			WSPasswordCallback wsCallback = (WSPasswordCallback) callbacks[i];
			String string = credentials.get(wsCallback.getIdentifier());
			if (wsCallback != null) {
				wsCallback.setPassword(string);
			}

		}

	}

}
