package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.encore.ViewProvider;
import defpackage.d39.b;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: d39  reason: default package */
public class d39<T extends Enum<T>, D extends b<T>> extends RecyclerView.e<a> {
    private c<T, D> c;
    private final ArrayList<g<T, D>> f = new ArrayList<>();
    private final ArrayList<g<T, D>> n = new ArrayList<>();
    private int o;

    /* renamed from: d39$a */
    public static class a extends RecyclerView.b0 {
        private final ViewProvider C;

        protected a(ViewProvider viewProvider) {
            super(viewProvider.getView());
            this.C = viewProvider;
        }

        public ViewProvider h0() {
            return this.C;
        }
    }

    /* renamed from: d39$b */
    public interface b<T extends Enum<T>> {
        long a();

        T type();
    }

    /* renamed from: d39$c */
    public interface c<T extends Enum<T>, D extends b<T>> {
        D a(int i, boolean z);

        int c();
    }

    /* renamed from: d39$d */
    public static abstract class d<T extends Enum<T>, D extends b<T>> {
        public static <T extends Enum<T>, D extends b<T>> d<T, D> a(ImmutableSet<T> immutableSet, f fVar, e<T, D> eVar) {
            return new w29(immutableSet, fVar, eVar);
        }

        public abstract ImmutableSet<T> b();

        public abstract e<T, D> c();

        public abstract f d();
    }

    /* renamed from: d39$e */
    public interface e<T extends Enum<T>, D extends b<T>> {
        void a(ViewProvider viewProvider, D d, int i);
    }

    /* renamed from: d39$f */
    public interface f {
        ViewProvider a(ViewGroup viewGroup);
    }

    /* access modifiers changed from: private */
    /* renamed from: d39$g */
    public static class g<T extends Enum<T>, D extends b<T>> {
        public final d<T, D> a;
        public final int b;

        g(d<T, D> dVar, int i) {
            this.a = dVar;
            this.b = i;
        }
    }

    /* renamed from: d39$h */
    public interface h<T extends Enum<T>, D extends b<T>> {
        ImmutableList<d<T, D>> a();
    }

    public d39() {
        U(true);
    }

    private g<T, D> c0(T t) {
        int ordinal = t.ordinal();
        MoreObjects.checkElementIndex(ordinal, this.f.size(), String.format("Type (%s) not supported", t));
        g<T, D> gVar = this.f.get(ordinal);
        MoreObjects.checkNotNull(gVar, String.format("Type (%s) not supported", t));
        return gVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: d39<T extends java.lang.Enum<T>, D extends d39$b<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        c<T, D> cVar = this.c;
        cVar.getClass();
        D a2 = cVar.a(i, true);
        e<T, D> c2 = c0(a2.type()).a.c();
        if (c2 != null) {
            Y(c2, aVar2.h0(), a2, i);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        MoreObjects.checkElementIndex(i, this.n.size(), "Bad view type");
        return new a(this.n.get(i).a.d().a(viewGroup));
    }

    public D X(int i, boolean z) {
        c<T, D> cVar = this.c;
        cVar.getClass();
        return cVar.a(i, z);
    }

    /* access modifiers changed from: protected */
    public void Y(e<T, D> eVar, ViewProvider viewProvider, D d2, int i) {
        throw null;
    }

    public void Z(h<T, D> hVar) {
        UnmodifiableListIterator<d<T, D>> listIterator = hVar.a().listIterator();
        while (listIterator.hasNext()) {
            d<T, D> next = listIterator.next();
            g<T, D> gVar = new g<>(next, this.n.size());
            this.n.add(gVar);
            UnmodifiableIterator<T> it = next.b().iterator();
            while (it.hasNext()) {
                int ordinal = it.next().ordinal();
                int size = this.f.size();
                if (ordinal >= size) {
                    this.f.addAll(Collections.nCopies(((ordinal + 1) * 2) - size, null));
                }
                this.f.set(ordinal, gVar);
            }
        }
    }

    public void b0(c<T, D> cVar) {
        this.c = cVar;
        this.o++;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        c<T, D> cVar = this.c;
        if (cVar != null) {
            return cVar.c();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        c<T, D> cVar = this.c;
        cVar.getClass();
        long a2 = cVar.a(i, false).a();
        return a2 == 0 ? (((long) this.o) << 32) | ((long) i) : a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: d39<T extends java.lang.Enum<T>, D extends d39$b<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        c<T, D> cVar = this.c;
        cVar.getClass();
        return c0(cVar.a(i, false).type()).b;
    }
}
