package com.spotify.music.offline;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.offline.AutoValue_OfflineErrorResponse;
import com.spotify.music.offline.AutoValue_OfflineErrorResponse_InnerError;

public abstract class OfflineErrorResponse implements JacksonModel {

    public static abstract class InnerError implements JacksonModel {

        public interface a {
        }

        public static a builder() {
            return new AutoValue_OfflineErrorResponse_InnerError.b();
        }

        @JsonCreator
        public static InnerError create(@JsonProperty("code") int i) {
            AutoValue_OfflineErrorResponse_InnerError.b bVar = (AutoValue_OfflineErrorResponse_InnerError.b) builder();
            bVar.b(i);
            return bVar.a();
        }

        public abstract int code();

        public abstract a toBuilder();
    }

    public interface a {
    }

    public static a builder() {
        return new AutoValue_OfflineErrorResponse.b();
    }

    @JsonCreator
    public static OfflineErrorResponse create(@JsonProperty("error") InnerError innerError) {
        AutoValue_OfflineErrorResponse.b bVar = (AutoValue_OfflineErrorResponse.b) builder();
        bVar.b(innerError);
        return bVar.a();
    }

    public abstract InnerError innerError();

    public abstract a toBuilder();

    public OfflineError toOfflineError() {
        return OfflineError.d(innerError().code());
    }
}
