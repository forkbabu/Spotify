package defpackage;

import defpackage.td3;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: rd3  reason: default package */
public abstract class rd3 extends td3.a {
    private final String a;
    private final String b;
    private final String c;
    private final boolean f;
    private final boolean n;
    private final boolean o;
    private final Boolean p;
    private final String q;
    private final String r;
    private final List<String> s;
    private final String t;
    private final String u;

    /* renamed from: rd3$b */
    static class b implements td3.a.AbstractC0684a {
        private String a;
        private String b;
        private String c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private String h;
        private String i;
        private List<String> j;
        private String k;
        private String l;

        b(td3.a aVar, a aVar2) {
            rd3 rd3 = (rd3) aVar;
            this.a = rd3.getUri();
            this.b = rd3.getName();
            this.c = rd3.getPreviewId();
            this.d = Boolean.valueOf(rd3.isExplicit());
            this.e = Boolean.valueOf(rd3.N1());
            this.f = Boolean.valueOf(rd3.m1());
            this.g = rd3.k0();
            this.h = rd3.b();
            this.i = rd3.c();
            this.j = rd3.x1();
            this.k = rd3.getImageUri();
            this.l = rd3.i2();
        }

        /* Return type fixed from 'com.spotify.music.freetiercommon.models.a' to match base method */
        @Override // com.spotify.music.freetiercommon.models.a.AbstractC0274a
        public td3.a build() {
            String str = this.a == null ? " uri" : "";
            if (this.b == null) {
                str = je.x0(str, " name");
            }
            if (this.c == null) {
                str = je.x0(str, " previewId");
            }
            if (this.d == null) {
                str = je.x0(str, " explicit");
            }
            if (this.e == null) {
                str = je.x0(str, " hearted");
            }
            if (this.f == null) {
                str = je.x0(str, " banned");
            }
            if (this.h == null) {
                str = je.x0(str, " albumName");
            }
            if (this.i == null) {
                str = je.x0(str, " artistName");
            }
            if (this.j == null) {
                str = je.x0(str, " artistNames");
            }
            if (this.k == null) {
                str = je.x0(str, " imageUri");
            }
            if (str.isEmpty()) {
                return new sd3(this.a, this.b, this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* Return type fixed from 'com.spotify.music.freetiercommon.models.a$a' to match base method */
        @Override // com.spotify.music.freetiercommon.models.a.AbstractC0274a
        public td3.a.AbstractC0684a h(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        /* Return type fixed from 'com.spotify.music.freetiercommon.models.a$a' to match base method */
        @Override // com.spotify.music.freetiercommon.models.a.AbstractC0274a
        public td3.a.AbstractC0684a i(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    rd3(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Boolean bool, String str4, String str5, List<String> list, String str6, String str7) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.f = z;
                    this.n = z2;
                    this.o = z3;
                    this.p = bool;
                    if (str4 != null) {
                        this.q = str4;
                        if (str5 != null) {
                            this.r = str5;
                            if (list != null) {
                                this.s = list;
                                if (str6 != null) {
                                    this.t = str6;
                                    this.u = str7;
                                    return;
                                }
                                throw new NullPointerException("Null imageUri");
                            }
                            throw new NullPointerException("Null artistNames");
                        }
                        throw new NullPointerException("Null artistName");
                    }
                    throw new NullPointerException("Null albumName");
                }
                throw new NullPointerException("Null previewId");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.spotify.music.freetiercommon.models.a
    public boolean N1() {
        return this.n;
    }

    @Override // defpackage.td3.a
    public td3.a.AbstractC0684a a() {
        return new b(this, null);
    }

    public String b() {
        return this.q;
    }

    public String c() {
        return this.r;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof td3.a)) {
            return false;
        }
        td3.a aVar = (td3.a) obj;
        if (this.a.equals(((rd3) aVar).a)) {
            rd3 rd3 = (rd3) aVar;
            if (this.b.equals(rd3.b) && this.c.equals(rd3.c) && this.f == rd3.f && this.n == rd3.n && this.o == rd3.o && ((bool = this.p) != null ? bool.equals(rd3.p) : rd3.p == null) && this.q.equals(rd3.q) && this.r.equals(rd3.r) && this.s.equals(rd3.s) && this.t.equals(rd3.t)) {
                String str = this.u;
                if (str == null) {
                    if (rd3.u == null) {
                        return true;
                    }
                } else if (str.equals(rd3.u)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.spotify.music.freetiercommon.models.a
    public String getImageUri() {
        return this.t;
    }

    @Override // com.spotify.music.freetiercommon.models.a
    public String getName() {
        return this.b;
    }

    @Override // com.spotify.music.freetiercommon.models.a
    public String getPreviewId() {
        return this.c;
    }

    @Override // com.spotify.music.freetiercommon.models.a
    public String getUri() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003;
        if (!this.o) {
            i = 1237;
        }
        int i2 = (hashCode ^ i) * 1000003;
        Boolean bool = this.p;
        int i3 = 0;
        int hashCode2 = (((((((((i2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003;
        String str = this.u;
        if (str != null) {
            i3 = str.hashCode();
        }
        return hashCode2 ^ i3;
    }

    @Override // com.spotify.music.freetiercommon.models.a
    public String i2() {
        return this.u;
    }

    @Override // com.spotify.music.freetiercommon.models.a
    public boolean isExplicit() {
        return this.f;
    }

    @Override // com.spotify.music.freetiercommon.models.a
    public Boolean k0() {
        return this.p;
    }

    @Override // com.spotify.music.freetiercommon.models.a
    public boolean m1() {
        return this.o;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("HubTrack{uri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", previewId=");
        V0.append(this.c);
        V0.append(", explicit=");
        V0.append(this.f);
        V0.append(", hearted=");
        V0.append(this.n);
        V0.append(", banned=");
        V0.append(this.o);
        V0.append(", currentlyPlayable=");
        V0.append(this.p);
        V0.append(", albumName=");
        V0.append(this.q);
        V0.append(", artistName=");
        V0.append(this.r);
        V0.append(", artistNames=");
        V0.append(this.s);
        V0.append(", imageUri=");
        V0.append(this.t);
        V0.append(", rowId=");
        return je.I0(V0, this.u, "}");
    }

    @Override // com.spotify.music.freetiercommon.models.a
    public List<String> x1() {
        return this.s;
    }
}
