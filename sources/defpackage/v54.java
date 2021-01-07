package defpackage;

import com.google.common.base.Optional;
import defpackage.z54;

/* access modifiers changed from: package-private */
/* renamed from: v54  reason: default package */
public final class v54 extends z54 {
    private final Optional<String> b;
    private final Optional<e74> c;

    /* access modifiers changed from: package-private */
    /* renamed from: v54$b */
    public static final class b extends z54.a {
        private Optional<String> a = Optional.absent();
        private Optional<e74> b = Optional.absent();

        b() {
        }

        @Override // defpackage.z54.a
        public z54.a a(e74 e74) {
            this.b = Optional.of(e74);
            return this;
        }

        @Override // defpackage.z54.a
        public z54 b() {
            return new v54(this.a, this.b, null);
        }

        @Override // defpackage.z54.a
        public z54.a c(String str) {
            this.a = Optional.of(str);
            return this;
        }

        public z54.a d(Optional<e74> optional) {
            this.b = optional;
            return this;
        }
    }

    v54(Optional optional, Optional optional2, a aVar) {
        this.b = optional;
        this.c = optional2;
    }

    @Override // defpackage.z54
    public Optional<e74> a() {
        return this.c;
    }

    @Override // defpackage.z54
    public Optional<String> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z54)) {
            return false;
        }
        z54 z54 = (z54) obj;
        if (!this.b.equals(z54.c()) || !this.c.equals(z54.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchLaunchParameters{userInteractionId=");
        V0.append(this.b);
        V0.append(", animationData=");
        return je.F0(V0, this.c, "}");
    }
}
