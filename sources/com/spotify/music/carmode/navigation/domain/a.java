package com.spotify.music.carmode.navigation.domain;

import com.spotify.mobius.e0;
import com.spotify.music.carmode.navigation.domain.n;
import com.spotify.music.carmode.navigation.domain.p;

public final /* synthetic */ class a implements ti0 {
    public final /* synthetic */ CarModeNavigationModel a;

    public /* synthetic */ a(CarModeNavigationModel carModeNavigationModel) {
        this.a = carModeNavigationModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        CarModeNavigationModel carModeNavigationModel = this.a;
        boolean o = ((p.j) obj).o();
        if (carModeNavigationModel.l() == o) {
            return e0.h();
        }
        n.b bVar = (n.b) carModeNavigationModel.n();
        bVar.k(o);
        return e0.f(bVar.build());
    }
}
