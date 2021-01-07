package com.spotify.music.share.logging;

public interface ShareMenuLogger {

    public enum ErrorMessageReason {
        SHARE_FAILED("share_failed"),
        PREVIEW_FAILED_TO_LOAD("preview_failed_to_load");
        
        private final String logValue;

        private ErrorMessageReason(String str) {
            this.logValue = str;
        }

        public final String d() {
            return this.logValue;
        }
    }

    void a();

    void b(int i, int i2, String str, String str2);

    void c(int i, int i2);

    void d(int i, int i2);

    void e(int i, int i2, String str, String str2);

    void f(ErrorMessageReason errorMessageReason);

    void g(ErrorMessageReason errorMessageReason);

    void h();
}
