package androidx.appcompat.app;

import android.view.View;
import androidx.core.widget.NestedScrollView;

class a implements NestedScrollView.b {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    a(AlertController alertController, View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // androidx.core.widget.NestedScrollView.b
    public void f(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        AlertController.d(nestedScrollView, this.a, this.b);
    }
}
