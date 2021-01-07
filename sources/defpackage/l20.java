package defpackage;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.j;
import com.google.gson.stream.b;
import com.google.gson.w;
import com.google.gson.x;
import java.util.ArrayList;

/* renamed from: l20  reason: default package */
public final class l20 extends w<Object> {
    public static final x b = new a();
    private final j a;

    /* renamed from: l20$a */
    class a implements x {
        a() {
        }

        @Override // com.google.gson.x
        public <T> w<T> b(j jVar, z20<T> z20) {
            if (z20.c() == Object.class) {
                return new l20(jVar);
            }
            return null;
        }
    }

    l20(j jVar) {
        this.a = jVar;
    }

    @Override // com.google.gson.w
    public Object read(com.google.gson.stream.a aVar) {
        int ordinal = aVar.J().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.l()) {
                arrayList.add(read(aVar));
            }
            aVar.g();
            return arrayList;
        } else if (ordinal == 2) {
            LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
            aVar.b();
            while (aVar.l()) {
                linkedTreeMap.put(aVar.B(), read(aVar));
            }
            aVar.h();
            return linkedTreeMap;
        } else if (ordinal == 5) {
            return aVar.G();
        } else {
            if (ordinal == 6) {
                return Double.valueOf(aVar.s());
            }
            if (ordinal == 7) {
                return Boolean.valueOf(aVar.r());
            }
            if (ordinal == 8) {
                aVar.D();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.w
    public void write(b bVar, Object obj) {
        if (obj == null) {
            bVar.r();
            return;
        }
        j jVar = this.a;
        Class<?> cls = obj.getClass();
        jVar.getClass();
        w c = jVar.c(z20.a(cls));
        if (c instanceof l20) {
            bVar.d();
            bVar.h();
            return;
        }
        c.write(bVar, obj);
    }
}
