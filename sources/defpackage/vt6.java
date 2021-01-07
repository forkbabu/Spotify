package defpackage;

import android.app.Activity;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.playlistentity.z;
import com.spotify.music.navigation.r;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.scannables.c;
import io.reactivex.y;

/* renamed from: vt6  reason: default package */
public final class vt6 implements fjf<ut6> {
    private final wlf<Activity> a;
    private final wlf<y> b;
    private final wlf<t> c;
    private final wlf<wt6> d;
    private final wlf<c> e;
    private final wlf<z> f;
    private final wlf<r> g;
    private final wlf<ImmutableList<gu6>> h;
    private final wlf<ImmutableList<eu6>> i;

    public vt6(wlf<Activity> wlf, wlf<y> wlf2, wlf<t> wlf3, wlf<wt6> wlf4, wlf<c> wlf5, wlf<z> wlf6, wlf<r> wlf7, wlf<ImmutableList<gu6>> wlf8, wlf<ImmutableList<eu6>> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ut6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
