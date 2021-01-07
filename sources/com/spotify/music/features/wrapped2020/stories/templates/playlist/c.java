package com.spotify.music.features.wrapped2020.stories.templates.playlist;

import android.animation.Animator;
import android.view.View;
import com.spotify.music.features.wrapped2020.stories.templates.playlist.PlaylistStory;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class c implements View.OnClickListener {
    final /* synthetic */ PlaylistStory a;

    static final class a<T> implements g<Boolean> {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            Boolean bool2 = bool;
            h.d(bool2, "isSuccess");
            if (bool2.booleanValue()) {
                PlaylistStory.o(this.a.a).e(PlaylistStory.p(this.a.a).k(), PlaylistStory.p(this.a.a).i());
                PlaylistStory.s(this.a.a, PlaylistStory.PlaylistState.ADDED);
                PlaylistStory playlistStory = this.a.a;
                Animator l = PlaylistStory.l(playlistStory);
                l.start();
                PlaylistStory.t(playlistStory, l);
                return;
            }
            PlaylistStory.s(this.a.a, PlaylistStory.PlaylistState.NOT_ADDED);
        }
    }

    c(PlaylistStory playlistStory) {
        this.a = playlistStory;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Animator m = PlaylistStory.m(this.a);
        if (m != null) {
            wz8.b(m);
        }
        PlaylistStory.s(this.a, PlaylistStory.PlaylistState.INDETERMINATE);
        q n = PlaylistStory.n(this.a);
        PlaylistStory playlistStory = this.a;
        n.a(PlaylistStory.k(playlistStory, PlaylistStory.p(playlistStory).i()).B(io.reactivex.android.schedulers.a.b()).subscribe(new a(this)));
    }
}
