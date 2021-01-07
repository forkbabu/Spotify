package androidx.mediarouter.app;

import android.view.ViewTreeObserver;

class c implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ b a;

    c(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.a.L.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.a.v();
    }
}
