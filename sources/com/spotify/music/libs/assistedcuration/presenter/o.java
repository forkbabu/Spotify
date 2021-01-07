package com.spotify.music.libs.assistedcuration.presenter;

import com.google.common.base.Optional;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.libs.assistedcuration.presenter.s;
import java.util.List;

final class o extends s {
    private final List<h> a;
    private final Optional<Boolean> b;
    private final x c;
    private final boolean d;
    private final boolean e;

    o(List list, Optional optional, x xVar, boolean z, boolean z2, a aVar) {
        this.a = list;
        this.b = optional;
        this.c = xVar;
        this.d = z;
        this.e = z2;
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.s
    public List<h> a() {
        return this.a;
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.s
    public Optional<Boolean> b() {
        return this.b;
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.s
    public x c() {
        return this.c;
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.s
    public boolean d() {
        return this.e;
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.s
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.a.equals(sVar.a()) || !this.b.equals(sVar.b()) || !this.c.equals(sVar.c()) || this.d != sVar.e() || this.e != sVar.d()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.s
    public s.a f() {
        return new b(this, null);
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Data{cards=");
        V0.append(this.a);
        V0.append(", isConnected=");
        V0.append(this.b);
        V0.append(", seedData=");
        V0.append(this.c);
        V0.append(", disableExplicitContent=");
        V0.append(this.d);
        V0.append(", disableAgeRestrictedContent=");
        return je.P0(V0, this.e, "}");
    }

    static final class b implements s.a {
        private List<h> a;
        private Optional<Boolean> b = Optional.absent();
        private x c;
        private Boolean d;
        private Boolean e;

        b() {
        }

        public s a() {
            String str = this.a == null ? " cards" : "";
            if (this.c == null) {
                str = je.x0(str, " seedData");
            }
            if (this.d == null) {
                str = je.x0(str, " disableExplicitContent");
            }
            if (this.e == null) {
                str = je.x0(str, " disableAgeRestrictedContent");
            }
            if (str.isEmpty()) {
                return new o(this.a, this.b, this.c, this.d.booleanValue(), this.e.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public s.a b(List<h> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null cards");
        }

        public s.a c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public s.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public s.a e(Optional<Boolean> optional) {
            this.b = optional;
            return this;
        }

        public s.a f(x xVar) {
            if (xVar != null) {
                this.c = xVar;
                return this;
            }
            throw new NullPointerException("Null seedData");
        }

        b(s sVar, a aVar) {
            this.a = sVar.a();
            this.b = sVar.b();
            this.c = sVar.c();
            this.d = Boolean.valueOf(sVar.e());
            this.e = Boolean.valueOf(sVar.d());
        }
    }
}
