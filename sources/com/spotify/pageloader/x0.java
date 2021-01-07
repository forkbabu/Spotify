package com.spotify.pageloader;

import io.reactivex.f;
import io.reactivex.r;
import kotlin.jvm.internal.h;

public final class x0 {
    public static final <T> void a(f<T> fVar, r<T> rVar) {
        h.e(fVar, "$this$onNotification");
        h.e(rVar, "notification");
        if (rVar.h()) {
            T e = rVar.e();
            h.c(e);
            fVar.onNext(e);
        } else if (rVar.g()) {
            Throwable d = rVar.d();
            h.c(d);
            fVar.onError(d);
        } else if (rVar.f()) {
            fVar.onComplete();
        } else {
            throw new IllegalArgumentException("invalid notification: " + rVar);
        }
    }
}
