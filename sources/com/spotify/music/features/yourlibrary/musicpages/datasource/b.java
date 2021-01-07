package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.datasource.x3;

/* access modifiers changed from: package-private */
public abstract class b extends x3.b {
    private final boolean b;
    private final String c;
    private final ane f;
    private final ImmutableMap<String, Boolean> n;

    /* access modifiers changed from: package-private */
    public static class a extends x3.b.a {
        private Boolean a;
        private String b;
        private ane c;
        private ImmutableMap<String, Boolean> d;

        a() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.b.a
        public x3.b a() {
            String str = this.a == null ? " textFilterActive" : "";
            if (this.b == null) {
                str = je.x0(str, " textFilter");
            }
            if (this.d == null) {
                str = je.x0(str, " filterStates");
            }
            if (str.isEmpty()) {
                return new u3(this.a.booleanValue(), this.b, this.c, this.d);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.b.a
        public x3.b.a b(ImmutableMap<String, Boolean> immutableMap) {
            if (immutableMap != null) {
                this.d = immutableMap;
                return this;
            }
            throw new NullPointerException("Null filterStates");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.b.a
        public x3.b.a c(ane ane) {
            this.c = ane;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.b.a
        public x3.b.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null textFilter");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.b.a
        public x3.b.a e(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    b(boolean z, String str, ane ane, ImmutableMap<String, Boolean> immutableMap) {
        this.b = z;
        if (str != null) {
            this.c = str;
            this.f = ane;
            if (immutableMap != null) {
                this.n = immutableMap;
                return;
            }
            throw new NullPointerException("Null filterStates");
        }
        throw new NullPointerException("Null textFilter");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.b
    public ImmutableMap<String, Boolean> b() {
        return this.n;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.b
    public ane c() {
        return this.f;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.b
    public String e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        ane ane;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x3.b)) {
            return false;
        }
        x3.b bVar = (x3.b) obj;
        if (this.b != bVar.f() || !this.c.equals(bVar.e()) || ((ane = this.f) != null ? !ane.equals(bVar.c()) : bVar.c() != null) || !this.n.equals(bVar.b())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.b
    public boolean f() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = ((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        ane ane = this.f;
        return ((hashCode ^ (ane == null ? 0 : ane.hashCode())) * 1000003) ^ this.n.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FilterAndSortOptions{textFilterActive=");
        V0.append(this.b);
        V0.append(", textFilter=");
        V0.append(this.c);
        V0.append(", sortOrder=");
        V0.append(this.f);
        V0.append(", filterStates=");
        V0.append(this.n);
        V0.append("}");
        return V0.toString();
    }
}
