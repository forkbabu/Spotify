package com.spotify.music.features.premiumdestination;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        return Boolean.valueOf(optional.isPresent() && "1".equals(optional.get()));
    }
}
