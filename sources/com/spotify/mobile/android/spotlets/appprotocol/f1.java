package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.a0;
import io.reactivex.c0;

public final /* synthetic */ class f1 implements c0 {
    public final /* synthetic */ AppProtocol.UriWithNamedOptions a;

    public /* synthetic */ f1(AppProtocol.UriWithNamedOptions uriWithNamedOptions) {
        this.a = uriWithNamedOptions;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0 a0Var) {
        e4.P(this.a, a0Var);
    }
}
