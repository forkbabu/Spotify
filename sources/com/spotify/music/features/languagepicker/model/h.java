package com.spotify.music.features.languagepicker.model;

import io.reactivex.a;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.List;

public class h implements e {
    private final f a;

    public h(f fVar) {
        this.a = fVar;
    }

    @Override // com.spotify.music.features.languagepicker.model.e
    public s<List<g>> a() {
        return s.d1(this.a.c().P(), this.a.b().P(), c.a);
    }

    @Override // com.spotify.music.features.languagepicker.model.e
    public a b(List<g> list) {
        ArrayList arrayList = new ArrayList();
        for (g gVar : list) {
            if (gVar.f()) {
                arrayList.add(gVar.a());
            }
        }
        return this.a.a(arrayList).q(b.a);
    }
}
