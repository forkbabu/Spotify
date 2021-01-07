package defpackage;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.j;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import com.google.gson.w;
import com.google.gson.x;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: e20  reason: default package */
public final class e20<E> extends w<Object> {
    public static final x c = new a();
    private final Class<E> a;
    private final w<E> b;

    /* renamed from: e20$a */
    class a implements x {
        a() {
        }

        @Override // com.google.gson.x
        public <T> w<T> b(j jVar, z20<T> z20) {
            Type type;
            Type d = z20.d();
            boolean z = d instanceof GenericArrayType;
            if (!z && (!(d instanceof Class) || !((Class) d).isArray())) {
                return null;
            }
            if (z) {
                type = ((GenericArrayType) d).getGenericComponentType();
            } else {
                type = ((Class) d).getComponentType();
            }
            return new e20(jVar, jVar.c(z20.b(type)), C$Gson$Types.g(type));
        }
    }

    public e20(j jVar, w<E> wVar, Class<E> cls) {
        this.b = new r20(jVar, wVar, cls);
        this.a = cls;
    }

    @Override // com.google.gson.w
    public Object read(com.google.gson.stream.a aVar) {
        if (aVar.J() == JsonToken.NULL) {
            aVar.D();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.l()) {
            arrayList.add(this.b.read(aVar));
        }
        aVar.g();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.gson.w<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.w
    public void write(b bVar, Object obj) {
        if (obj == null) {
            bVar.r();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.write(bVar, Array.get(obj, i));
        }
        bVar.g();
    }
}
