package com.spotify.android.glue.patterns.header.behavior;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
public final class f {
    private static final c a = new c(null);

    /* access modifiers changed from: private */
    public static class b implements e {
        private final NestedScrollView a;

        b(NestedScrollView nestedScrollView, a aVar) {
            this.a = nestedScrollView;
        }

        @Override // com.spotify.android.glue.patterns.header.behavior.f.e
        public void a(int i) {
            this.a.B(i);
        }

        @Override // com.spotify.android.glue.patterns.header.behavior.f.e
        public boolean b() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static class c implements e {
        c(a aVar) {
        }

        @Override // com.spotify.android.glue.patterns.header.behavior.f.e
        public void a(int i) {
        }

        @Override // com.spotify.android.glue.patterns.header.behavior.f.e
        public boolean b() {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static class d implements e {
        private final RecyclerView a;

        public d(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override // com.spotify.android.glue.patterns.header.behavior.f.e
        public void a(int i) {
            this.a.U(0, i);
        }

        @Override // com.spotify.android.glue.patterns.header.behavior.f.e
        public boolean b() {
            return !this.a.isLayoutSuppressed();
        }
    }

    /* access modifiers changed from: package-private */
    public interface e {
        void a(int i);

        boolean b();
    }

    static e a(CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return new d((RecyclerView) childAt);
            }
            if (childAt instanceof NestedScrollView) {
                return new b((NestedScrollView) childAt, null);
            }
        }
        return a;
    }
}
