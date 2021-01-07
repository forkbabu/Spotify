package com.spotify.music.appprotocol.volume;

import com.spotify.mobile.android.service.media.v1;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.y;

public class l extends ff2 {
    private final v1 e;
    private final y f;
    private b g = c.a();
    private VolumeState h = VolumeState.DEFAULT_VOLUME_STATE;

    public l(v1 v1Var, ff2.a aVar, y yVar) {
        super(aVar);
        this.e = v1Var;
        this.f = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        ik1 A3 = this.e.A3();
        this.g = A3.g().J0(new h(A3)).o0(this.f).subscribe(new i(this));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        if (!this.g.d()) {
            this.g.dispose();
        }
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i) {
        if (!this.h.equals(VolumeState.DEFAULT_VOLUME_STATE)) {
            b(i, this.h);
        }
    }

    public /* synthetic */ void k(VolumeState volumeState) {
        this.h = volumeState;
        c(volumeState);
    }
}
