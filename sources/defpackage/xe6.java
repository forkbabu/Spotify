package defpackage;

import com.spotify.music.connection.g;
import defpackage.we6;
import retrofit2.v;

/* renamed from: xe6  reason: default package */
public final class xe6<T> {
    private final we6<T> a;

    private xe6(we6<T> we6) {
        this.a = we6;
    }

    public static <T> xe6<T> a(g.b bVar) {
        return new xe6<>(new we6.c(bVar.d()));
    }

    public static <T, R> xe6<R> b(we6<v<T>> we6) {
        we6.getClass();
        if (we6 instanceof we6.a) {
            return new xe6<>(new we6.a(((we6.a) we6).a()));
        }
        return new xe6<>(new we6.c(((we6.c) we6).a()));
    }

    public static <T> xe6<T> c(Throwable th) {
        return new xe6<>(new we6.a(th));
    }

    public static <T> xe6<T> j() {
        return new xe6<>(new we6.b());
    }

    public static <T> xe6<T> k(T t) {
        return new xe6<>(new we6.d(t));
    }

    public T d() {
        we6<T> we6 = this.a;
        we6.getClass();
        return (T) ((we6.d) we6).a();
    }

    public we6<T> e() {
        return this.a;
    }

    public boolean f() {
        we6<T> we6 = this.a;
        we6.getClass();
        return we6 instanceof we6.a;
    }

    public boolean g() {
        we6<T> we6 = this.a;
        we6.getClass();
        return we6 instanceof we6.b;
    }

    public boolean h() {
        we6<T> we6 = this.a;
        we6.getClass();
        return we6 instanceof we6.c;
    }

    public boolean i() {
        we6<T> we6 = this.a;
        we6.getClass();
        return we6 instanceof we6.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RxStatus{mRxState=");
        V0.append(this.a);
        V0.append('}');
        return V0.toString();
    }
}
