package com.spotify.music.podcast.ui.topic;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class q extends RecyclerView.l {
    private final d a;

    public q(d dVar) {
        h.e(dVar, "childAdapterPositionResolver");
        this.a = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        h.e(rect, "outRect");
        h.e(view, "view");
        h.e(recyclerView, "parent");
        h.e(yVar, "state");
        RecyclerView.e adapter = recyclerView.getAdapter();
        boolean z = false;
        if (adapter != null) {
            if (this.a.a(recyclerView, view) < adapter.u() - 1) {
                z = true;
            }
        }
        if (z) {
            rect.right = view.getResources().getDimensionPixelOffset(C0707R.dimen.podcast_topic_padding_side);
        }
    }
}
