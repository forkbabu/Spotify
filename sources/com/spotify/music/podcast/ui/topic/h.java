package com.spotify.music.podcast.ui.topic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import java.util.List;

public final class h implements g90 {
    private final Context a;
    private final OverFlowLayout b;

    private h(Context context, ViewGroup viewGroup, int i) {
        this.a = context;
        OverFlowLayout overFlowLayout = (OverFlowLayout) LayoutInflater.from(context).inflate(C0707R.layout.podcast_topics_section, viewGroup, false);
        this.b = overFlowLayout;
        if (i != 0) {
            overFlowLayout.setRowInnerPadding(i);
        }
    }

    public static h c(Context context, ViewGroup viewGroup, int i) {
        return new h(context, viewGroup, i);
    }

    public void b(List<g> list, f fVar) {
        this.b.removeAllViews();
        for (g gVar : list) {
            e b2 = e.b(this.a);
            b2.d(gVar.b());
            b2.c(null, gVar.c());
            this.b.addView(b2.getView());
        }
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.b;
    }
}
