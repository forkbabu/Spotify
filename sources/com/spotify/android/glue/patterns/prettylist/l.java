package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

public class l extends o<StickyRecyclerView> implements k {
    public l(Context context, View view, int i) {
        super(context, view, i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void a(boolean z) {
        p(((StickyRecyclerView) this.a).getRecyclerView(), this.b.getDefaultScrollOffset(), z);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void b(boolean z) {
        p(((StickyRecyclerView) this.a).getRecyclerView(), ((StickyRecyclerView) this.a).getStickinessOffset(), z);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.o, com.spotify.android.glue.patterns.prettylist.m
    public PrettyHeaderView getPrettyHeaderView() {
        return this.b;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.k
    public RecyclerView getRecyclerView() {
        return ((StickyRecyclerView) this.a).getRecyclerView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.k
    public StickyRecyclerView getStickyRecyclerView() {
        return (StickyRecyclerView) this.a;
    }

    /* Return type fixed from 'android.view.View' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.prettylist.o
    public StickyRecyclerView l(Context context) {
        StickyRecyclerView stickyRecyclerView = new StickyRecyclerView(context, null);
        stickyRecyclerView.setId(C0707R.id.legacy_header_sticky_recycler);
        return stickyRecyclerView;
    }

    public void p(RecyclerView recyclerView, int i, boolean z) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (z) {
            recyclerView.N0(0);
        } else if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).t2(0, -i);
        } else {
            recyclerView.I0(0);
        }
    }
}
