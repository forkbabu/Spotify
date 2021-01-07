package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.podcast.freetierlikes.tabs.followed.p;
import com.spotify.player.model.ContextTrack;
import defpackage.xkc;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: ykc  reason: default package */
public final class ykc implements fjf<cbc<s<ryd>>> {
    private final wlf<dbc> a;
    private final wlf<p> b;
    private final wlf<Fragment> c;

    public ykc(wlf<dbc> wlf, wlf<p> wlf2, wlf<Fragment> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        dbc dbc = this.a.get();
        p pVar = this.b.get();
        Fragment fragment = this.c.get();
        xkc.a aVar = xkc.a;
        h.e(dbc, "factory");
        h.e(pVar, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(fragment, "fragment");
        cbc a2 = dbc.a(fragment, pVar.a());
        h.d(a2, "factory.create(fragment,…rovider.createLoadable())");
        return a2;
    }
}
