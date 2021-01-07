package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.a;
import com.spotify.pageloader.PageLoaderView;
import defpackage.xkc;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: zkc  reason: default package */
public final class zkc implements fjf<PageLoaderView.a<s<ryd>>> {
    private final wlf<zac> a;
    private final wlf<c.a> b;
    private final wlf<com.spotify.mobile.android.ui.fragments.s> c;
    private final wlf<a.AbstractC0327a> d;

    public zkc(wlf<zac> wlf, wlf<c.a> wlf2, wlf<com.spotify.mobile.android.ui.fragments.s> wlf3, wlf<a.AbstractC0327a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        zac zac = this.a.get();
        c.a aVar = this.b.get();
        com.spotify.mobile.android.ui.fragments.s sVar = this.c.get();
        a.AbstractC0327a aVar2 = this.d.get();
        xkc.a aVar3 = xkc.a;
        h.e(zac, "factory");
        h.e(aVar, "viewUriProvider");
        h.e(sVar, "fragmentIdentifier");
        h.e(aVar2, "loadedPageElementFactory");
        PageLoaderView.a b2 = zac.b(aVar.getViewUri(), sVar.u0());
        b2.e(new wkc(aVar2));
        h.d(b2, "factory\n                …entFactory.create(data) }");
        return b2;
    }
}
