package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import com.spotify.music.C0707R;
import defpackage.d5;
import java.util.ArrayList;

public class d implements m {
    private int A;
    int B;
    private int C = -1;
    final View.OnClickListener D = new a();
    private NavigationMenuView a;
    LinearLayout b;
    androidx.appcompat.view.menu.g c;
    private int f;
    c n;
    LayoutInflater o;
    int p;
    boolean q;
    ColorStateList r;
    ColorStateList s;
    Drawable t;
    int u;
    int v;
    int w;
    boolean x;
    boolean y = true;
    private int z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            d.this.I(true);
            androidx.appcompat.view.menu.i itemData = ((NavigationMenuItemView) view).getItemData();
            d dVar = d.this;
            boolean z2 = dVar.c.z(itemData, dVar, 0);
            if (itemData == null || !itemData.isCheckable() || !z2) {
                z = false;
            } else {
                d.this.n.c0(itemData);
            }
            d.this.I(false);
            if (z) {
                d.this.j(false);
            }
        }
    }

    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: private */
    public class c extends RecyclerView.e<l> {
        private final ArrayList<e> c = new ArrayList<>();
        private androidx.appcompat.view.menu.i f;
        private boolean n;

        c() {
            Z();
        }

        private void Z() {
            if (!this.n) {
                this.n = true;
                this.c.clear();
                this.c.add(new C0110d());
                int i = -1;
                int size = d.this.c.r().size();
                boolean z = false;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (i2 < size) {
                    androidx.appcompat.view.menu.i iVar = d.this.c.r().get(i2);
                    if (iVar.isChecked()) {
                        c0(iVar);
                    }
                    if (iVar.isCheckable()) {
                        iVar.r(z);
                    }
                    if (iVar.hasSubMenu()) {
                        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) iVar.getSubMenu();
                        if (gVar.hasVisibleItems()) {
                            if (i2 != 0) {
                                ArrayList<e> arrayList = this.c;
                                int i4 = d.this.B;
                                int i5 = z ? 1 : 0;
                                int i6 = z ? 1 : 0;
                                int i7 = z ? 1 : 0;
                                int i8 = z ? 1 : 0;
                                arrayList.add(new f(i4, i5));
                            }
                            this.c.add(new g(iVar));
                            int size2 = gVar.size();
                            int i9 = 0;
                            boolean z3 = false;
                            while (i9 < size2) {
                                androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) gVar.getItem(i9);
                                if (iVar2.isVisible()) {
                                    if (!z3 && iVar2.getIcon() != null) {
                                        z3 = true;
                                    }
                                    if (iVar2.isCheckable()) {
                                        iVar2.r(z);
                                    }
                                    if (iVar.isChecked()) {
                                        c0(iVar);
                                    }
                                    this.c.add(new g(iVar2));
                                }
                                i9++;
                                z = false;
                            }
                            if (z3) {
                                int size3 = this.c.size();
                                for (int size4 = this.c.size(); size4 < size3; size4++) {
                                    ((g) this.c.get(size4)).b = true;
                                }
                            }
                        }
                    } else {
                        int groupId = iVar.getGroupId();
                        if (groupId != i) {
                            i3 = this.c.size();
                            z2 = iVar.getIcon() != null;
                            if (i2 != 0) {
                                i3++;
                                ArrayList<e> arrayList2 = this.c;
                                int i10 = d.this.B;
                                arrayList2.add(new f(i10, i10));
                            }
                        } else if (!z2 && iVar.getIcon() != null) {
                            int size5 = this.c.size();
                            for (int i11 = i3; i11 < size5; i11++) {
                                ((g) this.c.get(i11)).b = true;
                            }
                            z2 = true;
                        }
                        g gVar2 = new g(iVar);
                        gVar2.b = z2;
                        this.c.add(gVar2);
                        i = groupId;
                    }
                    i2++;
                    z = false;
                }
                this.n = false;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        public void K(l lVar, int i) {
            l lVar2 = lVar;
            int w = w(i);
            if (w == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar2.a;
                navigationMenuItemView.setIconTintList(d.this.s);
                d dVar = d.this;
                if (dVar.q) {
                    navigationMenuItemView.setTextAppearance(dVar.p);
                }
                ColorStateList colorStateList = d.this.r;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = d.this.t;
                Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
                int i2 = q4.g;
                int i3 = Build.VERSION.SDK_INT;
                navigationMenuItemView.setBackground(newDrawable);
                g gVar = (g) this.c.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
                navigationMenuItemView.setHorizontalPadding(d.this.u);
                navigationMenuItemView.setIconPadding(d.this.v);
                d dVar2 = d.this;
                if (dVar2.x) {
                    navigationMenuItemView.setIconSize(dVar2.w);
                }
                navigationMenuItemView.setMaxLines(d.this.z);
                navigationMenuItemView.e(gVar.a(), 0);
            } else if (w == 1) {
                ((TextView) lVar2.a).setText(((g) this.c.get(i)).a().getTitle());
            } else if (w == 2) {
                f fVar = (f) this.c.get(i);
                lVar2.a.setPadding(0, fVar.b(), 0, fVar.a());
            }
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        public l M(ViewGroup viewGroup, int i) {
            l lVar;
            if (i == 0) {
                d dVar = d.this;
                lVar = new i(dVar.o, viewGroup, dVar.D);
            } else if (i == 1) {
                lVar = new k(d.this.o, viewGroup);
            } else if (i == 2) {
                lVar = new j(d.this.o, viewGroup);
            } else if (i != 3) {
                return null;
            } else {
                return new b(d.this.b);
            }
            return lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0] */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        public void R(l lVar) {
            l lVar2 = lVar;
            if (lVar2 instanceof i) {
                ((NavigationMenuItemView) lVar2.a).s();
            }
        }

        public Bundle X() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.i iVar = this.f;
            if (iVar != null) {
                bundle.putInt("android:menu:checked", iVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.c.get(i);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.i a = ((g) eVar).a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        f fVar = new f();
                        actionView.saveHierarchyState(fVar);
                        sparseArray.put(a.getItemId(), fVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.i Y() {
            return this.f;
        }

        public void b0(Bundle bundle) {
            androidx.appcompat.view.menu.i a;
            View actionView;
            f fVar;
            androidx.appcompat.view.menu.i a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.n = true;
                int size = this.c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    e eVar = this.c.get(i2);
                    if ((eVar instanceof g) && (a2 = ((g) eVar).a()) != null && a2.getItemId() == i) {
                        c0(a2);
                        break;
                    }
                    i2++;
                }
                this.n = false;
                Z();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = this.c.get(i3);
                    if (!(!(eVar2 instanceof g) || (a = ((g) eVar2).a()) == null || (actionView = a.getActionView()) == null || (fVar = (f) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(fVar);
                    }
                }
            }
        }

        public void c0(androidx.appcompat.view.menu.i iVar) {
            if (this.f != iVar && iVar.isCheckable()) {
                androidx.appcompat.view.menu.i iVar2 = this.f;
                if (iVar2 != null) {
                    iVar2.setChecked(false);
                }
                this.f = iVar;
                iVar.setChecked(true);
            }
        }

        public void f0(boolean z) {
            this.n = z;
        }

        public void g0() {
            Z();
            z();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int u() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public long v(int i) {
            return (long) i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int w(int i) {
            e eVar = this.c.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof C0110d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.d$d  reason: collision with other inner class name */
    public static class C0110d implements e {
        C0110d() {
        }
    }

    /* access modifiers changed from: private */
    public interface e {
    }

    /* access modifiers changed from: private */
    public static class f implements e {
        private final int a;
        private final int b;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public static class g implements e {
        private final androidx.appcompat.view.menu.i a;
        boolean b;

        g(androidx.appcompat.view.menu.i iVar) {
            this.a = iVar;
        }

        public androidx.appcompat.view.menu.i a() {
            return this.a;
        }
    }

    private class h extends c0 {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.c0, defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            c cVar = d.this.n;
            int i = d.this.b.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < d.this.n.u(); i2++) {
                if (d.this.n.w(i2) == 0) {
                    i++;
                }
            }
            d5Var.T(d5.b.a(i, 0, false));
        }
    }

    private static class i extends l {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.view.View.OnClickListener r5) {
            /*
                r2 = this;
                r0 = 2131624160(0x7f0e00e0, float:1.8875492E38)
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                r3.setOnClickListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.d.i.<init>(android.view.LayoutInflater, android.view.ViewGroup, android.view.View$OnClickListener):void");
        }
    }

    private static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0707R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0707R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class l extends RecyclerView.b0 {
        public l(View view) {
            super(view);
        }
    }

    private void J() {
        int i2 = (this.b.getChildCount() != 0 || !this.y) ? 0 : this.A;
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    public void A(int i2) {
        this.u = i2;
        j(false);
    }

    public void B(int i2) {
        this.v = i2;
        j(false);
    }

    public void C(int i2) {
        if (this.w != i2) {
            this.w = i2;
            this.x = true;
            j(false);
        }
    }

    public void D(ColorStateList colorStateList) {
        this.s = colorStateList;
        j(false);
    }

    public void E(int i2) {
        this.z = i2;
        j(false);
    }

    public void F(int i2) {
        this.p = i2;
        this.q = true;
        j(false);
    }

    public void G(ColorStateList colorStateList) {
        this.r = colorStateList;
        j(false);
    }

    public void H(int i2) {
        this.C = i2;
        NavigationMenuView navigationMenuView = this.a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void I(boolean z2) {
        c cVar = this.n;
        if (cVar != null) {
            cVar.f0(z2);
        }
    }

    public void b(b5 b5Var) {
        int j2 = b5Var.j();
        if (this.A != j2) {
            this.A = j2;
            J();
        }
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, b5Var.g());
        q4.d(this.b, b5Var);
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(androidx.appcompat.view.menu.g gVar, boolean z2) {
    }

    public androidx.appcompat.view.menu.i d() {
        return this.n.Y();
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable e() {
        Bundle bundle = new Bundle();
        if (this.a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.n;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.X());
        }
        if (this.b != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.n.b0(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z2) {
        c cVar = this.n;
        if (cVar != null) {
            cVar.g0();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean l(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void m(Context context, androidx.appcompat.view.menu.g gVar) {
        this.o = LayoutInflater.from(context);
        this.c = gVar;
        this.B = context.getResources().getDimensionPixelOffset(C0707R.dimen.design_navigation_separator_vertical_padding);
    }

    public int n() {
        return this.b.getChildCount();
    }

    public Drawable o() {
        return this.t;
    }

    public int p() {
        return this.u;
    }

    public int q() {
        return this.v;
    }

    public int r() {
        return this.z;
    }

    public ColorStateList s() {
        return this.r;
    }

    public ColorStateList t() {
        return this.s;
    }

    public n u(ViewGroup viewGroup) {
        if (this.a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.o.inflate(C0707R.layout.design_navigation_menu, viewGroup, false);
            this.a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.a));
            if (this.n == null) {
                this.n = new c();
            }
            int i2 = this.C;
            if (i2 != -1) {
                this.a.setOverScrollMode(i2);
            }
            this.b = (LinearLayout) this.o.inflate(C0707R.layout.design_navigation_item_header, (ViewGroup) this.a, false);
            this.a.setAdapter(this.n);
        }
        return this.a;
    }

    public View v(int i2) {
        View inflate = this.o.inflate(i2, (ViewGroup) this.b, false);
        this.b.addView(inflate);
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
        return inflate;
    }

    public void w(boolean z2) {
        if (this.y != z2) {
            this.y = z2;
            J();
        }
    }

    public void x(androidx.appcompat.view.menu.i iVar) {
        this.n.c0(iVar);
    }

    public void y(int i2) {
        this.f = i2;
    }

    public void z(Drawable drawable) {
        this.t = drawable;
        j(false);
    }
}
