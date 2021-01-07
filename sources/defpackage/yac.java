package defpackage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import com.spotify.pageloader.t0;

/* access modifiers changed from: package-private */
/* renamed from: yac  reason: default package */
public class yac<T> implements cbc<T> {
    private final a<T> a;

    /* renamed from: yac$a */
    static class a<T> extends LiveData<t0<T>> {
        private final t0<T> k;

        a(t0<T> t0Var) {
            this.k = t0Var;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void j() {
            this.k.start();
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void k() {
            this.k.stop();
        }

        /* access modifiers changed from: package-private */
        public t0<T> o() {
            return this.k;
        }
    }

    yac(n nVar, t0<T> t0Var) {
        a<T> aVar = new a<>(t0Var);
        this.a = aVar;
        aVar.h(nVar, tac.a);
    }

    @Override // defpackage.cbc
    public t0<T> get() {
        return this.a.o();
    }
}
