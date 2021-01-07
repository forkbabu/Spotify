package com.spotify.music.podcast.freetierlikes.tabs.followed;

import android.os.Bundle;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.podcast.freetierlikes.tabs.c;
import com.spotify.music.podcast.freetierlikes.tabs.d;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.f;
import com.spotify.music.yourlibrary.interfaces.g;

public class k implements g {
    private final c a;

    public k(d dVar) {
        this.a = dVar.c();
    }

    @Override // com.spotify.music.yourlibrary.interfaces.g
    public f a(com.spotify.android.flags.c cVar, String str) {
        FollowedPodcastsTabFragment followedPodcastsTabFragment = new FollowedPodcastsTabFragment();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        followedPodcastsTabFragment.r4(bundle);
        com.spotify.android.flags.d.a(followedPodcastsTabFragment, cVar);
        return followedPodcastsTabFragment;
    }

    @Override // com.spotify.music.yourlibrary.interfaces.g
    public YourLibraryPageId b() {
        return this.a.f();
    }

    @Override // com.spotify.music.yourlibrary.interfaces.g
    public boolean c(String str) {
        return this.a.a().contains(l0.z(str).q());
    }

    @Override // com.spotify.music.yourlibrary.interfaces.g
    public CharSequence getTitle() {
        return this.a.g();
    }
}
