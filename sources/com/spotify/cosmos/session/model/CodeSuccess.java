package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class CodeSuccess implements LoginResponseBody {
    @JsonCreator
    public static CodeSuccess create(@JsonProperty("identifier_token") String str, @JsonProperty("name") String str2, @JsonProperty("email") String str3, @JsonProperty("email_already_registered") Boolean bool) {
        return new AutoValue_CodeSuccess(str, str2, str3, bool);
    }

    public abstract String email();

    public abstract Boolean emailAlreadyRegistered();

    public abstract String identifierToken();

    public abstract String name();
}
