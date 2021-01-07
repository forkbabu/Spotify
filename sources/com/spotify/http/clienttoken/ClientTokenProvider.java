package com.spotify.http.clienttoken;

import kotlin.jvm.internal.h;

public interface ClientTokenProvider {

    public static class ClientTokenException extends Exception {
        private static final long serialVersionUID = 593539459345L;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClientTokenException(String str) {
            super(str);
            h.e(str, "message");
        }
    }

    a a(int i);

    void reset();
}
