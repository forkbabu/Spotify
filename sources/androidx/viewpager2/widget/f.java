package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class f extends ViewPager2.g {
    private final LinearLayoutManager a;
    private ViewPager2.i b;

    f(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void a(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void b(int i, float f, int i2) {
        if (this.b != null) {
            float f2 = -f;
            for (int i3 = 0; i3 < this.a.W(); i3++) {
                View V = this.a.V(i3);
                if (V != null) {
                    this.b.a(V, ((float) (this.a.o0(V) - i)) + f2);
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.a.W())));
                }
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void c(int i) {
    }

    /* access modifiers changed from: package-private */
    public ViewPager2.i d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void e(ViewPager2.i iVar) {
        this.b = iVar;
    }
}
