package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import io.reactivex.s;

/* renamed from: v98  reason: default package */
public class v98 implements u98 {
    private final bj9 a;
    private String b = PageIdentifiers.SEARCH.path();

    public v98(bj9 bj9) {
        this.a = bj9;
    }

    @Override // defpackage.ij9.a
    public s<ej9> a() {
        return this.a.a();
    }

    @Override // defpackage.u98
    public void b(String str) {
        this.b = str;
        this.a.b(str);
    }

    @Override // defpackage.u98
    public String c() {
        return this.b;
    }
}
