package com.spotify.music.features.yourlibrary.container;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.v;
import com.spotify.music.features.yourlibrary.musicpages.pages.w;
import com.spotify.music.libs.viewuri.c;

public final class d {
    public static c a(MusicPageId musicPageId, String str) {
        v vVar = w.a().get(musicPageId);
        Optional<c> e = vVar.e();
        Optional<c.b> f = vVar.f();
        if (!e.isPresent() && !f.isPresent()) {
            throw new IllegalArgumentException("You need to provide either ViewUri or ViewUriVerifier in the MusicPagesSetup");
        } else if (e.isPresent()) {
            return e.get();
        } else {
            if (str != null) {
                return f.get().b(str);
            }
            throw new IllegalArgumentException("If you provide a ViewUriVerifier You need to provide a uri");
        }
    }
}
