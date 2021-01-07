package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.pages.u;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import com.spotify.music.yourlibrary.interfaces.i;

final class q0 extends MusicPagesModel {
    private final u a;
    private final Optional<qpd> b;
    private final Optional<ImmutableMap<String, Boolean>> c;
    private final Optional<PagePrefs> d;
    private final String e;
    private final int f;
    private final int g;
    private final y3 h;
    private final Optional<Boolean> i;
    private final Optional<Boolean> j;
    private final Optional<Boolean> k;
    private final Optional<Boolean> l;
    private final MusicPagesModel.LoadingState m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final mpd s;
    private final i t;
    private final u0 u;
    private final boolean v;

    q0(u uVar, Optional optional, Optional optional2, Optional optional3, String str, int i2, int i3, y3 y3Var, Optional optional4, Optional optional5, Optional optional6, Optional optional7, MusicPagesModel.LoadingState loadingState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, mpd mpd, i iVar, u0 u0Var, boolean z6, a aVar) {
        this.a = uVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = str;
        this.f = i2;
        this.g = i3;
        this.h = y3Var;
        this.i = optional4;
        this.j = optional5;
        this.k = optional6;
        this.l = optional7;
        this.m = loadingState;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = mpd;
        this.t = iVar;
        this.u = u0Var;
        this.v = z6;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public Optional<ImmutableMap<String, Boolean>> a() {
        return this.c;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public Optional<qpd> b() {
        return this.b;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public y3 c() {
        return this.h;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public Optional<Boolean> e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicPagesModel)) {
            return false;
        }
        MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
        if (!this.a.equals(musicPagesModel.m()) || !this.b.equals(musicPagesModel.b()) || !this.c.equals(musicPagesModel.a()) || !this.d.equals(musicPagesModel.p()) || !this.e.equals(musicPagesModel.t()) || this.f != musicPagesModel.x() || this.g != musicPagesModel.w() || !this.h.equals(musicPagesModel.c()) || !this.i.equals(musicPagesModel.s()) || !this.j.equals(musicPagesModel.k()) || !this.k.equals(musicPagesModel.r()) || !this.l.equals(musicPagesModel.e()) || !this.m.equals(musicPagesModel.l()) || this.n != musicPagesModel.u() || this.o != musicPagesModel.g() || this.p != musicPagesModel.i() || this.q != musicPagesModel.h() || this.r != musicPagesModel.j() || !this.s.equals(musicPagesModel.o()) || !this.t.equals(musicPagesModel.y()) || !this.u.equals(musicPagesModel.q()) || this.v != musicPagesModel.n()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public boolean g() {
        return this.o;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public boolean h() {
        return this.q;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003) ^ (this.q ? 1231 : 1237)) * 1000003) ^ (this.r ? 1231 : 1237)) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003;
        if (!this.v) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public boolean i() {
        return this.p;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public boolean j() {
        return this.r;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public Optional<Boolean> k() {
        return this.j;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public MusicPagesModel.LoadingState l() {
        return this.m;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public u m() {
        return this.a;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public boolean n() {
        return this.v;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public mpd o() {
        return this.s;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public Optional<PagePrefs> p() {
        return this.d;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public u0 q() {
        return this.u;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public Optional<Boolean> r() {
        return this.k;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public Optional<Boolean> s() {
        return this.i;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public String t() {
        return this.e;
    }

    public String toString() {
        StringBuilder V0 = je.V0("MusicPagesModel{musicPage=");
        V0.append(this.a);
        V0.append(", activeSortOption=");
        V0.append(this.b);
        V0.append(", activeFilterStates=");
        V0.append(this.c);
        V0.append(", pagePrefs=");
        V0.append(this.d);
        V0.append(", textFilter=");
        V0.append(this.e);
        V0.append(", visibleRangeStart=");
        V0.append(this.f);
        V0.append(", visibleRangeSize=");
        V0.append(this.g);
        V0.append(", dataSourceViewport=");
        V0.append(this.h);
        V0.append(", showUnavailableTracks=");
        V0.append(this.i);
        V0.append(", isOffline=");
        V0.append(this.j);
        V0.append(", showOfflinedFirst=");
        V0.append(this.k);
        V0.append(", drillDownHeaderExpanded=");
        V0.append(this.l);
        V0.append(", loadingState=");
        V0.append(this.m);
        V0.append(", textFilterVisible=");
        V0.append(this.n);
        V0.append(", hasFocus=");
        V0.append(this.o);
        V0.append(", isConsumingBackPresses=");
        V0.append(this.p);
        V0.append(", isAutomaticSortByAvailableOfflineEnabled=");
        V0.append(this.q);
        V0.append(", isFilterAndSortPulldownEnabled=");
        V0.append(this.r);
        V0.append(", optionsMenuConfiguration=");
        V0.append(this.s);
        V0.append(", yourLibraryState=");
        V0.append(this.t);
        V0.append(", playerState=");
        V0.append(this.u);
        V0.append(", onDemandEnabled=");
        return je.P0(V0, this.v, "}");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public boolean u() {
        return this.n;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public MusicPagesModel.a v() {
        return new b(this, null);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public int w() {
        return this.g;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public int x() {
        return this.f;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel
    public i y() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends MusicPagesModel.a {
        private u a;
        private Optional<qpd> b = Optional.absent();
        private Optional<ImmutableMap<String, Boolean>> c = Optional.absent();
        private Optional<PagePrefs> d = Optional.absent();
        private String e;
        private Integer f;
        private Integer g;
        private y3 h;
        private Optional<Boolean> i = Optional.absent();
        private Optional<Boolean> j = Optional.absent();
        private Optional<Boolean> k = Optional.absent();
        private Optional<Boolean> l = Optional.absent();
        private MusicPagesModel.LoadingState m;
        private Boolean n;
        private Boolean o;
        private Boolean p;
        private Boolean q;
        private Boolean r;
        private mpd s;
        private i t;
        private u0 u;
        private Boolean v;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a a(Optional<ImmutableMap<String, Boolean>> optional) {
            this.c = optional;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a b(Optional<qpd> optional) {
            this.b = optional;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel c() {
            String str = this.a == null ? " musicPage" : "";
            if (this.e == null) {
                str = je.x0(str, " textFilter");
            }
            if (this.f == null) {
                str = je.x0(str, " visibleRangeStart");
            }
            if (this.g == null) {
                str = je.x0(str, " visibleRangeSize");
            }
            if (this.h == null) {
                str = je.x0(str, " dataSourceViewport");
            }
            if (this.m == null) {
                str = je.x0(str, " loadingState");
            }
            if (this.n == null) {
                str = je.x0(str, " textFilterVisible");
            }
            if (this.o == null) {
                str = je.x0(str, " hasFocus");
            }
            if (this.p == null) {
                str = je.x0(str, " isConsumingBackPresses");
            }
            if (this.q == null) {
                str = je.x0(str, " isAutomaticSortByAvailableOfflineEnabled");
            }
            if (this.r == null) {
                str = je.x0(str, " isFilterAndSortPulldownEnabled");
            }
            if (this.s == null) {
                str = je.x0(str, " optionsMenuConfiguration");
            }
            if (this.t == null) {
                str = je.x0(str, " yourLibraryState");
            }
            if (this.u == null) {
                str = je.x0(str, " playerState");
            }
            if (this.v == null) {
                str = je.x0(str, " onDemandEnabled");
            }
            if (str.isEmpty()) {
                return new q0(this.a, this.b, this.c, this.d, this.e, this.f.intValue(), this.g.intValue(), this.h, this.i, this.j, this.k, this.l, this.m, this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.q.booleanValue(), this.r.booleanValue(), this.s, this.t, this.u, this.v.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a d(y3 y3Var) {
            if (y3Var != null) {
                this.h = y3Var;
                return this;
            }
            throw new NullPointerException("Null dataSourceViewport");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a e(Optional<Boolean> optional) {
            if (optional != null) {
                this.l = optional;
                return this;
            }
            throw new NullPointerException("Null drillDownHeaderExpanded");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a f(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a g(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a h(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a i(boolean z) {
            this.r = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a j(Optional<Boolean> optional) {
            this.j = optional;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a k(MusicPagesModel.LoadingState loadingState) {
            this.m = loadingState;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a l(u uVar) {
            if (uVar != null) {
                this.a = uVar;
                return this;
            }
            throw new NullPointerException("Null musicPage");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a m(boolean z) {
            this.v = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a n(mpd mpd) {
            if (mpd != null) {
                this.s = mpd;
                return this;
            }
            throw new NullPointerException("Null optionsMenuConfiguration");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a o(Optional<PagePrefs> optional) {
            this.d = optional;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a p(u0 u0Var) {
            if (u0Var != null) {
                this.u = u0Var;
                return this;
            }
            throw new NullPointerException("Null playerState");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a q(Optional<Boolean> optional) {
            this.k = optional;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a r(Optional<Boolean> optional) {
            this.i = optional;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a s(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null textFilter");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a t(boolean z) {
            this.n = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a u(int i2) {
            this.g = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a v(int i2) {
            this.f = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a
        public MusicPagesModel.a w(i iVar) {
            if (iVar != null) {
                this.t = iVar;
                return this;
            }
            throw new NullPointerException("Null yourLibraryState");
        }

        b(MusicPagesModel musicPagesModel, a aVar) {
            this.a = musicPagesModel.m();
            this.b = musicPagesModel.b();
            this.c = musicPagesModel.a();
            this.d = musicPagesModel.p();
            this.e = musicPagesModel.t();
            this.f = Integer.valueOf(musicPagesModel.x());
            this.g = Integer.valueOf(musicPagesModel.w());
            this.h = musicPagesModel.c();
            this.i = musicPagesModel.s();
            this.j = musicPagesModel.k();
            this.k = musicPagesModel.r();
            this.l = musicPagesModel.e();
            this.m = musicPagesModel.l();
            this.n = Boolean.valueOf(musicPagesModel.u());
            this.o = Boolean.valueOf(musicPagesModel.g());
            this.p = Boolean.valueOf(musicPagesModel.i());
            this.q = Boolean.valueOf(musicPagesModel.h());
            this.r = Boolean.valueOf(musicPagesModel.j());
            this.s = musicPagesModel.o();
            this.t = musicPagesModel.y();
            this.u = musicPagesModel.q();
            this.v = Boolean.valueOf(musicPagesModel.n());
        }
    }
}
