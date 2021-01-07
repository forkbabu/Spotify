package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.features.charts.c;
import com.spotify.music.features.charts.d;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: fk4  reason: default package */
public final class fk4 implements fjf<d> {
    private final wlf<Resources> a;
    private final wlf<z<HubsJsonViewModel>> b;
    private final wlf<y> c;
    private final wlf<y> d;

    public fk4(wlf<Resources> wlf, wlf<z<HubsJsonViewModel>> wlf2, wlf<y> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        Resources resources = this.a.get();
        z<HubsJsonViewModel> zVar = this.b.get();
        y yVar = this.c.get();
        y yVar2 = this.d.get();
        h.e(resources, "resources");
        h.e(zVar, "dataSource");
        h.e(yVar, "mainThread");
        h.e(yVar2, "computation");
        return new c(resources, zVar, yVar, yVar2);
    }
}
