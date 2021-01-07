package defpackage;

import com.google.gson.j;
import com.google.gson.stream.a;
import com.google.gson.stream.b;
import com.google.gson.w;
import defpackage.n20;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* access modifiers changed from: package-private */
/* renamed from: r20  reason: default package */
public final class r20<T> extends w<T> {
    private final j a;
    private final w<T> b;
    private final Type c;

    r20(j jVar, w<T> wVar, Type type) {
        this.a = jVar;
        this.b = wVar;
        this.c = type;
    }

    @Override // com.google.gson.w
    public T read(a aVar) {
        return this.b.read(aVar);
    }

    @Override // com.google.gson.w
    public void write(b bVar, T t) {
        w<T> wVar = this.b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            wVar = this.a.c(z20.b(type));
            if (wVar instanceof n20.a) {
                w<T> wVar2 = this.b;
                if (!(wVar2 instanceof n20.a)) {
                    wVar = wVar2;
                }
            }
        }
        wVar.write(bVar, t);
    }
}
