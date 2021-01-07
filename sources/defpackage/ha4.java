package defpackage;

import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.music.features.browse.b;
import com.spotify.music.features.browse.e;

/* renamed from: ha4  reason: default package */
public final class ha4 implements fjf<b> {
    private final wlf<Bundle> a;
    private final wlf<c> b;
    private final wlf<fm9> c;

    public ha4(wlf<Bundle> wlf, wlf<c> wlf2, wlf<fm9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return e.c(this.a.get(), this.b.get(), this.c.get());
    }
}
