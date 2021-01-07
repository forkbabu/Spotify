package com.spotify.paste.widgets.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.paste.widgets.carousel.h;
import java.util.LinkedHashSet;
import java.util.Set;

public class CarouselView extends RecyclerView {
    private final Set<b> O0 = new LinkedHashSet();
    private h P0;
    private boolean Q0;
    private final c R0 = new c(null);

    public interface b {
        void a(int i);

        void b(int i, int i2, float f);

        void c(int i);
    }

    private static class c {
        int a;
        int b;
        int c = 0;
        int d;

        c(a aVar) {
        }
    }

    public static class d implements b {
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHasFixedSize(true);
        setScrollingTouchSlop(1);
    }

    private void U0(int i) {
        for (b bVar : this.O0) {
            bVar.a(i);
        }
    }

    private h getSnappingLayoutManager() {
        return (h) getLayoutManager();
    }

    public void T0(b bVar) {
        this.O0.add(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean U(int i, int i2) {
        h snappingLayoutManager = getSnappingLayoutManager();
        int g = snappingLayoutManager.g(i, i2);
        boolean q = snappingLayoutManager.q(g);
        N0(g);
        if (this.R0.b != 0) {
            U0(g);
        }
        return q;
    }

    public int getCurrentPosition() {
        h hVar = this.P0;
        if (hVar != null) {
            return hVar.f();
        }
        throw new IllegalStateException("Cannot get the current position without a LayoutManager.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.Q0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Q0) {
            return true;
        }
        h snappingLayoutManager = getSnappingLayoutManager();
        motionEvent.getAction();
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && getScrollState() == 0) {
            setPosition(snappingLayoutManager.a());
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.m mVar) {
        if (mVar instanceof h) {
            this.P0 = (h) mVar;
            super.setLayoutManager(mVar);
            return;
        }
        throw new UnsupportedOperationException("You must provide a SnappingLayoutManager to CarouselRecyclerView.");
    }

    public void setOnLayoutChildrenListener(h.a aVar) {
        getSnappingLayoutManager().m(aVar);
    }

    public void setPosition(int i) {
        N0(i);
        U0(i);
    }

    public void setScrollLock(boolean z) {
        this.Q0 = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void t0(int i) {
        h snappingLayoutManager = getSnappingLayoutManager();
        int i2 = this.R0.c;
        if (i2 == 0 && i != i2) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                this.R0.a = snappingLayoutManager.d(childAt);
            } else {
                this.R0.a = getMeasuredWidth();
            }
            this.R0.d = snappingLayoutManager.f();
            this.R0.b = 0;
        }
        this.R0.c = i;
        if (i == 0) {
            int f = snappingLayoutManager.f();
            for (b bVar : this.O0) {
                bVar.c(f);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void u0(int i, int i2) {
        int i3;
        if (i != 0 && i2 == 0) {
            this.R0.b += i;
        } else if (i != 0 || i2 == 0) {
            this.R0.b += i;
        } else {
            this.R0.b += i2;
        }
        c cVar = this.R0;
        float abs = Math.abs(((float) cVar.b) / ((float) cVar.a));
        c cVar2 = this.R0;
        int i4 = cVar2.b;
        if (i4 > 0) {
            i3 = cVar2.d + 1;
        } else if (i4 < 0) {
            i3 = cVar2.d - 1;
        } else {
            i3 = cVar2.d;
        }
        for (b bVar : this.O0) {
            bVar.b(this.R0.d, i3, abs);
        }
    }
}
