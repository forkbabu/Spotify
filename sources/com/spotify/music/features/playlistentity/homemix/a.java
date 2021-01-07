package com.spotify.music.features.playlistentity.homemix;

import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ q a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ HomeMixPlanType c;

    public /* synthetic */ a(q qVar, boolean z, HomeMixPlanType homeMixPlanType) {
        this.a = qVar;
        this.b = z;
        this.c = homeMixPlanType;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, this.c, (xe6) obj);
    }
}
