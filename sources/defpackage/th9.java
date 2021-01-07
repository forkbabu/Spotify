package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import defpackage.di9;

/* renamed from: th9  reason: default package */
abstract class th9 extends di9.b {
    private final String a;
    private final String b;
    private final String c;
    private final SpotifyIconV2 f;
    private final SpotifyIconV2 n;
    private final boolean o;

    /* access modifiers changed from: package-private */
    /* renamed from: th9$b */
    public static class b extends di9.b.a {
        private String a;
        private String b;
        private String c;
        private SpotifyIconV2 d;
        private SpotifyIconV2 e;
        private Boolean f;

        b() {
        }

        @Override // defpackage.di9.b.a
        public di9.b.a a(SpotifyIconV2 spotifyIconV2) {
            if (spotifyIconV2 != null) {
                this.e = spotifyIconV2;
                return this;
            }
            throw new NullPointerException("Null activeIcon");
        }

        @Override // defpackage.di9.b.a
        public di9.b.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null activeTitle");
        }

        @Override // defpackage.di9.b.a
        public di9.b c() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " inactiveTitle");
            }
            if (this.c == null) {
                str = je.x0(str, " activeTitle");
            }
            if (this.d == null) {
                str = je.x0(str, " inactiveIcon");
            }
            if (this.e == null) {
                str = je.x0(str, " activeIcon");
            }
            if (this.f == null) {
                str = je.x0(str, " isActive");
            }
            if (str.isEmpty()) {
                return new bi9(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.di9.b.a
        public di9.b.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // defpackage.di9.b.a
        public di9.b.a e(SpotifyIconV2 spotifyIconV2) {
            if (spotifyIconV2 != null) {
                this.d = spotifyIconV2;
                return this;
            }
            throw new NullPointerException("Null inactiveIcon");
        }

        @Override // defpackage.di9.b.a
        public di9.b.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null inactiveTitle");
        }

        @Override // defpackage.di9.b.a
        public di9.b.a g(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        b(di9.b bVar, a aVar) {
            this.a = bVar.e();
            this.b = bVar.g();
            this.c = bVar.b();
            this.d = bVar.f();
            this.e = bVar.a();
            this.f = Boolean.valueOf(bVar.h());
        }
    }

    th9(String str, String str2, String str3, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (spotifyIconV2 != null) {
                        this.f = spotifyIconV2;
                        if (spotifyIconV22 != null) {
                            this.n = spotifyIconV22;
                            this.o = z;
                            return;
                        }
                        throw new NullPointerException("Null activeIcon");
                    }
                    throw new NullPointerException("Null inactiveIcon");
                }
                throw new NullPointerException("Null activeTitle");
            }
            throw new NullPointerException("Null inactiveTitle");
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.di9.b
    public SpotifyIconV2 a() {
        return this.n;
    }

    @Override // defpackage.di9.b
    public String b() {
        return this.c;
    }

    @Override // defpackage.di9.b
    public String e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof di9.b)) {
            return false;
        }
        di9.b bVar = (di9.b) obj;
        if (!this.a.equals(bVar.e()) || !this.b.equals(bVar.g()) || !this.c.equals(bVar.b()) || !this.f.equals(bVar.f()) || !this.n.equals(bVar.a()) || this.o != bVar.h()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.di9.b
    public SpotifyIconV2 f() {
        return this.f;
    }

    @Override // defpackage.di9.b
    public String g() {
        return this.b;
    }

    @Override // defpackage.di9.b
    public boolean h() {
        return this.o;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (this.o ? 1231 : 1237);
    }

    @Override // defpackage.di9.b
    public di9.b.a i() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FilterOption{id=");
        V0.append(this.a);
        V0.append(", inactiveTitle=");
        V0.append(this.b);
        V0.append(", activeTitle=");
        V0.append(this.c);
        V0.append(", inactiveIcon=");
        V0.append(this.f);
        V0.append(", activeIcon=");
        V0.append(this.n);
        V0.append(", isActive=");
        return je.P0(V0, this.o, "}");
    }
}
