package com.spotify.music.features.yourlibraryx.view;

import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.view.y;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.d;

public final class h implements g {
    @Override // com.spotify.music.features.yourlibraryx.view.g
    public List<y> a(f fVar) {
        kotlin.jvm.internal.h.e(fVar, "model");
        if (!fVar.f().e() || fVar.f().c().isEmpty()) {
            return EmptyList.a;
        }
        return d.t(new y.d(fVar.n(), fVar.o().g()));
    }
}
