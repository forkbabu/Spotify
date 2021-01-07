package com.facebook;

import android.os.Handler;
import com.facebook.internal.h0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class p extends AbstractList<m> {
    private static AtomicInteger n = new AtomicInteger();
    private Handler a;
    private List<m> b;
    private final String c;
    private List<a> f;

    public interface a {
        void a(p pVar);
    }

    public interface b extends a {
        void b(p pVar, long j, long j2);
    }

    public p() {
        this.b = new ArrayList();
        this.c = Integer.valueOf(n.incrementAndGet()).toString();
        this.f = new ArrayList();
        this.b = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        this.b.add(i, (m) obj);
    }

    public final boolean c(m mVar) {
        return this.b.add(mVar);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    public void d(a aVar) {
        if (!this.f.contains(aVar)) {
            this.f.add(aVar);
        }
    }

    public final o e() {
        int i = m.n;
        h0.e(this, "requests");
        o oVar = new o(this);
        oVar.executeOnExecutor(k.l(), new Void[0]);
        return oVar;
    }

    public final m f(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.b.get(i);
    }

    /* access modifiers changed from: package-private */
    public final Handler h() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final List<a> i() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final String j() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final List<m> k() {
        return this.b;
    }

    public int l() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void n(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        return this.b.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        return this.b.set(i, (m) obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.b.add((m) obj);
    }

    public p(Collection<m> collection) {
        this.b = new ArrayList();
        this.c = Integer.valueOf(n.incrementAndGet()).toString();
        this.f = new ArrayList();
        this.b = new ArrayList(collection);
    }

    public p(m... mVarArr) {
        this.b = new ArrayList();
        this.c = Integer.valueOf(n.incrementAndGet()).toString();
        this.f = new ArrayList();
        this.b = Arrays.asList(mVarArr);
    }
}
