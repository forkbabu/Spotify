package defpackage;

import com.spotify.music.features.addtoplaylist.d;
import kotlin.jvm.internal.h;

/* renamed from: vbb  reason: default package */
public final class vbb implements fjf<rbb> {
    private final wlf<d> a;
    private final wlf<obb> b;

    public vbb(wlf<d> wlf, wlf<obb> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        d dVar = this.a.get();
        obb obb = this.b.get();
        h.e(dVar, "addToPlaylistNavigator");
        h.e(obb, "snackbarManager");
        return new tbb(dVar, obb);
    }
}
