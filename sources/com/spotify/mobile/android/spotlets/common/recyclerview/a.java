package com.spotify.mobile.android.spotlets.common.recyclerview;

import android.widget.AbsListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

public abstract class a extends RecyclerView.q implements AbsListView.OnScrollListener {
    private int a;
    private boolean b;

    private void h(int i, int i2, int i3) {
        int i4 = this.a;
        if (i3 != i4) {
            Logger.l("PaginatingScrollListener: item count: %d -> %d", Integer.valueOf(i4), Integer.valueOf(i3));
            this.a = i3;
            this.b = false;
        }
        if (!e()) {
            this.b = false;
        } else if (this.b) {
            Logger.l("PaginatingScrollListener: threshold reached, waiting", new Object[0]);
        } else if (i2 == 0) {
            Logger.l("PaginatingScrollListener: empty list", new Object[0]);
        } else {
            if (f() + i >= i3 + -1) {
                Logger.l("PaginatingScrollListener: the end is nigh!", new Object[0]);
                g(i, i3);
                this.b = true;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void c(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int Y1 = linearLayoutManager.Y1();
            int W = linearLayoutManager.W();
            h(Y1 + (W <= 0 ? 0 : W - 1), W, linearLayoutManager.i0());
            return;
        }
        Assertion.g("LayoutManager is not compatible: " + layoutManager);
    }

    /* access modifiers changed from: protected */
    public abstract boolean e();

    /* access modifiers changed from: protected */
    public abstract int f();

    /* access modifiers changed from: protected */
    public abstract void g(int i, int i2);

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        h((i + i2) - 1, i2, i3);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
