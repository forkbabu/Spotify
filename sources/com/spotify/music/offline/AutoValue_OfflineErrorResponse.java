package com.spotify.music.offline;

import com.spotify.music.offline.OfflineErrorResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflineErrorResponse extends OfflineErrorResponse {
    private final OfflineErrorResponse.InnerError innerError;

    /* access modifiers changed from: package-private */
    public static final class b implements OfflineErrorResponse.a {
        private OfflineErrorResponse.InnerError a;

        b() {
        }

        public OfflineErrorResponse a() {
            String str = this.a == null ? " innerError" : "";
            if (str.isEmpty()) {
                return new AutoValue_OfflineErrorResponse(this.a);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public OfflineErrorResponse.a b(OfflineErrorResponse.InnerError innerError) {
            if (innerError != null) {
                this.a = innerError;
                return this;
            }
            throw new NullPointerException("Null innerError");
        }

        b(OfflineErrorResponse offlineErrorResponse, a aVar) {
            this.a = offlineErrorResponse.innerError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OfflineErrorResponse) {
            return this.innerError.equals(((OfflineErrorResponse) obj).innerError());
        }
        return false;
    }

    public int hashCode() {
        return this.innerError.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.offline.OfflineErrorResponse
    public OfflineErrorResponse.InnerError innerError() {
        return this.innerError;
    }

    @Override // com.spotify.music.offline.OfflineErrorResponse
    public OfflineErrorResponse.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("OfflineErrorResponse{innerError=");
        V0.append(this.innerError);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_OfflineErrorResponse(OfflineErrorResponse.InnerError innerError2) {
        this.innerError = innerError2;
    }
}
