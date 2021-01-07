package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.TrackListPageLoaderFragment;
import com.spotify.music.navigation.k;

/* renamed from: ca7  reason: default package */
public class ca7 implements blb, k {
    @Override // com.spotify.music.navigation.k
    public s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        String B = l0Var.B();
        TrackListPageLoaderFragment trackListPageLoaderFragment = new TrackListPageLoaderFragment();
        Bundle bundle = new Bundle();
        bundle.putString("episode_tracklist", B);
        trackListPageLoaderFragment.r4(bundle);
        return trackListPageLoaderFragment;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).i(LinkType.SHOW_EPISODE_TRACKLIST, "Show episode tracklist", this);
    }
}
