package com.simbirsoft.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/credential.properties"})
public interface CredentialConfig extends Config {
    String url();
    String login();
    String password();
}
