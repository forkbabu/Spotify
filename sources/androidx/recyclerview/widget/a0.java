package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.f;

/* access modifiers changed from: package-private */
public class a0 implements f.b {
    final /* synthetic */ RecyclerView a;

    a0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public View a(int i) {
        return this.a.getChildAt(i);
    }

    public int b() {
        return this.a.getChildCount();
    }

    public void c(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.z(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }
}
