package com.spotify.mobile.android.observablestates.docking;

import io.reactivex.f;
import io.reactivex.t;

public class e {
    private f<Boolean> a;
    private boolean b;

    public /* synthetic */ void a(t tVar) {
        this.a = tVar;
        tVar.onNext(Boolean.valueOf(this.b));
    }

    public void b(boolean z) {
        this.b = z;
        f<Boolean> fVar = this.a;
        if (fVar != null) {
            fVar.onNext(Boolean.valueOf(z));
        }
    }
}
