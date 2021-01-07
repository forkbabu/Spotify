package defpackage;

import android.app.Activity;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.z;
import com.spotify.music.navigation.r;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.scannables.c;
import defpackage.zt6;
import io.reactivex.y;

/* renamed from: ut6  reason: default package */
final class ut6 implements zt6.a {
    private final wlf<Activity> a;
    private final wlf<y> b;
    private final wlf<t> c;
    private final wlf<wt6> d;
    private final wlf<c> e;
    private final wlf<z> f;
    private final wlf<r> g;
    private final wlf<ImmutableList<gu6>> h;
    private final wlf<ImmutableList<eu6>> i;

    ut6(wlf<Activity> wlf, wlf<y> wlf2, wlf<t> wlf3, wlf<wt6> wlf4, wlf<c> wlf5, wlf<z> wlf6, wlf<r> wlf7, wlf<ImmutableList<gu6>> wlf8, wlf<ImmutableList<eu6>> wlf9) {
        c(wlf, 1);
        this.a = wlf;
        c(wlf2, 2);
        this.b = wlf2;
        c(wlf3, 3);
        this.c = wlf3;
        c(wlf4, 4);
        this.d = wlf4;
        c(wlf5, 5);
        this.e = wlf5;
        c(wlf6, 6);
        this.f = wlf6;
        c(wlf7, 7);
        this.g = wlf7;
        c(wlf8, 8);
        this.h = wlf8;
        c(wlf9, 9);
        this.i = wlf9;
    }

    private static <T> T c(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    @Override // defpackage.zt6.a
    public zt6 a(ToolbarConfiguration toolbarConfiguration, ImmutableList immutableList, ImmutableList immutableList2) {
        Activity activity = this.a.get();
        c(activity, 1);
        Activity activity2 = activity;
        y yVar = this.b.get();
        c(yVar, 2);
        y yVar2 = yVar;
        t tVar = this.c.get();
        c(tVar, 3);
        t tVar2 = tVar;
        wt6 wt6 = this.d.get();
        c(wt6, 4);
        wt6 wt62 = wt6;
        c cVar = this.e.get();
        c(cVar, 5);
        c cVar2 = cVar;
        z zVar = this.f.get();
        c(zVar, 6);
        z zVar2 = zVar;
        r rVar = this.g.get();
        c(rVar, 7);
        c(toolbarConfiguration, 8);
        c(immutableList, 9);
        c(immutableList2, 10);
        return new tt6(activity2, yVar2, tVar2, wt62, cVar2, zVar2, rVar, immutableList, immutableList2, toolbarConfiguration);
    }

    @Override // defpackage.zt6.a
    public zt6 b(ToolbarConfiguration toolbarConfiguration) {
        Activity activity = this.a.get();
        c(activity, 1);
        Activity activity2 = activity;
        y yVar = this.b.get();
        c(yVar, 2);
        y yVar2 = yVar;
        t tVar = this.c.get();
        c(tVar, 3);
        t tVar2 = tVar;
        wt6 wt6 = this.d.get();
        c(wt6, 4);
        wt6 wt62 = wt6;
        c cVar = this.e.get();
        c(cVar, 5);
        c cVar2 = cVar;
        z zVar = this.f.get();
        c(zVar, 6);
        z zVar2 = zVar;
        r rVar = this.g.get();
        c(rVar, 7);
        r rVar2 = rVar;
        ImmutableList<gu6> immutableList = this.h.get();
        c(immutableList, 8);
        ImmutableList<gu6> immutableList2 = immutableList;
        ImmutableList<eu6> immutableList3 = this.i.get();
        c(immutableList3, 9);
        c(toolbarConfiguration, 10);
        return new tt6(activity2, yVar2, tVar2, wt62, cVar2, zVar2, rVar2, immutableList2, immutableList3, toolbarConfiguration);
    }
}
