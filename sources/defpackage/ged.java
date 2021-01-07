package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.models.Participant;
import defpackage.jed;

/* renamed from: ged  reason: default package */
final class ged extends jed {
    private final Optional<ImmutableList<Participant>> b;
    private final Optional<String> c;
    private final String d;
    private final String e;
    private final boolean f;
    private final int g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final Optional<String> m;
    private final Optional<Integer> n;

    ged(Optional optional, Optional optional2, String str, String str2, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Optional optional3, Optional optional4, a aVar) {
        this.b = optional;
        this.c = optional2;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = i2;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = optional3;
        this.n = optional4;
    }

    @Override // defpackage.jed
    public boolean a() {
        return this.k;
    }

    @Override // defpackage.jed
    public boolean b() {
        return this.f;
    }

    @Override // defpackage.jed
    public String c() {
        return this.d;
    }

    @Override // defpackage.jed
    public String d() {
        return this.e;
    }

    @Override // defpackage.jed
    public int e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jed)) {
            return false;
        }
        jed jed = (jed) obj;
        if (this.b.equals(jed.f()) && this.c.equals(jed.n()) && this.d.equals(jed.c()) && this.e.equals(jed.d()) && this.f == jed.b() && this.g == jed.e() && this.h == jed.i() && this.i == jed.j() && this.j == jed.l() && this.k == jed.a() && this.l == jed.k() && this.m.equals(jed.h()) && this.n.equals(jed.g())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jed
    public Optional<ImmutableList<Participant>> f() {
        return this.b;
    }

    @Override // defpackage.jed
    public Optional<Integer> g() {
        return this.n;
    }

    @Override // defpackage.jed
    public Optional<String> h() {
        return this.m;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003;
        if (!this.l) {
            i2 = 1237;
        }
        return ((((hashCode ^ i2) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    @Override // defpackage.jed
    public boolean i() {
        return this.h;
    }

    @Override // defpackage.jed
    public boolean j() {
        return this.i;
    }

    @Override // defpackage.jed
    public boolean k() {
        return this.l;
    }

    @Override // defpackage.jed
    public boolean l() {
        return this.j;
    }

    @Override // defpackage.jed
    public jed.a m() {
        return new b(this, null);
    }

    @Override // defpackage.jed
    public Optional<String> n() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ParticipantListViewModel{participants=");
        V0.append(this.b);
        V0.append(", username=");
        V0.append(this.c);
        V0.append(", joinToken=");
        V0.append(this.d);
        V0.append(", joinUri=");
        V0.append(this.e);
        V0.append(", isClosing=");
        V0.append(this.f);
        V0.append(", multiOutputMaxNumberOfParticipants=");
        V0.append(this.g);
        V0.append(", sessionShared=");
        V0.append(this.h);
        V0.append(", showInviteSection=");
        V0.append(this.i);
        V0.append(", showToolbarInviteButton=");
        V0.append(this.j);
        V0.append(", inviteAlwaysEnabled=");
        V0.append(this.k);
        V0.append(", showScannable=");
        V0.append(this.l);
        V0.append(", scannableImageUrl=");
        V0.append(this.m);
        V0.append(", scannableBgColor=");
        return je.F0(V0, this.n, "}");
    }

    /* renamed from: ged$b */
    static final class b extends jed.a {
        private Optional<ImmutableList<Participant>> a = Optional.absent();
        private Optional<String> b = Optional.absent();
        private String c;
        private String d;
        private Boolean e;
        private Integer f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Optional<String> l = Optional.absent();
        private Optional<Integer> m = Optional.absent();

        b() {
        }

        @Override // defpackage.jed.a
        public jed a() {
            String str = this.c == null ? " joinToken" : "";
            if (this.d == null) {
                str = je.x0(str, " joinUri");
            }
            if (this.e == null) {
                str = je.x0(str, " isClosing");
            }
            if (this.f == null) {
                str = je.x0(str, " multiOutputMaxNumberOfParticipants");
            }
            if (this.g == null) {
                str = je.x0(str, " sessionShared");
            }
            if (this.h == null) {
                str = je.x0(str, " showInviteSection");
            }
            if (this.i == null) {
                str = je.x0(str, " showToolbarInviteButton");
            }
            if (this.j == null) {
                str = je.x0(str, " inviteAlwaysEnabled");
            }
            if (this.k == null) {
                str = je.x0(str, " showScannable");
            }
            if (str.isEmpty()) {
                return new ged(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.intValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l, this.m, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.jed.a
        public jed.a b(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.jed.a
        public jed.a c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.jed.a
        public jed.a d(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null joinToken");
        }

        @Override // defpackage.jed.a
        public jed.a e(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null joinUri");
        }

        @Override // defpackage.jed.a
        public jed.a f(int i2) {
            this.f = Integer.valueOf(i2);
            return this;
        }

        @Override // defpackage.jed.a
        public jed.a g(Optional<ImmutableList<Participant>> optional) {
            this.a = optional;
            return this;
        }

        @Override // defpackage.jed.a
        public jed.a h(Optional<Integer> optional) {
            this.m = optional;
            return this;
        }

        @Override // defpackage.jed.a
        public jed.a i(Optional<String> optional) {
            this.l = optional;
            return this;
        }

        @Override // defpackage.jed.a
        public jed.a j(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.jed.a
        public jed.a k(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.jed.a
        public jed.a l(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.jed.a
        public jed.a m(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.jed.a
        public jed.a n(Optional<String> optional) {
            this.b = optional;
            return this;
        }

        b(jed jed, a aVar) {
            this.a = jed.f();
            this.b = jed.n();
            this.c = jed.c();
            this.d = jed.d();
            this.e = Boolean.valueOf(jed.b());
            this.f = Integer.valueOf(jed.e());
            this.g = Boolean.valueOf(jed.i());
            this.h = Boolean.valueOf(jed.j());
            this.i = Boolean.valueOf(jed.l());
            this.j = Boolean.valueOf(jed.a());
            this.k = Boolean.valueOf(jed.k());
            this.l = jed.h();
            this.m = jed.g();
        }
    }
}
