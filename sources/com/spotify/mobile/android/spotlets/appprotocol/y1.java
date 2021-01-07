package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.base.Optional;
import io.reactivex.functions.f;

public final /* synthetic */ class y1 implements f {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ Optional b;

    public /* synthetic */ y1(e4 e4Var, Optional optional) {
        this.a = e4Var;
        this.b = optional;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.J(this.b);
    }
}
