package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import defpackage.cf2;
import io.reactivex.s;

public final /* synthetic */ class n implements cf2.c {
    public final /* synthetic */ v3 a;

    public /* synthetic */ n(v3 v3Var) {
        this.a = v3Var;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        return this.a.H((AppProtocolBase.Empty) jacksonModel);
    }
}
