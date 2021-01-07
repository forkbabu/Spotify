package com.spotify.music.email;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailVerifyResponse implements JacksonModel {
    private final boolean text;

    public EmailVerifyResponse(boolean z) {
        this.text = z;
    }

    public static /* synthetic */ EmailVerifyResponse copy$default(EmailVerifyResponse emailVerifyResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailVerifyResponse.text;
        }
        return emailVerifyResponse.copy(z);
    }

    public final boolean component1() {
        return this.text;
    }

    public final EmailVerifyResponse copy(boolean z) {
        return new EmailVerifyResponse(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EmailVerifyResponse) && this.text == ((EmailVerifyResponse) obj).text;
        }
        return true;
    }

    @JsonProperty("text")
    public final boolean getText() {
        return this.text;
    }

    public int hashCode() {
        boolean z = this.text;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return je.P0(je.V0("EmailVerifyResponse(text="), this.text, ")");
    }
}
