package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;

/* renamed from: mg0  reason: default package */
public final class mg0<T> {
    private final Supplier<T> a;

    /* renamed from: mg0$a */
    class a implements Supplier<T> {
        final /* synthetic */ b a;

        a(mg0 mg0, b bVar) {
            this.a = bVar;
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            return (T) this.a.create();
        }
    }

    /* renamed from: mg0$b */
    public interface b<T> {
        T create();
    }

    private mg0(b<T> bVar) {
        this.a = MoreObjects.memoize(new a(this, bVar));
    }

    public static <T> mg0<T> b(b<T> bVar) {
        bVar.getClass();
        return new mg0<>(bVar);
    }

    public T a() {
        T t = this.a.get();
        t.getClass();
        return t;
    }

    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
