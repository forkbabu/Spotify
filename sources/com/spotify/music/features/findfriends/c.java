package com.spotify.music.features.findfriends;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

public final /* synthetic */ class c implements n {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}
