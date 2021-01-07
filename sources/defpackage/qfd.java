package defpackage;

import com.spotify.http.u;

/* renamed from: qfd  reason: default package */
public final class qfd implements fjf<ufd> {
    private final wlf<u> a;

    public qfd(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ufd ufd = (ufd) this.a.get().c(ufd.class);
        yif.g(ufd, "Cannot return null from a non-@Nullable @Provides method");
        return ufd;
    }
}
