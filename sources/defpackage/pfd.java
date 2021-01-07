package defpackage;

import com.spotify.http.u;

/* renamed from: pfd  reason: default package */
public final class pfd implements fjf<tfd> {
    private final wlf<u> a;

    public pfd(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        tfd tfd = (tfd) this.a.get().c(tfd.class);
        yif.g(tfd, "Cannot return null from a non-@Nullable @Provides method");
        return tfd;
    }
}
