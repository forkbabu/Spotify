package com.spotify.music.features.yourlibrary.musicpages.item;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

abstract class c extends MusicItem.f {
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final boolean n;
    private final boolean o;
    private final String p;

    /* access modifiers changed from: package-private */
    public static class a extends MusicItem.f.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private Boolean e;
        private Boolean f;
        private String g;

        a() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a
        public MusicItem.f a() {
            String str = this.a == null ? " buttonTitle" : "";
            if (this.b == null) {
                str = je.x0(str, " infoDialogTitle");
            }
            if (this.c == null) {
                str = je.x0(str, " infoDialogText");
            }
            if (this.d == null) {
                str = je.x0(str, " infoDialogDismissText");
            }
            if (this.e == null) {
                str = je.x0(str, " collapsable");
            }
            if (this.f == null) {
                str = je.x0(str, " collapsed");
            }
            if (this.g == null) {
                str = je.x0(str, " collapseOption");
            }
            if (str.isEmpty()) {
                return new k(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.booleanValue(), this.g);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a
        public MusicItem.f.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null buttonTitle");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a
        public MusicItem.f.a c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a
        public MusicItem.f.a d(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null collapseOption");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a
        public MusicItem.f.a e(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a
        public MusicItem.f.a f(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null infoDialogDismissText");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a
        public MusicItem.f.a g(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null infoDialogText");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f.a
        public MusicItem.f.a h(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null infoDialogTitle");
        }
    }

    c(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.f = str4;
                        this.n = z;
                        this.o = z2;
                        if (str5 != null) {
                            this.p = str5;
                            return;
                        }
                        throw new NullPointerException("Null collapseOption");
                    }
                    throw new NullPointerException("Null infoDialogDismissText");
                }
                throw new NullPointerException("Null infoDialogText");
            }
            throw new NullPointerException("Null infoDialogTitle");
        }
        throw new NullPointerException("Null buttonTitle");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f
    public String b() {
        return this.a;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f
    public boolean c() {
        return this.n;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f
    public String e() {
        return this.p;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicItem.f)) {
            return false;
        }
        MusicItem.f fVar = (MusicItem.f) obj;
        if (!this.a.equals(fVar.b()) || !this.b.equals(fVar.i()) || !this.c.equals(fVar.h()) || !this.f.equals(fVar.g()) || this.n != fVar.c() || this.o != fVar.f() || !this.p.equals(fVar.e())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f
    public boolean f() {
        return this.o;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f
    public String g() {
        return this.f;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f
    public String h() {
        return this.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003;
        if (!this.o) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.p.hashCode();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f
    public String i() {
        return this.b;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SectionHeaderExtras{buttonTitle=");
        V0.append(this.a);
        V0.append(", infoDialogTitle=");
        V0.append(this.b);
        V0.append(", infoDialogText=");
        V0.append(this.c);
        V0.append(", infoDialogDismissText=");
        V0.append(this.f);
        V0.append(", collapsable=");
        V0.append(this.n);
        V0.append(", collapsed=");
        V0.append(this.o);
        V0.append(", collapseOption=");
        return je.I0(V0, this.p, "}");
    }
}
