package com.spotify.music.newplaying.scroll.widgets.podcastqna.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import kotlin.jvm.internal.h;

public final class PodcastQnAWidgetView extends LinearLayout implements a {
    private ttc a;

    public PodcastQnAWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.podcastqna.view.a
    public void a(String str) {
        h.e(str, "episodeUri");
        ttc ttc = this.a;
        if (ttc != null) {
            ttc.b(str);
        }
    }

    public final void b(ttc ttc) {
        h.e(ttc, "podcastQnA");
        this.a = ttc;
        LayoutInflater from = LayoutInflater.from(getContext());
        h.d(from, "LayoutInflater.from(context)");
        addView(ttc.a(from, this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PodcastQnAWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
