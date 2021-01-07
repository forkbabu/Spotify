package com.spotify.music.libs.mediabrowserservice;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class x implements l {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ long b;

    public /* synthetic */ x(a2 a2Var, long j) {
        this.a = a2Var;
        this.b = j;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f.Z2().t(this.b, (Optional) obj);
    }
}
