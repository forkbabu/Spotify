package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.DurationPlayPauseButton;
import kotlin.jvm.internal.h;

public final class a implements ControlBarViewBinder {
    private PodcastContextButton a;
    private PodcastContextButton b;
    private final ControlBarViewBinder.a c;

    /* renamed from: com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.a$a  reason: collision with other inner class name */
    /* compiled from: java-style lambda group */
    static final class View$OnClickListenerC0315a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public View$OnClickListenerC0315a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                ((a) this.b).c.a(a.c((a) this.b).getCurrentMode(), true);
            } else if (i == 1) {
                ((a) this.b).c.a(a.e((a) this.b).getCurrentMode(), false);
            } else {
                throw null;
            }
        }
    }

    public a(ControlBarViewBinder.a aVar) {
        h.e(aVar, "listener");
        this.c = aVar;
    }

    public static final /* synthetic */ PodcastContextButton c(a aVar) {
        PodcastContextButton podcastContextButton = aVar.a;
        if (podcastContextButton != null) {
            return podcastContextButton;
        }
        h.k("leftButton");
        throw null;
    }

    public static final /* synthetic */ PodcastContextButton e(a aVar) {
        PodcastContextButton podcastContextButton = aVar.b;
        if (podcastContextButton != null) {
            return podcastContextButton;
        }
        h.k("rightButton");
        throw null;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder
    public void a(ViewGroup viewGroup) {
        h.e(viewGroup, "root");
        View findViewById = viewGroup.findViewById(C0707R.id.duration_play_pause_button);
        h.d(findViewById, "findViewById(R.id.duration_play_pause_button)");
        DurationPlayPauseButton durationPlayPauseButton = (DurationPlayPauseButton) findViewById;
        View findViewById2 = viewGroup.findViewById(C0707R.id.button_left);
        h.d(findViewById2, "findViewById(R.id.button_left)");
        this.a = (PodcastContextButton) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0707R.id.button_right);
        h.d(findViewById3, "findViewById(R.id.button_right)");
        this.b = (PodcastContextButton) findViewById3;
        PodcastContextButton podcastContextButton = this.a;
        if (podcastContextButton != null) {
            podcastContextButton.setOnClickListener(new View$OnClickListenerC0315a(0, this));
            PodcastContextButton podcastContextButton2 = this.b;
            if (podcastContextButton2 != null) {
                podcastContextButton2.setOnClickListener(new View$OnClickListenerC0315a(1, this));
            } else {
                h.k("rightButton");
                throw null;
            }
        } else {
            h.k("leftButton");
            throw null;
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder
    public void b(ControlBarViewBinder.Mode mode, boolean z) {
        h.e(mode, "mode");
        PodcastContextButton podcastContextButton = this.a;
        if (podcastContextButton != null) {
            podcastContextButton.e(mode, z);
            PodcastContextButton podcastContextButton2 = this.b;
            if (podcastContextButton2 != null) {
                podcastContextButton2.e(mode, z);
            } else {
                h.k("rightButton");
                throw null;
            }
        } else {
            h.k("leftButton");
            throw null;
        }
    }
}
