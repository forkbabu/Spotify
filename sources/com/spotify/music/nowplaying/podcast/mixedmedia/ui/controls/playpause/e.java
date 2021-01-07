package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause;

import android.view.View;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.h;
import kotlin.jvm.internal.h;

public final class e implements d {
    private h a;

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.d
    public void a(View view) {
        h.e(view, "rootView");
        View findViewById = view.findViewById(C0707R.id.duration_play_pause_button);
        h.d(findViewById, "rootView.findViewById(R.…ration_play_pause_button)");
        this.a = (h) findViewById;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.h
    public void f(boolean z) {
        h hVar = this.a;
        if (hVar != null) {
            hVar.f(z);
        } else {
            h.k("durationPlayPauseButton");
            throw null;
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.h
    public void setOnToggleListener(h.a aVar) {
        h hVar = this.a;
        if (hVar != null) {
            hVar.setOnToggleListener(aVar);
        } else {
            kotlin.jvm.internal.h.k("durationPlayPauseButton");
            throw null;
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.g
    public void setPosition(float f) {
        h hVar = this.a;
        if (hVar != null) {
            if (!(hVar instanceof g)) {
                hVar = null;
            }
            g gVar = (g) hVar;
            if (gVar != null) {
                gVar.setPosition(f);
                return;
            }
            return;
        }
        kotlin.jvm.internal.h.k("durationPlayPauseButton");
        throw null;
    }
}
