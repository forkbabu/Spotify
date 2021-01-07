package com.spotify.music.features.profile.profilelist;

import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.e;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = ProfileListFragment.l0;
        if (((e) obj).c() == LoadingState.FAILED) {
            throw new RuntimeException("Error loading profile list data");
        }
    }
}
