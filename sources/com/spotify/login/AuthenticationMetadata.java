package com.spotify.login;

public final class AuthenticationMetadata {
    private final boolean a;
    private final String b;
    private final String c;
    private final AuthSource d;

    public enum AuthSource {
        EMAIL,
        AUTOSMARTLOCK,
        ASSISTEDSMARTLOCK,
        MAGICLINK,
        SAMSUNG,
        PHONENUMBER,
        GOOGLE,
        FACEBOOK
    }

    public AuthenticationMetadata(boolean z, String str, String str2, AuthSource authSource) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = authSource;
    }

    public AuthSource a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthenticationMetadata.class != obj.getClass()) {
            return false;
        }
        AuthenticationMetadata authenticationMetadata = (AuthenticationMetadata) obj;
        if (this.a != authenticationMetadata.a) {
            return false;
        }
        String str = this.b;
        if (str == null ? authenticationMetadata.b != null : !str.equals(authenticationMetadata.b)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? authenticationMetadata.c != null : !str2.equals(authenticationMetadata.c)) {
            return false;
        }
        AuthSource authSource = this.d;
        AuthSource authSource2 = authenticationMetadata.d;
        return authSource == null ? authSource2 == null : authSource == authSource2;
    }

    public int hashCode() {
        int i = (this.a ? 1 : 0) * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AuthSource authSource = this.d;
        if (authSource != null) {
            i2 = authSource.hashCode();
        }
        return hashCode2 + i2;
    }
}
