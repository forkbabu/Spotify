package defpackage;

import com.google.gson.j;
import com.google.gson.w;
import com.google.gson.x;

/* renamed from: t20  reason: default package */
class t20 implements x {
    final /* synthetic */ Class a;
    final /* synthetic */ Class b;
    final /* synthetic */ w c;

    t20(Class cls, Class cls2, w wVar) {
        this.a = cls;
        this.b = cls2;
        this.c = wVar;
    }

    @Override // com.google.gson.x
    public <T> w<T> b(j jVar, z20<T> z20) {
        Class<? super T> c2 = z20.c();
        if (c2 == this.a || c2 == this.b) {
            return this.c;
        }
        return null;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Factory[type=");
        V0.append(this.a.getName());
        V0.append("+");
        V0.append(this.b.getName());
        V0.append(",adapter=");
        V0.append(this.c);
        V0.append("]");
        return V0.toString();
    }
}
