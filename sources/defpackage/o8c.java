package defpackage;

import com.spotify.music.offline.b;

/* renamed from: o8c  reason: default package */
public final class o8c implements fjf<n8c> {
    private final wlf<b> a;

    public o8c(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n8c(this.a.get());
    }
}
