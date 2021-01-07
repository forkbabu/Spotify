package defpackage;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.z;
import com.spotify.music.features.quicksilver.v2.mobius.InAppMessagingModel;
import com.spotify.music.features.quicksilver.v2.mobius.a;
import com.spotify.music.features.quicksilver.v2.mobius.g;
import com.spotify.music.features.quicksilver.v2.mobius.h;
import io.reactivex.y;

/* renamed from: k18  reason: default package */
public final class k18 implements fjf<MobiusLoop.f<InAppMessagingModel, h, g>> {
    private final wlf<y> a;
    private final wlf<q<h>> b;
    private final wlf<q18> c;

    public k18(wlf<y> wlf, wlf<q<h>> wlf2, wlf<q18> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        y yVar = this.a.get();
        ny7 ny7 = ny7.a;
        m f = i.f();
        f.d(g.a.class, new a(this.c.get()));
        MobiusLoop.f f2 = z.c(ny7, i.b(f.i())).h(this.b.get()).b(new gz7(yVar)).d(new ez7(yVar)).f(b.g("InAppMessagingLibraryManagerMobius"));
        yif.g(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }
}
