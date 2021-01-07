package com.spotify.magiclink;

/* access modifiers changed from: package-private */
public final class m extends a {
    m(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public final String toString() {
        StringBuilder V0 = je.V0("EmailLinkData{username=");
        V0.append(c());
        V0.append(", token=██, passwordToken=");
        return je.H0(V0, a() != null ? "██" : null, '}');
    }
}
