package defpackage;

import com.spotify.mobile.android.skiplimitpivot.view.OnDemandPlaylistsPresenter;
import com.spotify.mobile.android.skiplimitpivot.view.g;
import com.spotify.remoteconfig.ek;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: to1  reason: default package */
public final class to1 implements fjf<OnDemandPlaylistsPresenter> {
    private final wlf<lo1> a;
    private final wlf<g> b;
    private final wlf<y> c;
    private final wlf<op1> d;
    private final wlf<ek> e;

    public to1(wlf<lo1> wlf, wlf<g> wlf2, wlf<y> wlf3, wlf<op1> wlf4, wlf<ek> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        lo1 lo1 = this.a.get();
        g gVar = this.b.get();
        y yVar = this.c.get();
        op1 op1 = this.d.get();
        ek ekVar = this.e.get();
        h.e(lo1, "dataSource");
        h.e(gVar, "onDemandPlaylistsViewBinder");
        h.e(yVar, "scheduler");
        h.e(op1, "skipLimitInAppMessageTriggerManager");
        h.e(ekVar, "skipLimitPivotToOnDemandProperties");
        return new OnDemandPlaylistsPresenter(lo1.a(), gVar, yVar, op1, ekVar);
    }
}
