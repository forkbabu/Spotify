package defpackage;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: v42  reason: default package */
public class v42 extends BaseAdapter {
    private final DataSetObserver a = new a();
    private final Context b;
    private w42 c;
    private final List<b> f = new ArrayList();
    private final SparseArray<b> n = new SparseArray<>();
    private int o;
    private int p = 3;
    private final w42 q;
    private b r;

    /* access modifiers changed from: package-private */
    /* renamed from: v42$a */
    public class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            v42.this.l();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            v42.this.l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v42$b */
    public static class b {
        public final ListAdapter a;
        public String b;
        public final int c;
        public boolean d;
        public int e;
        public int f;
        public int g = -1;
        public View h;
        public View i;
        public boolean j;
        public boolean k;

        b(ListAdapter listAdapter, String str, int i2, View view, View view2, a aVar) {
            this.a = listAdapter;
            this.b = str;
            this.c = i2;
            this.d = true;
            this.h = view;
            this.i = view2;
            this.j = true;
            this.k = true;
        }

        public int a() {
            return (this.i == null || !this.j) ? 0 : 1;
        }

        public int b() {
            return (this.h == null || !this.k) ? 0 : 1;
        }

        public int c(int i2) {
            int d2 = d(i2);
            if (h(d2)) {
                Assertion.p("Should not find title at " + i2);
            }
            if (g(d2)) {
                Assertion.p("Should not find header at " + i2);
            }
            if (f(d2)) {
                Assertion.p("Should not find footer at " + i2);
            }
            return (d2 - e()) - b();
        }

        public int d(int i2) {
            int i3 = i2 - this.e;
            if (i3 < 0 || i3 >= this.a.getCount() + e() + b() + a()) {
                Assertion.p("global position out of bounds: " + i2);
            }
            return i3;
        }

        public int e() {
            return this.b != null ? 1 : 0;
        }

        public boolean f(int i2) {
            if (i2 < this.a.getCount() + e() + b() + a()) {
                if (i2 >= this.a.getCount() + e() + b()) {
                    return true;
                }
            }
            return false;
        }

        public boolean g(int i2) {
            return i2 < e() + b() && i2 >= e();
        }

        public boolean h(int i2) {
            return i2 < e();
        }
    }

    public v42(Context context) {
        this.b = context;
        t42 t42 = new t42(context);
        this.q = t42;
        this.c = t42;
    }

    private b g(int i) {
        MoreObjects.checkArgument(i != Integer.MIN_VALUE, "Invalid section id: SECTION_ID_NONE");
        b bVar = this.n.get(i, null);
        bVar.getClass();
        return bVar;
    }

    private b h(int i) {
        b bVar = this.r;
        if (bVar != null && bVar.e <= i && i < bVar.f) {
            return bVar;
        }
        for (b bVar2 : this.f) {
            if (i < bVar2.f) {
                this.r = bVar2;
                return bVar2;
            }
        }
        if (this.o == 0) {
            throw new IndexOutOfBoundsException("No section found, adapter is empty");
        }
        StringBuilder W0 = je.W0("No section found for global position=", i, ", should be between 0 and ");
        W0.append(this.o);
        throw new IndexOutOfBoundsException(W0.toString());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l() {
        int i = 0;
        for (b bVar : this.f) {
            bVar.e = i;
            if (bVar.d) {
                i = bVar.a.getCount() + bVar.e() + bVar.b() + bVar.a() + i;
            }
            bVar.f = i;
        }
        this.o = i;
        this.r = null;
        int i2 = this.p;
        for (b bVar2 : this.f) {
            if (bVar2.g == -1) {
                bVar2.g = i2;
                i2 += bVar2.a.getViewTypeCount();
            }
        }
        this.p = i2;
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        for (b bVar : this.f) {
            if (bVar.d && !bVar.a.areAllItemsEnabled()) {
                return false;
            }
        }
        return true;
    }

    public void b(ListAdapter listAdapter, int i, int i2) {
        c(listAdapter, i, i2, null, null);
    }

    public void c(ListAdapter listAdapter, int i, int i2, View view, View view2) {
        e(listAdapter, this.b.getString(i), i2, null, view2);
    }

    public void d(ListAdapter listAdapter, String str, int i) {
        e(listAdapter, str, i, null, null);
    }

    public void e(ListAdapter listAdapter, String str, int i, View view, View view2) {
        listAdapter.getClass();
        if (i != Integer.MIN_VALUE) {
            MoreObjects.checkArgument(this.n.get(i, null) == null, "Section id %s is already in use!", Integer.toString(i));
        }
        b bVar = new b(listAdapter, str, i, view, view2, null);
        this.f.size();
        this.f.add(bVar);
        if (i != Integer.MIN_VALUE) {
            this.n.put(i, bVar);
        }
        listAdapter.registerDataSetObserver(this.a);
        l();
    }

    public int f(int i, int i2) {
        return g(i2).c(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.o;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        b h = h(i);
        int d = h.d(i);
        if (h.h(d)) {
            return h.b;
        }
        if (h.g(d)) {
            return h.h;
        }
        if (h.f(d)) {
            return h.i;
        }
        return h.a.getItem(h.c(i));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        b h = h(i);
        int d = h.d(i);
        if (h.h(d)) {
            return -1;
        }
        if (h.g(d)) {
            return -2;
        }
        if (h.f(d)) {
            return -3;
        }
        return h.a.getItemId(h.c(i));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        b h = h(i);
        int d = h.d(i);
        if (h.h(d)) {
            return 0;
        }
        if (h.g(d)) {
            return 1;
        }
        if (h.f(d)) {
            return 2;
        }
        int itemViewType = h.a.getItemViewType(h.c(i));
        if (itemViewType == -1 || itemViewType == -2) {
            return -1;
        }
        return h.g + itemViewType;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b h = h(i);
        int d = h.d(i);
        if (h.h(d)) {
            String str = h.b;
            int i2 = h.c;
            View a2 = this.c.a(i2, viewGroup);
            this.c.b(i2, a2, h.b, str, i == 0);
            return a2;
        } else if (h.g(d)) {
            View view2 = h.h;
            view2.getClass();
            return view2;
        } else if (h.f(d)) {
            View view3 = h.i;
            view3.getClass();
            return view3;
        } else {
            View view4 = h.a.getView(h.c(i), view, viewGroup);
            view4.getClass();
            return view4;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.p;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public int i(int i) {
        b h = h(i);
        int d = h.d(i);
        if (!h.h(d) && !h.g(d) && !h.f(d)) {
            return h.c;
        }
        return Integer.MIN_VALUE;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        return this.o == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        b h = h(i);
        int d = h.d(i);
        if (!h.h(d) && !h.g(d) && !h.f(d)) {
            return h.a.isEnabled(h.c(i));
        }
        return false;
    }

    public void j(int... iArr) {
        boolean z = false;
        for (b bVar : this.f) {
            if (bVar.d) {
                z = true;
            }
            bVar.d = false;
        }
        for (int i : iArr) {
            if (!g(i).d) {
                z = true;
            }
            g(i).d = true;
        }
        if (z) {
            l();
        }
    }

    public void k(int... iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (g(i).d) {
                z = true;
            }
            g(i).d = false;
        }
        if (z) {
            l();
        }
    }

    public void m(int i, String str) {
        g(i).b = str;
        l();
    }

    public void n(w42 w42) {
        this.c = w42;
    }

    public void o(int... iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (!g(i).d) {
                z = true;
            }
            g(i).d = true;
        }
        if (z) {
            l();
        }
    }

    public boolean p(int i) {
        b g = g(i);
        boolean z = g.d;
        boolean z2 = g.a.getCount() > 0;
        g.d = z2;
        if (z != z2) {
            l();
        }
        return g.d;
    }
}
