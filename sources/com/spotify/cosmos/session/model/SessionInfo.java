package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.charset.Charset;

public abstract class SessionInfo implements LoginResponseBody {
    @JsonCreator
    public static SessionInfo create(@JsonProperty("username") String str, @JsonProperty("storedCredentials") String str2, @JsonProperty("locale") String str3, @JsonProperty("accessToken") String str4) {
        return new AutoValue_SessionInfo(str, str2, str3, str4);
    }

    public abstract String accessToken();

    public abstract String locale();

    public abstract String storedCredentials();

    public final byte[] storedCredentialsBytes() {
        String storedCredentials = storedCredentials();
        if (storedCredentials == null) {
            return new byte[0];
        }
        return storedCredentials.getBytes(Charset.defaultCharset());
    }

    public abstract String username();
}
