package com.spotify.effortlesslogin;

import com.spotify.effortlesslogin.backend.EffortlessLoginTokenResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public final /* synthetic */ p a;

    public /* synthetic */ h(p pVar) {
        this.a = pVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.i((EffortlessLoginTokenResponse) obj);
    }
}
