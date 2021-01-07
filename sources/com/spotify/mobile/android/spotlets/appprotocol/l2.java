package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.functions.l;

public final /* synthetic */ class l2 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ l2(e4 e4Var, String str, String str2) {
        this.a = e4Var;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.O(this.b, this.c, (PreparePlayOptions) obj);
    }
}
