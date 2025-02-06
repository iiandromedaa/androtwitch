package com.androbohij.androtwitch;

import com.github.philippheuer.credentialmanager.domain.OAuth2Credential;
import com.github.twitch4j.TwitchClient;
import com.github.twitch4j.TwitchClientBuilder;

public class Androtwitch {

    final String OAUTH = System.getenv("twitchoath");

    public Androtwitch() {
        OAuth2Credential credential = new OAuth2Credential("twitch", OAUTH);
        
        TwitchClient twitchClient = TwitchClientBuilder.builder()
            .withEnableHelix(true)
            .withEnableChat(true)
            .withChatAccount(credential)
            .build();
    }

}