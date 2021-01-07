package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.madeforyouhub.view.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: up5  reason: default package */
public class up5 {
    private final s<SessionState> a;
    private final c b;
    private final y c;
    private b d = EmptyDisposable.INSTANCE;
    private final vo5 e;
    private final sp5 f;

    public up5(c cVar, y yVar, vo5 vo5, s<SessionState> sVar, sp5 sp5) {
        cVar.getClass();
        this.b = cVar;
        this.c = yVar;
        this.e = vo5;
        this.a = sVar;
        this.f = sp5;
    }

    public /* synthetic */ v a(Boolean bool) {
        return this.e.a();
    }

    public void b() {
        this.d.dispose();
        s<R> o0 = this.a.j0(pp5.a).F(mp5.a).V(new op5(this), rp5.a).j0(this.f).o0(this.c);
        c cVar = this.b;
        cVar.getClass();
        this.d = o0.subscribe(new qp5(cVar), np5.a);
    }

    public void c() {
        this.d.dispose();
    }
}
