package com.spotify.music.features.premiumdestination;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.subjects.PublishSubject;

public final class y implements fjf<e61> {
    private final wlf<Context> a;
    private final wlf<c> b;
    private final wlf<w51> c;
    private final wlf<m> d;
    private final wlf<PublishSubject<RecyclerView>> e;

    public y(wlf<Context> wlf, wlf<c> wlf2, wlf<w51> wlf3, wlf<m> wlf4, wlf<PublishSubject<RecyclerView>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        e61 b2 = HubsGlueViewBinderFactories.c(this.b.get()).d(HubsGlueViewBinderFactories.HeaderPolicy.ALWAYS_ON_TOP).a(this.d.get()).b().b(this.a.get(), this.c.get(), new n(this.e.get()));
        yif.g(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
