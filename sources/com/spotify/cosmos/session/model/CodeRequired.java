package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class CodeRequired implements LoginResponseBody {
    public static final int METHOD_SMS = 1;
    public static final int METHOD_UNKNOWN = 0;

    @JsonCreator
    public static CodeRequired create(@JsonProperty("challenge_id") String str, @JsonProperty("method") int i, @JsonProperty("code_length") long j, @JsonProperty("canonical_phone_number") String str2, @JsonProperty("expires_in") long j2, @JsonProperty("retry_number") int i2) {
        return new AutoValue_CodeRequired(str, i, j, str2, j2, i2);
    }

    public abstract String canonicalPhoneNumber();

    public abstract String challengeId();

    public abstract long codeLength();

    public abstract long expiresIn();

    public abstract int method();

    public abstract int retryNumber();
}
