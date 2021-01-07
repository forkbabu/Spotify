package com.spotify.music.nowplaying.drivingmode.view.pivot;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ PivotListView a;
    public final /* synthetic */ l b;

    public /* synthetic */ e(PivotListView pivotListView, l lVar) {
        this.a = pivotListView;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e1(this.b);
    }
}
