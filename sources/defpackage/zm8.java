package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import defpackage.qn8;

/* renamed from: zm8  reason: default package */
final class zm8 extends qn8 {
    private final TasteOnboardingItem a;
    private final ln8 b;
    private final boolean c;

    /* renamed from: zm8$b */
    static final class b extends qn8.a {
        private TasteOnboardingItem a;
        private ln8 b;
        private Boolean c;

        b() {
        }

        @Override // defpackage.qn8.a
        public qn8 a() {
            String str = this.a == null ? " artist" : "";
            if (this.b == null) {
                str = je.x0(str, " position");
            }
            if (this.c == null) {
                str = je.x0(str, " shouldBeLiked");
            }
            if (str.isEmpty()) {
                return new zm8(this.a, this.b, this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.qn8.a
        public qn8.a b(ln8 ln8) {
            this.b = ln8;
            return this;
        }

        @Override // defpackage.qn8.a
        public qn8.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public qn8.a d(TasteOnboardingItem tasteOnboardingItem) {
            this.a = tasteOnboardingItem;
            return this;
        }
    }

    zm8(TasteOnboardingItem tasteOnboardingItem, ln8 ln8, boolean z, a aVar) {
        this.a = tasteOnboardingItem;
        this.b = ln8;
        this.c = z;
    }

    @Override // defpackage.qn8
    public TasteOnboardingItem a() {
        return this.a;
    }

    @Override // defpackage.qn8
    public ln8 b() {
        return this.b;
    }

    @Override // defpackage.qn8
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qn8)) {
            return false;
        }
        qn8 qn8 = (qn8) obj;
        if (!this.a.equals(qn8.a()) || !this.b.equals(qn8.b()) || this.c != qn8.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SelectSearchArtistResult{artist=");
        V0.append(this.a);
        V0.append(", position=");
        V0.append(this.b);
        V0.append(", shouldBeLiked=");
        return je.P0(V0, this.c, "}");
    }
}
