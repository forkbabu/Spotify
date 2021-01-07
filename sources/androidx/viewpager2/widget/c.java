package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* access modifiers changed from: package-private */
public final class c extends ViewPager2.g {
    private final List<ViewPager2.g> a;

    c(int i) {
        this.a = new ArrayList(i);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void a(int i) {
        try {
            for (ViewPager2.g gVar : this.a) {
                gVar.a(i);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void b(int i, float f, int i2) {
        try {
            for (ViewPager2.g gVar : this.a) {
                gVar.b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void c(int i) {
        try {
            for (ViewPager2.g gVar : this.a) {
                gVar.c(i);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(ViewPager2.g gVar) {
        this.a.add(gVar);
    }

    /* access modifiers changed from: package-private */
    public void e(ViewPager2.g gVar) {
        this.a.remove(gVar);
    }
}
