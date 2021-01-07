package com.spotify.mobile.android.sso.bakery;

final class AutoValue_Cookie extends Cookie {
    private final String domain;
    private final int maxAge;
    private final String name;
    private final String path;
    private final boolean secure;
    private final String value;

    AutoValue_Cookie(String str, String str2, String str3, String str4, int i, boolean z) {
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.value = str2;
                if (str3 != null) {
                    this.path = str3;
                    if (str4 != null) {
                        this.domain = str4;
                        this.maxAge = i;
                        this.secure = z;
                        return;
                    }
                    throw new NullPointerException("Null domain");
                }
                throw new NullPointerException("Null path");
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null name");
    }

    @Override // com.spotify.mobile.android.sso.bakery.Cookie
    public String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        if (!this.name.equals(cookie.name()) || !this.value.equals(cookie.value()) || !this.path.equals(cookie.path()) || !this.domain.equals(cookie.domain()) || this.maxAge != cookie.maxAge() || this.secure != cookie.secure()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.value.hashCode()) * 1000003) ^ this.path.hashCode()) * 1000003) ^ this.domain.hashCode()) * 1000003) ^ this.maxAge) * 1000003) ^ (this.secure ? 1231 : 1237);
    }

    @Override // com.spotify.mobile.android.sso.bakery.Cookie
    public int maxAge() {
        return this.maxAge;
    }

    @Override // com.spotify.mobile.android.sso.bakery.Cookie
    public String name() {
        return this.name;
    }

    @Override // com.spotify.mobile.android.sso.bakery.Cookie
    public String path() {
        return this.path;
    }

    @Override // com.spotify.mobile.android.sso.bakery.Cookie
    public boolean secure() {
        return this.secure;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Cookie{name=");
        V0.append(this.name);
        V0.append(", value=");
        V0.append(this.value);
        V0.append(", path=");
        V0.append(this.path);
        V0.append(", domain=");
        V0.append(this.domain);
        V0.append(", maxAge=");
        V0.append(this.maxAge);
        V0.append(", secure=");
        return je.P0(V0, this.secure, "}");
    }

    @Override // com.spotify.mobile.android.sso.bakery.Cookie
    public String value() {
        return this.value;
    }
}
