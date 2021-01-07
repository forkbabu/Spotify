package com.spotify.music.podcast.freetierlikes.tabs.downloads;

import android.os.Bundle;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.podcast.freetierlikes.tabs.c;
import com.spotify.music.podcast.freetierlikes.tabs.d;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.g;

public class f implements g {
    private final c a;

    public f(d dVar) {
        this.a = dVar.a();
    }

    @Override // com.spotify.music.yourlibrary.interfaces.g
    public com.spotify.music.yourlibrary.interfaces.f a(com.spotify.android.flags.c cVar, String str) {
        DownloadsTabFragment downloadsTabFragment = new DownloadsTabFragment();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        downloadsTabFragment.r4(bundle);
        com.spotify.android.flags.d.a(downloadsTabFragment, cVar);
        return downloadsTabFragment;
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
