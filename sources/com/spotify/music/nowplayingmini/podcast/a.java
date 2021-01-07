package com.spotify.music.nowplayingmini.podcast;

import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PodcastModeFragment podcastModeFragment = new PodcastModeFragment();
        d.a(podcastModeFragment, (c) obj);
        return podcastModeFragment;
    }
}
