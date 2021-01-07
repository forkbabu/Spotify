package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import defpackage.pn8;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: ym8  reason: default package */
public final class ym8 extends pn8 {
    private final List<TasteOnboardingItem> a;
    private final boolean b;

    /* renamed from: ym8$b */
    static final class b extends pn8.a {
        private List<TasteOnboardingItem> a;
        private Boolean b;

        b() {
        }

        public pn8 a() {
            String str = this.a == null ? " items" : "";
            if (this.b == null) {
                str = je.x0(str, " expand");
            }
            if (str.isEmpty()) {
                return new ym8(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public pn8.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public pn8.a c(List<TasteOnboardingItem> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }
    }

    ym8(List list, boolean z, a aVar) {
        this.a = list;
        this.b = z;
    }

    @Override // defpackage.pn8
    public boolean a() {
        return this.b;
    }

    @Override // defpackage.pn8
    public List<TasteOnboardingItem> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pn8)) {
            return false;
        }
        pn8 pn8 = (pn8) obj;
        if (!this.a.equals(pn8.b()) || this.b != pn8.a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SelectGridArtistResult{items=");
        V0.append(this.a);
        V0.append(", expand=");
        return je.P0(V0, this.b, "}");
    }
}
