package com.spotify.http.wg;

public interface WebgateTokenProvider {

    public static class WebgateTokenException extends Exception {
        private static final long serialVersionUID = 593539459345L;
    }

    String a(int i);

    String b(int i, boolean z);

    void onStop();

    void reset();
}
