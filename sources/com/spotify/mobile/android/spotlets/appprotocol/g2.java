package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.l;

public final /* synthetic */ class g2 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ AppProtocol.SkipPrevious b;

    public /* synthetic */ g2(e4 e4Var, AppProtocol.SkipPrevious skipPrevious) {
        this.a = e4Var;
        this.b = skipPrevious;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.Y(this.b, (Optional) obj);
    }
}
