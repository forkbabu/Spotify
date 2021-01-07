package com.spotify.music.features.yourlibrary.musicpages.pages;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.pages.u;

final class n extends u {
    private final MusicPageId a;
    private final Optional<String> b;
    private final String c;
    private final di9 d;
    private final qpd e;
    private final ImmutableMap<String, Boolean> f;
    private final String g;
    private final CharSequence h;
    private final String i;
    private final CharSequence j;
    private final String k;
    private final EmptyPageAction l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final PageAction q;
    private final String r;

    n(MusicPageId musicPageId, Optional optional, String str, di9 di9, qpd qpd, ImmutableMap immutableMap, String str2, CharSequence charSequence, String str3, CharSequence charSequence2, String str4, EmptyPageAction emptyPageAction, boolean z, boolean z2, boolean z3, boolean z4, PageAction pageAction, String str5, a aVar) {
        this.a = musicPageId;
        this.b = optional;
        this.c = str;
        this.d = di9;
        this.e = qpd;
        this.f = immutableMap;
        this.g = str2;
        this.h = charSequence;
        this.i = str3;
        this.j = charSequence2;
        this.k = str4;
        this.l = emptyPageAction;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = pageAction;
        this.r = str5;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public ImmutableMap<String, Boolean> b() {
        return this.f;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public qpd c() {
        return this.e;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public String d() {
        return this.k;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public EmptyPageAction e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.a.equals(uVar.k()) || !this.b.equals(uVar.t()) || !this.c.equals(uVar.r()) || !this.d.equals(uVar.h()) || !this.e.equals(uVar.c()) || !this.f.equals(uVar.b()) || !this.g.equals(uVar.j()) || !this.h.equals(uVar.i()) || !this.i.equals(uVar.g()) || !this.j.equals(uVar.f()) || !this.k.equals(uVar.d()) || !this.l.equals(uVar.e()) || this.m != uVar.o() || this.n != uVar.n() || this.o != uVar.p() || this.p != uVar.q() || !this.q.equals(uVar.l()) || !this.r.equals(uVar.m())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public CharSequence f() {
        return this.j;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public String g() {
        return this.i;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public di9 h() {
        return this.d;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003;
        if (!this.p) {
            i2 = 1237;
        }
        return ((((hashCode ^ i2) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public CharSequence i() {
        return this.h;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public String j() {
        return this.g;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public MusicPageId k() {
        return this.a;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public PageAction l() {
        return this.q;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public String m() {
        return this.r;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public boolean n() {
        return this.n;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public boolean o() {
        return this.m;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public boolean p() {
        return this.o;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public boolean q() {
        return this.p;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public String r() {
        return this.c;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public u.a s() {
        return new b(this, null);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u
    public Optional<String> t() {
        return this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("MusicPage{id=");
        V0.append(this.a);
        V0.append(", uri=");
        V0.append(this.b);
        V0.append(", title=");
        V0.append(this.c);
        V0.append(", filterAndSortConfiguration=");
        V0.append(this.d);
        V0.append(", defaultSortOption=");
        V0.append(this.e);
        V0.append(", defaultFilterStates=");
        V0.append(this.f);
        V0.append(", filterEmptyTitle=");
        V0.append(this.g);
        V0.append(", filterEmptySubtitle=");
        V0.append((Object) this.h);
        V0.append(", emptyTitle=");
        V0.append(this.i);
        V0.append(", emptySubtitle=");
        V0.append((Object) this.j);
        V0.append(", emptyActionText=");
        V0.append(this.k);
        V0.append(", emptyPageAction=");
        V0.append(this.l);
        V0.append(", showTextFilterOption=");
        V0.append(this.m);
        V0.append(", showSortOption=");
        V0.append(this.n);
        V0.append(", showTextFilterOptions=");
        V0.append(this.o);
        V0.append(", showToggleFilterOptions=");
        V0.append(this.p);
        V0.append(", pageAction=");
        V0.append(this.q);
        V0.append(", pageActionText=");
        return je.I0(V0, this.r, "}");
    }

    /* access modifiers changed from: package-private */
    public static final class b extends u.a {
        private MusicPageId a;
        private Optional<String> b = Optional.absent();
        private String c;
        private di9 d;
        private qpd e;
        private ImmutableMap<String, Boolean> f;
        private String g;
        private CharSequence h;
        private String i;
        private CharSequence j;
        private String k;
        private EmptyPageAction l;
        private Boolean m;
        private Boolean n;
        private Boolean o;
        private Boolean p;
        private PageAction q;
        private String r;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u a() {
            String str = this.a == null ? " id" : "";
            if (this.c == null) {
                str = je.x0(str, " title");
            }
            if (this.d == null) {
                str = je.x0(str, " filterAndSortConfiguration");
            }
            if (this.e == null) {
                str = je.x0(str, " defaultSortOption");
            }
            if (this.f == null) {
                str = je.x0(str, " defaultFilterStates");
            }
            if (this.g == null) {
                str = je.x0(str, " filterEmptyTitle");
            }
            if (this.h == null) {
                str = je.x0(str, " filterEmptySubtitle");
            }
            if (this.i == null) {
                str = je.x0(str, " emptyTitle");
            }
            if (this.j == null) {
                str = je.x0(str, " emptySubtitle");
            }
            if (this.k == null) {
                str = je.x0(str, " emptyActionText");
            }
            if (this.l == null) {
                str = je.x0(str, " emptyPageAction");
            }
            if (this.m == null) {
                str = je.x0(str, " showTextFilterOption");
            }
            if (this.n == null) {
                str = je.x0(str, " showSortOption");
            }
            if (this.o == null) {
                str = je.x0(str, " showTextFilterOptions");
            }
            if (this.p == null) {
                str = je.x0(str, " showToggleFilterOptions");
            }
            if (this.q == null) {
                str = je.x0(str, " pageAction");
            }
            if (this.r == null) {
                str = je.x0(str, " pageActionText");
            }
            if (str.isEmpty()) {
                return new n(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.q, this.r, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a b(ImmutableMap<String, Boolean> immutableMap) {
            this.f = immutableMap;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a c(qpd qpd) {
            this.e = qpd;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a d(String str) {
            if (str != null) {
                this.k = str;
                return this;
            }
            throw new NullPointerException("Null emptyActionText");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a e(EmptyPageAction emptyPageAction) {
            this.l = emptyPageAction;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a f(CharSequence charSequence) {
            if (charSequence != null) {
                this.j = charSequence;
                return this;
            }
            throw new NullPointerException("Null emptySubtitle");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a g(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null emptyTitle");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a h(di9 di9) {
            if (di9 != null) {
                this.d = di9;
                return this;
            }
            throw new NullPointerException("Null filterAndSortConfiguration");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a i(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a j(String str) {
            this.g = str;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a k(MusicPageId musicPageId) {
            if (musicPageId != null) {
                this.a = musicPageId;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a l(PageAction pageAction) {
            this.q = pageAction;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a m(String str) {
            if (str != null) {
                this.r = str;
                return this;
            }
            throw new NullPointerException("Null pageActionText");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a n(boolean z) {
            this.n = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a o(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a p(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a q(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a r(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.u.a
        public u.a s(Optional<String> optional) {
            this.b = optional;
            return this;
        }

        b(u uVar, a aVar) {
            this.a = uVar.k();
            this.b = uVar.t();
            this.c = uVar.r();
            this.d = uVar.h();
            this.e = uVar.c();
            this.f = uVar.b();
            this.g = uVar.j();
            this.h = uVar.i();
            this.i = uVar.g();
            this.j = uVar.f();
            this.k = uVar.d();
            this.l = uVar.e();
            this.m = Boolean.valueOf(uVar.o());
            this.n = Boolean.valueOf(uVar.n());
            this.o = Boolean.valueOf(uVar.p());
            this.p = Boolean.valueOf(uVar.q());
            this.q = uVar.l();
            this.r = uVar.m();
        }
    }
}
