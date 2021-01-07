package defpackage;

import com.google.android.exoplayer2.offline.n;
import com.spotify.android.storage.e;
import com.spotify.mobile.android.video.offline.t;
import com.spotify.mobile.android.video.offline.x;
import java.io.File;

/* renamed from: y72  reason: default package */
public final class y72 implements fjf<t> {
    private final wlf<n> a;
    private final wlf<x> b;
    private final wlf<r82> c;
    private final wlf<File> d;
    private final wlf<Boolean> e;

    public y72(wlf<n> wlf, wlf<x> wlf2, wlf<r82> wlf3, wlf<File> wlf4, wlf<Boolean> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get(), this.b.get(), this.c.get(), new e(), this.d.get(), this.e.get().booleanValue());
    }
}
