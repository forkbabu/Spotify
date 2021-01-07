package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

public final class d implements ViewPager2.i {
    private final List<ViewPager2.i> a = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(View view, float f) {
        for (ViewPager2.i iVar : this.a) {
            iVar.a(view, f);
        }
    }

    public void b(ViewPager2.i iVar) {
        this.a.add(iVar);
    }
}
