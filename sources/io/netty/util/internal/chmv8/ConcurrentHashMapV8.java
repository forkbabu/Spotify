package io.netty.util.internal.chmv8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

public class ConcurrentHashMapV8<K, V> implements ConcurrentMap<K, V>, Serializable {
    private static final long A;
    private static final long B;
    private static final long C;
    private static final long D;
    private static final int E;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    static final int u = Runtime.getRuntime().availableProcessors();
    static final AtomicInteger v = new AtomicInteger();
    private static final Unsafe w;
    private static final long x;
    private static final long y;
    private static final long z;
    volatile transient h<K, V>[] a;
    private volatile transient h<K, V>[] b;
    private volatile transient long c;
    private volatile transient int f;
    private volatile transient int n;
    private volatile transient int o;
    private volatile transient int p;
    private volatile transient c[] q;
    private transient KeySetView<K, V> r;
    private transient ValuesView<K, V> s;
    private transient EntrySetView<K, V> t;

    static final class EntrySetView<K, V> extends CollectionView<K, V, Map.Entry<K, V>> implements Set<Map.Entry<K, V>>, Serializable {
        private static final long serialVersionUID = 2249069246763182397L;

        EntrySetView(ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(concurrentHashMapV8);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            boolean z = false;
            for (Map.Entry<K, V> entry : collection) {
                if (add(entry)) {
                    z = true;
                }
            }
            return z;
        }

        /* renamed from: c */
        public boolean add(Map.Entry<K, V> entry) {
            return this.map.k(entry.getKey(), entry.getValue(), false) == null;
        }

        @Override // io.netty.util.internal.chmv8.ConcurrentHashMapV8.CollectionView, java.util.Collection
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            V v;
            Object value;
            return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (v = this.map.get(key)) == null || (value = entry.getValue()) == null || (value != v && !value.equals(v))) ? false : true;
        }

        @Override // java.util.Collection, java.lang.Object, java.util.Set
        public final boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.util.Collection, java.lang.Object, java.util.Set
        public final int hashCode() {
            int length;
            h<K, V>[] hVarArr = this.map.a;
            int i = 0;
            if (hVarArr != null) {
                int length2 = hVarArr.length;
                int length3 = hVarArr.length;
                h<K, V> hVar = null;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (hVar != null) {
                        hVar = hVar.f;
                    }
                    while (true) {
                        if (hVar != null) {
                            break;
                        } else if (i2 >= length3 || hVarArr == null || (length = hVarArr.length) <= i3 || i3 < 0) {
                            break;
                        } else {
                            h<K, V> p = ConcurrentHashMapV8.p(hVarArr, i3);
                            if (p != null && p.a < 0) {
                                if (p instanceof e) {
                                    hVarArr = ((e) p).n;
                                    hVar = null;
                                } else {
                                    p = p instanceof j ? ((j) p).o : null;
                                }
                            }
                            i3 += length2;
                            if (i3 >= length) {
                                i2++;
                                i3 = i2;
                            }
                            hVar = p;
                        }
                    }
                    hVar = null;
                    if (hVar == null) {
                        break;
                    }
                    i += hVar.hashCode();
                    hVar = hVar;
                }
            }
            return i;
        }

        @Override // io.netty.util.internal.chmv8.ConcurrentHashMapV8.CollectionView, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            ConcurrentHashMapV8<K, V> concurrentHashMapV8 = this.map;
            h<K, V>[] hVarArr = concurrentHashMapV8.a;
            int length = hVarArr == null ? 0 : hVarArr.length;
            return new d(hVarArr, length, 0, length, concurrentHashMapV8);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.map.remove(key, value);
        }
    }

    public static class KeySetView<K, V> extends CollectionView<K, V, K> implements Set<K>, Serializable {
        private static final long serialVersionUID = 7249069246763182397L;
        private final V value = null;

        KeySetView(ConcurrentHashMapV8<K, V> concurrentHashMapV8, V v) {
            super(concurrentHashMapV8);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            V v = this.value;
            if (v != null) {
                return this.map.k(k, v, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: io.netty.util.internal.chmv8.ConcurrentHashMapV8<K, V> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends K> collection) {
            V v = this.value;
            if (v != null) {
                Iterator<? extends K> it = collection.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (this.map.k(it.next(), v, true) == null) {
                        z = true;
                    }
                }
                return z;
            }
            throw new UnsupportedOperationException();
        }

        @Override // io.netty.util.internal.chmv8.ConcurrentHashMapV8.CollectionView, java.util.Collection
        public boolean contains(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // java.util.Collection, java.lang.Object, java.util.Set
        public boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.util.Collection, java.lang.Object, java.util.Set
        public int hashCode() {
            Iterator<K> it = iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().hashCode();
            }
            return i;
        }

        @Override // io.netty.util.internal.chmv8.ConcurrentHashMapV8.CollectionView, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            ConcurrentHashMapV8<K, V> concurrentHashMapV8 = this.map;
            h<K, V>[] hVarArr = concurrentHashMapV8.a;
            int length = hVarArr == null ? 0 : hVarArr.length;
            return new f(hVarArr, length, 0, length, concurrentHashMapV8);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }
    }

    static class Segment<K, V> extends ReentrantLock implements Serializable {
        private static final long serialVersionUID = 2249069246763182397L;
        final float loadFactor;

        Segment(float f) {
            this.loadFactor = f;
        }
    }

    static final class ValuesView<K, V> extends CollectionView<K, V, V> implements Collection<V>, Serializable {
        private static final long serialVersionUID = 2249069246763182397L;

        ValuesView(ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(concurrentHashMapV8);
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // io.netty.util.internal.chmv8.ConcurrentHashMapV8.CollectionView, java.util.Collection
        public final boolean contains(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // io.netty.util.internal.chmv8.ConcurrentHashMapV8.CollectionView, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            ConcurrentHashMapV8<K, V> concurrentHashMapV8 = this.map;
            h<K, V>[] hVarArr = concurrentHashMapV8.a;
            int length = hVarArr == null ? 0 : hVarArr.length;
            return new l(hVarArr, length, 0, length, concurrentHashMapV8);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            b bVar;
            if (obj == null) {
                return false;
            }
            Iterator<V> it = iterator();
            do {
                bVar = (b) it;
                if (!bVar.hasNext()) {
                    return false;
                }
            } while (!obj.equals(((l) it).next()));
            bVar.remove();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* access modifiers changed from: package-private */
    public static class b<K, V> extends i<K, V> {
        final ConcurrentHashMapV8<K, V> p;
        h<K, V> q;

        b(h<K, V>[] hVarArr, int i, int i2, int i3, ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(hVarArr, i, i2, i3);
            this.p = concurrentHashMapV8;
            a();
        }

        public final boolean hasMoreElements() {
            return this.b != null;
        }

        public final boolean hasNext() {
            return this.b != null;
        }

        public final void remove() {
            h<K, V> hVar = this.q;
            if (hVar != null) {
                this.q = null;
                this.p.l(hVar.b, null, null);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c {
        volatile long a;

        c(long j) {
            this.a = j;
        }
    }

    static final class d<K, V> extends b<K, V> implements Iterator<Map.Entry<K, V>> {
        d(h<K, V>[] hVarArr, int i, int i2, int i3, ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(hVarArr, i, i2, i3, concurrentHashMapV8);
        }

        @Override // java.util.Iterator
        public Object next() {
            h<K, V> hVar = this.b;
            if (hVar != null) {
                K k = hVar.b;
                V v = hVar.c;
                this.q = hVar;
                a();
                return new g(k, v, this.p);
            }
            throw new NoSuchElementException();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<K, V> extends h<K, V> {
        final h<K, V>[] n;

        e(h<K, V>[] hVarArr) {
            super(-1, null, null, null);
            this.n = hVarArr;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
            if ((r0 instanceof io.netty.util.internal.chmv8.ConcurrentHashMapV8.e) == false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
            r0 = ((io.netty.util.internal.chmv8.ConcurrentHashMapV8.e) r0).n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
            return r0.a(r5, r6);
         */
        @Override // io.netty.util.internal.chmv8.ConcurrentHashMapV8.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.netty.util.internal.chmv8.ConcurrentHashMapV8.h<K, V> a(int r5, java.lang.Object r6) {
            /*
                r4 = this;
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V>[] r0 = r4.n
            L_0x0002:
                r1 = 0
                if (r0 == 0) goto L_0x0037
                int r2 = r0.length
                if (r2 == 0) goto L_0x0037
                int r2 = r2 + -1
                r2 = r2 & r5
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$h r0 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.p(r0, r2)
                if (r0 != 0) goto L_0x0012
                goto L_0x0037
            L_0x0012:
                int r2 = r0.a
                if (r2 != r5) goto L_0x0023
                K r3 = r0.b
                if (r3 == r6) goto L_0x0022
                if (r3 == 0) goto L_0x0023
                boolean r3 = r6.equals(r3)
                if (r3 == 0) goto L_0x0023
            L_0x0022:
                return r0
            L_0x0023:
                if (r2 >= 0) goto L_0x0033
                boolean r1 = r0 instanceof io.netty.util.internal.chmv8.ConcurrentHashMapV8.e
                if (r1 == 0) goto L_0x002e
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$e r0 = (io.netty.util.internal.chmv8.ConcurrentHashMapV8.e) r0
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V>[] r0 = r0.n
                goto L_0x0002
            L_0x002e:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$h r5 = r0.a(r5, r6)
                return r5
            L_0x0033:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V> r0 = r0.f
                if (r0 != 0) goto L_0x0012
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.e.a(int, java.lang.Object):io.netty.util.internal.chmv8.ConcurrentHashMapV8$h");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<K, V> extends b<K, V> implements Iterator<K>, Enumeration<K> {
        f(h<K, V>[] hVarArr, int i, int i2, int i3, ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(hVarArr, i, i2, i3, concurrentHashMapV8);
        }

        @Override // java.util.Iterator
        public final K next() {
            h<K, V> hVar = this.b;
            if (hVar != null) {
                K k = hVar.b;
                this.q = hVar;
                a();
                return k;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Enumeration
        public final K nextElement() {
            return next();
        }
    }

    static final class g<K, V> implements Map.Entry<K, V> {
        final K a;
        V b;
        final ConcurrentHashMapV8<K, V> c;

        g(K k, V v, ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            this.a = k;
            this.b = v;
            this.c = concurrentHashMapV8;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public boolean equals(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            K k;
            V v;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (k = this.a) || key.equals(k)) && (value == (v = this.b) || value.equals(v));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            v.getClass();
            V v2 = this.b;
            this.b = v;
            this.c.put(this.a, v);
            return v2;
        }

        @Override // java.lang.Object
        public String toString() {
            return ((Object) this.a) + "=" + ((Object) this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public static class h<K, V> implements Map.Entry<K, V> {
        final int a;
        final K b;
        volatile V c;
        volatile h<K, V> f;

        h(int i, K k, V v, h<K, V> hVar) {
            this.a = i;
            this.b = k;
            this.c = v;
            this.f = hVar;
        }

        /* access modifiers changed from: package-private */
        public h<K, V> a(int i, Object obj) {
            K k;
            h<K, V> hVar = this;
            do {
                if (hVar.a == i && ((k = hVar.b) == obj || (k != null && obj.equals(k)))) {
                    return hVar;
                }
                hVar = hVar.f;
            } while (hVar != null);
            return null;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public final boolean equals(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            K k;
            V v;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (k = this.b) || key.equals(k)) && (value == (v = this.c) || value.equals(v));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public final int hashCode() {
            return this.b.hashCode() ^ this.c.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Object
        public final String toString() {
            return ((Object) this.b) + "=" + ((Object) this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public static class i<K, V> {
        h<K, V>[] a;
        h<K, V> b = null;
        int c;
        int f;
        int n;
        final int o;

        i(h<K, V>[] hVarArr, int i, int i2, int i3) {
            this.a = hVarArr;
            this.o = i;
            this.c = i2;
            this.f = i2;
            this.n = i3;
        }

        /* access modifiers changed from: package-private */
        public final h<K, V> a() {
            h<K, V>[] hVarArr;
            int length;
            int i;
            h<K, V> hVar = this.b;
            if (hVar != null) {
                hVar = hVar.f;
            }
            while (hVar == null) {
                if (this.f >= this.n || (hVarArr = this.a) == null || (length = hVarArr.length) <= (i = this.c) || i < 0) {
                    this.b = null;
                    return null;
                }
                hVar = ConcurrentHashMapV8.p(hVarArr, i);
                if (hVar != null && hVar.a < 0) {
                    if (hVar instanceof e) {
                        this.a = ((e) hVar).n;
                        hVar = null;
                    } else {
                        hVar = hVar instanceof j ? ((j) hVar).o : null;
                    }
                }
                int i2 = this.c + this.o;
                this.c = i2;
                if (i2 >= length) {
                    int i3 = this.f + 1;
                    this.f = i3;
                    this.c = i3;
                }
            }
            this.b = hVar;
            return hVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<K, V> extends h<K, V> {
        private static final Unsafe r;
        private static final long s;
        k<K, V> n;
        volatile k<K, V> o;
        volatile Thread p;
        volatile int q;

        static {
            try {
                Unsafe h = ConcurrentHashMapV8.h();
                r = h;
                s = h.objectFieldOffset(j.class.getDeclaredField("q"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        j(k<K, V> kVar) {
            super(-2, null, null, null);
            int f;
            this.o = kVar;
            k<K, V> kVar2 = null;
            while (kVar != null) {
                k<K, V> kVar3 = (k) kVar.f;
                kVar.p = null;
                kVar.o = null;
                if (kVar2 == null) {
                    kVar.n = null;
                    kVar.r = false;
                } else {
                    K k = kVar.b;
                    int i = kVar.a;
                    k<K, V> kVar4 = kVar2;
                    Class<?> cls = null;
                    while (true) {
                        int i2 = kVar4.a;
                        f = i2 > i ? -1 : i2 < i ? 1 : (cls == null && (cls = ConcurrentHashMapV8.e(k)) == null) ? 0 : ConcurrentHashMapV8.f(cls, k, kVar4.b);
                        k<K, V> kVar5 = f <= 0 ? kVar4.o : kVar4.p;
                        if (kVar5 == null) {
                            break;
                        }
                        kVar4 = kVar5;
                    }
                    kVar.n = kVar4;
                    if (f <= 0) {
                        kVar4.o = kVar;
                    } else {
                        kVar4.p = kVar;
                    }
                    kVar = c(kVar2, kVar);
                }
                kVar2 = kVar;
                kVar = kVar3;
            }
            this.n = kVar2;
        }

        static <K, V> k<K, V> b(k<K, V> kVar, k<K, V> kVar2) {
            boolean z;
            boolean z2;
            while (kVar2 != null && kVar2 != kVar) {
                k<K, V> kVar3 = kVar2.n;
                if (kVar3 == null) {
                    kVar2.r = false;
                    return kVar2;
                } else if (kVar2.r) {
                    kVar2.r = false;
                    return kVar;
                } else {
                    k<K, V> kVar4 = kVar3.o;
                    k<K, V> kVar5 = null;
                    if (kVar4 == kVar2) {
                        k<K, V> kVar6 = kVar3.p;
                        if (kVar6 != null && kVar6.r) {
                            kVar6.r = false;
                            kVar3.r = true;
                            kVar = h(kVar, kVar3);
                            kVar3 = kVar2.n;
                            kVar6 = kVar3 == null ? null : kVar3.p;
                        }
                        if (kVar6 != null) {
                            k<K, V> kVar7 = kVar6.o;
                            k<K, V> kVar8 = kVar6.p;
                            if ((kVar8 == null || !kVar8.r) && (kVar7 == null || !kVar7.r)) {
                                kVar6.r = true;
                            } else {
                                if (kVar8 == null || !kVar8.r) {
                                    if (kVar7 != null) {
                                        kVar7.r = false;
                                    }
                                    kVar6.r = true;
                                    kVar = i(kVar, kVar6);
                                    kVar3 = kVar2.n;
                                    if (kVar3 != null) {
                                        kVar5 = kVar3.p;
                                    }
                                    kVar6 = kVar5;
                                }
                                if (kVar6 != null) {
                                    if (kVar3 == null) {
                                        z2 = false;
                                    } else {
                                        z2 = kVar3.r;
                                    }
                                    kVar6.r = z2;
                                    k<K, V> kVar9 = kVar6.p;
                                    if (kVar9 != null) {
                                        kVar9.r = false;
                                    }
                                }
                                if (kVar3 != null) {
                                    kVar3.r = false;
                                    kVar = h(kVar, kVar3);
                                }
                            }
                        }
                        kVar2 = kVar3;
                    } else {
                        if (kVar4 != null && kVar4.r) {
                            kVar4.r = false;
                            kVar3.r = true;
                            kVar = i(kVar, kVar3);
                            kVar3 = kVar2.n;
                            kVar4 = kVar3 == null ? null : kVar3.o;
                        }
                        if (kVar4 != null) {
                            k<K, V> kVar10 = kVar4.o;
                            k<K, V> kVar11 = kVar4.p;
                            if ((kVar10 == null || !kVar10.r) && (kVar11 == null || !kVar11.r)) {
                                kVar4.r = true;
                            } else {
                                if (kVar10 == null || !kVar10.r) {
                                    if (kVar11 != null) {
                                        kVar11.r = false;
                                    }
                                    kVar4.r = true;
                                    kVar = h(kVar, kVar4);
                                    kVar3 = kVar2.n;
                                    if (kVar3 != null) {
                                        kVar5 = kVar3.o;
                                    }
                                    kVar4 = kVar5;
                                }
                                if (kVar4 != null) {
                                    if (kVar3 == null) {
                                        z = false;
                                    } else {
                                        z = kVar3.r;
                                    }
                                    kVar4.r = z;
                                    k<K, V> kVar12 = kVar4.o;
                                    if (kVar12 != null) {
                                        kVar12.r = false;
                                    }
                                }
                                if (kVar3 != null) {
                                    kVar3.r = false;
                                    kVar = i(kVar, kVar3);
                                }
                            }
                        }
                        kVar2 = kVar3;
                    }
                    kVar2 = kVar;
                    kVar = kVar2;
                }
            }
            return kVar;
        }

        static <K, V> k<K, V> c(k<K, V> kVar, k<K, V> kVar2) {
            k<K, V> kVar3;
            kVar2.r = true;
            while (true) {
                k<K, V> kVar4 = kVar2.n;
                if (kVar4 == null) {
                    kVar2.r = false;
                    return kVar2;
                } else if (!kVar4.r || (kVar3 = kVar4.n) == null) {
                    break;
                } else {
                    k<K, V> kVar5 = kVar3.o;
                    if (kVar4 == kVar5) {
                        k<K, V> kVar6 = kVar3.p;
                        if (kVar6 == null || !kVar6.r) {
                            if (kVar2 == kVar4.p) {
                                kVar = h(kVar, kVar4);
                                k<K, V> kVar7 = kVar4.n;
                                kVar3 = kVar7 == null ? null : kVar7.n;
                                kVar4 = kVar7;
                                kVar2 = kVar4;
                            }
                            if (kVar4 != null) {
                                kVar4.r = false;
                                if (kVar3 != null) {
                                    kVar3.r = true;
                                    kVar = i(kVar, kVar3);
                                }
                            }
                        } else {
                            kVar6.r = false;
                            kVar4.r = false;
                            kVar3.r = true;
                        }
                    } else if (kVar5 == null || !kVar5.r) {
                        if (kVar2 == kVar4.o) {
                            kVar = i(kVar, kVar4);
                            k<K, V> kVar8 = kVar4.n;
                            kVar3 = kVar8 == null ? null : kVar8.n;
                            kVar4 = kVar8;
                            kVar2 = kVar4;
                        }
                        if (kVar4 != null) {
                            kVar4.r = false;
                            if (kVar3 != null) {
                                kVar3.r = true;
                                kVar = h(kVar, kVar3);
                            }
                        }
                    } else {
                        kVar5.r = false;
                        kVar4.r = false;
                        kVar3.r = true;
                    }
                    kVar2 = kVar3;
                }
            }
            return kVar;
        }

        private final void d() {
            boolean z = false;
            while (true) {
                int i = this.q;
                if ((i & 1) == 0) {
                    if (r.compareAndSwapInt(this, s, i, 1)) {
                        break;
                    }
                } else if ((i & 2) == 0) {
                    if (r.compareAndSwapInt(this, s, i, i | 2)) {
                        this.p = Thread.currentThread();
                        z = true;
                    }
                } else if (z) {
                    LockSupport.park(this);
                }
            }
            if (z) {
                this.p = null;
            }
        }

        private final void e() {
            if (!r.compareAndSwapInt(this, s, 0, 1)) {
                d();
            }
        }

        static <K, V> k<K, V> h(k<K, V> kVar, k<K, V> kVar2) {
            k<K, V> kVar3;
            if (!(kVar2 == null || (kVar3 = kVar2.p) == null)) {
                k<K, V> kVar4 = kVar3.o;
                kVar2.p = kVar4;
                if (kVar4 != null) {
                    kVar4.n = kVar2;
                }
                k<K, V> kVar5 = kVar2.n;
                kVar3.n = kVar5;
                if (kVar5 == null) {
                    kVar3.r = false;
                    kVar = kVar3;
                } else if (kVar5.o == kVar2) {
                    kVar5.o = kVar3;
                } else {
                    kVar5.p = kVar3;
                }
                kVar3.o = kVar2;
                kVar2.n = kVar3;
            }
            return kVar;
        }

        static <K, V> k<K, V> i(k<K, V> kVar, k<K, V> kVar2) {
            k<K, V> kVar3;
            if (!(kVar2 == null || (kVar3 = kVar2.o) == null)) {
                k<K, V> kVar4 = kVar3.p;
                kVar2.o = kVar4;
                if (kVar4 != null) {
                    kVar4.n = kVar2;
                }
                k<K, V> kVar5 = kVar2.n;
                kVar3.n = kVar5;
                if (kVar5 == null) {
                    kVar3.r = false;
                    kVar = kVar3;
                } else if (kVar5.p == kVar2) {
                    kVar5.p = kVar3;
                } else {
                    kVar5.o = kVar3;
                }
                kVar3.p = kVar2;
                kVar2.n = kVar3;
            }
            return kVar;
        }

        /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
            java.lang.StackOverflowError
            	at jadx.core.dex.instructions.ArithNode.isSameLiteral(ArithNode.java:97)
            	at jadx.core.dex.instructions.ArithNode.isSame(ArithNode.java:93)
            	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
            	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
            	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
            	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
            */
        @Override // io.netty.util.internal.chmv8.ConcurrentHashMapV8.h
        final io.netty.util.internal.chmv8.ConcurrentHashMapV8.h<K, V> a(int r10, java.lang.Object r11) {
            /*
                r9 = this;
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k<K, V> r0 = r9.o
            L_0x0002:
                r1 = 0
                if (r0 == 0) goto L_0x006c
                int r6 = r9.q
                r2 = r6 & 3
                if (r2 == 0) goto L_0x001c
                int r1 = r0.a
                if (r1 != r10) goto L_0x0069
                K r1 = r0.b
                if (r1 == r11) goto L_0x001b
                if (r1 == 0) goto L_0x0069
                boolean r1 = r11.equals(r1)
                if (r1 == 0) goto L_0x0069
            L_0x001b:
                return r0
            L_0x001c:
                sun.misc.Unsafe r2 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.j.r
                long r4 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.j.s
                int r7 = r6 + 4
                r3 = r9
                boolean r2 = r2.compareAndSwapInt(r3, r4, r6, r7)
                if (r2 == 0) goto L_0x0069
                r2 = 6
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k<K, V> r0 = r9.n     // Catch:{ all -> 0x004d }
                if (r0 != 0) goto L_0x002f
                goto L_0x0033
            L_0x002f:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k r1 = r0.b(r10, r11, r1)     // Catch:{ all -> 0x004d }
            L_0x0033:
                sun.misc.Unsafe r3 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.j.r
                long r5 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.j.s
                int r10 = r9.q
                int r8 = r10 + -4
                r4 = r9
                r7 = r10
                boolean r11 = r3.compareAndSwapInt(r4, r5, r7, r8)
                if (r11 == 0) goto L_0x0033
                if (r10 != r2) goto L_0x004c
                java.lang.Thread r10 = r9.p
                if (r10 == 0) goto L_0x004c
                java.util.concurrent.locks.LockSupport.unpark(r10)
            L_0x004c:
                return r1
            L_0x004d:
                r10 = move-exception
                r1 = r10
            L_0x004f:
                sun.misc.Unsafe r3 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.j.r
                long r5 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.j.s
                int r10 = r9.q
                int r8 = r10 + -4
                r4 = r9
                r7 = r10
                boolean r11 = r3.compareAndSwapInt(r4, r5, r7, r8)
                if (r11 == 0) goto L_0x004f
                if (r10 != r2) goto L_0x0068
                java.lang.Thread r10 = r9.p
                if (r10 == 0) goto L_0x0068
                java.util.concurrent.locks.LockSupport.unpark(r10)
            L_0x0068:
                throw r1
            L_0x0069:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V> r0 = r0.f
                goto L_0x0002
            L_0x006c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.j.a(int, java.lang.Object):io.netty.util.internal.chmv8.ConcurrentHashMapV8$h");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
            return null;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x008e A[LOOP:0: B:1:0x0004->B:47:0x008e, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x005a A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final io.netty.util.internal.chmv8.ConcurrentHashMapV8.k<K, V> f(int r13, K r14, V r15) {
            /*
                r12 = this;
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k<K, V> r0 = r12.n
                r1 = 0
                r2 = r1
            L_0x0004:
                if (r0 != 0) goto L_0x0017
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k r0 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$k
                r7 = 0
                r8 = 0
                r3 = r0
                r4 = r13
                r5 = r14
                r6 = r15
                r3.<init>(r4, r5, r6, r7, r8)
                r12.n = r0
                r12.o = r0
                goto L_0x0089
            L_0x0017:
                int r3 = r0.a
                r4 = -1
                r8 = 1
                if (r3 <= r13) goto L_0x001f
            L_0x001d:
                r9 = -1
                goto L_0x0051
            L_0x001f:
                if (r3 >= r13) goto L_0x0023
            L_0x0021:
                r9 = 1
                goto L_0x0051
            L_0x0023:
                K r3 = r0.b
                if (r3 == r14) goto L_0x0091
                if (r3 == 0) goto L_0x0031
                boolean r5 = r14.equals(r3)
                if (r5 == 0) goto L_0x0031
                goto L_0x0091
            L_0x0031:
                if (r2 != 0) goto L_0x0039
                java.lang.Class r2 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.e(r14)
                if (r2 == 0) goto L_0x003f
            L_0x0039:
                int r3 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.f(r2, r14, r3)
                if (r3 != 0) goto L_0x0050
            L_0x003f:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k<K, V> r3 = r0.o
                if (r3 != 0) goto L_0x0044
                goto L_0x0021
            L_0x0044:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k<K, V> r3 = r0.p
                if (r3 == 0) goto L_0x001d
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k r3 = r3.b(r13, r14, r2)
                if (r3 != 0) goto L_0x004f
                goto L_0x001d
            L_0x004f:
                return r3
            L_0x0050:
                r9 = r3
            L_0x0051:
                if (r9 >= 0) goto L_0x0056
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k<K, V> r3 = r0.o
                goto L_0x0058
            L_0x0056:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k<K, V> r3 = r0.p
            L_0x0058:
                if (r3 != 0) goto L_0x008e
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k<K, V> r10 = r12.o
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k r11 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$k
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r10
                r7 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                r12.o = r11
                if (r10 == 0) goto L_0x006d
                r10.q = r11
            L_0x006d:
                if (r9 >= 0) goto L_0x0072
                r0.o = r11
                goto L_0x0074
            L_0x0072:
                r0.p = r11
            L_0x0074:
                boolean r13 = r0.r
                if (r13 != 0) goto L_0x007b
                r11.r = r8
                goto L_0x0089
            L_0x007b:
                r12.e()
                r13 = 0
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k<K, V> r14 = r12.n     // Catch:{ all -> 0x008a }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$k r14 = c(r14, r11)     // Catch:{ all -> 0x008a }
                r12.n = r14     // Catch:{ all -> 0x008a }
                r12.q = r13
            L_0x0089:
                return r1
            L_0x008a:
                r14 = move-exception
                r12.q = r13
                throw r14
            L_0x008e:
                r0 = r3
                goto L_0x0004
            L_0x0091:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.j.f(int, java.lang.Object, java.lang.Object):io.netty.util.internal.chmv8.ConcurrentHashMapV8$k");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x008e A[Catch:{ all -> 0x00c8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00a9 A[Catch:{ all -> 0x00c8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x00aa A[Catch:{ all -> 0x00c8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x00ba A[Catch:{ all -> 0x00c8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00bd A[Catch:{ all -> 0x00c8 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean g(io.netty.util.internal.chmv8.ConcurrentHashMapV8.k<K, V> r11) {
            /*
            // Method dump skipped, instructions count: 205
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.j.g(io.netty.util.internal.chmv8.ConcurrentHashMapV8$k):boolean");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<K, V> extends h<K, V> {
        k<K, V> n;
        k<K, V> o;
        k<K, V> p;
        k<K, V> q;
        boolean r;

        k(int i, K k, V v, h<K, V> hVar, k<K, V> kVar) {
            super(i, k, v, hVar);
            this.n = kVar;
        }

        /* access modifiers changed from: package-private */
        @Override // io.netty.util.internal.chmv8.ConcurrentHashMapV8.h
        public h<K, V> a(int i, Object obj) {
            return b(i, obj, null);
        }

        /* access modifiers changed from: package-private */
        public final k<K, V> b(int i, Object obj, Class<?> cls) {
            k<K, V> b;
            int f;
            if (obj == null) {
                return null;
            }
            k<K, V> kVar = this;
            do {
                k<K, V> kVar2 = kVar.o;
                k<K, V> kVar3 = kVar.p;
                int i2 = kVar.a;
                if (i2 <= i) {
                    if (i2 >= i) {
                        K k = kVar.b;
                        if (k == obj || (k != null && obj.equals(k))) {
                            return kVar;
                        }
                        if (kVar2 == null && kVar3 == null) {
                            return null;
                        }
                        if ((cls == null && (cls = ConcurrentHashMapV8.e(obj)) == null) || (f = ConcurrentHashMapV8.f(cls, obj, k)) == 0) {
                            if (kVar2 != null) {
                                if (!(kVar3 == null || (b = kVar3.b(i, obj, cls)) == null)) {
                                    return b;
                                }
                            }
                        } else if (f >= 0) {
                            kVar2 = kVar3;
                        }
                    }
                    kVar = kVar3;
                    continue;
                }
                kVar = kVar2;
                continue;
            } while (kVar != null);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<K, V> extends b<K, V> implements Iterator<V>, Enumeration<V> {
        l(h<K, V>[] hVarArr, int i, int i2, int i3, ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(hVarArr, i, i2, i3, concurrentHashMapV8);
        }

        @Override // java.util.Iterator
        public final V next() {
            h<K, V> hVar = this.b;
            if (hVar != null) {
                V v = hVar.c;
                this.q = hVar;
                a();
                return v;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Enumeration
        public final V nextElement() {
            return next();
        }
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", Segment[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe h2 = h();
            w = h2;
            x = h2.objectFieldOffset(ConcurrentHashMapV8.class.getDeclaredField("f"));
            y = h2.objectFieldOffset(ConcurrentHashMapV8.class.getDeclaredField("n"));
            z = h2.objectFieldOffset(ConcurrentHashMapV8.class.getDeclaredField("o"));
            A = h2.objectFieldOffset(ConcurrentHashMapV8.class.getDeclaredField("c"));
            B = h2.objectFieldOffset(ConcurrentHashMapV8.class.getDeclaredField("p"));
            C = h2.objectFieldOffset(c.class.getDeclaredField("a"));
            D = (long) h2.arrayBaseOffset(h[].class);
            int arrayIndexScale = h2.arrayIndexScale(h[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                E = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                return;
            }
            throw new Error("data type scale not a power of two");
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0.compareAndSwapLong(r19, r2, r4, r11) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(long r20, int r22) {
        /*
            r19 = this;
            r8 = r19
            r9 = r22
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$c[] r10 = r8.q
            if (r10 != 0) goto L_0x0019
            sun.misc.Unsafe r0 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.w
            long r2 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.A
            long r4 = r8.c
            long r11 = r4 + r20
            r1 = r19
            r6 = r11
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 != 0) goto L_0x0049
        L_0x0019:
            io.netty.util.internal.e r1 = io.netty.util.internal.e.e()
            io.netty.util.internal.d r4 = r1.c()
            r0 = 1
            if (r4 == 0) goto L_0x0094
            if (r10 == 0) goto L_0x0094
            int r2 = r10.length
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x0094
            int r3 = r4.a
            r2 = r2 & r3
            r12 = r10[r2]
            if (r12 == 0) goto L_0x0094
            sun.misc.Unsafe r11 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.w
            long r13 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.C
            long r2 = r12.a
            long r17 = r2 + r20
            r15 = r2
            boolean r2 = r11.compareAndSwapLong(r12, r13, r15, r17)
            if (r2 != 0) goto L_0x0042
            r5 = r2
            goto L_0x0095
        L_0x0042:
            if (r9 > r0) goto L_0x0045
            return
        L_0x0045:
            long r11 = r19.o()
        L_0x0049:
            if (r9 < 0) goto L_0x0093
        L_0x004b:
            int r4 = r8.f
            long r0 = (long) r4
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0093
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V>[] r6 = r8.a
            if (r6 == 0) goto L_0x0093
            int r0 = r6.length
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 >= r1) goto L_0x0093
            if (r4 >= 0) goto L_0x007d
            r0 = -1
            if (r4 == r0) goto L_0x0093
            int r0 = r8.n
            int r1 = r8.o
            if (r0 <= r1) goto L_0x0093
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V>[] r7 = r8.b
            if (r7 != 0) goto L_0x006b
            goto L_0x0093
        L_0x006b:
            sun.misc.Unsafe r0 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.w
            long r2 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.x
            int r5 = r4 + -1
            r1 = r19
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r0 == 0) goto L_0x008e
            r8.r(r6, r7)
            goto L_0x008e
        L_0x007d:
            sun.misc.Unsafe r0 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.w
            long r2 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.x
            r5 = -2
            r1 = r19
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r0 == 0) goto L_0x008e
            r0 = 0
            r8.r(r6, r0)
        L_0x008e:
            long r11 = r19.o()
            goto L_0x004b
        L_0x0093:
            return
        L_0x0094:
            r5 = 1
        L_0x0095:
            r0 = r19
            r2 = r20
            r0.g(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.b(long, int):void");
    }

    static final <K, V> boolean d(h<K, V>[] hVarArr, int i2, h<K, V> hVar, h<K, V> hVar2) {
        return w.compareAndSwapObject(hVarArr, (((long) i2) << E) + D, (Object) null, hVar2);
    }

    static Class<?> e(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    static int f(Class<?> cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ad, code lost:
        if (r25.q != r7) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00af, code lost:
        r1 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8.c[(r8 << 1)];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b4, code lost:
        if (r2 >= r8) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b6, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bd, code lost:
        r25.q = r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x011b A[EDGE_INSN: B:87:0x011b->B:82:0x011b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x002c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g(io.netty.util.internal.e r26, long r27, io.netty.util.internal.d r29, boolean r30) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.g(io.netty.util.internal.e, long, io.netty.util.internal.d, boolean):void");
    }

    /* access modifiers changed from: private */
    public static Unsafe h() {
        try {
            return Unsafe.getUnsafe();
        } catch (SecurityException unused) {
            try {
                return (Unsafe) AccessController.doPrivileged(new a());
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
    }

    private final h<K, V>[] j() {
        while (true) {
            h<K, V>[] hVarArr = this.a;
            if (hVarArr != null && hVarArr.length != 0) {
                return hVarArr;
            }
            int i2 = this.f;
            if (i2 < 0) {
                Thread.yield();
            } else if (w.compareAndSwapInt(this, x, i2, -1)) {
                try {
                    h<K, V>[] hVarArr2 = this.a;
                    if (hVarArr2 == null || hVarArr2.length == 0) {
                        int i3 = i2 > 0 ? i2 : 16;
                        h<K, V>[] hVarArr3 = new h[i3];
                        this.a = hVarArr3;
                        i2 = i3 - (i3 >>> 2);
                        hVarArr2 = hVarArr3;
                    }
                    return hVarArr2;
                } finally {
                    this.f = i2;
                }
            }
        }
    }

    static final <K, V> void m(h<K, V>[] hVarArr, int i2, h<K, V> hVar) {
        w.putObjectVolatile(hVarArr, (((long) i2) << E) + D, hVar);
    }

    static final int n(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    static final <K, V> h<K, V> p(h<K, V>[] hVarArr, int i2) {
        return (h) w.getObjectVolatile(hVarArr, (((long) i2) << E) + D);
    }

    private static final int q(int i2) {
        int i3 = i2 - 1;
        int i4 = i3 | (i3 >>> 1);
        int i5 = i4 | (i4 >>> 2);
        int i6 = i5 | (i5 >>> 4);
        int i7 = i6 | (i6 >>> 8);
        int i8 = i7 | (i7 >>> 16);
        if (i8 < 0) {
            return 1;
        }
        if (i8 >= 1073741824) {
            return 1073741824;
        }
        return 1 + i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V>] */
    /* JADX WARN: Type inference failed for: r13v12, types: [io.netty.util.internal.chmv8.ConcurrentHashMapV8$h] */
    /* JADX WARN: Type inference failed for: r13v13, types: [io.netty.util.internal.chmv8.ConcurrentHashMapV8$h] */
    /* JADX WARN: Type inference failed for: r6v18, types: [io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void r(io.netty.util.internal.chmv8.ConcurrentHashMapV8.h<K, V>[] r28, io.netty.util.internal.chmv8.ConcurrentHashMapV8.h<K, V>[] r29) {
        /*
        // Method dump skipped, instructions count: 565
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.r(io.netty.util.internal.chmv8.ConcurrentHashMapV8$h[], io.netty.util.internal.chmv8.ConcurrentHashMapV8$h[]):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j2;
        int i2;
        boolean z2;
        K k2;
        this.f = -1;
        objectInputStream.defaultReadObject();
        long j3 = 0;
        long j4 = 0;
        h<K, V> hVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j2 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j4++;
            hVar = new h<>(n(readObject.hashCode()), readObject, readObject2, hVar);
        }
        if (j4 == 0) {
            this.f = 0;
            return;
        }
        if (j4 >= 536870912) {
            i2 = 1073741824;
        } else {
            int i3 = (int) j4;
            i2 = q(i3 + (i3 >>> 1) + 1);
        }
        h<K, V>[] hVarArr = new h[i2];
        int i4 = i2 - 1;
        while (hVar != null) {
            h<K, V> hVar2 = hVar.f;
            int i5 = hVar.a;
            int i6 = i5 & i4;
            h<K, V> p2 = p(hVarArr, i6);
            if (p2 == null) {
                z2 = true;
            } else {
                K k3 = hVar.b;
                if (p2.a >= 0) {
                    h<K, V> hVar3 = p2;
                    int i7 = 0;
                    while (true) {
                        if (hVar3 == null) {
                            z2 = true;
                            break;
                        } else if (hVar3.a != i5 || ((k2 = hVar3.b) != k3 && (k2 == null || !k3.equals(k2)))) {
                            i7++;
                            hVar3 = hVar3.f;
                        }
                    }
                    z2 = false;
                    if (z2 && i7 >= 8) {
                        j3++;
                        hVar.f = p2;
                        h<K, V> hVar4 = hVar;
                        k<K, V> kVar = null;
                        k<K, V> kVar2 = null;
                        while (hVar4 != null) {
                            k<K, V> kVar3 = new k<>(hVar4.a, hVar4.b, hVar4.c, null, null);
                            kVar3.q = kVar2;
                            if (kVar2 == null) {
                                kVar = kVar3;
                            } else {
                                kVar2.f = kVar3;
                            }
                            hVar4 = hVar4.f;
                            kVar2 = kVar3;
                            j3 = j3;
                        }
                        m(hVarArr, i6, new j(kVar));
                    }
                } else if (((j) p2).f(i5, k3, hVar.c) == null) {
                    j3 += j2;
                }
                z2 = false;
            }
            if (z2) {
                j3++;
                hVar.f = p2;
                m(hVarArr, i6, hVar);
            }
            j2 = 1;
            hVar = hVar2;
        }
        this.a = hVarArr;
        this.f = i2 - (i2 >>> 2);
        this.c = j3;
    }

    private final void s(h<K, V>[] hVarArr, int i2) {
        int i3;
        if (hVarArr != null) {
            k<K, V> kVar = null;
            if (hVarArr.length >= 64) {
                h<K, V> p2 = p(hVarArr, i2);
                if (p2 != null && p2.a >= 0) {
                    synchronized (p2) {
                        if (p(hVarArr, i2) == p2) {
                            h<K, V> hVar = p2;
                            k<K, V> kVar2 = null;
                            while (hVar != null) {
                                k<K, V> kVar3 = new k<>(hVar.a, hVar.b, hVar.c, null, null);
                                kVar3.q = kVar2;
                                if (kVar2 == null) {
                                    kVar = kVar3;
                                } else {
                                    kVar2.f = kVar3;
                                }
                                hVar = hVar.f;
                                kVar2 = kVar3;
                            }
                            m(hVarArr, i2, new j(kVar));
                        }
                    }
                }
            } else if (hVarArr == this.a && (i3 = this.f) >= 0 && w.compareAndSwapInt(this, x, i3, -2)) {
                r(hVarArr, null);
            }
        }
    }

    private final void t(int i2) {
        int length;
        int q2 = i2 >= 536870912 ? 1073741824 : q(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.f;
            if (i3 >= 0) {
                h<K, V>[] hVarArr = this.a;
                if (hVarArr == null || (length = hVarArr.length) == 0) {
                    int i4 = i3 > q2 ? i3 : q2;
                    if (w.compareAndSwapInt(this, x, i3, -1)) {
                        try {
                            if (this.a == hVarArr) {
                                this.a = new h[i4];
                                i3 = i4 - (i4 >>> 2);
                            }
                        } finally {
                            this.f = i3;
                        }
                    }
                } else if (q2 > i3 && length < 1073741824) {
                    if (hVarArr == this.a && w.compareAndSwapInt(this, x, i3, -2)) {
                        r(hVarArr, null);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    static <K, V> h<K, V> u(h<K, V> hVar) {
        h<K, V> hVar2 = null;
        h<K, V> hVar3 = null;
        while (hVar != null) {
            h<K, V> hVar4 = new h<>(hVar.a, hVar.b, hVar.c, null);
            if (hVar3 == null) {
                hVar2 = hVar4;
            } else {
                hVar3.f = hVar4;
            }
            hVar = hVar.f;
            hVar3 = hVar4;
        }
        return hVar2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 < 16) {
            i4++;
            i3 <<= 1;
        }
        int i5 = 32 - i4;
        int i6 = i3 - 1;
        Segment[] segmentArr = new Segment[16];
        for (int i7 = 0; i7 < 16; i7++) {
            segmentArr[i7] = new Segment(0.75f);
        }
        objectOutputStream.putFields().put("segments", segmentArr);
        objectOutputStream.putFields().put("segmentShift", i5);
        objectOutputStream.putFields().put("segmentMask", i6);
        objectOutputStream.writeFields();
        h<K, V>[] hVarArr = this.a;
        if (hVarArr != null) {
            int length2 = hVarArr.length;
            int length3 = hVarArr.length;
            h<K, V>[] hVarArr2 = hVarArr;
            h<K, V> hVar = null;
            int i8 = 0;
            while (true) {
                if (hVar != null) {
                    hVar = hVar.f;
                }
                while (true) {
                    if (hVar != null) {
                        break;
                    } else if (i2 >= length3 || hVarArr2 == null || (length = hVarArr2.length) <= i8 || i8 < 0) {
                        break;
                    } else {
                        h<K, V> p2 = p(hVarArr2, i8);
                        if (p2 != null && p2.a < 0) {
                            if (p2 instanceof e) {
                                hVarArr2 = ((e) p2).n;
                                hVar = null;
                            } else {
                                p2 = p2 instanceof j ? ((j) p2).o : null;
                            }
                        }
                        i8 += length2;
                        if (i8 >= length) {
                            i2++;
                            i8 = i2;
                        }
                        hVar = p2;
                    }
                }
                hVar = null;
                if (hVar == null) {
                    break;
                }
                objectOutputStream.writeObject(hVar.b);
                objectOutputStream.writeObject(hVar.c);
                hVar = hVar;
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.Map
    public void clear() {
        h<K, V> hVar;
        h<K, V>[] hVarArr = this.a;
        long j2 = 0;
        loop0:
        while (true) {
            int i2 = 0;
            while (hVarArr != null && i2 < hVarArr.length) {
                h<K, V> p2 = p(hVarArr, i2);
                if (p2 == null) {
                    i2++;
                } else {
                    int i3 = p2.a;
                    if (i3 == -1) {
                        hVarArr = i(hVarArr, p2);
                    } else {
                        synchronized (p2) {
                            if (p(hVarArr, i2) == p2) {
                                if (i3 >= 0) {
                                    hVar = p2;
                                } else {
                                    hVar = p2 instanceof j ? ((j) p2).o : null;
                                }
                                while (hVar != null) {
                                    j2--;
                                    hVar = hVar.f;
                                }
                                m(hVarArr, i2, null);
                                i2++;
                            }
                        }
                    }
                }
            }
        }
        if (j2 != 0) {
            b(j2, -1);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        int length;
        obj.getClass();
        h<K, V>[] hVarArr = this.a;
        if (hVarArr != null) {
            int length2 = hVarArr.length;
            int length3 = hVarArr.length;
            h<K, V> hVar = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (hVar != null) {
                    hVar = hVar.f;
                }
                while (true) {
                    if (hVar != null) {
                        break;
                    } else if (i2 >= length3 || hVarArr == null || (length = hVarArr.length) <= i3 || i3 < 0) {
                        break;
                    } else {
                        h<K, V> p2 = p(hVarArr, i3);
                        if (p2 != null && p2.a < 0) {
                            if (p2 instanceof e) {
                                hVarArr = ((e) p2).n;
                                hVar = null;
                            } else {
                                p2 = p2 instanceof j ? ((j) p2).o : null;
                            }
                        }
                        i3 += length2;
                        if (i3 >= length) {
                            i2++;
                            i3 = i2;
                        }
                        hVar = p2;
                    }
                }
                hVar = null;
                if (hVar == null) {
                    break;
                }
                V v2 = hVar.c;
                if (v2 == obj) {
                    return true;
                }
                if (v2 != null && obj.equals(v2)) {
                    return true;
                }
                hVar = hVar;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        EntrySetView<K, V> entrySetView = this.t;
        if (entrySetView != null) {
            return entrySetView;
        }
        EntrySetView<K, V> entrySetView2 = new EntrySetView<>(this);
        this.t = entrySetView2;
        return entrySetView2;
    }

    @Override // java.util.Map, java.lang.Object
    public boolean equals(Object obj) {
        int length;
        V value;
        V v2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        h<K, V>[] hVarArr = this.a;
        int length2 = hVarArr == null ? 0 : hVarArr.length;
        h<K, V> hVar = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (hVar != null) {
                hVar = hVar.f;
            }
            while (true) {
                if (hVar != null) {
                    break;
                } else if (i2 >= length2 || hVarArr == null || (length = hVarArr.length) <= i3 || i3 < 0) {
                    break;
                } else {
                    h<K, V> p2 = p(hVarArr, i3);
                    if (p2 != null && p2.a < 0) {
                        if (p2 instanceof e) {
                            hVarArr = ((e) p2).n;
                            hVar = null;
                        } else {
                            p2 = p2 instanceof j ? ((j) p2).o : null;
                        }
                    }
                    i3 += length2;
                    if (i3 >= length) {
                        i2++;
                        i3 = i2;
                    }
                    hVar = p2;
                }
            }
            hVar = null;
            if (hVar != null) {
                V v3 = hVar.c;
                Object obj2 = map.get(hVar.b);
                if (obj2 == null || (obj2 != v3 && !obj2.equals(v3))) {
                    break;
                }
                hVar = hVar;
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v2 = get(key)) == null || (value != v2 && !value.equals(v2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return r1.c;
     */
    @Override // java.util.Map
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = n(r0)
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V>[] r1 = r4.a
            r2 = 0
            if (r1 == 0) goto L_0x004e
            int r3 = r1.length
            if (r3 <= 0) goto L_0x004e
            int r3 = r3 + -1
            r3 = r3 & r0
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h r1 = p(r1, r3)
            if (r1 == 0) goto L_0x004e
            int r3 = r1.a
            if (r3 != r0) goto L_0x002c
            K r3 = r1.b
            if (r3 == r5) goto L_0x0029
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x0029:
            V r5 = r1.c
            return r5
        L_0x002c:
            if (r3 >= 0) goto L_0x0037
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h r5 = r1.a(r0, r5)
            if (r5 == 0) goto L_0x0036
            V r2 = r5.c
        L_0x0036:
            return r2
        L_0x0037:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V> r1 = r1.f
            if (r1 == 0) goto L_0x004e
            int r3 = r1.a
            if (r3 != r0) goto L_0x0037
            K r3 = r1.b
            if (r3 == r5) goto L_0x004b
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x004b:
            V r5 = r1.c
            return r5
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public V getOrDefault(Object obj, V v2) {
        V v3 = get(obj);
        return v3 == null ? v2 : v3;
    }

    @Override // java.util.Map, java.lang.Object
    public int hashCode() {
        int length;
        h<K, V>[] hVarArr = this.a;
        int i2 = 0;
        if (hVarArr != null) {
            int length2 = hVarArr.length;
            int length3 = hVarArr.length;
            h<K, V> hVar = null;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (hVar != null) {
                    hVar = hVar.f;
                }
                while (true) {
                    if (hVar != null) {
                        break;
                    } else if (i3 >= length3 || hVarArr == null || (length = hVarArr.length) <= i4 || i4 < 0) {
                        break;
                    } else {
                        h<K, V> p2 = p(hVarArr, i4);
                        if (p2 != null && p2.a < 0) {
                            if (p2 instanceof e) {
                                hVarArr = ((e) p2).n;
                                hVar = null;
                            } else {
                                p2 = p2 instanceof j ? ((j) p2).o : null;
                            }
                        }
                        i4 += length2;
                        if (i4 >= length) {
                            i3++;
                            i4 = i3;
                        }
                        hVar = p2;
                    }
                }
                hVar = null;
                if (hVar == null) {
                    break;
                }
                i2 += hVar.c.hashCode() ^ hVar.b.hashCode();
                hVar = hVar;
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final h<K, V>[] i(h<K, V>[] hVarArr, h<K, V> hVar) {
        h<K, V>[] hVarArr2;
        int i2;
        if (!(hVar instanceof e) || (hVarArr2 = ((e) hVar).n) == null) {
            return this.a;
        }
        if (hVarArr2 == this.b && hVarArr == this.a && this.n > this.o && (i2 = this.f) < -1 && w.compareAndSwapInt(this, x, i2, i2 - 1)) {
            r(hVarArr, hVarArr2);
        }
        return hVarArr2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return o() <= 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r7 = r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r11 != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        r6.c = r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V k(K r9, V r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x009b
            if (r10 == 0) goto L_0x009b
            int r1 = r9.hashCode()
            int r1 = n(r1)
            r2 = 0
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V>[] r3 = r8.a
        L_0x0010:
            if (r3 == 0) goto L_0x0095
            int r4 = r3.length
            if (r4 != 0) goto L_0x0017
            goto L_0x0095
        L_0x0017:
            int r4 = r4 + -1
            r4 = r4 & r1
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h r5 = p(r3, r4)
            if (r5 != 0) goto L_0x002d
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h r5 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$h
            r5.<init>(r1, r9, r10, r0)
            boolean r4 = d(r3, r4, r0, r5)
            if (r4 == 0) goto L_0x0010
            goto L_0x008c
        L_0x002d:
            int r6 = r5.a
            r7 = -1
            if (r6 != r7) goto L_0x0037
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h[] r3 = r8.i(r3, r5)
            goto L_0x0010
        L_0x0037:
            monitor-enter(r5)
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h r7 = p(r3, r4)     // Catch:{ all -> 0x0092 }
            if (r7 != r5) goto L_0x007e
            if (r6 < 0) goto L_0x0069
            r2 = 1
            r6 = r5
        L_0x0042:
            int r7 = r6.a     // Catch:{ all -> 0x0092 }
            if (r7 != r1) goto L_0x0059
            K r7 = r6.b     // Catch:{ all -> 0x0092 }
            if (r7 == r9) goto L_0x0052
            if (r7 == 0) goto L_0x0059
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0092 }
            if (r7 == 0) goto L_0x0059
        L_0x0052:
            V r7 = r6.c     // Catch:{ all -> 0x0092 }
            if (r11 != 0) goto L_0x007f
            r6.c = r10     // Catch:{ all -> 0x0092 }
            goto L_0x007f
        L_0x0059:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h<K, V> r7 = r6.f     // Catch:{ all -> 0x0092 }
            if (r7 != 0) goto L_0x0065
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h r7 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$h     // Catch:{ all -> 0x0092 }
            r7.<init>(r1, r9, r10, r0)     // Catch:{ all -> 0x0092 }
            r6.f = r7     // Catch:{ all -> 0x0092 }
            goto L_0x007e
        L_0x0065:
            int r2 = r2 + 1
            r6 = r7
            goto L_0x0042
        L_0x0069:
            boolean r6 = r5 instanceof io.netty.util.internal.chmv8.ConcurrentHashMapV8.j     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x007e
            r2 = 2
            r6 = r5
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r6 = (io.netty.util.internal.chmv8.ConcurrentHashMapV8.j) r6     // Catch:{ all -> 0x0092 }
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$k r6 = r6.f(r1, r9, r10)     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x007e
            V r7 = r6.c     // Catch:{ all -> 0x0092 }
            if (r11 != 0) goto L_0x007f
            r6.c = r10     // Catch:{ all -> 0x0092 }
            goto L_0x007f
        L_0x007e:
            r7 = r0
        L_0x007f:
            monitor-exit(r5)     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x0010
            r9 = 8
            if (r2 < r9) goto L_0x0089
            r8.s(r3, r4)
        L_0x0089:
            if (r7 == 0) goto L_0x008c
            return r7
        L_0x008c:
            r9 = 1
            r8.b(r9, r2)
            return r0
        L_0x0092:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L_0x0095:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$h[] r3 = r8.j()
            goto L_0x0010
        L_0x009b:
            goto L_0x009d
        L_0x009c:
            throw r0
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.k(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.Map
    public Set keySet() {
        KeySetView<K, V> keySetView = this.r;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView<K, V> keySetView2 = new KeySetView<>(this, null);
        this.r = keySetView2;
        return keySetView2;
    }

    /* access modifiers changed from: package-private */
    public final V l(Object obj, V v2, Object obj2) {
        int length;
        int i2;
        h<K, V> p2;
        V v3;
        k<K, V> b2;
        K k2;
        int n2 = n(obj.hashCode());
        h<K, V>[] hVarArr = this.a;
        while (true) {
            if (hVarArr == null || (length = hVarArr.length) == 0 || (p2 = p(hVarArr, (i2 = (length - 1) & n2))) == null) {
                break;
            }
            int i3 = p2.a;
            if (i3 == -1) {
                hVarArr = i(hVarArr, p2);
            } else {
                boolean z2 = false;
                synchronized (p2) {
                    if (p(hVarArr, i2) == p2) {
                        if (i3 >= 0) {
                            h<K, V> hVar = null;
                            h<K, V> hVar2 = p2;
                            while (true) {
                                if (hVar2.a != n2 || ((k2 = hVar2.b) != obj && (k2 == null || !obj.equals(k2)))) {
                                    h<K, V> hVar3 = hVar2.f;
                                    if (hVar3 == null) {
                                        break;
                                    }
                                    hVar = hVar2;
                                    hVar2 = hVar3;
                                }
                            }
                            v3 = hVar2.c;
                            if (obj2 == null || obj2 == v3 || (v3 != null && obj2.equals(v3))) {
                                if (v2 != null) {
                                    hVar2.c = v2;
                                } else if (hVar != null) {
                                    hVar.f = hVar2.f;
                                } else {
                                    m(hVarArr, i2, hVar2.f);
                                }
                                z2 = true;
                            }
                        } else if (p2 instanceof j) {
                            j jVar = (j) p2;
                            k<K, V> kVar = jVar.n;
                            if (kVar != null && (b2 = kVar.b(n2, obj, null)) != null) {
                                v3 = b2.c;
                                if (obj2 == null || obj2 == v3 || (v3 != null && obj2.equals(v3))) {
                                    if (v2 != null) {
                                        b2.c = v2;
                                    } else if (jVar.g(b2)) {
                                        m(hVarArr, i2, u(jVar.o));
                                    }
                                    z2 = true;
                                }
                            }
                        }
                        v3 = null;
                        z2 = true;
                    }
                    v3 = null;
                }
                if (z2) {
                    if (v3 != null) {
                        if (v2 == null) {
                            b(-1, -1);
                        }
                        return v3;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final long o() {
        c[] cVarArr = this.q;
        long j2 = this.c;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j2 += cVar.a;
                }
            }
        }
        return j2;
    }

    @Override // java.util.Map
    public V put(K k2, V v2) {
        return k(k2, v2, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: io.netty.util.internal.chmv8.ConcurrentHashMapV8<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        t(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            k(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public V putIfAbsent(K k2, V v2) {
        return k(k2, v2, true);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return l(obj, null, null);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean replace(K k2, V v2, V v3) {
        if (k2 == null) {
            throw null;
        } else if (v2 == null) {
            throw null;
        } else if (v3 != null) {
            return l(k2, v3, v2) != null;
        } else {
            throw null;
        }
    }

    @Override // java.util.Map
    public int size() {
        long o2 = o();
        if (o2 < 0) {
            return 0;
        }
        if (o2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) o2;
    }

    @Override // java.lang.Object
    public String toString() {
        h<K, V>[] hVarArr = this.a;
        int length = hVarArr == null ? 0 : hVarArr.length;
        i iVar = new i(hVarArr, length, 0, length);
        StringBuilder S0 = je.S0('{');
        h<K, V> a2 = iVar.a();
        if (a2 != null) {
            while (true) {
                K k2 = a2.b;
                V v2 = a2.c;
                if (k2 == this) {
                    k2 = "(this Map)";
                }
                S0.append((Object) k2);
                S0.append('=');
                if (v2 == this) {
                    v2 = "(this Map)";
                }
                S0.append((Object) v2);
                a2 = iVar.a();
                if (a2 == null) {
                    break;
                }
                S0.append(',');
                S0.append(' ');
            }
        }
        S0.append('}');
        return S0.toString();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        ValuesView<K, V> valuesView = this.s;
        if (valuesView != null) {
            return valuesView;
        }
        ValuesView<K, V> valuesView2 = new ValuesView<>(this);
        this.s = valuesView2;
        return valuesView2;
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || l(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public V replace(K k2, V v2) {
        if (k2 != null && v2 != null) {
            return l(k2, v2, null);
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public static abstract class CollectionView<K, V, E> implements Collection<E>, Serializable {
        private static final long serialVersionUID = 7249069246763182397L;
        final ConcurrentHashMapV8<K, V> map;

        CollectionView(ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            this.map = concurrentHashMapV8;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.map.clear();
        }

        @Override // java.util.Collection
        public abstract boolean contains(Object obj);

        /* JADX WARNING: Removed duplicated region for block: B:4:0x000c  */
        @Override // java.util.Collection
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean containsAll(java.util.Collection<?> r2) {
            /*
                r1 = this;
                if (r2 == r1) goto L_0x001a
                java.util.Iterator r2 = r2.iterator()
            L_0x0006:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x001a
                java.lang.Object r0 = r2.next()
                if (r0 == 0) goto L_0x0018
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0006
            L_0x0018:
                r2 = 0
                return r2
            L_0x001a:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.CollectionView.containsAll(java.util.Collection):boolean");
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.map.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public abstract Iterator<E> iterator();

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Iterator<E> it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Iterator<E> it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return this.map.size();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            long o = this.map.o();
            if (o < 0) {
                o = 0;
            }
            if (o <= 2147483639) {
                int i = (int) o;
                Object[] objArr = new Object[i];
                int i2 = 0;
                Iterator<E> it = iterator();
                while (it.hasNext()) {
                    E next = it.next();
                    if (i2 == i) {
                        int i3 = 2147483639;
                        if (i < 2147483639) {
                            if (i < 1073741819) {
                                i3 = (i >>> 1) + 1 + i;
                            }
                            objArr = Arrays.copyOf(objArr, i3);
                            i = i3;
                        } else {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                    }
                    objArr[i2] = next;
                    i2++;
                }
                return i2 == i ? objArr : Arrays.copyOf(objArr, i2);
            }
            throw new OutOfMemoryError("Required array size too large");
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder S0 = je.S0('[');
            Iterator<E> it = iterator();
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    if (next == this) {
                        next = "(this Collection)";
                    }
                    S0.append(next);
                    if (!it.hasNext()) {
                        break;
                    }
                    S0.append(',');
                    S0.append(' ');
                }
            }
            S0.append(']');
            return S0.toString();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: T[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            long o = this.map.o();
            if (o < 0) {
                o = 0;
            }
            if (o <= 2147483639) {
                int i = (int) o;
                T[] tArr2 = tArr.length >= i ? tArr : (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
                int length = tArr2.length;
                int i2 = 0;
                Iterator<E> it = iterator();
                while (it.hasNext()) {
                    E next = it.next();
                    if (i2 == length) {
                        int i3 = 2147483639;
                        if (length < 2147483639) {
                            if (length < 1073741819) {
                                i3 = (length >>> 1) + 1 + length;
                            }
                            tArr2 = (T[]) Arrays.copyOf(tArr2, i3);
                            length = i3;
                        } else {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                    }
                    tArr2[i2] = next;
                    i2++;
                }
                if (tArr != tArr2 || i2 >= length) {
                    return i2 == length ? tArr2 : (T[]) Arrays.copyOf(tArr2, i2);
                }
                tArr2[i2] = null;
                return tArr2;
            }
            throw new OutOfMemoryError("Required array size too large");
        }
    }
}
