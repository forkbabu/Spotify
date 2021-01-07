package defpackage;

import com.spotify.http.contentaccesstoken.ContentAccessTokenProvider;

/* renamed from: an0  reason: default package */
public final class an0 implements fjf<pn0> {
    private final wlf<ContentAccessTokenProvider> a;

    public an0(wlf<ContentAccessTokenProvider> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pn0(this.a.get());
    }
}
