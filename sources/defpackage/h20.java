package defpackage;

import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.o;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;

/* renamed from: h20  reason: default package */
public final class h20 implements x {
    private final f a;

    public h20(f fVar) {
        this.a = fVar;
    }

    /* access modifiers changed from: package-private */
    public w<?> a(f fVar, j jVar, z20<?> z20, c20 c20) {
        w<?> wVar;
        Object a2 = fVar.a(z20.a(c20.value())).a();
        if (a2 instanceof w) {
            wVar = (w) a2;
        } else if (a2 instanceof x) {
            wVar = ((x) a2).b(jVar, z20);
        } else {
            boolean z = a2 instanceof v;
            if (z || (a2 instanceof o)) {
                o oVar = null;
                v vVar = z ? (v) a2 : null;
                if (a2 instanceof o) {
                    oVar = (o) a2;
                }
                wVar = new q20<>(vVar, oVar, jVar, z20, null);
            } else {
                StringBuilder V0 = je.V0("Invalid attempt to bind an instance of ");
                V0.append(a2.getClass().getName());
                V0.append(" as a @JsonAdapter for ");
                V0.append(z20.toString());
                V0.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(V0.toString());
            }
        }
        return (wVar == null || !c20.nullSafe()) ? wVar : wVar.nullSafe();
    }

    @Override // com.google.gson.x
    public <T> w<T> b(j jVar, z20<T> z20) {
        c20 c20 = (c20) z20.c().getAnnotation(c20.class);
        if (c20 == null) {
            return null;
        }
        return (w<T>) a(this.a, jVar, z20, c20);
    }
}
