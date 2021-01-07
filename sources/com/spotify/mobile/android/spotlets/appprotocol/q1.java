package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class q1 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AppProtocol.Identifier c;

    public /* synthetic */ q1(e4 e4Var, String str, AppProtocol.Identifier identifier) {
        this.a = e4Var;
        this.b = str;
        this.c = identifier;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.I(this.b, this.c, (LoggingParams) obj);
    }
}
