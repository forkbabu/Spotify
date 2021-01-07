package com.spotify.http.contentaccesstoken;

import kotlin.jvm.internal.h;

public interface ContentAccessTokenProvider {

    public static class ContentAccessTokenException extends Exception {
        private static final long serialVersionUID = 593539459345L;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ContentAccessTokenException(String str) {
            super(str);
            h.e(str, "message");
        }
    }

    d a(int i);

    boolean isEnabled();

    void reset();
}
