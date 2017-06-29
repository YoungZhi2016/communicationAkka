package com.winone.communication.sender;

import akka.actor.UntypedActor;

public class SenderActor extends UntypedActor {

	@Override
	public void onReceive(Object message) throws Throwable {
		System.out.println("communication SenderActor onReceive: " + message);

	}

}
