package com.spotify.music.libs.assistedcuration.presenter;

import androidx.lifecycle.n;
import com.spotify.instrumentation.a;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.assistedcuration.AssistedCurationLogger;
import com.spotify.music.libs.assistedcuration.presenter.AssistedCurationContentPresenter;
import com.spotify.music.libs.assistedcuration.provider.b0;
import com.spotify.music.preview.v;

public final class i implements AssistedCurationContentPresenter.a {
    private final wlf<String> a;
    private final wlf<b0> b;
    private final wlf<ExplicitContentFacade> c;
    private final wlf<AgeRestrictedContentFacade> d;
    private final wlf<AssistedCurationLogger.a> e;

    public i(wlf<String> wlf, wlf<b0> wlf2, wlf<ExplicitContentFacade> wlf3, wlf<AgeRestrictedContentFacade> wlf4, wlf<AssistedCurationLogger.a> wlf5) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.AssistedCurationContentPresenter.a
    public AssistedCurationContentPresenter a(n nVar, a2a a2a, a aVar, v vVar, x1a x1a) {
        String str = this.a.get();
        b(str, 1);
        String str2 = str;
        b0 b0Var = this.b.get();
        b(b0Var, 2);
        b0 b0Var2 = b0Var;
        ExplicitContentFacade explicitContentFacade = this.c.get();
        b(explicitContentFacade, 3);
        ExplicitContentFacade explicitContentFacade2 = explicitContentFacade;
        AgeRestrictedContentFacade ageRestrictedContentFacade = this.d.get();
        b(ageRestrictedContentFacade, 4);
        AgeRestrictedContentFacade ageRestrictedContentFacade2 = ageRestrictedContentFacade;
        AssistedCurationLogger.a aVar2 = this.e.get();
        b(aVar2, 5);
        b(nVar, 6);
        b(a2a, 7);
        b(aVar, 8);
        b(vVar, 9);
        b(x1a, 10);
        return new AssistedCurationContentPresenter(str2, b0Var2, explicitContentFacade2, ageRestrictedContentFacade2, aVar2, nVar, a2a, aVar, vVar, x1a);
    }
}
