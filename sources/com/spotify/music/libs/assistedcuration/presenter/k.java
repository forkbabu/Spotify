package com.spotify.music.libs.assistedcuration.presenter;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.assistedcuration.provider.b0;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;

public class k {
    private final y a;
    private final b0 b;
    private final g<SessionState> c;
    private final ExplicitContentFacade d;
    private final AgeRestrictedContentFacade e;

    public interface a {
        k a(y yVar);
    }

    public k(b0 b0Var, g<SessionState> gVar, ExplicitContentFacade explicitContentFacade, AgeRestrictedContentFacade ageRestrictedContentFacade, y yVar) {
        this.b = b0Var;
        this.c = gVar;
        this.d = explicitContentFacade;
        this.e = ageRestrictedContentFacade;
        this.a = yVar;
    }

    public /* synthetic */ v a(x xVar) {
        String a2 = xVar.a();
        return this.b.d(xVar.b(), a2).j0(new c(xVar));
    }

    public s<s> b() {
        return s.l(this.a.a().P().J0(new b(this)), new io.reactivex.internal.operators.observable.v(this.c.O(h.a).s()), this.d.c(), this.e.c().E(), d.a);
    }
}
