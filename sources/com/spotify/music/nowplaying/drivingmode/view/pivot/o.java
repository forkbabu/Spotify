package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
public class o extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ PivotListRecyclerView a;

    o(PivotListRecyclerView pivotListRecyclerView) {
        this.a = pivotListRecyclerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i;
        PivotListRecyclerView pivotListRecyclerView = this.a;
        int i2 = PivotListRecyclerView.Z0;
        int i3 = 0;
        while (true) {
            if (i3 >= pivotListRecyclerView.getChildCount()) {
                i = -1;
                break;
            }
            View childAt = pivotListRecyclerView.getChildAt(i3);
            if (motionEvent.getY() >= ((float) childAt.getTop()) && motionEvent.getY() < ((float) childAt.getBottom())) {
                i = pivotListRecyclerView.X(childAt);
                break;
            }
            i3++;
        }
        if (i != -1) {
            PivotListRecyclerView pivotListRecyclerView2 = this.a;
            if (i != pivotListRecyclerView2.X(pivotListRecyclerView2.O0)) {
                this.a.N0(i);
            }
        }
        return false;
    }
}
