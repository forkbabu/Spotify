package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import defpackage.cf2;
import io.reactivex.s;

public final /* synthetic */ class k0 implements cf2.c {
    public final /* synthetic */ v3 a;

    public /* synthetic */ k0(v3 v3Var) {
        this.a = v3Var;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        return this.a.f((AppProtocolBase.Empty) jacksonModel);
    }
}
