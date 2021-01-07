package io.doist.recyclerviewext.sticky_headers;

import android.view.ViewTreeObserver;

class b implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ StickyHeadersLinearLayoutManager b;

    b(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, ViewTreeObserver viewTreeObserver) {
        this.b = stickyHeadersLinearLayoutManager;
        this.a = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.a.removeOnGlobalLayoutListener(this);
        if (StickyHeadersLinearLayoutManager.D2(this.b) != -1) {
            StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.b;
            stickyHeadersLinearLayoutManager.t2(StickyHeadersLinearLayoutManager.D2(stickyHeadersLinearLayoutManager), StickyHeadersLinearLayoutManager.E2(this.b));
            StickyHeadersLinearLayoutManager.F2(this.b, -1, Integer.MIN_VALUE);
        }
    }
}
