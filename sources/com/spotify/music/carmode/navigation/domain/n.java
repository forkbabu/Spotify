package com.spotify.music.carmode.navigation.domain;

import com.google.common.base.Optional;
import com.spotify.music.carmode.navigation.domain.CarModeNavigationModel;
import com.spotify.music.navigation.x;

/* access modifiers changed from: package-private */
public final class n extends CarModeNavigationModel {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final CarModeNavigationModel.IsReturning g;
    private final CarModeNavigationModel.IsReturning h;
    private final CarModeNavigationModel.NavigationTab i;
    private final CarModeNavigationModel.SearchType j;
    private final ifd k;
    private final Optional<x> l;

    n(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CarModeNavigationModel.IsReturning isReturning, CarModeNavigationModel.IsReturning isReturning2, CarModeNavigationModel.NavigationTab navigationTab, CarModeNavigationModel.SearchType searchType, ifd ifd, Optional optional, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = isReturning;
        this.h = isReturning2;
        this.i = navigationTab;
        this.j = searchType;
        this.k = ifd;
        this.l = optional;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public Optional<x> a() {
        return this.l;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public CarModeNavigationModel.NavigationTab b() {
        return this.i;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public ifd d() {
        return this.k;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CarModeNavigationModel)) {
            return false;
        }
        CarModeNavigationModel carModeNavigationModel = (CarModeNavigationModel) obj;
        if (this.a != carModeNavigationModel.e() || this.b != carModeNavigationModel.i() || this.c != carModeNavigationModel.h() || this.d != carModeNavigationModel.g() || this.e != carModeNavigationModel.l() || this.f != carModeNavigationModel.f() || !this.g.equals(carModeNavigationModel.j()) || !this.h.equals(carModeNavigationModel.k()) || !this.i.equals(carModeNavigationModel.b()) || !this.j.equals(carModeNavigationModel.m()) || !this.k.equals(carModeNavigationModel.d()) || !this.l.equals(carModeNavigationModel.a())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public boolean f() {
        return this.f;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public boolean g() {
        return this.d;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public boolean h() {
        return this.c;
    }

    public int hashCode() {
        int i2 = 1231;
        int i3 = ((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i2 = 1237;
        }
        return ((((((((((((i3 ^ i2) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public boolean i() {
        return this.b;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public CarModeNavigationModel.IsReturning j() {
        return this.g;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public CarModeNavigationModel.IsReturning k() {
        return this.h;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public boolean l() {
        return this.e;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public CarModeNavigationModel.SearchType m() {
        return this.j;
    }

    @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel
    public CarModeNavigationModel.a n() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("CarModeNavigationModel{isAdPlaying=");
        V0.append(this.a);
        V0.append(", isNetworkConnected=");
        V0.append(this.b);
        V0.append(", isMicrophoneEnabled=");
        V0.append(this.c);
        V0.append(", isLanguageSupported=");
        V0.append(this.d);
        V0.append(", isVoiceSearchListening=");
        V0.append(this.e);
        V0.append(", isCarModeHomeEnabled=");
        V0.append(this.f);
        V0.append(", isReturningHomeUser=");
        V0.append(this.g);
        V0.append(", isReturningVoiceUser=");
        V0.append(this.h);
        V0.append(", activeTab=");
        V0.append(this.i);
        V0.append(", searchType=");
        V0.append(this.j);
        V0.append(", currentFeatureIdentifier=");
        V0.append(this.k);
        V0.append(", activeRootFeature=");
        return je.F0(V0, this.l, "}");
    }

    /* access modifiers changed from: package-private */
    public static final class b implements CarModeNavigationModel.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private CarModeNavigationModel.IsReturning g;
        private CarModeNavigationModel.IsReturning h;
        private CarModeNavigationModel.NavigationTab i;
        private CarModeNavigationModel.SearchType j;
        private ifd k;
        private Optional<x> l = Optional.absent();

        b() {
        }

        @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel.a
        public CarModeNavigationModel.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel.a
        public CarModeNavigationModel.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel.a
        public CarModeNavigationModel build() {
            String str = this.a == null ? " isAdPlaying" : "";
            if (this.b == null) {
                str = je.x0(str, " isNetworkConnected");
            }
            if (this.c == null) {
                str = je.x0(str, " isMicrophoneEnabled");
            }
            if (this.d == null) {
                str = je.x0(str, " isLanguageSupported");
            }
            if (this.e == null) {
                str = je.x0(str, " isVoiceSearchListening");
            }
            if (this.f == null) {
                str = je.x0(str, " isCarModeHomeEnabled");
            }
            if (this.g == null) {
                str = je.x0(str, " isReturningHomeUser");
            }
            if (this.h == null) {
                str = je.x0(str, " isReturningVoiceUser");
            }
            if (this.i == null) {
                str = je.x0(str, " activeTab");
            }
            if (this.j == null) {
                str = je.x0(str, " searchType");
            }
            if (this.k == null) {
                str = je.x0(str, " currentFeatureIdentifier");
            }
            if (str.isEmpty()) {
                return new n(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel.a
        public CarModeNavigationModel.a c(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel.a
        public CarModeNavigationModel.a d(ifd ifd) {
            if (ifd != null) {
                this.k = ifd;
                return this;
            }
            throw new NullPointerException("Null currentFeatureIdentifier");
        }

        @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel.a
        public CarModeNavigationModel.a e(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.carmode.navigation.domain.CarModeNavigationModel.a
        public CarModeNavigationModel.a f(Optional<x> optional) {
            if (optional != null) {
                this.l = optional;
                return this;
            }
            throw new NullPointerException("Null activeRootFeature");
        }

        public CarModeNavigationModel.a g(CarModeNavigationModel.NavigationTab navigationTab) {
            if (navigationTab != null) {
                this.i = navigationTab;
                return this;
            }
            throw new NullPointerException("Null activeTab");
        }

        public CarModeNavigationModel.a h(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public CarModeNavigationModel.a i(CarModeNavigationModel.IsReturning isReturning) {
            this.g = isReturning;
            return this;
        }

        public CarModeNavigationModel.a j(CarModeNavigationModel.IsReturning isReturning) {
            this.h = isReturning;
            return this;
        }

        public CarModeNavigationModel.a k(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public CarModeNavigationModel.a l(CarModeNavigationModel.SearchType searchType) {
            if (searchType != null) {
                this.j = searchType;
                return this;
            }
            throw new NullPointerException("Null searchType");
        }

        b(CarModeNavigationModel carModeNavigationModel, a aVar) {
            this.a = Boolean.valueOf(carModeNavigationModel.e());
            this.b = Boolean.valueOf(carModeNavigationModel.i());
            this.c = Boolean.valueOf(carModeNavigationModel.h());
            this.d = Boolean.valueOf(carModeNavigationModel.g());
            this.e = Boolean.valueOf(carModeNavigationModel.l());
            this.f = Boolean.valueOf(carModeNavigationModel.f());
            this.g = carModeNavigationModel.j();
            this.h = carModeNavigationModel.k();
            this.i = carModeNavigationModel.b();
            this.j = carModeNavigationModel.m();
            this.k = carModeNavigationModel.d();
            this.l = carModeNavigationModel.a();
        }
    }
}
