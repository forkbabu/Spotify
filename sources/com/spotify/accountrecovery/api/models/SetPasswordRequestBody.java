package com.spotify.accountrecovery.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize
public final class SetPasswordRequestBody implements JacksonModel {
    private final String oneTimeToken;
    private final String password;

    public SetPasswordRequestBody(@JsonProperty("password") String str, @JsonProperty("oneTimeToken") String str2) {
        h.e(str, "password");
        h.e(str2, "oneTimeToken");
        this.password = str;
        this.oneTimeToken = str2;
    }

    public static /* synthetic */ SetPasswordRequestBody copy$default(SetPasswordRequestBody setPasswordRequestBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setPasswordRequestBody.password;
        }
        if ((i & 2) != 0) {
            str2 = setPasswordRequestBody.oneTimeToken;
        }
        return setPasswordRequestBody.copy(str, str2);
    }

    public final String component1() {
        return this.password;
    }

    public final String component2() {
        return this.oneTimeToken;
    }

    public final SetPasswordRequestBody copy(@JsonProperty("password") String str, @JsonProperty("oneTimeToken") String str2) {
        h.e(str, "password");
        h.e(str2, "oneTimeToken");
        return new SetPasswordRequestBody(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetPasswordRequestBody)) {
            return false;
        }
        SetPasswordRequestBody setPasswordRequestBody = (SetPasswordRequestBody) obj;
        return h.a(this.password, setPasswordRequestBody.password) && h.a(this.oneTimeToken, setPasswordRequestBody.oneTimeToken);
    }

    public final String getOneTimeToken() {
        return this.oneTimeToken;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        String str = this.password;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.oneTimeToken;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SetPasswordRequestBody(password=");
        V0.append(this.password);
        V0.append(", oneTimeToken=");
        return je.I0(V0, this.oneTimeToken, ")");
    }
}
