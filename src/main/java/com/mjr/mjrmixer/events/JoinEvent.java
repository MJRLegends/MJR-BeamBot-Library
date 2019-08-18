package com.mjr.mjrmixer.events;

import com.mjr.mjrmixer.Event;

public class JoinEvent extends Event{

	public final String channel;
	public final int channelID;
	public final String sender;
	public final int senderID;
	
	public JoinEvent(String channel, int channelID, String sender, int senderID) {
		super(EventType.JOIN);
		this.channel = channel;
		this.channelID = channelID;
		this.sender = sender;
		this.senderID = senderID;
	}
	
	public JoinEvent() {
		super(EventType.JOIN);
		this.channel = null;
		this.channelID = -1;
		this.sender = null;
		this.senderID = -1;
	}
	
	public void onEvent(JoinEvent event) {
		
	}

}