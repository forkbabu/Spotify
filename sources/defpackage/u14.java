package defpackage;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.spotify.instrumentation.a;
import com.spotify.libs.search.history.l;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.assistedcuration.AssistedCurationLogger;
import com.spotify.music.libs.assistedcuration.presenter.n;
import com.spotify.music.libs.assistedcuration.presenter.s;
import com.spotify.music.libs.assistedcuration.presenter.x;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.y;
import java.util.HashSet;
import java.util.Set;

/* renamed from: u14  reason: default package */
public class u14 {
    private final q a = new q();
    private final y b;
    private final g<SessionState> c;
    private final l d;
    private final AssistedCurationLogger e;
    private final r34 f;
    private final n g;
    private String h;
    private final Set<String> i = new HashSet();

    public u14(y yVar, g<SessionState> gVar, l lVar, AssistedCurationLogger.a aVar, n nVar, a aVar2, r34 r34) {
        this.b = yVar;
        this.c = gVar;
        this.d = lVar;
        this.e = aVar.a(aVar2);
        this.f = r34;
        this.g = nVar;
    }

    public /* synthetic */ void a(SessionState sessionState) {
        this.d.a(sessionState.currentUserName(), "assisted_curation").a();
    }

    public /* synthetic */ void b(s sVar) {
        x c2 = sVar.c();
        this.h = c2.a();
        this.i.clear();
        this.i.addAll(c2.b());
        this.f.X(sVar);
    }

    public void c() {
        this.e.b();
    }

    public void d() {
        this.e.j();
        this.f.G();
    }

    public void e() {
        this.e.n();
        this.f.D(ImmutableSet.copyOf(Collections2.limit(this.i, 100)), this.h);
    }

    public void f(io.reactivex.s<s> sVar) {
        this.a.a(this.c.C(r14.a).E().subscribe(new q14(this)));
        this.a.a(sVar.o0(this.b).subscribe(new s14(this)));
        q qVar = this.a;
        io.reactivex.a A = this.g.a().A(this.b);
        r34 r34 = this.f;
        r34.getClass();
        qVar.a(A.subscribe(new t14(r34)));
    }

    public void g() {
        this.a.c();
    }
}
