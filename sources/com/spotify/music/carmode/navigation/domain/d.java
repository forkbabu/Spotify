package com.spotify.music.carmode.navigation.domain;

import com.spotify.mobius.e0;
import com.spotify.music.carmode.navigation.domain.CarModeNavigationModel;
import com.spotify.music.carmode.navigation.domain.o;
import com.spotify.music.carmode.navigation.domain.p;

public final /* synthetic */ class d implements ti0 {
    public final /* synthetic */ CarModeNavigationModel a;

    public /* synthetic */ d(CarModeNavigationModel carModeNavigationModel) {
        this.a = carModeNavigationModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        CarModeNavigationModel carModeNavigationModel = this.a;
        p.h hVar = (p.h) obj;
        if (carModeNavigationModel.b() == CarModeNavigationModel.NavigationTab.SEARCH) {
            return e0.a(z42.l(new o.l(carModeNavigationModel.b(), carModeNavigationModel.m(), carModeNavigationModel.a(), Boolean.valueOf(carModeNavigationModel.f()))));
        }
        return e0.a(z42.l(new o.e()));
    }
}