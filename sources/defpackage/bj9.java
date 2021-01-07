package defpackage;

import com.jakewharton.rxrelay2.b;
import defpackage.ij9;
import io.reactivex.s;

/* renamed from: bj9  reason: default package */
public class bj9 implements ij9.a {
    private final b<ej9> a = b.g1();

    @Override // defpackage.ij9.a
    public s<ej9> a() {
        return this.a;
    }

    public void b(String str) {
        this.a.accept(new yi9(str, null, null, null));
    }

    public void d(String str, String str2) {
        this.a.accept(new yi9(str, str2, null, null));
    }
}
