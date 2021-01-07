package com.spotify.music.features.podcast.episode;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;

public final /* synthetic */ class x implements k {
    public static final /* synthetic */ x a = new x();

    private /* synthetic */ x() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        String c = wna.c(l0Var.B());
        Bundle extras = intent.getExtras();
        String currentUserName = sessionState.currentUserName();
        PodcastEpisodeFragment podcastEpisodeFragment = new PodcastEpisodeFragment();
        Bundle bundle = new Bundle();
        c.getClass();
        bundle.putString("ARGUMENT_EPISODE_URI", c);
        bundle.putString("username", currentUserName);
        if (extras != null) {
            bundle.putBundle("ARGUMENT_EXTRAS", extras);
        }
        podcastEpisodeFragment.r4(bundle);
        d.a(podcastEpisodeFragment, cVar);
        return podcastEpisodeFragment;
    }
}
