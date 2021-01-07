package com.spotify.cosmos.android;

import com.spotify.cosmos.android.AutoValue_TypedResponse;
import java.util.Map;

public abstract class TypedResponse<T> {

    public static abstract class Builder<T> {
        public abstract Builder<T> body(T t);

        public abstract TypedResponse<T> build();

        public abstract Builder<T> headers(Map<String, String> map);

        public abstract Builder<T> status(int i);

        public abstract Builder<T> uri(String str);
    }

    public static <T> Builder<T> builder() {
        return new AutoValue_TypedResponse.Builder();
    }

    public abstract T body();

    public abstract Map<String, String> headers();

    public abstract int status();

    public abstract String uri();
}
