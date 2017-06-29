package com.winone.communication.sender;

import com.winone.communication.system.LocalActorSystem;

import akka.actor.ActorSelection;

public final class Sender {

	public static ActorSelection getRemoteRef(String host, int port) {
		StringBuilder comm = new StringBuilder("akka.tcp://RemoteSystem@");
		comm.append(host);
		comm.append(":");
		comm.append(port);
		comm.append("/user/remote");
		return LocalActorSystem.getActorSystem().actorSelection(comm.toString());
	}

	/**
	 * get result in SenderActor
	 */
	public static void tell(String host, int port, Object message) {
		getRemoteRef(host, port).tell(message, LocalActorSystem.getActorSender());
	}
}
