package com.spotify.mobile.android.sso;

import java.util.Arrays;
import java.util.List;

public abstract class AuthorizationRequest {

    public enum ResponseType {
        TOKEN("token"),
        CODE("code"),
        NONE("unknown");
        
        private final String mType;

        private ResponseType(String str) {
            this.mType = str;
        }

        public String d() {
            return this.mType;
        }
    }

    public static AuthorizationRequest a(String str, ResponseType responseType, String str2, ClientIdentity clientIdentity, String str3, String[] strArr, boolean z) {
        if (strArr == null) {
            strArr = new String[0];
        }
        return new l(str2, str, Arrays.asList(strArr), responseType, clientIdentity, str3, z);
    }

    public abstract String b();

    public abstract ClientIdentity c();

    public abstract void d();

    public abstract String e();

    public abstract ResponseType f();

    public String[] g() {
        return (String[]) h().toArray(new String[0]);
    }

    public abstract List<String> h();

    public abstract String i();

    public abstract boolean j();
}
