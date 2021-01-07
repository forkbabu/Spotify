package com.spotify.intentrouter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class j<T> {
    private final List<k<T>> a;

    public static class b<T> {
        private final List<k<T>> a = new ArrayList();

        b() {
        }

        public b<T> a(m<T> mVar, h<T> hVar) {
            this.a.add(new f(mVar, hVar));
            return this;
        }

        public j<T> b() {
            return new j<>(Collections.unmodifiableList(new ArrayList(this.a)), null);
        }
    }

    j(List list, a aVar) {
        this.a = list;
    }

    public static <T> b<T> a() {
        return new b<>();
    }

    public List<k<T>> b(T t) {
        ArrayList arrayList = new ArrayList();
        for (k<T> kVar : this.a) {
            if (kVar.b().a(t)) {
                arrayList.add(kVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
