package com.winone.communication.remote;

import akka.actor.UntypedActor;

public class RemoteActor extends UntypedActor {

	@Override
	public void onReceive(Object message) throws Throwable {
		System.out.println("communication RemoteActor onReceive: " + message);

	}

}
