package com.spotify.music.features.ads.screensaver;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

public final /* synthetic */ class a implements n {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}
