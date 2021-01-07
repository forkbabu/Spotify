package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

class a implements View.OnLayoutChangeListener {
    final /* synthetic */ FrameLayout a;
    final /* synthetic */ d b;
    final /* synthetic */ FragmentStateAdapter c;

    a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, d dVar) {
        this.c = fragmentStateAdapter;
        this.a = frameLayout;
        this.b = dVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.a.getParent() != null) {
            this.a.removeOnLayoutChangeListener(this);
            this.c.g0(this.b);
        }
    }
}
