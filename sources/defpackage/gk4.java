package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.charts.j;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: gk4  reason: default package */
public final class gk4 implements fjf<z<HubsJsonViewModel>> {
    private final wlf<c> a;
    private final wlf<j> b;

    public gk4(wlf<c> wlf, wlf<j> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        z<HubsJsonViewModel> zVar;
        c cVar = this.a.get();
        j jVar = this.b.get();
        h.e(cVar, "viewUri");
        h.e(jVar, "endpoint");
        l0 z = l0.z(cVar.toString());
        h.d(z, "SpotifyLink.of(viewUri.toString())");
        LinkType q = z.q();
        if (q != null) {
            int ordinal = q.ordinal();
            if (ordinal == 47) {
                String k = z.k();
                h.d(k, "link.lastSegment");
                zVar = jVar.b(k);
            } else if (ordinal == 50) {
                String k2 = z.k();
                h.d(k2, "link.lastSegment");
                zVar = jVar.a(k2);
            }
            yif.g(zVar, "Cannot return null from a non-@Nullable @Provides method");
            return zVar;
        }
        zVar = jVar.c();
        yif.g(zVar, "Cannot return null from a non-@Nullable @Provides method");
        return zVar;
    }
}
