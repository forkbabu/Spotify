package defpackage;

import com.spotify.music.features.queue.v;

/* renamed from: bx7  reason: default package */
public final class bx7 implements fjf<v> {
    private final wlf<rx7> a;

    public bx7(wlf<rx7> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get());
    }
}
