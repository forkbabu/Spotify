package com.spotify.music.offline;

import com.spotify.music.offline.OfflineErrorResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflineErrorResponse_InnerError extends OfflineErrorResponse.InnerError {
    private final int code;

    /* access modifiers changed from: package-private */
    public static final class b implements OfflineErrorResponse.InnerError.a {
        private Integer a;

        b() {
        }

        public OfflineErrorResponse.InnerError a() {
            String str = this.a == null ? " code" : "";
            if (str.isEmpty()) {
                return new AutoValue_OfflineErrorResponse_InnerError(this.a.intValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public OfflineErrorResponse.InnerError.a b(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        b(OfflineErrorResponse.InnerError innerError, a aVar) {
            this.a = Integer.valueOf(innerError.code());
        }
    }

    @Override // com.spotify.music.offline.OfflineErrorResponse.InnerError
    public int code() {
        return this.code;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineErrorResponse.InnerError) || this.code != ((OfflineErrorResponse.InnerError) obj).code()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.code ^ 1000003;
    }

    @Override // com.spotify.music.offline.OfflineErrorResponse.InnerError
    public OfflineErrorResponse.InnerError.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        return je.B0(je.V0("InnerError{code="), this.code, "}");
    }

    private AutoValue_OfflineErrorResponse_InnerError(int i) {
        this.code = i;
    }
}
