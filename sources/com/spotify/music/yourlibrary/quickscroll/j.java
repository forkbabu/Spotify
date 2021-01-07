package com.spotify.music.yourlibrary.quickscroll;

import com.spotify.music.yourlibrary.quickscroll.x;

/* access modifiers changed from: package-private */
public final class j extends x {
    private final v a;
    private final a0 b;
    private final z c;
    private final v d;
    private final Integer e;

    /* access modifiers changed from: package-private */
    public static final class b implements x.a {
        private v a;
        private a0 b;
        private z c;
        private v d;
        private Integer e;

        b() {
        }

        public x a() {
            String str = this.a == null ? " sizeProvider" : "";
            if (this.b == null) {
                str = je.x0(str, " labelProvider");
            }
            if (this.d == null) {
                str = je.x0(str, " positionInteractor");
            }
            if (str.isEmpty()) {
                return new j(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public x.a b(z zVar) {
            this.c = zVar;
            return this;
        }

        public x.a c(Integer num) {
            this.e = num;
            return this;
        }

        public x.a d(a0 a0Var) {
            this.b = a0Var;
            return this;
        }

        public x.a e(v vVar) {
            this.d = vVar;
            return this;
        }

        public x.a f(v vVar) {
            if (vVar != null) {
                this.a = vVar;
                return this;
            }
            throw new NullPointerException("Null sizeProvider");
        }
    }

    j(v vVar, a0 a0Var, z zVar, v vVar2, Integer num, a aVar) {
        this.a = vVar;
        this.b = a0Var;
        this.c = zVar;
        this.d = vVar2;
        this.e = num;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.x
    public z b() {
        return this.c;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.x
    public Integer c() {
        return this.e;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.x
    public a0 d() {
        return this.b;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.x
    public v e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        z zVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.a.equals(xVar.f()) && this.b.equals(xVar.d()) && ((zVar = this.c) != null ? zVar.equals(xVar.b()) : xVar.b() == null) && this.d.equals(xVar.e())) {
            Integer num = this.e;
            if (num == null) {
                if (xVar.c() == null) {
                    return true;
                }
            } else if (num.equals(xVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.x
    public v f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        z zVar = this.c;
        int i = 0;
        int hashCode2 = (((hashCode ^ (zVar == null ? 0 : zVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Configuration{sizeProvider=");
        V0.append(this.a);
        V0.append(", labelProvider=");
        V0.append(this.b);
        V0.append(", ignoredItemProvider=");
        V0.append(this.c);
        V0.append(", positionInteractor=");
        V0.append(this.d);
        V0.append(", initialPosition=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}
