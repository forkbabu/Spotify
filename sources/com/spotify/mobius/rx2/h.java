package com.spotify.mobius.rx2;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
public class h<F, E> implements w<F, E> {
    private final e<F, E> a;

    class a implements w<F, E> {
        final /* synthetic */ Set a;

        a(h hVar, Set set) {
            this.a = set;
        }

        @Override // io.reactivex.w
        public v apply(s sVar) {
            return sVar.Q(new g(this)).j0(new f(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    h(Set<Class<?>> set, Collection<w<F, E>> collection) {
        HashSet hashSet = new HashSet(set);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(collection));
        a aVar = new a(this, hashSet);
        ArrayList arrayList = new ArrayList(unmodifiableList);
        arrayList.add(aVar);
        this.a = new e<>(arrayList);
    }

    @Override // io.reactivex.w
    public v apply(s sVar) {
        return sVar.q(this.a);
    }
}
