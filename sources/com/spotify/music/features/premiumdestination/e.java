package com.spotify.music.features.premiumdestination;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Optional.fromNullable(((Map) obj).get("tablet-free"));
    }
}
