package com.spotify.music.features.yourlibrary.musicpages.filtertags.loader;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import io.reactivex.z;

public class c implements b {
    private final e1 a;
    private final a b;
    private final cqe c;

    public c(e1 e1Var, a aVar, cqe cqe) {
        this.a = e1Var;
        this.b = aVar;
        this.c = cqe;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.b
    public z<FilterTagsResponse> a(int i) {
        a aVar = this.b;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        if (this.a.h()) {
            builder.mo51put("subjective", "true");
        }
        builder.mo51put("offline-count", String.valueOf(i));
        builder.mo51put("client-timezone", this.c.f().getID());
        return aVar.a(builder.build());
    }
}
