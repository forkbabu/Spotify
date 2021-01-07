package com.spotify.music.features.queue;

import com.spotify.libs.connect.picker.view.g;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.queue.logging.c;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.player.controls.d;

public class b0 {
    private final wlf<w> a;
    private final wlf<v> b;
    private final wlf<c> c;
    private final wlf<ExplicitContentFacade> d;
    private final wlf<AgeRestrictedContentFacade> e;
    private final wlf<d> f;
    private final wlf<Boolean> g;

    public b0(wlf<w> wlf, wlf<v> wlf2, wlf<c> wlf3, wlf<ExplicitContentFacade> wlf4, wlf<AgeRestrictedContentFacade> wlf5, wlf<d> wlf6, wlf<Boolean> wlf7) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public a0 b(g gVar) {
        a(gVar, 1);
        w wVar = this.a.get();
        a(wVar, 2);
        w wVar2 = wVar;
        v vVar = this.b.get();
        a(vVar, 3);
        v vVar2 = vVar;
        c cVar = this.c.get();
        a(cVar, 4);
        c cVar2 = cVar;
        ExplicitContentFacade explicitContentFacade = this.d.get();
        a(explicitContentFacade, 5);
        ExplicitContentFacade explicitContentFacade2 = explicitContentFacade;
        AgeRestrictedContentFacade ageRestrictedContentFacade = this.e.get();
        a(ageRestrictedContentFacade, 6);
        AgeRestrictedContentFacade ageRestrictedContentFacade2 = ageRestrictedContentFacade;
        d dVar = this.f.get();
        a(dVar, 7);
        d dVar2 = dVar;
        Boolean bool = this.g.get();
        a(bool, 8);
        return new a0(gVar, wVar2, vVar2, cVar2, explicitContentFacade2, ageRestrictedContentFacade2, dVar2, bool.booleanValue());
    }
}
