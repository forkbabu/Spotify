package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: fb7  reason: default package */
public final class fb7 implements fjf<eb7> {
    private final wlf<t> a;

    public fb7(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new eb7(this.a.get());
    }
}
