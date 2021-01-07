package defpackage;

import android.content.Context;
import com.spotify.music.navigation.o;

/* renamed from: fb4  reason: default package */
public final class fb4 implements fjf<a64> {
    private final wlf<Context> a;
    private final wlf<o> b;

    public fb4(wlf<Context> wlf, wlf<o> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w54(this.a.get(), this.b.get());
    }
}
