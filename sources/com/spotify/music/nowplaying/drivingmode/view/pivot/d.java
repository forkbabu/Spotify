package com.spotify.music.nowplaying.drivingmode.view.pivot;

import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView;

public final /* synthetic */ class d implements PivotListRecyclerView.c {
    public final /* synthetic */ PivotListView a;

    public /* synthetic */ d(PivotListView pivotListView) {
        this.a = pivotListView;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView.c
    public final void a(q qVar, boolean z, boolean z2) {
        PivotListView pivotListView = this.a;
        pivotListView.getClass();
        if (!z) {
            pivotListView.performHapticFeedback(1);
        }
    }
}
