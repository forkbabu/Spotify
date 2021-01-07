package com.spotify.music.libs.assistedcuration.presenter;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.assistedcuration.presenter.k;
import com.spotify.music.libs.assistedcuration.provider.b0;
import io.reactivex.g;

public final class l implements k.a {
    private final wlf<b0> a;
    private final wlf<g<SessionState>> b;
    private final wlf<ExplicitContentFacade> c;
    private final wlf<AgeRestrictedContentFacade> d;

    public l(wlf<b0> wlf, wlf<g<SessionState>> wlf2, wlf<ExplicitContentFacade> wlf3, wlf<AgeRestrictedContentFacade> wlf4) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.k.a
    public k a(y yVar) {
        b0 b0Var = this.a.get();
        b(b0Var, 1);
        b0 b0Var2 = b0Var;
        g<SessionState> gVar = this.b.get();
        b(gVar, 2);
        g<SessionState> gVar2 = gVar;
        ExplicitContentFacade explicitContentFacade = this.c.get();
        b(explicitContentFacade, 3);
        ExplicitContentFacade explicitContentFacade2 = explicitContentFacade;
        AgeRestrictedContentFacade ageRestrictedContentFacade = this.d.get();
        b(ageRestrictedContentFacade, 4);
        b(yVar, 5);
        return new k(b0Var2, gVar2, explicitContentFacade2, ageRestrictedContentFacade, yVar);
    }
}
