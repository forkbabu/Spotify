package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.stream.b;
import com.google.gson.w;
import com.google.gson.x;

/* renamed from: u20  reason: default package */
class u20 implements x {
    final /* synthetic */ Class a;
    final /* synthetic */ w b;

    /* renamed from: u20$a */
    class a extends w<T1> {
        final /* synthetic */ Class a;

        a(Class cls) {
            this.a = cls;
        }

        @Override // com.google.gson.w
        public T1 read(com.google.gson.stream.a aVar) {
            T1 t1 = (T1) u20.this.b.read(aVar);
            if (t1 == null || this.a.isInstance(t1)) {
                return t1;
            }
            StringBuilder V0 = je.V0("Expected a ");
            V0.append(this.a.getName());
            V0.append(" but was ");
            V0.append(t1.getClass().getName());
            throw new JsonSyntaxException(V0.toString());
        }

        @Override // com.google.gson.w
        public void write(b bVar, T1 t1) {
            u20.this.b.write(bVar, t1);
        }
    }

    u20(Class cls, w wVar) {
        this.a = cls;
        this.b = wVar;
    }

    @Override // com.google.gson.x
    public <T2> w<T2> b(j jVar, z20<T2> z20) {
        Class<? super T2> c = z20.c();
        if (!this.a.isAssignableFrom(c)) {
            return null;
        }
        return new a(c);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Factory[typeHierarchy=");
        V0.append(this.a.getName());
        V0.append(",adapter=");
        V0.append(this.b);
        V0.append("]");
        return V0.toString();
    }
}
