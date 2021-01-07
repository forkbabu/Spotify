package com.spotify.music.libs.restrictedcontent.transformer;

import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.k;

public class h implements k<b91, b91> {
    private final f a;
    private final AgeRestrictedContentFacade b;

    public h(f fVar, AgeRestrictedContentFacade ageRestrictedContentFacade) {
        this.a = fVar;
        this.b = ageRestrictedContentFacade;
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    @Override // io.reactivex.k
    public tpf<b91> a(g<b91> gVar) {
        return g.i(gVar, this.b.c().Y0(BackpressureStrategy.LATEST), this.a);
    }
}
