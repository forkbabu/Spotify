package defpackage;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.f;
import com.google.gson.internal.q;
import com.google.gson.j;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import com.google.gson.w;
import com.google.gson.x;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: f20  reason: default package */
public final class f20 implements x {
    private final f a;

    /* renamed from: f20$a */
    private static final class a<E> extends w<Collection<E>> {
        private final w<E> a;
        private final q<? extends Collection<E>> b;

        public a(j jVar, Type type, w<E> wVar, q<? extends Collection<E>> qVar) {
            this.a = new r20(jVar, wVar, type);
            this.b = qVar;
        }

        @Override // com.google.gson.w
        public Object read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            Collection collection = (Collection) this.b.a();
            aVar.a();
            while (aVar.l()) {
                collection.add(this.a.read(aVar));
            }
            aVar.g();
            return collection;
        }

        @Override // com.google.gson.w
        public void write(b bVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                bVar.r();
                return;
            }
            bVar.b();
            for (E e : collection) {
                this.a.write(bVar, e);
            }
            bVar.g();
        }
    }

    public f20(f fVar) {
        this.a = fVar;
    }

    @Override // com.google.gson.x
    public <T> w<T> b(j jVar, z20<T> z20) {
        Type d = z20.d();
        Class<? super T> c = z20.c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type d2 = C$Gson$Types.d(d, c);
        return new a(jVar, d2, jVar.c(z20.b(d2)), this.a.a(z20));
    }
}
