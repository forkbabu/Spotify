package com.spotify.mobile.android.hubframework.defaults.playback;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ PlayFromContextCommandHandler a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ PreparePlayOptions f;

    public /* synthetic */ g(PlayFromContextCommandHandler playFromContextCommandHandler, Context context, String str, PreparePlayOptions preparePlayOptions) {
        this.a = playFromContextCommandHandler;
        this.b = context;
        this.c = str;
        this.f = preparePlayOptions;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, this.f, (Boolean) obj);
    }
}
