package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

public class q extends FrameLayout implements k {
    private final StickyRecyclerView a;
    private u b;

    public q(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        StickyRecyclerView stickyRecyclerView = new StickyRecyclerView(context, null);
        this.a = stickyRecyclerView;
        stickyRecyclerView.setId(C0707R.id.legacy_header_sticky_recycler);
        stickyRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(stickyRecyclerView);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void a(boolean z) {
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void b(boolean z) {
    }

    public View getHeaderAccessory() {
        return null;
    }

    public ImageView getHeaderBackgroundView() {
        return null;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public PrettyHeaderView getPrettyHeaderView() {
        return null;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.k
    public RecyclerView getRecyclerView() {
        return this.a.getRecyclerView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.k
    public StickyRecyclerView getStickyRecyclerView() {
        return this.a;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public View getView() {
        return this;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setFilterView(View view) {
        this.a.setHeaderView(view);
        this.a.setStickyView(view);
        this.a.setFilterView((View) view.getTag(C0707R.id.legacy_filter_tag));
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setHeaderAccessory(View view) {
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setHeaderBackgroundColor(int i) {
        this.a.setHeaderBackgroundColor(i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setHeaderSticky(boolean z) {
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setTitle(String str) {
        u uVar = this.b;
        if (uVar != null) {
            uVar.setTitle(str);
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setToolbarUpdater(u uVar) {
        this.b = uVar;
    }
}
