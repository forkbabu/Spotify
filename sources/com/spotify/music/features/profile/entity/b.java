package com.spotify.music.features.profile.entity;

import com.spotify.music.features.profile.model.LoadingState;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = ProfileEntityFragment.o0;
        if (((np7) obj).h() == LoadingState.FAILED) {
            throw new RuntimeException("Failed to load profile entity");
        }
    }
}
