package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import defpackage.t45;
import java.util.List;
import java.util.Map;

/* renamed from: s45  reason: default package */
final class s45 extends t45 {
    private final String a;
    private final List<com.spotify.music.freetiercommon.models.a> b;
    private final Map<String, CollectionStateProvider.a> c;
    private final boolean d;

    /* access modifiers changed from: package-private */
    /* renamed from: s45$b */
    public static final class b implements t45.a {
        private String a;
        private List<com.spotify.music.freetiercommon.models.a> b;
        private Map<String, CollectionStateProvider.a> c;
        private Boolean d;

        b() {
        }

        @Override // defpackage.t45.a
        public t45.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        @Override // defpackage.t45.a
        public t45.a b(Map<String, CollectionStateProvider.a> map) {
            if (map != null) {
                this.c = map;
                return this;
            }
            throw new NullPointerException("Null collectionStateMap");
        }

        @Override // defpackage.t45.a
        public t45 build() {
            String str = this.a == null ? " title" : "";
            if (this.b == null) {
                str = je.x0(str, " tracks");
            }
            if (this.c == null) {
                str = je.x0(str, " collectionStateMap");
            }
            if (this.d == null) {
                str = je.x0(str, " shouldDisableExplicitContent");
            }
            if (str.isEmpty()) {
                return new s45(this.a, this.b, this.c, this.d.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.t45.a
        public t45.a c(List<com.spotify.music.freetiercommon.models.a> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null tracks");
        }

        @Override // defpackage.t45.a
        public t45.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        b(t45 t45, a aVar) {
            this.a = t45.c();
            this.b = t45.d();
            this.c = t45.b();
            this.d = Boolean.valueOf(t45.e());
        }
    }

    s45(String str, List list, Map map, boolean z, a aVar) {
        this.a = str;
        this.b = list;
        this.c = map;
        this.d = z;
    }

    @Override // defpackage.t45
    public Map<String, CollectionStateProvider.a> b() {
        return this.c;
    }

    @Override // defpackage.t45
    public String c() {
        return this.a;
    }

    @Override // defpackage.t45
    public List<com.spotify.music.freetiercommon.models.a> d() {
        return this.b;
    }

    @Override // defpackage.t45
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t45)) {
            return false;
        }
        t45 t45 = (t45) obj;
        if (!this.a.equals(t45.c()) || !this.b.equals(t45.d()) || !this.c.equals(t45.b()) || this.d != t45.e()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.t45
    public t45.a f() {
        return new b(this, null);
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("FreeTierTracksData{title=");
        V0.append(this.a);
        V0.append(", tracks=");
        V0.append(this.b);
        V0.append(", collectionStateMap=");
        V0.append(this.c);
        V0.append(", shouldDisableExplicitContent=");
        return je.P0(V0, this.d, "}");
    }
}
