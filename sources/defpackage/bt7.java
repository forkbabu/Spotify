package defpackage;

import com.spotify.music.follow.m;

/* renamed from: bt7  reason: default package */
public final class bt7 implements fjf<at7> {
    private final wlf<m> a;

    public bt7(wlf<m> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new at7(this.a.get());
    }
}
