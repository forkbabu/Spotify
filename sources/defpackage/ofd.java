package defpackage;

import com.spotify.http.u;

/* renamed from: ofd  reason: default package */
public final class ofd implements fjf<rfd> {
    private final wlf<u> a;

    public ofd(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        rfd rfd = (rfd) this.a.get().c(rfd.class);
        yif.g(rfd, "Cannot return null from a non-@Nullable @Provides method");
        return rfd;
    }
}
