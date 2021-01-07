package com.spotify.libs.search.history;

import android.database.Observable;
import com.spotify.libs.search.history.o;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class f<T> implements o<T> {
    private final Set<T> a = new HashSet();
    private final Deque<g> b = new LinkedList();
    private final b c = new b(null);
    private final int d;
    private final LinkedList<T> e = new LinkedList<>();

    /* access modifiers changed from: private */
    public static class b extends Observable<o.a> {
        b(a aVar) {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            Iterator it = ((Observable) this).mObservers.iterator();
            while (it.hasNext()) {
                ((o.a) it.next()).a();
            }
        }
    }

    public f(int i) {
        this.d = i;
    }

    private void a(int i, int i2) {
        this.b.add(new d(Integer.valueOf(i), Integer.valueOf((i2 - i) + 1)));
    }

    private void j() {
        int size = this.e.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.a.add(this.e.get(i2))) {
                if (i == -1) {
                    i = i2;
                }
                if (i2 + 1 == size) {
                    a(i, i2);
                }
            } else if (i != -1) {
                a(i, i2 - 1);
                i = -1;
            }
        }
        this.a.clear();
        Iterator<g> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            g next = descendingIterator.next();
            Integer b2 = next.b();
            Integer a2 = next.a();
            if (!(b2 == null || a2 == null)) {
                this.e.subList(b2.intValue(), a2.intValue() + b2.intValue()).clear();
            }
            descendingIterator.remove();
        }
    }

    private void l() {
        if (this.e.size() - this.d > 0) {
            while (this.e.size() > this.d) {
                this.e.removeLast();
            }
        }
    }

    public void b(List<T> list) {
        this.e.addAll(list);
        j();
        l();
        this.c.a();
    }

    public void c() {
        this.e.clear();
        this.c.a();
    }

    public g<List<T>> d() {
        return g.p(new b(this), BackpressureStrategy.LATEST);
    }

    public List<T> e() {
        return Collections.unmodifiableList(new ArrayList(this.e));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: io.reactivex.h */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.spotify.libs.search.history.f$b */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void f(h hVar) {
        c cVar = new c(this, hVar);
        this.c.registerObserver(cVar);
        hVar.onNext(new ArrayList(this.e));
        hVar.e(new a(this, cVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: io.reactivex.h */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void g(h hVar) {
        hVar.onNext(new ArrayList(this.e));
    }

    public /* synthetic */ void h(o.a aVar) {
        this.c.unregisterObserver(aVar);
    }

    public void i(T t) {
        this.e.push(t);
        j();
        l();
        this.c.a();
    }

    public void k(T t) {
        this.e.remove(t);
        this.c.a();
    }
}
