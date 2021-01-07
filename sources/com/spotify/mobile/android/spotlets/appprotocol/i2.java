package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.l;

public final /* synthetic */ class i2 implements l {
    public final /* synthetic */ AppProtocol.Identifier a;

    public /* synthetic */ i2(AppProtocol.Identifier identifier) {
        this.a = identifier;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new AppProtocol.Saved(this.a.id, ((Boolean) obj).booleanValue(), true);
    }
}
