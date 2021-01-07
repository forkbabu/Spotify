package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonSubTypes({@JsonSubTypes.Type(name = "sessionInfo", value = SessionInfo.class), @JsonSubTypes.Type(name = "codeSuccess", value = CodeSuccess.class), @JsonSubTypes.Type(name = "codeRequired", value = CodeRequired.class), @JsonSubTypes.Type(name = "bootstrapRequired", value = BootstrapRequired.class)})
@JsonTypeInfo(include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", use = JsonTypeInfo.Id.NAME)
public interface LoginResponseBody {
    public static final String BOOTSTRAP_REQUIRED = "bootstrapRequired";
    public static final String CODE_REQUIRED = "codeRequired";
    public static final String CODE_SUCCESS = "codeSuccess";
    public static final String SESSION_INFO = "sessionInfo";
}
