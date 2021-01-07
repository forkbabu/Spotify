package com.spotify.music.appprotocol.volume;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import defpackage.cf2;
import io.reactivex.s;

public final /* synthetic */ class e implements cf2.c {
    public final /* synthetic */ k a;

    public /* synthetic */ e(k kVar) {
        this.a = kVar;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        return this.a.g((AppProtocolBase.Empty) jacksonModel);
    }
}
