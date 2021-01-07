package com.spotify.music.features.editplaylist.operations;

import android.net.Uri;
import com.spotify.music.features.editplaylist.operations.u;
import com.spotify.playlist.models.l;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class a extends u {
    private final String a;
    private final Uri b;
    private final String c;
    private final List<l> f;
    private final boolean n;
    private final boolean o;
    private final boolean p;

    /* access modifiers changed from: package-private */
    public static class b implements u.a {
        private String a;
        private Uri b;
        private String c;
        private List<l> d;
        private Boolean e;
        private Boolean f;
        private Boolean g;

        b(u uVar, C0227a aVar) {
            this.a = uVar.i();
            this.b = uVar.c();
            this.c = uVar.b();
            this.d = uVar.h();
            this.e = Boolean.valueOf(uVar.e());
            this.f = Boolean.valueOf(uVar.f());
            this.g = Boolean.valueOf(uVar.g());
        }

        public u a() {
            String str = this.a == null ? " name" : "";
            if (this.b == null) {
                str = je.x0(str, " image");
            }
            if (this.c == null) {
                str = je.x0(str, " description");
            }
            if (this.d == null) {
                str = je.x0(str, " items");
            }
            if (this.e == null) {
                str = je.x0(str, " isCollaborative");
            }
            if (this.f == null) {
                str = je.x0(str, " isOwnBySelf");
            }
            if (this.g == null) {
                str = je.x0(str, " isPictureAnnotated");
            }
            if (str.isEmpty()) {
                return new o(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public u.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null description");
        }

        public u.a c(Uri uri) {
            if (uri != null) {
                this.b = uri;
                return this;
            }
            throw new NullPointerException("Null image");
        }

        public u.a d(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public u.a e(List<l> list) {
            this.d = list;
            return this;
        }

        public u.a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    a(String str, Uri uri, String str2, List<l> list, boolean z, boolean z2, boolean z3) {
        if (str != null) {
            this.a = str;
            if (uri != null) {
                this.b = uri;
                if (str2 != null) {
                    this.c = str2;
                    if (list != null) {
                        this.f = list;
                        this.n = z;
                        this.o = z2;
                        this.p = z3;
                        return;
                    }
                    throw new NullPointerException("Null items");
                }
                throw new NullPointerException("Null description");
            }
            throw new NullPointerException("Null image");
        }
        throw new NullPointerException("Null name");
    }

    @Override // com.spotify.music.features.editplaylist.operations.u
    public String b() {
        return this.c;
    }

    @Override // com.spotify.music.features.editplaylist.operations.u
    public Uri c() {
        return this.b;
    }

    @Override // com.spotify.music.features.editplaylist.operations.u
    public boolean e() {
        return this.n;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.a.equals(uVar.i()) || !this.b.equals(uVar.c()) || !this.c.equals(uVar.b()) || !this.f.equals(uVar.h()) || this.n != uVar.e() || this.o != uVar.f() || this.p != uVar.g()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.editplaylist.operations.u
    public boolean f() {
        return this.o;
    }

    @Override // com.spotify.music.features.editplaylist.operations.u
    public boolean g() {
        return this.p;
    }

    @Override // com.spotify.music.features.editplaylist.operations.u
    public List<l> h() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003;
        if (!this.p) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.music.features.editplaylist.operations.u
    public String i() {
        return this.a;
    }

    @Override // com.spotify.music.features.editplaylist.operations.u
    public u.a k() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Data{name=");
        V0.append(this.a);
        V0.append(", image=");
        V0.append(this.b);
        V0.append(", description=");
        V0.append(this.c);
        V0.append(", items=");
        V0.append(this.f);
        V0.append(", isCollaborative=");
        V0.append(this.n);
        V0.append(", isOwnBySelf=");
        V0.append(this.o);
        V0.append(", isPictureAnnotated=");
        return je.P0(V0, this.p, "}");
    }
}
