package com.spotify.cosmos.android;

import com.spotify.cosmos.android.TypedResponse;
import java.util.Map;

final class AutoValue_TypedResponse<T> extends TypedResponse<T> {
    private final T body;
    private final Map<String, String> headers;
    private final int status;
    private final String uri;

    /* access modifiers changed from: package-private */
    public static final class Builder<T> extends TypedResponse.Builder<T> {
        private T body;
        private Map<String, String> headers;
        private Integer status;
        private String uri;

        Builder() {
        }

        @Override // com.spotify.cosmos.android.TypedResponse.Builder
        public TypedResponse.Builder<T> body(T t) {
            this.body = t;
            return this;
        }

        @Override // com.spotify.cosmos.android.TypedResponse.Builder
        public TypedResponse<T> build() {
            String str = this.status == null ? " status" : "";
            if (this.uri == null) {
                str = je.x0(str, " uri");
            }
            if (this.headers == null) {
                str = je.x0(str, " headers");
            }
            if (str.isEmpty()) {
                return new AutoValue_TypedResponse(this.status.intValue(), this.uri, this.headers, this.body);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.cosmos.android.TypedResponse.Builder
        public TypedResponse.Builder<T> headers(Map<String, String> map) {
            if (map != null) {
                this.headers = map;
                return this;
            }
            throw new NullPointerException("Null headers");
        }

        @Override // com.spotify.cosmos.android.TypedResponse.Builder
        public TypedResponse.Builder<T> status(int i) {
            this.status = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.cosmos.android.TypedResponse.Builder
        public TypedResponse.Builder<T> uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    @Override // com.spotify.cosmos.android.TypedResponse
    public T body() {
        return this.body;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TypedResponse)) {
            return false;
        }
        TypedResponse typedResponse = (TypedResponse) obj;
        if (this.status == typedResponse.status() && this.uri.equals(typedResponse.uri()) && this.headers.equals(typedResponse.headers())) {
            T t = this.body;
            if (t == null) {
                if (typedResponse.body() == null) {
                    return true;
                }
            } else if (t.equals(typedResponse.body())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.status ^ 1000003) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.headers.hashCode()) * 1000003;
        T t = this.body;
        return hashCode ^ (t == null ? 0 : t.hashCode());
    }

    @Override // com.spotify.cosmos.android.TypedResponse
    public Map<String, String> headers() {
        return this.headers;
    }

    @Override // com.spotify.cosmos.android.TypedResponse
    public int status() {
        return this.status;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TypedResponse{status=");
        V0.append(this.status);
        V0.append(", uri=");
        V0.append(this.uri);
        V0.append(", headers=");
        V0.append(this.headers);
        V0.append(", body=");
        return je.G0(V0, this.body, "}");
    }

    @Override // com.spotify.cosmos.android.TypedResponse
    public String uri() {
        return this.uri;
    }

    private AutoValue_TypedResponse(int i, String str, Map<String, String> map, T t) {
        this.status = i;
        this.uri = str;
        this.headers = map;
        this.body = t;
    }
}
