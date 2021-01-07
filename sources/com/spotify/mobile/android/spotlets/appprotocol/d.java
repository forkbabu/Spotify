package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

public final /* synthetic */ class d implements n {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}
