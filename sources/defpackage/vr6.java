package defpackage;

import com.spotify.music.navigation.b;
import com.spotify.music.navigation.o;

/* renamed from: vr6  reason: default package */
public final class vr6 implements fjf<ur6> {
    private final wlf<b> a;
    private final wlf<o> b;

    public vr6(wlf<b> wlf, wlf<o> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ur6(this.a.get(), this.b.get());
    }
}
