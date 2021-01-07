package defpackage;

import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.proto.ArtistlistResponse$Artist;
import com.spotify.music.features.profile.proto.PlaylistlistResponse$Playlist;
import defpackage.np7;
import java.util.List;

/* renamed from: kp7  reason: default package */
final class kp7 extends np7 {
    private final LoadingState b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int k;
    private final ct7 l;
    private final List<ArtistlistResponse$Artist> m;
    private final List<PlaylistlistResponse$Playlist> n;
    private final String o;
    private final int p;

    /* renamed from: kp7$b */
    static final class b extends np7.a {
        private LoadingState a;
        private String b;
        private String c;
        private String d;
        private String e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Integer j;
        private ct7 k;
        private List<ArtistlistResponse$Artist> l;
        private List<PlaylistlistResponse$Playlist> m;
        private String n;
        private Integer o;

        b() {
        }

        @Override // defpackage.np7.a
        public np7 a() {
            String str = this.a == null ? " loadingState" : "";
            if (this.b == null) {
                str = je.x0(str, " username");
            }
            if (this.c == null) {
                str = je.x0(str, " currentUserUsername");
            }
            if (this.d == null) {
                str = je.x0(str, " displayName");
            }
            if (this.f == null) {
                str = je.x0(str, " hasSpotifyImage");
            }
            if (this.g == null) {
                str = je.x0(str, " verified");
            }
            if (this.h == null) {
                str = je.x0(str, " editProfileDisabled");
            }
            if (this.i == null) {
                str = je.x0(str, " reportAbuseDisabled");
            }
            if (this.j == null) {
                str = je.x0(str, " publicPlaylistsCount");
            }
            if (this.k == null) {
                str = je.x0(str, " followState");
            }
            if (this.l == null) {
                str = je.x0(str, " recentlyPlayedArtists");
            }
            if (this.m == null) {
                str = je.x0(str, " publicPlaylists");
            }
            if (this.n == null) {
                str = je.x0(str, " reportAbuseUrl");
            }
            if (this.o == null) {
                str = je.x0(str, " color");
            }
            if (str.isEmpty()) {
                return new kp7(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.intValue(), this.k, this.l, this.m, this.n, this.o.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.np7.a
        public np7.a b(int i2) {
            this.o = Integer.valueOf(i2);
            return this;
        }

        @Override // defpackage.np7.a
        public np7.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null currentUserUsername");
        }

        @Override // defpackage.np7.a
        public np7.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }

        @Override // defpackage.np7.a
        public np7.a e(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.np7.a
        public np7.a f(ct7 ct7) {
            if (ct7 != null) {
                this.k = ct7;
                return this;
            }
            throw new NullPointerException("Null followState");
        }

        @Override // defpackage.np7.a
        public np7.a g(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.np7.a
        public np7.a h(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.np7.a
        public np7.a i(LoadingState loadingState) {
            this.a = loadingState;
            return this;
        }

        @Override // defpackage.np7.a
        public np7.a j(List<PlaylistlistResponse$Playlist> list) {
            if (list != null) {
                this.m = list;
                return this;
            }
            throw new NullPointerException("Null publicPlaylists");
        }

        @Override // defpackage.np7.a
        public np7.a k(int i2) {
            this.j = Integer.valueOf(i2);
            return this;
        }

        @Override // defpackage.np7.a
        public np7.a l(List<ArtistlistResponse$Artist> list) {
            if (list != null) {
                this.l = list;
                return this;
            }
            throw new NullPointerException("Null recentlyPlayedArtists");
        }

        @Override // defpackage.np7.a
        public np7.a m(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.np7.a
        public np7.a n(String str) {
            this.n = str;
            return this;
        }

        @Override // defpackage.np7.a
        public np7.a o(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }

        @Override // defpackage.np7.a
        public np7.a p(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        b(np7 np7, a aVar) {
            this.a = np7.h();
            this.b = np7.o();
            this.c = np7.b();
            this.d = np7.c();
            this.e = np7.g();
            this.f = Boolean.valueOf(np7.f());
            this.g = Boolean.valueOf(np7.p());
            this.h = Boolean.valueOf(np7.d());
            this.i = Boolean.valueOf(np7.l());
            this.j = Integer.valueOf(np7.j());
            this.k = np7.e();
            this.l = np7.k();
            this.m = np7.i();
            this.n = np7.m();
            this.o = Integer.valueOf(np7.a());
        }
    }

    kp7(LoadingState loadingState, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, int i2, ct7 ct7, List list, List list2, String str5, int i3, a aVar) {
        this.b = loadingState;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = i2;
        this.l = ct7;
        this.m = list;
        this.n = list2;
        this.o = str5;
        this.p = i3;
    }

    @Override // defpackage.np7
    public int a() {
        return this.p;
    }

    @Override // defpackage.np7
    public String b() {
        return this.d;
    }

    @Override // defpackage.np7
    public String c() {
        return this.e;
    }

    @Override // defpackage.np7
    public boolean d() {
        return this.i;
    }

    @Override // defpackage.np7
    public ct7 e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof np7)) {
            return false;
        }
        np7 np7 = (np7) obj;
        if (!this.b.equals(np7.h()) || !this.c.equals(np7.o()) || !this.d.equals(np7.b()) || !this.e.equals(np7.c()) || ((str = this.f) != null ? !str.equals(np7.g()) : np7.g() != null) || this.g != np7.f() || this.h != np7.p() || this.i != np7.d() || this.j != np7.l() || this.k != np7.j() || !this.l.equals(np7.e()) || !this.m.equals(np7.k()) || !this.n.equals(np7.i()) || !this.o.equals(np7.m()) || this.p != np7.a()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.np7
    public boolean f() {
        return this.g;
    }

    @Override // defpackage.np7
    public String g() {
        return this.f;
    }

    @Override // defpackage.np7
    public LoadingState h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int i2 = 1231;
        int hashCode2 = (((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003;
        if (!this.j) {
            i2 = 1237;
        }
        return ((((((((((((hashCode2 ^ i2) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p;
    }

    @Override // defpackage.np7
    public List<PlaylistlistResponse$Playlist> i() {
        return this.n;
    }

    @Override // defpackage.np7
    public int j() {
        return this.k;
    }

    @Override // defpackage.np7
    public List<ArtistlistResponse$Artist> k() {
        return this.m;
    }

    @Override // defpackage.np7
    public boolean l() {
        return this.j;
    }

    @Override // defpackage.np7
    public String m() {
        return this.o;
    }

    @Override // defpackage.np7
    public np7.a n() {
        return new b(this, null);
    }

    @Override // defpackage.np7
    public String o() {
        return this.c;
    }

    @Override // defpackage.np7
    public boolean p() {
        return this.h;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ProfileEntityDataModel{loadingState=");
        V0.append(this.b);
        V0.append(", username=");
        V0.append(this.c);
        V0.append(", currentUserUsername=");
        V0.append(this.d);
        V0.append(", displayName=");
        V0.append(this.e);
        V0.append(", imageUrl=");
        V0.append(this.f);
        V0.append(", hasSpotifyImage=");
        V0.append(this.g);
        V0.append(", verified=");
        V0.append(this.h);
        V0.append(", editProfileDisabled=");
        V0.append(this.i);
        V0.append(", reportAbuseDisabled=");
        V0.append(this.j);
        V0.append(", publicPlaylistsCount=");
        V0.append(this.k);
        V0.append(", followState=");
        V0.append(this.l);
        V0.append(", recentlyPlayedArtists=");
        V0.append(this.m);
        V0.append(", publicPlaylists=");
        V0.append(this.n);
        V0.append(", reportAbuseUrl=");
        V0.append(this.o);
        V0.append(", color=");
        return je.B0(V0, this.p, "}");
    }
}
