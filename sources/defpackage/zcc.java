package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.partnerapps.PartnerType;
import defpackage.ddc;

/* renamed from: zcc  reason: default package */
final class zcc extends ddc {
    private final Optional<Boolean> b;
    private final ImmutableMap<PartnerType, bla> c;
    private final Optional<PartnerType> d;

    zcc(Optional optional, ImmutableMap immutableMap, Optional optional2, a aVar) {
        this.b = optional;
        this.c = immutableMap;
        this.d = optional2;
    }

    @Override // defpackage.ddc
    public Optional<PartnerType> a() {
        return this.d;
    }

    @Override // defpackage.ddc
    public ImmutableMap<PartnerType, bla> b() {
        return this.c;
    }

    @Override // defpackage.ddc
    public Optional<Boolean> c() {
        return this.b;
    }

    @Override // defpackage.ddc
    public ddc.a d() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ddc)) {
            return false;
        }
        ddc ddc = (ddc) obj;
        if (!this.b.equals(ddc.c()) || !this.c.equals(ddc.b()) || !this.d.equals(ddc.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SettingsModel{masterToggle=");
        V0.append(this.b);
        V0.append(", integrationList=");
        V0.append(this.c);
        V0.append(", authStartedForPartnerType=");
        return je.F0(V0, this.d, "}");
    }

    /* renamed from: zcc$b */
    static final class b extends ddc.a {
        private Optional<Boolean> a = Optional.absent();
        private ImmutableMap<PartnerType, bla> b;
        private Optional<PartnerType> c = Optional.absent();

        b() {
        }

        @Override // defpackage.ddc.a
        public ddc.a a(Optional<PartnerType> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null authStartedForPartnerType");
        }

        @Override // defpackage.ddc.a
        public ddc b() {
            String str = this.b == null ? " integrationList" : "";
            if (str.isEmpty()) {
                return new zcc(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.ddc.a
        public ddc.a c(ImmutableMap<PartnerType, bla> immutableMap) {
            if (immutableMap != null) {
                this.b = immutableMap;
                return this;
            }
            throw new NullPointerException("Null integrationList");
        }

        @Override // defpackage.ddc.a
        public ddc.a d(Optional<Boolean> optional) {
            this.a = optional;
            return this;
        }

        b(ddc ddc, a aVar) {
            this.a = ddc.c();
            this.b = ddc.b();
            this.c = ddc.a();
        }
    }
}
