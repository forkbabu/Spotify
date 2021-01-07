package com.spotify.mobile.android.hubframework.model.immutable;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

public final class j<E> {
    public static final a b = new a(null);
    private List<E> a;

    public static final class a {
        public a(f fVar) {
        }
    }

    public j(List<? extends E> list) {
        h.e(list, "list");
        this.a = d.W(list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Iterable<? extends E> iterable) {
        h.e(iterable, "items");
        if (this.a instanceof ImmutableList) {
            this.a = new ArrayList(this.a);
        }
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            this.a.add(it.next());
        }
    }

    public final ImmutableList<E> b() {
        ImmutableList<E> copyOf = ImmutableList.copyOf((Collection) this.a);
        h.d(copyOf, "ImmutableList.copyOf(list)");
        return copyOf;
    }

    public final void c(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableList) {
            this.a = m.b(iterable);
            return;
        }
        if (!(iterable == null || ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()))) {
            ArrayList newArrayList = Collections2.newArrayList(iterable);
            h.d(newArrayList, "Lists.newArrayList(items)");
            this.a = newArrayList;
            return;
        }
        List<E> list = this.a;
        if (list instanceof ImmutableList) {
            ImmutableList of = ImmutableList.of();
            h.d(of, "ImmutableList.of()");
            this.a = of;
            return;
        }
        list.clear();
    }
}
