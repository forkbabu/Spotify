package com.spotify.accountrecovery.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize
public final class MagicLinkRequestBody implements JacksonModel {
    private final String emailOrUsername;
    private final String template;

    public MagicLinkRequestBody(@JsonProperty("emailOrUsername") String str, @JsonProperty("template") String str2) {
        h.e(str, "emailOrUsername");
        h.e(str2, "template");
        this.emailOrUsername = str;
        this.template = str2;
    }

    public static /* synthetic */ MagicLinkRequestBody copy$default(MagicLinkRequestBody magicLinkRequestBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = magicLinkRequestBody.emailOrUsername;
        }
        if ((i & 2) != 0) {
            str2 = magicLinkRequestBody.template;
        }
        return magicLinkRequestBody.copy(str, str2);
    }

    public final String component1() {
        return this.emailOrUsername;
    }

    public final String component2() {
        return this.template;
    }

    public final MagicLinkRequestBody copy(@JsonProperty("emailOrUsername") String str, @JsonProperty("template") String str2) {
        h.e(str, "emailOrUsername");
        h.e(str2, "template");
        return new MagicLinkRequestBody(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagicLinkRequestBody)) {
            return false;
        }
        MagicLinkRequestBody magicLinkRequestBody = (MagicLinkRequestBody) obj;
        return h.a(this.emailOrUsername, magicLinkRequestBody.emailOrUsername) && h.a(this.template, magicLinkRequestBody.template);
    }

    public final String getEmailOrUsername() {
        return this.emailOrUsername;
    }

    public final String getTemplate() {
        return this.template;
    }

    public int hashCode() {
        String str = this.emailOrUsername;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.template;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("MagicLinkRequestBody(emailOrUsername=");
        V0.append(this.emailOrUsername);
        V0.append(", template=");
        return je.I0(V0, this.template, ")");
    }
}
