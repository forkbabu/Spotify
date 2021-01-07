package defpackage;

import androidx.loader.content.b;
import defpackage.c6;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gc1  reason: default package */
public class gc1 {
    private int a;
    private final Map<c6.a<?>, b<?>> b = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: gc1$b */
    public static class b<D> implements b.a<D> {
        private final int a;
        private final androidx.loader.content.b<D> b;
        private boolean c;
        private boolean d;
        private final c6.a<D> e;

        b(int i, c6.a aVar, a aVar2) {
            this.a = i;
            this.b = aVar.b(i, null);
            this.e = aVar;
        }

        @Override // androidx.loader.content.b.a
        public void a(androidx.loader.content.b<D> bVar, D d2) {
            this.e.a(this.b, d2);
        }

        public void b() {
            if (!this.c) {
                this.c = true;
                if (!this.d) {
                    this.b.g(this.a, this);
                    this.d = true;
                }
                this.b.i();
            }
        }

        public void c() {
            if (this.d) {
                this.d = false;
                this.b.k(this);
            }
            this.b.h();
            this.e.c(this.b);
        }
    }

    public <D> void a(c6.a<D> aVar) {
        b<?> bVar = this.b.get(aVar);
        if (bVar == null) {
            int i = this.a;
            this.a = i + 1;
            b<?> bVar2 = new b<>(i, aVar, null);
            this.b.put(aVar, bVar2);
            bVar = bVar2;
        }
        bVar.b();
    }

    public void b(c6.a<?> aVar) {
        b<?> remove = this.b.remove(aVar);
        if (remove != null) {
            remove.c();
        }
    }
}
