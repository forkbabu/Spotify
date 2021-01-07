package defpackage;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.s51;
import java.util.List;

/* renamed from: i61  reason: default package */
public class i61 extends RecyclerView.e<b> {
    private final w51 c;
    private final m61 f;
    private final j61 n;
    private final x51<List<? extends s81>, t61> o = new a();

    /* renamed from: i61$a */
    class a extends x51<List<? extends s81>, t61> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.x51
        public t61 a() {
            return i61.this.f.e();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.x51
        public List<? extends s81> b() {
            return i61.this.f.j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i61$b */
    public static final class b extends RecyclerView.b0 {
        private final w61<?> C;

        b(w61<?> w61) {
            super(w61.e());
            this.C = w61;
        }

        /* access modifiers changed from: package-private */
        public void j0(int i, v61 v61, s51.b bVar) {
            this.C.a(i, v61.b(), bVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.b0
        public String toString() {
            StringBuilder V0 = je.V0("HubsAdapter.");
            V0.append(super.toString());
            V0.append(" (");
            V0.append(this.C);
            V0.append(')');
            return V0.toString();
        }
    }

    public i61(w51 w51) {
        w51.getClass();
        this.c = w51;
        m61 m61 = new m61(w51);
        this.f = m61;
        this.n = new j61(m61);
        U(true);
        T(m61.i());
    }

    public static w61<?> f0(RecyclerView.b0 b0Var) {
        if (b0Var instanceof b) {
            return ((b) b0Var).C;
        }
        throw new IllegalArgumentException("Not a HubsAdapter view holder");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(b bVar, int i) {
        bVar.j0(i, this.f.f(i), this.n);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public b M(ViewGroup viewGroup, int i) {
        return new b(w61.b(i, viewGroup, this.c));
    }

    public x51<List<? extends s81>, t61> Y() {
        return this.o;
    }

    public void Z(Parcelable parcelable) {
        this.n.d(parcelable);
    }

    public Parcelable b0() {
        return this.n.f();
    }

    public void c0(List<? extends s81> list) {
        if (list == null || list.isEmpty()) {
            this.n.c();
        }
        this.f.k(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        s81 b2 = this.f.f(i).b();
        String id = b2.id();
        if (id != null) {
            b2 = id;
        }
        return (long) b2.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return this.f.f(i).a();
    }
}
