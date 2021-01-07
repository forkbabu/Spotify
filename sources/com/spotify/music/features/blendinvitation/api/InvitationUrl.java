package com.spotify.music.features.blendinvitation.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class InvitationUrl implements JacksonModel {
    private final String url;

    public InvitationUrl(@JsonProperty("invite") String str) {
        this.url = str;
    }

    public static /* synthetic */ InvitationUrl copy$default(InvitationUrl invitationUrl, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invitationUrl.url;
        }
        return invitationUrl.copy(str);
    }

    public final String component1() {
        return this.url;
    }

    public final InvitationUrl copy(@JsonProperty("invite") String str) {
        return new InvitationUrl(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof InvitationUrl) && h.a(this.url, ((InvitationUrl) obj).url);
        }
        return true;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.I0(je.V0("InvitationUrl(url="), this.url, ")");
    }
}
