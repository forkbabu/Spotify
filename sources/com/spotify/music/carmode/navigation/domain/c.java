package com.spotify.music.carmode.navigation.domain;

import com.spotify.mobius.e0;
import com.spotify.music.carmode.navigation.domain.CarModeNavigationModel;
import com.spotify.music.carmode.navigation.domain.n;
import com.spotify.music.carmode.navigation.domain.p;

public final /* synthetic */ class c implements ti0 {
    public final /* synthetic */ CarModeNavigationModel a;

    public /* synthetic */ c(CarModeNavigationModel carModeNavigationModel) {
        this.a = carModeNavigationModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        CarModeNavigationModel carModeNavigationModel = this.a;
        CarModeNavigationModel.SearchType o = ((p.i) obj).o();
        n.b bVar = (n.b) carModeNavigationModel.n();
        bVar.l(o);
        return e0.f(bVar.build());
    }
}
