package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.b;

public abstract class TokenResult {

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static abstract class a {
        public abstract TokenResult a();

        public abstract a b(ResponseCode responseCode);

        public abstract a c(String str);

        public abstract a d(long j);
    }

    public static a a() {
        b.C0134b bVar = new b.C0134b();
        bVar.d(0);
        return bVar;
    }

    public abstract ResponseCode b();

    public abstract String c();

    public abstract long d();
}
