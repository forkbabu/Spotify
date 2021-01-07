package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.jvm.internal.h;

/* renamed from: re2  reason: default package */
public final class re2 {
    private final String a;
    private final String b;

    public re2(String str, String str2) {
        h.e(str, "spotifyAuthCode");
        h.e(str2, "alexaAuthCode");
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re2)) {
            return false;
        }
        re2 re2 = (re2) obj;
        return h.a(this.a, re2.a) && h.a(this.b, re2.b);
    }

    @JsonProperty("alexa_auth_code")
    public final String getAlexaAuthCode() {
        return this.b;
    }

    @JsonProperty("spotify_auth_code")
    public final String getSpotifyAuthCode() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LinkAuthCode(spotifyAuthCode=");
        V0.append(this.a);
        V0.append(", alexaAuthCode=");
        return je.I0(V0, this.b, ")");
    }
}
