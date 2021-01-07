package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import defpackage.cf2;

public final /* synthetic */ class s implements cf2.c {
    public final /* synthetic */ v3 a;

    public /* synthetic */ s(v3 v3Var) {
        this.a = v3Var;
    }

    @Override // defpackage.cf2.c
    public final io.reactivex.s a(JacksonModel jacksonModel) {
        return this.a.d((AppProtocolBase.Empty) jacksonModel);
    }
}
