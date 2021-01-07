package defpackage;

import com.spotify.playlist.models.Episode;
import defpackage.t06;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: s06  reason: default package */
public final class s06 extends t06 {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final String f;
    private final Episode.MediaType g;
    private final Map<String, String> h;

    /* access modifiers changed from: package-private */
    /* renamed from: s06$b */
    public static final class b implements t06.a {
        private String a;
        private String b;
        private Boolean c;
        private Boolean d;
        private Integer e;
        private String f;
        private Episode.MediaType g;
        private Map<String, String> h;

        b() {
        }

        public t06.a a(Map<String, String> map) {
            if (map != null) {
                this.h = map;
                return this;
            }
            throw new NullPointerException("Null additionalMetadata");
        }

        public t06 b() {
            String str = this.a == null ? " uri" : "";
            if (this.b == null) {
                str = je.x0(str, " name");
            }
            if (this.c == null) {
                str = je.x0(str, " canRemoveFromPlaylist");
            }
            if (this.d == null) {
                str = je.x0(str, " canBanFromPlaylist");
            }
            if (this.e == null) {
                str = je.x0(str, " index");
            }
            if (this.h == null) {
                str = je.x0(str, " additionalMetadata");
            }
            if (str.isEmpty()) {
                return new s06(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.intValue(), this.f, this.g, this.h, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public t06.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public t06.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public t06.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        public t06.a f(Episode.MediaType mediaType) {
            this.g = mediaType;
            return this;
        }

        public t06.a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public t06.a h(String str) {
            this.f = str;
            return this;
        }

        public t06.a i(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    s06(String str, String str2, boolean z, boolean z2, int i, String str3, Episode.MediaType mediaType, Map map, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = str3;
        this.g = mediaType;
        this.h = map;
    }

    @Override // defpackage.t06
    public Map<String, String> b() {
        return this.h;
    }

    @Override // defpackage.t06
    public int c() {
        return this.e;
    }

    @Override // defpackage.t06
    public Episode.MediaType d() {
        return this.g;
    }

    @Override // defpackage.t06
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        Episode.MediaType mediaType;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t06)) {
            return false;
        }
        t06 t06 = (t06) obj;
        if (!this.a.equals(t06.g()) || !this.b.equals(t06.e()) || this.c != t06.i() || this.d != t06.h() || this.e != t06.c() || ((str = this.f) != null ? !str.equals(t06.f()) : t06.f() != null) || ((mediaType = this.g) != null ? !mediaType.equals(t06.d()) : t06.d() != null) || !this.h.equals(t06.b())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.t06
    public String f() {
        return this.f;
    }

    @Override // defpackage.t06
    public String g() {
        return this.a;
    }

    @Override // defpackage.t06
    public boolean h() {
        return this.d;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        int i2 = (((hashCode ^ i) * 1000003) ^ this.e) * 1000003;
        String str = this.f;
        int i3 = 0;
        int hashCode2 = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Episode.MediaType mediaType = this.g;
        if (mediaType != null) {
            i3 = mediaType.hashCode();
        }
        return ((hashCode2 ^ i3) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.t06
    public boolean i() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextMenuItem{uri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", canRemoveFromPlaylist=");
        V0.append(this.c);
        V0.append(", canBanFromPlaylist=");
        V0.append(this.d);
        V0.append(", index=");
        V0.append(this.e);
        V0.append(", rowId=");
        V0.append(this.f);
        V0.append(", mediaType=");
        V0.append(this.g);
        V0.append(", additionalMetadata=");
        return je.M0(V0, this.h, "}");
    }
}
