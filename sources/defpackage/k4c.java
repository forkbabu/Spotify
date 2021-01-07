package defpackage;

import com.spotify.playlist.formatlisttype.a;

/* renamed from: k4c  reason: default package */
public final class k4c implements fjf<j4c> {
    private final wlf<a> a;

    public k4c(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j4c(this.a.get());
    }
}
