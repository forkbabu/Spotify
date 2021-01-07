package com.spotify.mobile.android.ui.layout_traits;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.ui.layout_traits.TraitsLayoutManager;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public final class a {
    private final C0200a<?, ?, ?> a;

    /* JADX WARN: Unknown type variable: P in type: com.spotify.mobile.android.ui.layout_traits.a$c<P> */
    /* JADX WARN: Unknown type variable: R in type: com.spotify.mobile.android.ui.layout_traits.a$d<R> */
    /* renamed from: com.spotify.mobile.android.ui.layout_traits.a$a  reason: collision with other inner class name */
    private static class C0200a<T extends RP:TTR:Ljava/lang/Object> {
        private final c<P> a;
        private final d<R> b;

        /* JADX WARN: Unknown type variable: P in type: com.spotify.mobile.android.ui.layout_traits.a$c<P> */
        /* JADX WARN: Unknown type variable: R in type: com.spotify.mobile.android.ui.layout_traits.a$d<R> */
        C0200a(c<P> cVar, d<R> dVar) {
            this.a = cVar;
            this.b = dVar;
        }

        /* JADX WARN: Unknown type variable: R in type: java.util.Set<R> */
        private Set<R> d(int i, e eVar, RecyclerView.e<?> eVar2) {
            Set set = (Set<P>) this.a.a(i, ((TraitsLayoutManager.c) eVar).a.w(i), eVar2);
            if (set.isEmpty()) {
                return Collections.emptySet();
            }
            if (set instanceof EnumSet) {
                return set;
            }
            return ImmutableSet.copyOf((Collection) set);
        }

        /* JADX WARN: Unknown type variable: R in type: java.util.Set<R> */
        private Set<R> e(int i, int i2, e eVar, RecyclerView.e<?> eVar2) {
            if (i < 0) {
                return Collections.emptySet();
            }
            if (i >= i2) {
                return Collections.emptySet();
            }
            return d(i, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public void b(Rect rect, int i, int i2, b bVar, e eVar, RecyclerView.e<?> eVar2) {
            rect.set(0, 0, 0, 0);
            this.b.b(rect, e(i - 1, i2, eVar, eVar2), e(i, i2, eVar, eVar2), e(i + 1, i2, eVar, eVar2), i, i2, bVar);
        }

        /* access modifiers changed from: package-private */
        public int c(int i, int i2, int i3, e eVar, RecyclerView.e<?> eVar2) {
            return this.b.a(d(i, eVar, eVar2), i, i2, i3);
        }
    }

    public interface b {
        int a(int i);

        int b();

        int c(int i);

        int d(int i);
    }

    public interface c<T> {
        Set<T> a(int i, int i2, RecyclerView.e<?> eVar);
    }

    public interface d<T> {
        int a(Set<T> set, int i, int i2, int i3);

        void b(Rect rect, Set<T> set, Set<T> set2, Set<T> set3, int i, int i2, b bVar);

        void invalidate();
    }

    /* access modifiers changed from: package-private */
    public interface e {
    }

    private <T> a(c<? extends T> cVar, d<? super T> dVar) {
        cVar.getClass();
        dVar.getClass();
        this.a = new C0200a<>(cVar, dVar);
    }

    public static <T> a a(c<? extends T> cVar, d<? super T> dVar) {
        return new a(cVar, dVar);
    }

    /* access modifiers changed from: package-private */
    public void b(Rect rect, int i, int i2, b bVar, e eVar, RecyclerView.e<?> eVar2) {
        this.a.b(rect, i, i2, bVar, eVar, eVar2);
    }

    /* access modifiers changed from: package-private */
    public int c(int i, int i2, int i3, e eVar, RecyclerView.e<?> eVar2) {
        return this.a.c(i, i2, i3, eVar, eVar2);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        ((C0200a) this.a).b.invalidate();
    }
}
