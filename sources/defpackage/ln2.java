package defpackage;

import com.spotify.music.carmode.navigation.domain.p;
import com.spotify.music.carmode.navigation.s;
import com.spotify.music.carmode.navigation.t;
import com.spotify.music.libs.carmodeengine.util.y;

/* renamed from: ln2  reason: default package */
public class ln2 {
    private final s a;
    private final y b;

    public ln2(s sVar, y yVar) {
        this.a = sVar;
        this.b = yVar;
    }

    public io.reactivex.s<p> a() {
        return ((t) this.a).a().a1(io.reactivex.s.i0(Boolean.valueOf(this.b.g())), fn2.a).j0(en2.a);
    }

    public io.reactivex.s<p> b() {
        return ((t) this.a).b().a1(this.b.d(), gn2.a).j0(dn2.a);
    }
}
