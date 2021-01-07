package com.spotify.pageloader;

import io.reactivex.functions.f;
import kotlin.jvm.internal.h;

final class r0 implements f {
    private final /* synthetic */ cmf a;

    r0(cmf cmf) {
        this.a = cmf;
    }

    @Override // io.reactivex.functions.f
    public final /* synthetic */ void cancel() {
        h.d(this.a.invoke(), "invoke(...)");
    }
}
