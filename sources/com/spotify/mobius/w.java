package com.spotify.mobius;

import java.util.ArrayList;
import java.util.List;

public class w<E> implements q<E> {
    private final List<q<E>> a;

    class a implements w92 {
        final /* synthetic */ List a;

        a(w wVar, List list) {
            this.a = list;
        }

        @Override // defpackage.w92
        public void dispose() {
            for (E e : this.a) {
                e.dispose();
            }
        }
    }

    private w(List<q<E>> list) {
        this.a = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <E> q<E> b(q<E> qVar, q<E>... qVarArr) {
        ArrayList arrayList = new ArrayList();
        qVar.getClass();
        arrayList.add(qVar);
        for (q<E> qVar2 : qVarArr) {
            qVar2.getClass();
            arrayList.add(qVar2);
        }
        return new w(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.q
    public w92 a(da2<E> da2) {
        ArrayList arrayList = new ArrayList(this.a.size());
        for (q<E> qVar : this.a) {
            arrayList.add(qVar.a(da2));
        }
        return new a(this, arrayList);
    }
}
