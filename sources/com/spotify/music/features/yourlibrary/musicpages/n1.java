package com.spotify.music.features.yourlibrary.musicpages;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.u;
import com.spotify.music.features.yourlibrary.musicpages.pages.w;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.f;
import com.spotify.music.yourlibrary.interfaces.g;
import com.spotify.music.yourlibrary.interfaces.h;

public class n1 implements h {
    private final w a;

    /* access modifiers changed from: package-private */
    public class a implements g {
        final /* synthetic */ u a;
        final /* synthetic */ YourLibraryPageId b;
        final /* synthetic */ MusicPageId c;

        a(u uVar, YourLibraryPageId yourLibraryPageId, MusicPageId musicPageId) {
            this.a = uVar;
            this.b = yourLibraryPageId;
            this.c = musicPageId;
        }

        @Override // com.spotify.music.yourlibrary.interfaces.g
        public f a(c cVar, String str) {
            u uVar = this.a;
            MusicPagesFragment musicPagesFragment = new MusicPagesFragment();
            MusicPageId k = uVar.k();
            Bundle D2 = musicPagesFragment.D2();
            if (D2 == null) {
                D2 = new Bundle();
                musicPagesFragment.r4(D2);
            }
            D2.putSerializable("music-page-id", k);
            if (uVar.t().isPresent()) {
                String str2 = uVar.t().get();
                str2.getClass();
                String str3 = str2;
                Bundle D22 = musicPagesFragment.D2();
                if (D22 == null) {
                    D22 = new Bundle();
                    musicPagesFragment.r4(D22);
                }
                D22.putString("uri", str3);
            }
            Bundle D23 = musicPagesFragment.D2();
            if (D23 == null) {
                D23 = new Bundle();
                musicPagesFragment.r4(D23);
            }
            D23.putString("username", str);
            d.a(musicPagesFragment, cVar);
            return musicPagesFragment;
        }

        @Override // com.spotify.music.yourlibrary.interfaces.g
        public YourLibraryPageId b() {
            return this.b;
        }

        @Override // com.spotify.music.yourlibrary.interfaces.g
        public boolean c(String str) {
            return n1.this.a.c(this.c).a().contains(l0.z(str).q());
        }

        @Override // com.spotify.music.yourlibrary.interfaces.g
        public CharSequence getTitle() {
            return this.a.r();
        }
    }

    public n1(w wVar) {
        this.a = wVar;
    }

    private g c(YourLibraryPageId yourLibraryPageId) {
        MusicPageId musicPageId;
        int ordinal = yourLibraryPageId.ordinal();
        if (ordinal == 0) {
            musicPageId = MusicPageId.PLAYLISTS;
        } else if (ordinal == 1) {
            musicPageId = MusicPageId.ARTISTS;
        } else if (ordinal == 2) {
            musicPageId = MusicPageId.ALBUMS;
        } else if (ordinal == 3) {
            musicPageId = MusicPageId.SONGS;
        } else {
            throw new AssertionError("Not a valid Music page " + yourLibraryPageId);
        }
        return new a(this.a.b(musicPageId), yourLibraryPageId, musicPageId);
    }

    @Override // com.spotify.music.yourlibrary.interfaces.h
    public ImmutableList<g> a() {
        return ImmutableList.of(c(YourLibraryPageId.MUSIC_PLAYLISTS), c(YourLibraryPageId.MUSIC_ARTISTS), c(YourLibraryPageId.MUSIC_ALBUMS), c(YourLibraryPageId.MUSIC_SONGS));
    }
}
