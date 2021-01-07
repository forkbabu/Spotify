package defpackage;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.spotify.libs.search.history.l;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.assistedcuration.presenter.k;
import com.spotify.music.libs.assistedcuration.presenter.s;
import com.spotify.music.libs.assistedcuration.presenter.x;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import io.reactivex.disposables.c;
import io.reactivex.g;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: e07  reason: default package */
public class e07 {
    private final q a = new q();
    private final p b = new p();
    private final a<s> c = a.h1();
    private final CompletableSubject d = CompletableSubject.R();
    private final y e;
    private final g<SessionState> f;
    private final l g;
    private final k h;
    private String i;
    private final Set<String> j = new HashSet();
    private g07 k;

    public e07(y yVar, g<SessionState> gVar, l lVar, com.spotify.music.libs.assistedcuration.presenter.y yVar2, k.a aVar) {
        this.e = yVar;
        this.f = gVar;
        this.g = lVar;
        this.h = aVar.a(yVar2);
    }

    public void a(g07 g07) {
        this.k = g07;
        if (g07 != null) {
            p pVar = this.b;
            io.reactivex.s<s> o0 = this.c.o0(this.e);
            g07 g072 = this.k;
            g072.getClass();
            pVar.b(o0.subscribe(new zz6(g072)));
            return;
        }
        this.b.b(c.a());
    }

    public /* synthetic */ void b(SessionState sessionState) {
        this.g.a(sessionState.currentUserName(), "assisted_curation").a();
    }

    public /* synthetic */ void c(s sVar) {
        x c2 = sVar.c();
        this.i = c2.a();
        this.j.clear();
        this.j.addAll(c2.b());
        this.c.onNext(sVar);
    }

    public void d() {
        g07 g07 = this.k;
        if (g07 != null) {
            ((a07) g07).C(ImmutableSet.copyOf(Collections2.limit(this.j, 100)), this.i);
        }
    }

    public void e(int i2) {
        if (i2 <= 5) {
            this.d.onComplete();
        }
    }

    public void f() {
        this.a.a(this.d.e(this.f).C(vz6.a).E().subscribe(new tz6(this), wz6.a));
        this.a.a(this.d.g(this.h.b()).o0(this.e).subscribe(new uz6(this), xz6.a));
    }

    public void g() {
        this.a.c();
    }
}
