package com.spotify.accountrecovery.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize
public final class VerifyTokenRequestBody implements JacksonModel {
    private final String oneTimeToken;

    public VerifyTokenRequestBody(@JsonProperty("oneTimeToken") String str) {
        h.e(str, "oneTimeToken");
        this.oneTimeToken = str;
    }

    public static /* synthetic */ VerifyTokenRequestBody copy$default(VerifyTokenRequestBody verifyTokenRequestBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyTokenRequestBody.oneTimeToken;
        }
        return verifyTokenRequestBody.copy(str);
    }

    public final String component1() {
        return this.oneTimeToken;
    }

    public final VerifyTokenRequestBody copy(@JsonProperty("oneTimeToken") String str) {
        h.e(str, "oneTimeToken");
        return new VerifyTokenRequestBody(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof VerifyTokenRequestBody) && h.a(this.oneTimeToken, ((VerifyTokenRequestBody) obj).oneTimeToken);
        }
        return true;
    }

    public final String getOneTimeToken() {
        return this.oneTimeToken;
    }

    public int hashCode() {
        String str = this.oneTimeToken;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.I0(je.V0("VerifyTokenRequestBody(oneTimeToken="), this.oneTimeToken, ")");
    }
}
