package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import io.reactivex.s;

/* renamed from: ij9  reason: default package */
public final class ij9 {
    private final s<ej9> a;

    /* renamed from: ij9$a */
    public interface a {
        s<ej9> a();
    }

    /* renamed from: ij9$b */
    public interface b {
        ij9 u0();
    }

    private ij9(s<ej9> sVar) {
        this.a = sVar;
    }

    public static ij9 a(com.spotify.instrumentation.a aVar) {
        return b(aVar, null);
    }

    public static ij9 b(com.spotify.instrumentation.a aVar, String str) {
        return new ij9(s.i0(fj9.b(aVar.path(), str)));
    }

    public static ij9 c(a aVar) {
        return new ij9(aVar.a());
    }

    public static ij9 d(String str) {
        return new ij9(s.i0(new yi9(PageIdentifiers.UNKNOWN_UNCOVERED.path(), null, null, str)));
    }

    public s<ej9> e() {
        return this.a;
    }
}
