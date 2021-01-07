package com.spotify.music.storylines.service;

import com.google.common.base.Optional;
import com.spotify.mobile.android.storylines.model.StorylinesUris;
import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ StorylinesUrisFetcher a;

    public /* synthetic */ c(StorylinesUrisFetcher storylinesUrisFetcher) {
        this.a = storylinesUrisFetcher;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        StorylinesUrisFetcher storylinesUrisFetcher = this.a;
        storylinesUrisFetcher.getClass();
        if (((Optional) obj).isPresent()) {
            return a.u(new h(storylinesUrisFetcher));
        }
        z<StorylinesUris> E = storylinesUrisFetcher.q.b().J(30, TimeUnit.SECONDS, storylinesUrisFetcher.u).p(new g(storylinesUrisFetcher)).m(new d(storylinesUrisFetcher)).E(i.a);
        sjd sjd = storylinesUrisFetcher.r;
        sjd.getClass();
        return E.t(new a(sjd)).q(b.a).B();
    }
}
