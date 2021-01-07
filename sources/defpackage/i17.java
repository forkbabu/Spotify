package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import defpackage.o17;

/* access modifiers changed from: package-private */
/* renamed from: i17  reason: default package */
public final class i17 extends o17.a {
    private final HubsImmutableViewModel a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    /* access modifiers changed from: package-private */
    /* renamed from: i17$b */
    public static final class b implements o17.a.AbstractC0652a {
        private HubsImmutableViewModel a;
        private Boolean b;
        private Boolean c;
        private Boolean d;

        b() {
        }

        public o17.a a() {
            String str = this.a == null ? " moreLikeThisData" : "";
            if (this.b == null) {
                str = je.x0(str, " shouldLoadData");
            }
            if (this.c == null) {
                str = je.x0(str, " isLoadingData");
            }
            if (this.d == null) {
                str = je.x0(str, " filterActive");
            }
            if (str.isEmpty()) {
                return new i17(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public o17.a.AbstractC0652a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public o17.a.AbstractC0652a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public o17.a.AbstractC0652a d(HubsImmutableViewModel hubsImmutableViewModel) {
            if (hubsImmutableViewModel != null) {
                this.a = hubsImmutableViewModel;
                return this;
            }
            throw new NullPointerException("Null moreLikeThisData");
        }

        public o17.a.AbstractC0652a e(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        b(o17.a aVar, a aVar2) {
            this.a = aVar.d();
            this.b = Boolean.valueOf(aVar.e());
            this.c = Boolean.valueOf(aVar.c());
            this.d = Boolean.valueOf(aVar.b());
        }
    }

    i17(HubsImmutableViewModel hubsImmutableViewModel, boolean z, boolean z2, boolean z3, a aVar) {
        this.a = hubsImmutableViewModel;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // defpackage.o17.a
    public boolean b() {
        return this.d;
    }

    @Override // defpackage.o17.a
    public boolean c() {
        return this.c;
    }

    @Override // defpackage.o17.a
    public HubsImmutableViewModel d() {
        return this.a;
    }

    @Override // defpackage.o17.a
    public boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o17.a)) {
            return false;
        }
        o17.a aVar = (o17.a) obj;
        if (this.a.equals(aVar.d()) && this.b == aVar.e() && this.c == aVar.c() && this.d == aVar.b()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o17.a
    public o17.a.AbstractC0652a f() {
        return new b(this, null);
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("State{moreLikeThisData=");
        V0.append(this.a);
        V0.append(", shouldLoadData=");
        V0.append(this.b);
        V0.append(", isLoadingData=");
        V0.append(this.c);
        V0.append(", filterActive=");
        return je.P0(V0, this.d, "}");
    }
}
