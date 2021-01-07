package defpackage;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k1e  reason: default package */
public class k1e<T> implements w<T, T> {
    private final List<w<T, T>> a;

    /* renamed from: k1e$b */
    public static class b<T> {
        private final List<w<T, T>> a = new ArrayList(10);

        public b<T> a(w<T, T> wVar) {
            if (wVar != null) {
                this.a.add(wVar);
            }
            return this;
        }

        public k1e<T> b() {
            return new k1e<>(this.a, null);
        }
    }

    k1e(List list, a aVar) {
        this.a = list;
    }

    @Override // io.reactivex.w
    public v<T> apply(s<T> sVar) {
        for (w<T, T> wVar : this.a) {
            sVar = sVar.q(wVar);
        }
        return sVar;
    }
}
