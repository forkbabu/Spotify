package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.f;
import com.google.gson.internal.p;
import com.google.gson.internal.q;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import com.google.gson.t;
import com.google.gson.w;
import com.google.gson.x;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: k20  reason: default package */
public final class k20 implements x {
    private final f a;
    final boolean b;

    /* renamed from: k20$a */
    private final class a<K, V> extends w<Map<K, V>> {
        private final w<K> a;
        private final w<V> b;
        private final q<? extends Map<K, V>> c;

        public a(j jVar, Type type, w<K> wVar, Type type2, w<V> wVar2, q<? extends Map<K, V>> qVar) {
            this.a = new r20(jVar, wVar, type);
            this.b = new r20(jVar, wVar2, type2);
            this.c = qVar;
        }

        @Override // com.google.gson.w
        public Object read(com.google.gson.stream.a aVar) {
            JsonToken J = aVar.J();
            if (J == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            Map map = (Map) this.c.a();
            if (J == JsonToken.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.l()) {
                    aVar.a();
                    K read = this.a.read(aVar);
                    if (map.put(read, this.b.read(aVar)) == null) {
                        aVar.g();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + ((Object) read));
                    }
                }
                aVar.g();
            } else {
                aVar.b();
                while (aVar.l()) {
                    p.a.a(aVar);
                    K read2 = this.a.read(aVar);
                    if (map.put(read2, this.b.read(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + ((Object) read2));
                    }
                }
                aVar.h();
            }
            return map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: com.google.gson.w<V> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: com.google.gson.w<V> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.w
        public void write(b bVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                bVar.r();
            } else if (!k20.this.b) {
                bVar.d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    bVar.p(String.valueOf(entry.getKey()));
                    this.b.write(bVar, entry.getValue());
                }
                bVar.h();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    com.google.gson.p jsonTree = this.a.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    jsonTree.getClass();
                    z |= (jsonTree instanceof m) || (jsonTree instanceof r);
                }
                if (z) {
                    bVar.b();
                    int size = arrayList.size();
                    while (i < size) {
                        bVar.b();
                        s20.X.write(bVar, (com.google.gson.p) arrayList.get(i));
                        this.b.write(bVar, arrayList2.get(i));
                        bVar.g();
                        i++;
                    }
                    bVar.g();
                    return;
                }
                bVar.d();
                int size2 = arrayList.size();
                while (i < size2) {
                    com.google.gson.p pVar = (com.google.gson.p) arrayList.get(i);
                    pVar.getClass();
                    if (pVar instanceof t) {
                        t d2 = pVar.d();
                        if (d2.o()) {
                            str = String.valueOf(d2.k());
                        } else if (d2.l()) {
                            str = Boolean.toString(d2.f());
                        } else if (d2.t()) {
                            str = d2.e();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (pVar instanceof com.google.gson.q) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    bVar.p(str);
                    this.b.write(bVar, arrayList2.get(i));
                    i++;
                }
                bVar.h();
            }
        }
    }

    public k20(f fVar, boolean z) {
        this.a = fVar;
        this.b = z;
    }

    @Override // com.google.gson.x
    public <T> w<T> b(j jVar, z20<T> z20) {
        w<Boolean> wVar;
        Type d = z20.d();
        if (!Map.class.isAssignableFrom(z20.c())) {
            return null;
        }
        Type[] f = C$Gson$Types.f(d, C$Gson$Types.g(d));
        Type type = f[0];
        if (type == Boolean.TYPE || type == Boolean.class) {
            wVar = s20.f;
        } else {
            wVar = jVar.c(z20.b(type));
        }
        return new a(jVar, f[0], wVar, f[1], jVar.c(z20.b(f[1])), this.a.a(z20));
    }
}
