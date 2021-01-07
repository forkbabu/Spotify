package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import com.spotify.music.C0707R;
import java.util.ArrayList;

public class e implements m, AdapterView.OnItemClickListener {
    Context a;
    LayoutInflater b;
    g c;
    ExpandedMenuView f;
    private m.a n;
    a o;

    /* access modifiers changed from: private */
    public class a extends BaseAdapter {
        private int a = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            i o = e.this.c.o();
            if (o != null) {
                ArrayList<i> p = e.this.c.p();
                int size = p.size();
                for (int i = 0; i < size; i++) {
                    if (p.get(i) == o) {
                        this.a = i;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        /* renamed from: b */
        public i getItem(int i) {
            ArrayList<i> p = e.this.c.p();
            e.this.getClass();
            int i2 = i + 0;
            int i3 = this.a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return p.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.c.p().size();
            e.this.getClass();
            int i = size + 0;
            return this.a < 0 ? i : i - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return (long) i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = e.this.b.inflate(C0707R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((n.a) view).e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.o == null) {
            this.o = new a();
        }
        return this.o;
    }

    public n b(ViewGroup viewGroup) {
        if (this.f == null) {
            this.f = (ExpandedMenuView) this.b.inflate(C0707R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.o == null) {
                this.o = new a();
            }
            this.f.setAdapter((ListAdapter) this.o);
            this.f.setOnItemClickListener(this);
        }
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z) {
        m.a aVar = this.n;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable e() {
        if (this.f == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.n = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).a(null);
        m.a aVar = this.n;
        if (aVar == null) {
            return true;
        }
        aVar.d(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z) {
        a aVar = this.o;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean l(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void m(Context context, g gVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = gVar;
        a aVar = this.o;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.z(this.o.getItem(i), this, 0);
    }
}
