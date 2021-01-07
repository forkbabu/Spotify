package com.spotify.http.contentaccesstoken;

import com.spotify.http.contentaccesstoken.ContentAccessTokenProvider;
import kotlin.jvm.internal.h;

public final class f implements ContentAccessTokenProvider {
    private final e a;
    private final h b;

    public f(h hVar, cqe cqe) {
        h.e(hVar, "contentAccessTokenRequester");
        h.e(cqe, "clock");
        this.b = hVar;
        this.a = new e(hVar, cqe);
    }

    @Override // com.spotify.http.contentaccesstoken.ContentAccessTokenProvider
    public d a(int i) {
        d c = this.a.c(i);
        if (c != null) {
            return c;
        }
        throw new ContentAccessTokenProvider.ContentAccessTokenException("Content Access token unavailable");
    }

    @Override // com.spotify.http.contentaccesstoken.ContentAccessTokenProvider
    public boolean isEnabled() {
        return this.b.isEnabled();
    }

    @Override // com.spotify.http.contentaccesstoken.ContentAccessTokenProvider
    public void reset() {
        if (this.a.a() != null) {
            this.b.cancel();
            this.a.b();
        }
    }
}
