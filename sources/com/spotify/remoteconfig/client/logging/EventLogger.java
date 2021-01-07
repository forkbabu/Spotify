package com.spotify.remoteconfig.client.logging;

public interface EventLogger {

    public enum FetchErrorReason {
        UNKNOWN("unknown"),
        TIMEOUT("timeout"),
        CLIENT_ERROR("client_error"),
        SERVER_ERROR("server_error"),
        UCS_RESPONSE_WRAPPER_ERROR("ucs_response_wrapper_error");
        
        private final String value;

        private FetchErrorReason(String str) {
            this.value = str;
        }

        public final String d() {
            return this.value;
        }
    }
}
