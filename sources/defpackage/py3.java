package defpackage;

import com.spotify.music.connection.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: py3  reason: default package */
public class py3 implements w<b91, b91> {
    private final l a;
    private final k91 b;

    public py3(l lVar, k91 k91) {
        this.a = lVar;
        this.b = k91;
    }

    public static b91 a(py3 py3, b91 b91, boolean z) {
        py3.getClass();
        return z ? py3.b.b(b91) : b91;
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return s.n(sVar, this.a.a().j0(xx3.a), new kx3(this));
    }
}
