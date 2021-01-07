package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.l;

public final /* synthetic */ class i1 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ AppProtocol.PlaybackPosition b;

    public /* synthetic */ i1(e4 e4Var, AppProtocol.PlaybackPosition playbackPosition) {
        this.a = e4Var;
        this.b = playbackPosition;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.T(this.b, (Optional) obj);
    }
}
