package com.spotify.music.carmode.navigation.domain;

import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import com.spotify.music.carmode.navigation.domain.CarModeNavigationModel;
import com.spotify.music.carmode.navigation.domain.n;
import com.spotify.music.carmode.navigation.domain.o;
import com.spotify.music.carmode.navigation.domain.p;

public final class q {
    private static e0<CarModeNavigationModel, o> a(CarModeNavigationModel carModeNavigationModel, CarModeNavigationModel carModeNavigationModel2) {
        CarModeNavigationModel.IsReturning j = carModeNavigationModel2.j();
        CarModeNavigationModel.IsReturning isReturning = CarModeNavigationModel.IsReturning.UNKNOWN;
        if (j == isReturning || carModeNavigationModel2.k() == isReturning) {
            return e0.f(carModeNavigationModel2);
        }
        CarModeNavigationModel.IsReturning j2 = carModeNavigationModel2.j();
        CarModeNavigationModel.IsReturning isReturning2 = CarModeNavigationModel.IsReturning.NO;
        if (j2 == isReturning2) {
            return e0.g(carModeNavigationModel2, z42.l(new o.f()));
        }
        if (carModeNavigationModel2.k() == isReturning2) {
            return e0.g(carModeNavigationModel2, z42.l(new o.i(), new o.h()));
        }
        if (!carModeNavigationModel.equals(carModeNavigationModel2)) {
            return e0.f(carModeNavigationModel2);
        }
        return e0.h();
    }

    public static s<CarModeNavigationModel, o> b(CarModeNavigationModel carModeNavigationModel) {
        if (!carModeNavigationModel.f() || carModeNavigationModel.d().equals(kfd.q)) {
            return s.b(carModeNavigationModel);
        }
        return s.c(carModeNavigationModel, z42.l(new o.b()));
    }

    private static boolean c(CarModeNavigationModel carModeNavigationModel) {
        return carModeNavigationModel.b() == CarModeNavigationModel.NavigationTab.SEARCH && carModeNavigationModel.m() == CarModeNavigationModel.SearchType.VOICE;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0023: APUT  
      (r6v6 com.spotify.music.carmode.navigation.domain.o[])
      (1 ??[boolean, int, float, short, byte, char])
      (r5v12 com.spotify.music.carmode.navigation.domain.o)
     */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x006f: APUT  
      (r6v3 com.spotify.music.carmode.navigation.domain.o[])
      (0 ??[int, short, byte, char])
      (r5v2 com.spotify.music.carmode.navigation.domain.o)
     */
    static e0 d(CarModeNavigationModel carModeNavigationModel, p.b bVar) {
        o oVar;
        o oVar2;
        if (c(carModeNavigationModel)) {
            o[] oVarArr = new o[2];
            oVarArr[0] = new o.a();
            if (carModeNavigationModel.f()) {
                oVar2 = new o.c();
            } else {
                oVar2 = new o.d();
            }
            oVarArr[1] = oVar2;
            return e0.a(z42.l(oVarArr));
        } else if (carModeNavigationModel.b() == CarModeNavigationModel.NavigationTab.HOME) {
            return e0.a(z42.l(new o.l(carModeNavigationModel.b(), carModeNavigationModel.m(), carModeNavigationModel.a(), Boolean.valueOf(carModeNavigationModel.f()))));
        } else {
            o[] oVarArr2 = new o[1];
            if (carModeNavigationModel.f()) {
                oVar = new o.c();
            } else {
                oVar = new o.d();
            }
            oVarArr2[0] = oVar;
            return e0.a(z42.l(oVarArr2));
        }
    }

    static e0 e(CarModeNavigationModel carModeNavigationModel, p.m mVar) {
        if (c(carModeNavigationModel)) {
            return e0.a(z42.l(new o.a(), new o.j()));
        }
        if (carModeNavigationModel.b() == CarModeNavigationModel.NavigationTab.YOUR_LIBRARY) {
            return e0.a(z42.l(new o.l(carModeNavigationModel.b(), carModeNavigationModel.m(), carModeNavigationModel.a(), Boolean.valueOf(carModeNavigationModel.f()))));
        }
        return e0.a(z42.l(new o.j()));
    }

    static e0 f(CarModeNavigationModel carModeNavigationModel, p.d dVar) {
        boolean o = dVar.o();
        n.b bVar = (n.b) carModeNavigationModel.n();
        bVar.i(o ? CarModeNavigationModel.IsReturning.YES : CarModeNavigationModel.IsReturning.NO);
        return a(carModeNavigationModel, bVar.build());
    }

    static e0 g(CarModeNavigationModel carModeNavigationModel, p.e eVar) {
        boolean o = eVar.o();
        n.b bVar = (n.b) carModeNavigationModel.n();
        bVar.j(o ? CarModeNavigationModel.IsReturning.YES : CarModeNavigationModel.IsReturning.NO);
        return a(carModeNavigationModel, bVar.build());
    }
}
