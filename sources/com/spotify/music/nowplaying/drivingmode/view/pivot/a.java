package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.view.View;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ PivotListRecyclerView a;

    public /* synthetic */ a(PivotListRecyclerView pivotListRecyclerView) {
        this.a = pivotListRecyclerView;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        PivotListRecyclerView.X0(this.a, (View) obj);
    }
}
