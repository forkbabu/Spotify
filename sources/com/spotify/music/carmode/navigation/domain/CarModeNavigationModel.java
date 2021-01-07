package com.spotify.music.carmode.navigation.domain;

import com.google.common.base.Optional;
import com.spotify.music.carmode.navigation.domain.n;
import com.spotify.music.navigation.x;

public abstract class CarModeNavigationModel {

    public enum IsReturning {
        UNKNOWN,
        YES,
        NO
    }

    public enum NavigationTab {
        HOME,
        SEARCH,
        YOUR_LIBRARY
    }

    public enum SearchType {
        VOICE,
        REGULAR
    }

    public interface a {
        a a(boolean z);

        a b(boolean z);

        CarModeNavigationModel build();

        a c(boolean z);

        a d(ifd ifd);

        a e(boolean z);

        a f(Optional<x> optional);
    }

    static {
        ((n.b) c()).build();
    }

    public static a c() {
        n.b bVar = new n.b();
        bVar.h(false);
        n.b bVar2 = bVar;
        bVar2.b(false);
        n.b bVar3 = bVar2;
        bVar3.e(false);
        n.b bVar4 = bVar3;
        bVar4.a(false);
        n.b bVar5 = bVar4;
        bVar5.k(false);
        n.b bVar6 = bVar5;
        bVar6.c(false);
        IsReturning isReturning = IsReturning.UNKNOWN;
        n.b bVar7 = bVar6;
        bVar7.i(isReturning);
        n.b bVar8 = bVar7;
        bVar8.j(isReturning);
        n.b bVar9 = bVar8;
        bVar9.g(NavigationTab.HOME);
        n.b bVar10 = bVar9;
        bVar10.l(SearchType.REGULAR);
        n.b bVar11 = bVar10;
        bVar11.d(kfd.w1);
        return bVar11;
    }

    public abstract Optional<x> a();

    public abstract NavigationTab b();

    public abstract ifd d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract IsReturning j();

    public abstract IsReturning k();

    public abstract boolean l();

    public abstract SearchType m();

    public abstract a n();
}
