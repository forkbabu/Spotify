package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.view.View;
import android.widget.ListView;

public class j extends o<StickyListView> implements i {
    public j(Context context, View view, int i) {
        super(context, view, i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void a(boolean z) {
        ListView listView = ((StickyListView) this.a).getListView();
        int defaultScrollOffset = this.b.getDefaultScrollOffset();
        if (z) {
            listView.smoothScrollToPositionFromTop(0, -defaultScrollOffset);
        } else {
            listView.setSelectionFromTop(0, -defaultScrollOffset);
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void b(boolean z) {
        ListView listView = ((StickyListView) this.a).getListView();
        int stickinessOffset = ((StickyListView) this.a).getStickinessOffset();
        if (z) {
            listView.smoothScrollToPositionFromTop(0, -stickinessOffset);
        } else {
            listView.setSelectionFromTop(0, -stickinessOffset);
        }
    }

    public ListView getListView() {
        return ((StickyListView) this.a).getListView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.i
    public StickyListView getStickyListView() {
        return (StickyListView) this.a;
    }

    /* Return type fixed from 'android.view.View' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.prettylist.o
    public StickyListView l(Context context) {
        return new StickyListView(context, null);
    }
}
