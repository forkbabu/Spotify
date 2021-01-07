package com.spotify.music.features.playlistentity.homemix;

import com.google.common.base.Predicate;
import retrofit2.v;

public final /* synthetic */ class c implements Predicate {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        v vVar = (v) obj;
        return vVar != null && (vVar.b() == 200 || vVar.b() == 202);
    }
}
