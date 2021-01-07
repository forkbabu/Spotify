package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import java.util.List;
import kotlin.jvm.internal.h;

public final class v implements fjf<PageLoaderView.a<List<Channel>>> {
    private final s a;
    private final wlf<zac> b;
    private final wlf<o> c;
    private final wlf<c.a> d;
    private final wlf<ij9> e;

    public v(s sVar, wlf<zac> wlf, wlf<o> wlf2, wlf<c.a> wlf3, wlf<ij9> wlf4) {
        this.a = sVar;
        this.b = wlf;
        this.c = wlf2;
        this.d = wlf3;
        this.e = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        s sVar = this.a;
        zac zac = this.b.get();
        o oVar = this.c.get();
        c.a aVar = this.d.get();
        ij9 ij9 = this.e.get();
        sVar.getClass();
        h.e(zac, "factory");
        h.e(oVar, "pageFactory");
        h.e(aVar, "viewUriProvider");
        h.e(ij9, "pageViewObservable");
        PageLoaderView.a b2 = zac.b(aVar.getViewUri(), ij9);
        b2.i(q.a);
        b2.e(new r(new ChannelsPageLoaderModule$providePageLoaderViewBuilder$2(oVar)));
        h.d(b2, "factory\n            .cre…aded(pageFactory::create)");
        return b2;
    }
}
