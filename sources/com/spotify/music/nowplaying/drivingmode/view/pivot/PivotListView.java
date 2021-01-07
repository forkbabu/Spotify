package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.n0;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView;
import com.spotify.music.nowplaying.drivingmode.view.pivot.p;
import java.util.List;

public class PivotListView extends PivotListRecyclerView implements p {
    private j a1;
    private p.a b1;
    private final PivotListRecyclerView.c c1;
    private Runnable d1;
    private boolean e1;
    private final Handler f1;

    public PivotListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void N0(int i) {
        this.e1 = false;
        super.N0(i);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.p
    public void b(List<l> list, int i) {
        if (!this.a1.X().equals(list)) {
            setInitialPosition(i);
            this.a1.Y(list);
        } else if (getScrollState() == 0) {
            N0(i);
        }
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.p
    public void c(boolean z) {
        Z0(z);
    }

    public /* synthetic */ void d1(View view) {
        this.f1.removeCallbacks(this.d1);
        e eVar = new e(this, this.a1.X().get(X(view)));
        this.d1 = eVar;
        this.f1.postDelayed(eVar, 500);
    }

    public /* synthetic */ void e1(l lVar) {
        p.a aVar = this.b1;
        if (aVar != null) {
            ((n0) aVar).o(lVar, this.e1);
            this.e1 = true;
            playSoundEffect(0);
        }
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setHapticFeedbackEnabled(boolean z) {
        super.setHapticFeedbackEnabled(z);
        if (z) {
            W0(this.c1);
        } else {
            c1(this.c1);
        }
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.p
    public void setListener(p.a aVar) {
        this.b1 = aVar;
    }

    public PivotListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c1 = new d(this);
        this.e1 = true;
        this.f1 = new Handler();
        j jVar = new j(LayoutInflater.from(getContext()));
        this.a1 = jVar;
        setAdapter(jVar);
        m mVar = new m();
        W0(mVar);
        setOnAdStateChangedListener(mVar);
        setOnChildSelectedListener(new f(this));
        setHasFixedSize(true);
        setHapticFeedbackEnabled(true);
    }
}
