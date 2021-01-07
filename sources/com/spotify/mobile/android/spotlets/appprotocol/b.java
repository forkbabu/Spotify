package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ z3 a;

    public /* synthetic */ b(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g((SessionState) obj);
    }
}
