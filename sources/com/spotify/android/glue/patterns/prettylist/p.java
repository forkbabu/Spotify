package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;

public class p extends FrameLayout implements i {
    private final StickyListView a;
    private u b;

    public p(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        StickyListView stickyListView = new StickyListView(context, null);
        this.a = stickyListView;
        stickyListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(stickyListView);
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

    public ListView getListView() {
        return this.a.getListView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public PrettyHeaderView getPrettyHeaderView() {
        return null;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.i
    public StickyListView getStickyListView() {
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
