package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.functions.l;

public final /* synthetic */ class d1 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ AppProtocol.UriWithNamedOptions b;

    public /* synthetic */ d1(e4 e4Var, AppProtocol.UriWithNamedOptions uriWithNamedOptions) {
        this.a = e4Var;
        this.b = uriWithNamedOptions;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.Q(this.b, (PreparePlayOptions) obj);
    }
}
