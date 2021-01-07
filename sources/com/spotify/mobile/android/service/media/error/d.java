package com.spotify.mobile.android.service.media.error;

import com.spotify.player.sub.l;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.s;

public class d implements c {
    private final l a;
    private final PublishProcessor<EISError> b = PublishProcessor.r0();

    public d(l lVar) {
        this.a = lVar;
    }

    @Override // com.spotify.mobile.android.service.media.error.c
    public s<EISError> a() {
        s<R> Q = this.a.error().j0(a.a).Q(b.a);
        PublishProcessor<EISError> publishProcessor = this.b;
        publishProcessor.getClass();
        return Q.n0(new v(publishProcessor));
    }

    @Override // com.spotify.mobile.android.service.media.error.c
    public void b(EISError eISError) {
        this.b.onNext(eISError);
    }
}
