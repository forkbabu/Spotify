package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.functions.l;

public final /* synthetic */ class k2 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ PreparePlayOptions b;
    public final /* synthetic */ String c;

    public /* synthetic */ k2(e4 e4Var, PreparePlayOptions preparePlayOptions, String str) {
        this.a = e4Var;
        this.b = preparePlayOptions;
        this.c = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.M(this.b, this.c, (String) obj);
    }
}
