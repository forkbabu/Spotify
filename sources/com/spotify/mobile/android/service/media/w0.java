package com.spotify.mobile.android.service.media;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class w0 implements l {
    public final /* synthetic */ a3 a;

    public /* synthetic */ w0(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f((LoggingParams) obj);
    }
}