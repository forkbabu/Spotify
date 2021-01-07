package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: m61  reason: default package */
public final class m61 extends AbstractList<v61> {
    private final w51 a;
    private List<? extends s81> b = Collections.emptyList();
    private t61 c = t61.f;
    private final r61 f;
    private final List<s81> n = new a();
    private final RecyclerView.g o = new b();

    /* renamed from: m61$a */
    class a extends AbstractList<s81> {
        a() {
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            return m61.c(m61.this, i);
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
        public int size() {
            return m61.this.size();
        }
    }

    /* renamed from: m61$b */
    class b extends RecyclerView.g {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            m61.d(m61.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void b(int i, int i2) {
            m61.d(m61.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void c(int i, int i2, Object obj) {
            m61.d(m61.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i, int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i, int i2) {
            m61.d(m61.this);
        }
    }

    m61(w51 w51) {
        this.a = w51;
        this.f = new r61(w51);
    }

    static s81 c(m61 m61, int i) {
        Object obj = m61.b.get(i);
        obj.getClass();
        return (s81) obj;
    }

    static void d(m61 m61) {
        m61.f.a();
    }

    /* access modifiers changed from: package-private */
    public t61 e() {
        return this.c;
    }

    public v61 f(int i) {
        r61 r61 = this.f;
        Object obj = this.b.get(i);
        obj.getClass();
        return r61.b((s81) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        r61 r61 = this.f;
        Object obj = this.b.get(i);
        obj.getClass();
        return r61.b((s81) obj);
    }

    /* access modifiers changed from: package-private */
    public r61 h() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.g i() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public List<s81> j() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public void k(List<? extends s81> list) {
        if (list != null) {
            this.b = list;
            this.c = t61.c(this.a.f(), list);
            return;
        }
        this.b = Collections.emptyList();
        this.c = t61.f;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        return this.b.size();
    }
}
