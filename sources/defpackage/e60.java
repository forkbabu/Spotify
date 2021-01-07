package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.g60;
import kotlin.jvm.internal.h;

/* renamed from: e60  reason: default package */
public final class e60 extends RecyclerView.l implements RecyclerView.n {
    private final g60 a;

    /* renamed from: e60$a */
    static final class a implements Runnable {
        final /* synthetic */ s81 a;
        final /* synthetic */ e60 b;
        final /* synthetic */ View c;

        a(s81 s81, e60 e60, View view) {
            this.a = s81;
            this.b = e60;
            this.c = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.a.a(new g60.a(this.a.componentId().id(), this.c.getMeasuredWidth(), this.c.getMeasuredHeight()));
        }
    }

    public e60(g60 g60) {
        h.e(g60, "itemSizeRepo");
        this.a = g60;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void b(View view) {
        h.e(view, "view");
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.A0(this);
            recyclerView.B0(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void d(View view) {
        h.e(view, "view");
        if (view instanceof RecyclerView) {
            g((RecyclerView) view);
        }
    }

    public final void g(RecyclerView recyclerView) {
        h.e(recyclerView, "rv");
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= itemDecorationCount) {
                break;
            } else if (h.a(recyclerView.f0(i), this)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            recyclerView.k(this, -1);
            recyclerView.l(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        h.e(rect, "outRect");
        h.e(view, "view");
        h.e(recyclerView, "parent");
        h.e(yVar, "state");
        RecyclerView.b0 a0 = recyclerView.a0(view);
        if (a0 != null) {
            w61<?> f0 = i61.f0(a0);
            h.d(f0, "HubsAdapter.unwrap(viewHolder)");
            s81 d = f0.d();
            h.d(d, "HubsAdapter.unwrap(viewHolder).model");
            n4.a(view, new a(d, this, view));
        }
    }
}
