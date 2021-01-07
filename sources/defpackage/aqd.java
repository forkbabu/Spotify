package defpackage;

import com.spotify.android.flags.c;
import com.spotify.music.yourlibrary.interfaces.h;
import java.util.Set;

/* renamed from: aqd  reason: default package */
public final class aqd implements fjf<zpd> {
    private final wlf<Set<h>> a;
    private final wlf<c> b;

    public aqd(wlf<Set<h>> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zpd(this.a.get(), this.b.get());
    }
}
