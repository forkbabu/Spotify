package com.spotify.music.features.profile.profilelist;

import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.e;
import io.reactivex.functions.n;

public final /* synthetic */ class b implements n {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = ProfileListFragment.l0;
        return ((e) obj).c() == LoadingState.LOADED;
    }
}
