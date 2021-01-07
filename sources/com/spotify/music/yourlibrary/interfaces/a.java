package com.spotify.music.yourlibrary.interfaces;

import com.spotify.music.yourlibrary.interfaces.i;

/* access modifiers changed from: package-private */
public abstract class a extends i {
    private final boolean b;
    private final boolean c;
    private final int f;
    private final int n;

    static class b extends i.a {
        private Boolean a;
        private Boolean b;
        private Integer c;
        private Integer d;

        b() {
        }

        @Override // com.spotify.music.yourlibrary.interfaces.i.a
        public i a() {
            String str = this.a == null ? " tabsCollapseLocked" : "";
            if (this.b == null) {
                str = je.x0(str, " pageSwipeLocked");
            }
            if (this.c == null) {
                str = je.x0(str, " maxTabsOffset");
            }
            if (this.d == null) {
                str = je.x0(str, " tabsOffset");
            }
            if (str.isEmpty()) {
                return new b(this.a.booleanValue(), this.b.booleanValue(), this.c.intValue(), this.d.intValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.yourlibrary.interfaces.i.a
        public i.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.yourlibrary.interfaces.i.a
        public i.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.yourlibrary.interfaces.i.a
        public i.a d(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.yourlibrary.interfaces.i.a
        public i.a e(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        b(i iVar, C0354a aVar) {
            this.a = Boolean.valueOf(iVar.c());
            this.b = Boolean.valueOf(iVar.b());
            this.c = Integer.valueOf(iVar.a());
            this.d = Integer.valueOf(iVar.e());
        }
    }

    a(boolean z, boolean z2, int i, int i2) {
        this.b = z;
        this.c = z2;
        this.f = i;
        this.n = i2;
    }

    @Override // com.spotify.music.yourlibrary.interfaces.i
    public int a() {
        return this.f;
    }

    @Override // com.spotify.music.yourlibrary.interfaces.i
    public boolean b() {
        return this.c;
    }

    @Override // com.spotify.music.yourlibrary.interfaces.i
    public boolean c() {
        return this.b;
    }

    @Override // com.spotify.music.yourlibrary.interfaces.i
    public int e() {
        return this.n;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.b == iVar.c() && this.c == iVar.b() && this.f == iVar.a() && this.n == iVar.e()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.yourlibrary.interfaces.i
    public i.a f() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int i2 = ((this.b ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return ((((i2 ^ i) * 1000003) ^ this.f) * 1000003) ^ this.n;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryState{tabsCollapseLocked=");
        V0.append(this.b);
        V0.append(", pageSwipeLocked=");
        V0.append(this.c);
        V0.append(", maxTabsOffset=");
        V0.append(this.f);
        V0.append(", tabsOffset=");
        return je.B0(V0, this.n, "}");
    }
}
