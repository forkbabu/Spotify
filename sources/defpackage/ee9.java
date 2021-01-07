package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.libs.assistedcuration.model.RecsTrack;
import defpackage.ie9;

/* renamed from: ee9  reason: default package */
final class ee9 extends ie9 {
    private final String b;
    private final int c;
    private final boolean d;
    private final ImmutableList<String> e;
    private final ImmutableList<RecsTrack> f;
    private final ImmutableList<MusicItem> g;
    private final ImmutableList<MusicItem> h;
    private final Optional<Boolean> i;

    ee9(String str, int i2, boolean z, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, Optional optional, a aVar) {
        this.b = str;
        this.c = i2;
        this.d = z;
        this.e = immutableList;
        this.f = immutableList2;
        this.g = immutableList3;
        this.h = immutableList4;
        this.i = optional;
    }

    @Override // defpackage.ie9
    public Optional<Boolean> a() {
        return this.i;
    }

    @Override // defpackage.ie9
    public String b() {
        return this.b;
    }

    @Override // defpackage.ie9
    public ImmutableList<MusicItem> c() {
        return this.g;
    }

    @Override // defpackage.ie9
    public int d() {
        return this.c;
    }

    @Override // defpackage.ie9
    public ImmutableList<RecsTrack> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ie9)) {
            return false;
        }
        ie9 ie9 = (ie9) obj;
        if (!this.b.equals(ie9.b()) || this.c != ie9.d() || this.d != ie9.g() || !this.e.equals(ie9.h()) || !this.f.equals(ie9.e()) || !this.g.equals(ie9.c()) || !this.h.equals(ie9.f()) || !this.i.equals(ie9.a())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ie9
    public ImmutableList<MusicItem> f() {
        return this.h;
    }

    @Override // defpackage.ie9
    public boolean g() {
        return this.d;
    }

    @Override // defpackage.ie9
    public ImmutableList<String> h() {
        return this.e;
    }

    public int hashCode() {
        return ((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.ie9
    public ie9.a i() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("RecsDataSourceModel{contextUri=");
        V0.append(this.b);
        V0.append(", fillUpToCount=");
        V0.append(this.c);
        V0.append(", recsRequested=");
        V0.append(this.d);
        V0.append(", sourceTrackUris=");
        V0.append(this.e);
        V0.append(", rawRecs=");
        V0.append(this.f);
        V0.append(", decoratedRecs=");
        V0.append(this.g);
        V0.append(", recs=");
        V0.append(this.h);
        V0.append(", connected=");
        return je.F0(V0, this.i, "}");
    }

    /* renamed from: ee9$b */
    static final class b extends ie9.a {
        private String a;
        private Integer b;
        private Boolean c;
        private ImmutableList<String> d;
        private ImmutableList<RecsTrack> e;
        private ImmutableList<MusicItem> f;
        private ImmutableList<MusicItem> g;
        private Optional<Boolean> h = Optional.absent();

        b() {
        }

        @Override // defpackage.ie9.a
        public ie9 a() {
            String str = this.a == null ? " contextUri" : "";
            if (this.b == null) {
                str = je.x0(str, " fillUpToCount");
            }
            if (this.c == null) {
                str = je.x0(str, " recsRequested");
            }
            if (this.d == null) {
                str = je.x0(str, " sourceTrackUris");
            }
            if (this.e == null) {
                str = je.x0(str, " rawRecs");
            }
            if (this.f == null) {
                str = je.x0(str, " decoratedRecs");
            }
            if (this.g == null) {
                str = je.x0(str, " recs");
            }
            if (str.isEmpty()) {
                return new ee9(this.a, this.b.intValue(), this.c.booleanValue(), this.d, this.e, this.f, this.g, this.h, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.ie9.a
        public ie9.a b(Optional<Boolean> optional) {
            this.h = optional;
            return this;
        }

        @Override // defpackage.ie9.a
        public ie9.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        @Override // defpackage.ie9.a
        public ie9.a d(ImmutableList<MusicItem> immutableList) {
            if (immutableList != null) {
                this.f = immutableList;
                return this;
            }
            throw new NullPointerException("Null decoratedRecs");
        }

        @Override // defpackage.ie9.a
        public ie9.a e(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.ie9.a
        public ie9.a f(ImmutableList<RecsTrack> immutableList) {
            if (immutableList != null) {
                this.e = immutableList;
                return this;
            }
            throw new NullPointerException("Null rawRecs");
        }

        @Override // defpackage.ie9.a
        public ie9.a g(ImmutableList<MusicItem> immutableList) {
            if (immutableList != null) {
                this.g = immutableList;
                return this;
            }
            throw new NullPointerException("Null recs");
        }

        @Override // defpackage.ie9.a
        public ie9.a h(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.ie9.a
        public ie9.a i(ImmutableList<String> immutableList) {
            if (immutableList != null) {
                this.d = immutableList;
                return this;
            }
            throw new NullPointerException("Null sourceTrackUris");
        }

        b(ie9 ie9, a aVar) {
            this.a = ie9.b();
            this.b = Integer.valueOf(ie9.d());
            this.c = Boolean.valueOf(ie9.g());
            this.d = ie9.h();
            this.e = ie9.e();
            this.f = ie9.c();
            this.g = ie9.f();
            this.h = ie9.a();
        }
    }
}
