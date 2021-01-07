package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListLayoutManager;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.processors.PublishProcessor;
import java.util.LinkedHashSet;
import java.util.Set;

public class PivotListRecyclerView extends RecyclerView {
    public static final /* synthetic */ int Z0 = 0;
    private View O0;
    private d P0;
    private final Set<c> Q0;
    private b R0;
    private final PublishProcessor<View> S0;
    private final PivotListLayoutManager.b T0;
    private final Runnable U0;
    private GestureDetector V0;
    private Handler W0;
    private io.reactivex.disposables.b X0;
    private boolean Y0;

    class a implements PivotListLayoutManager.b {
        a() {
        }
    }

    public interface b {
    }

    public interface c {
        void a(q qVar, boolean z, boolean z2);
    }

    public interface d {
        void a(View view);
    }

    public PivotListRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void T0(PivotListRecyclerView pivotListRecyclerView) {
        View S1;
        if (pivotListRecyclerView.getLayoutManager() != null && (S1 = ((PivotListLayoutManager) pivotListRecyclerView.getLayoutManager()).S1()) != null && S1 != pivotListRecyclerView.O0) {
            pivotListRecyclerView.a1((q) pivotListRecyclerView.a0(S1));
            if (pivotListRecyclerView.getLayoutManager() != null) {
                pivotListRecyclerView.b1(((PivotListLayoutManager) pivotListRecyclerView.getLayoutManager()).S1());
            }
        }
    }

    public static void X0(PivotListRecyclerView pivotListRecyclerView, View view) {
        d dVar = pivotListRecyclerView.P0;
        if (dVar != null) {
            dVar.a(view);
        }
    }

    /* access modifiers changed from: private */
    public void a1(q qVar) {
        View view = this.O0;
        boolean z = view == null || Y(view) == Y(qVar.a);
        boolean z2 = true ^ this.Y0;
        for (c cVar : this.Q0) {
            cVar.a(qVar, z, z2);
        }
        b1(qVar.a);
        this.O0 = qVar.a;
    }

    private void b1(View view) {
        d dVar = this.P0;
        if (dVar != null) {
            dVar.a(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean U(int i, int i2) {
        return super.U(i, (int) (((float) i2) * 0.01f));
    }

    public void W0(c cVar) {
        Set<c> set = this.Q0;
        cVar.getClass();
        set.add(cVar);
    }

    public /* synthetic */ void Y0() {
        this.S0.onNext(this.O0);
    }

    public void Z0(boolean z) {
        this.Y0 = z;
        b bVar = this.R0;
        if (bVar != null) {
            ((m) bVar).c(z);
        }
    }

    public void c1(c cVar) {
        Set<c> set = this.Q0;
        cVar.getClass();
        set.remove(cVar);
    }

    public int getCenterChildPosition() {
        return X(this.O0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X0.dispose();
        this.W0.removeCallbacks(this.U0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.V0.onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.V0.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setInitialPosition(int i) {
        if (getLayoutManager() != null) {
            ((PivotListLayoutManager) getLayoutManager()).V1(i);
        }
    }

    public void setOnAdStateChangedListener(b bVar) {
        this.R0 = bVar;
    }

    public void setOnChildSelectedListener(d dVar) {
        dVar.getClass();
        this.P0 = dVar;
    }

    public PivotListRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Q0 = new LinkedHashSet(20);
        PublishProcessor<View> r0 = PublishProcessor.r0();
        this.S0 = r0;
        a aVar = new a();
        this.T0 = aVar;
        this.U0 = new c(this);
        setLayoutManager(new PivotListLayoutManager(aVar));
        r rVar = new r();
        this.X0 = g.m(r0, g.p(rVar, BackpressureStrategy.LATEST)).s().subscribe(new a(this), b.a);
        rVar.a(this);
        this.V0 = new GestureDetector(getContext(), new o(this));
        this.W0 = new Handler();
        setItemAnimator(null);
    }
}
