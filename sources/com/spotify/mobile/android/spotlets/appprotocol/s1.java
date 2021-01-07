package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.l;

public final /* synthetic */ class s1 implements l {
    public final /* synthetic */ e4 a;

    public /* synthetic */ s1(e4 e4Var) {
        this.a = e4Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.Z((AppProtocol.Identifier) obj);
    }
}
