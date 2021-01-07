package com.spotify.music.features.assistedcuration.search.utils;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ RestrictedPlaybackCommandHelper a;

    public /* synthetic */ a(RestrictedPlaybackCommandHelper restrictedPlaybackCommandHelper) {
        this.a = restrictedPlaybackCommandHelper;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        RestrictedPlaybackCommandHelper.d(this.a, ((Boolean) obj).booleanValue());
    }
}
