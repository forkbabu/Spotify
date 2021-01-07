package com.spotify.music.newplaying.scroll.widgets.podcastpolls.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class PodcastPollsWidgetView extends LinearLayout implements a {
    private awc a;

    public PodcastPollsWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(awc awc) {
        this.a = awc;
        addView(awc.a(LayoutInflater.from(getContext()), this));
    }

    public void b() {
        this.a.b();
    }

    public void c(String str) {
        this.a.c(str);
    }

    public void d() {
        this.a.stop();
    }

    public PodcastPollsWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
