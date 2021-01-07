package com.spotify.music.features.profile.entity;

import com.spotify.music.features.profile.model.LoadingState;
import io.reactivex.functions.n;

public final /* synthetic */ class d implements n {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = ProfileEntityFragment.o0;
        return ((np7) obj).h() == LoadingState.LOADED;
    }
}
