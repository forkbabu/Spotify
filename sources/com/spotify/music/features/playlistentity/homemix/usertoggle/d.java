package com.spotify.music.features.playlistentity.homemix.usertoggle;

import com.google.common.base.Predicate;
import retrofit2.v;

public final /* synthetic */ class d implements Predicate {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        v vVar = (v) obj;
        int i = k.l;
        return vVar != null && (vVar.b() == 200 || vVar.b() == 202);
    }
}
