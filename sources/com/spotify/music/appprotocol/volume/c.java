package com.spotify.music.appprotocol.volume;

import com.spotify.mobile.android.cosmos.JacksonModel;
import defpackage.cf2;
import io.reactivex.s;

public final /* synthetic */ class c implements cf2.c {
    public final /* synthetic */ k a;

    public /* synthetic */ c(k kVar) {
        this.a = kVar;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        return this.a.h((VolumeLevel) jacksonModel);
    }
}
