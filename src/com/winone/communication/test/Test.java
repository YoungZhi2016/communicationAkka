package com.winone.communication.test;

import com.winone.communication.system.LocalActorSystem;

import akka.actor.ActorRef;

public class Test {

	public static void main(String[] args) {
		// Sender.tell("172.16.0.13", 6008, "hello");//
		LocalActorSystem.getActorSender().tell("hello akka", ActorRef.noSender());
	}

}
