package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

public final class b {
    private final TabLayout a;
    private final ViewPager2 b;
    private final AbstractC0111b c;
    private RecyclerView.e<?> d;
    private boolean e;
    private c f;
    private TabLayout.d g;
    private RecyclerView.g h;

    private class a extends RecyclerView.g {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            b.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void b(int i, int i2) {
            b.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void c(int i, int i2, Object obj) {
            b.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i, int i2) {
            b.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i, int i2, int i3) {
            b.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i, int i2) {
            b.this.b();
        }
    }

    /* renamed from: com.google.android.material.tabs.b$b  reason: collision with other inner class name */
    public interface AbstractC0111b {
        void a(TabLayout.g gVar, int i);
    }

    private static class c extends ViewPager2.g {
        private final WeakReference<TabLayout> a;
        private int b = 0;
        private int c = 0;

        c(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void a(int i) {
            this.b = this.c;
            this.c = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void b(int i, float f, int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.b == 1;
                if (!(i3 == 2 && this.b == 0)) {
                    z = true;
                }
                tabLayout.o(i, f, z2, z);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.c;
                tabLayout.m(tabLayout.i(i), i2 == 0 || (i2 == 2 && this.b == 0));
            }
        }
    }

    private static class d implements TabLayout.d {
        private final ViewPager2 a;
        private final boolean b;

        d(ViewPager2 viewPager2, boolean z) {
            this.a = viewPager2;
            this.b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
            this.a.h(gVar.e(), this.b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }

    public b(TabLayout tabLayout, ViewPager2 viewPager2, AbstractC0111b bVar) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.c = bVar;
    }

    public void a() {
        if (!this.e) {
            RecyclerView.e<?> adapter = this.b.getAdapter();
            this.d = adapter;
            if (adapter != null) {
                this.e = true;
                c cVar = new c(this.a);
                this.f = cVar;
                this.b.e(cVar);
                d dVar = new d(this.b, true);
                this.g = dVar;
                this.a.b(dVar);
                a aVar = new a();
                this.h = aVar;
                this.d.T(aVar);
                b();
                this.a.o(this.b.getCurrentItem(), 0.0f, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int min;
        this.a.l();
        RecyclerView.e<?> eVar = this.d;
        if (eVar != null) {
            int u = eVar.u();
            for (int i = 0; i < u; i++) {
                TabLayout.g j = this.a.j();
                this.c.a(j, i);
                this.a.c(j, false);
            }
            if (u > 0 && (min = Math.min(this.b.getCurrentItem(), this.a.getTabCount() - 1)) != this.a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.a;
                tabLayout.m(tabLayout.i(min), true);
            }
        }
    }
}
