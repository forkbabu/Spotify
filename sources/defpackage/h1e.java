package defpackage;

import com.google.common.collect.Collections2;
import io.reactivex.g;
import io.reactivex.k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h1e  reason: default package */
public class h1e<T> implements k<T, T> {
    private final List<k<T, T>> a;

    /* renamed from: h1e$a */
    public static class a<T> {
        private final List<k<T, T>> a = new ArrayList(10);

        public a<T> a(k<T, T> kVar) {
            this.a.add(kVar);
            return this;
        }

        public h1e<T> b() {
            return h1e.b(this.a);
        }
    }

    private h1e(List<k<T, T>> list) {
        this.a = list;
    }

    public static <T> h1e<T> b(List<k<T, T>> list) {
        return new h1e<>(Collections2.newArrayList(list));
    }

    @Override // io.reactivex.k
    public tpf a(g gVar) {
        for (k<T, T> kVar : this.a) {
            gVar = gVar.l(kVar);
        }
        return gVar;
    }
}
