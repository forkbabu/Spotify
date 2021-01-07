package defpackage;

import android.view.ViewGroup;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;
import com.spotify.rxjava2.p;
import com.spotify.voiceassistant.voice.results.o;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: cy8  reason: default package */
public class cy8 implements ahb {
    private static final String o;
    private final t a;
    private final s<Boolean> b;
    private final o c;
    private final y f;
    private final p n = new p();

    static {
        s52 a2 = t52.a(LinkType.VOICE_RESULTS);
        a2.getClass();
        o = a2.b().get(0);
    }

    cy8(t tVar, s<Boolean> sVar, o oVar, y yVar) {
        this.a = tVar;
        this.b = sVar;
        this.c = oVar;
        this.f = yVar;
    }

    @Override // defpackage.ahb
    public void a() {
        this.n.b(this.b.J0(new zw8(this)).o0(this.f).subscribe(new ax8(this)));
    }

    public /* synthetic */ v b(Boolean bool) {
        if (bool.booleanValue()) {
            return this.c.b();
        }
        return e0.a;
    }

    @Override // defpackage.ahb
    public void c() {
    }

    public /* synthetic */ void d(Boolean bool) {
        if (bool.booleanValue()) {
            t tVar = this.a;
            n.a a2 = n.a(o);
            a2.b(true);
            tVar.e(a2.a());
        }
    }

    @Override // defpackage.ahb
    public void e() {
        this.n.a();
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
    }
}
