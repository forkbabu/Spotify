package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.features.notificationsettings.common.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class w implements fjf<PageLoaderView.a<Pair<List<a>, Channel>>> {
    private final u a;
    private final wlf<zac> b;
    private final wlf<q> c;
    private final wlf<c.a> d;
    private final wlf<ij9> e;

    public w(u uVar, wlf<zac> wlf, wlf<q> wlf2, wlf<c.a> wlf3, wlf<ij9> wlf4) {
        this.a = uVar;
        this.b = wlf;
        this.c = wlf2;
        this.d = wlf3;
        this.e = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        u uVar = this.a;
        zac zac = this.b.get();
        q qVar = this.c.get();
        c.a aVar = this.d.get();
        ij9 ij9 = this.e.get();
        uVar.getClass();
        h.e(zac, "factory");
        h.e(qVar, "pageFactory");
        h.e(aVar, "viewUriProvider");
        h.e(ij9, "pageViewObservable");
        PageLoaderView.a b2 = zac.b(aVar.getViewUri(), ij9);
        b2.i(s.a);
        b2.e(new t(new ChannelDetailsPageLoaderModule$providePageLoaderViewBuilder$2(qVar)));
        h.d(b2, "factory\n            .cre…aded(pageFactory::create)");
        return b2;
    }
}
