package defpackage;

import androidx.lifecycle.n;
import com.spotify.music.playlist.synchronizer.d;

/* renamed from: w69  reason: default package */
public final class w69 implements fjf<d> {
    private final wlf<d.a> a;
    private final wlf<n> b;

    public w69(wlf<d.a> wlf, wlf<n> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        d a2 = this.a.get().a(this.b.get());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
