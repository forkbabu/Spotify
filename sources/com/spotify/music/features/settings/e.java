package com.spotify.music.features.settings;

import com.google.common.base.Optional;
import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(!Ad.DEFAULT_SKIPPABLE_AD_DELAY.equals(((Optional) obj).orNull()));
    }
}
