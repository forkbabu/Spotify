package com.google.gson;

import com.google.gson.internal.f;
import com.google.gson.internal.n;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import com.google.gson.stream.b;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class j {
    private static final z20<?> n = z20.a(Object.class);
    private final ThreadLocal<Map<z20<?>, a<?>>> a;
    private final Map<z20<?>, w<?>> b;
    private final f c;
    private final h20 d;
    final List<x> e;
    final Map<Type, l<?>> f;
    final boolean g;
    final boolean h;
    final boolean i;
    final boolean j;
    final boolean k;
    final List<x> l;
    final List<x> m;

    /* access modifiers changed from: package-private */
    public static class a<T> extends w<T> {
        private w<T> a;

        a() {
        }

        public void a(w<T> wVar) {
            if (this.a == null) {
                this.a = wVar;
                return;
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.w
        public T read(com.google.gson.stream.a aVar) {
            w<T> wVar = this.a;
            if (wVar != null) {
                return wVar.read(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.w
        public void write(b bVar, T t) {
            w<T> wVar = this.a;
            if (wVar != null) {
                wVar.write(bVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public j() {
        this(n.c, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public <T> T b(String str, Type type) {
        T t = null;
        if (str == null) {
            return null;
        }
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(new StringReader(str));
        aVar.Q(this.k);
        boolean m2 = aVar.m();
        boolean z = true;
        aVar.Q(true);
        try {
            aVar.J();
            z = false;
            t = c(z20.b(type)).read(aVar);
        } catch (EOFException e2) {
            if (!z) {
                throw new JsonSyntaxException(e2);
            }
        } catch (IllegalStateException e3) {
            throw new JsonSyntaxException(e3);
        } catch (IOException e4) {
            throw new JsonSyntaxException(e4);
        } catch (AssertionError e5) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e5.getMessage());
            assertionError.initCause(e5);
            throw assertionError;
        } catch (Throwable th) {
            aVar.Q(m2);
            throw th;
        }
        aVar.Q(m2);
        if (t != null) {
            try {
                if (aVar.J() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e6) {
                throw new JsonSyntaxException(e6);
            } catch (IOException e7) {
                throw new JsonIOException(e7);
            }
        }
        return t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.util.Map<z20<?>, com.google.gson.w<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: com.google.gson.w<T>, com.google.gson.w<?> */
    public <T> w<T> c(z20<T> z20) {
        w<T> wVar = (w<T>) this.b.get(z20);
        if (wVar != null) {
            return wVar;
        }
        Map<z20<?>, a<?>> map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.a.set(map);
            z = true;
        }
        a<?> aVar = map.get(z20);
        if (aVar != null) {
            return aVar;
        }
        try {
            a<?> aVar2 = new a<>();
            map.put(z20, aVar2);
            for (x xVar : this.e) {
                w wVar2 = (w<T>) xVar.b(this, z20);
                if (wVar2 != null) {
                    aVar2.a(wVar2);
                    this.b.put(z20, wVar2);
                    return wVar2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + z20);
        } finally {
            map.remove(z20);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> w<T> d(x xVar, z20<T> z20) {
        if (!this.e.contains(xVar)) {
            xVar = this.d;
        }
        boolean z = false;
        for (x xVar2 : this.e) {
            if (z) {
                w<T> b2 = xVar2.b(this, z20);
                if (b2 != null) {
                    return b2;
                }
            } else if (xVar2 == xVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + z20);
    }

    public b e(Writer writer) {
        if (this.h) {
            writer.write(")]}'\n");
        }
        b bVar = new b(writer);
        if (this.j) {
            bVar.C("  ");
        }
        bVar.F(this.g);
        return bVar;
    }

    public void f(Object obj, Type type, b bVar) {
        w c2 = c(z20.b(type));
        boolean m2 = bVar.m();
        bVar.D(true);
        boolean l2 = bVar.l();
        bVar.B(this.i);
        boolean i2 = bVar.i();
        bVar.F(this.g);
        try {
            c2.write(bVar, obj);
            bVar.D(m2);
            bVar.B(l2);
            bVar.F(i2);
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            bVar.D(m2);
            bVar.B(l2);
            bVar.F(i2);
            throw th;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.g + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    j(n nVar, d dVar, Map<Type, l<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i2, int i3, List<x> list, List<x> list2, List<x> list3) {
        w wVar;
        w wVar2;
        w wVar3;
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f = map;
        f fVar = new f(map);
        this.c = fVar;
        this.g = z;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = list;
        this.m = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(s20.Y);
        arrayList.add(l20.b);
        arrayList.add(nVar);
        arrayList.addAll(list3);
        arrayList.add(s20.D);
        arrayList.add(s20.m);
        arrayList.add(s20.g);
        arrayList.add(s20.i);
        arrayList.add(s20.k);
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            wVar = s20.t;
        } else {
            wVar = new g();
        }
        arrayList.add(s20.b(Long.TYPE, Long.class, wVar));
        Class cls = Double.TYPE;
        if (z7) {
            wVar2 = s20.v;
        } else {
            wVar2 = new e(this);
        }
        arrayList.add(s20.b(cls, Double.class, wVar2));
        Class cls2 = Float.TYPE;
        if (z7) {
            wVar3 = s20.u;
        } else {
            wVar3 = new f(this);
        }
        arrayList.add(s20.b(cls2, Float.class, wVar3));
        arrayList.add(s20.x);
        arrayList.add(s20.o);
        arrayList.add(s20.q);
        arrayList.add(s20.a(AtomicLong.class, new h(wVar).nullSafe()));
        arrayList.add(s20.a(AtomicLongArray.class, new i(wVar).nullSafe()));
        arrayList.add(s20.s);
        arrayList.add(s20.z);
        arrayList.add(s20.F);
        arrayList.add(s20.H);
        arrayList.add(s20.a(BigDecimal.class, s20.B));
        arrayList.add(s20.a(BigInteger.class, s20.C));
        arrayList.add(s20.J);
        arrayList.add(s20.L);
        arrayList.add(s20.P);
        arrayList.add(s20.R);
        arrayList.add(s20.W);
        arrayList.add(s20.N);
        arrayList.add(s20.d);
        arrayList.add(g20.b);
        arrayList.add(s20.U);
        arrayList.add(p20.b);
        arrayList.add(o20.b);
        arrayList.add(s20.S);
        arrayList.add(e20.c);
        arrayList.add(s20.b);
        arrayList.add(new f20(fVar));
        arrayList.add(new k20(fVar, z2));
        h20 h20 = new h20(fVar);
        this.d = h20;
        arrayList.add(h20);
        arrayList.add(s20.Z);
        arrayList.add(new n20(fVar, dVar, nVar, h20));
        this.e = Collections.unmodifiableList(arrayList);
    }
}
