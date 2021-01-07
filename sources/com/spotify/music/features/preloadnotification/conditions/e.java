package com.spotify.music.features.preloadnotification.conditions;

import java.util.ArrayList;
import java.util.List;

public class e {
    private final List<a> a;

    public e(f fVar, b bVar, d dVar) {
        ArrayList arrayList = new ArrayList(3);
        this.a = arrayList;
        arrayList.add(fVar);
        arrayList.add(bVar);
        arrayList.add(dVar);
    }

    public boolean a() {
        for (a aVar : this.a) {
            if (!aVar.a()) {
                return false;
            }
        }
        return true;
    }
}
