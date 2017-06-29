package com.winone.communication.system;

import com.winone.communication.remote.RemoteActor;
import com.winone.communication.sender.SenderActor;
import com.winone.communication.utils.Configs;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class LocalActorSystem {

	private static final ActorSystem ACTOR_SYSTEM;

	private static final ActorRef ACTOR_REMOTE;
	private static final ActorRef ACTOR_SENDER;

	static {
		ACTOR_SYSTEM = ActorSystem.create("localSystem",
				LocalActorConfig.getConfig(Configs.getAkkaHost(), Configs.getAkkaPort()));

		ACTOR_REMOTE = ACTOR_SYSTEM.actorOf(Props.create(RemoteActor.class), "remote");
		ACTOR_SENDER = ACTOR_SYSTEM.actorOf(Props.create(SenderActor.class), "sender");
	}

	public static void init() {

	}

	public static ActorSystem getActorSystem() {
		return ACTOR_SYSTEM;
	}

	public static ActorRef getActorRemote() {
		return ACTOR_REMOTE;
	}

	public static ActorRef getActorSender() {
		return ACTOR_SENDER;
	}

}
