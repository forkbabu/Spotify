package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import defpackage.bn8;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: wm8  reason: default package */
public final class wm8 extends bn8 {
    private final List<TasteOnboardingItem> a;
    private final ln8 b;

    /* access modifiers changed from: package-private */
    /* renamed from: wm8$b */
    public static final class b extends bn8.a {
        private List<TasteOnboardingItem> a;
        private ln8 b;

        b() {
        }

        public bn8 a() {
            String str = this.a == null ? " items" : "";
            if (this.b == null) {
                str = je.x0(str, " position");
            }
            if (str.isEmpty()) {
                return new wm8(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public bn8.a b(List<TasteOnboardingItem> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public bn8.a c(ln8 ln8) {
            this.b = ln8;
            return this;
        }
    }

    wm8(List list, ln8 ln8, a aVar) {
        this.a = list;
        this.b = ln8;
    }

    @Override // defpackage.bn8
    public List<TasteOnboardingItem> a() {
        return this.a;
    }

    @Override // defpackage.bn8
    public ln8 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bn8)) {
            return false;
        }
        bn8 bn8 = (bn8) obj;
        if (!this.a.equals(bn8.a()) || !this.b.equals(bn8.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ExpandArtistResult{items=");
        V0.append(this.a);
        V0.append(", position=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
