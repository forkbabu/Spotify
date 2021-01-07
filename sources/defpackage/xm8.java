package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import defpackage.cn8;

/* access modifiers changed from: package-private */
/* renamed from: xm8  reason: default package */
public final class xm8 extends cn8 {
    private final ImmutableList<TasteOnboardingItem> a;
    private final boolean b;

    /* access modifiers changed from: package-private */
    /* renamed from: xm8$b */
    public static final class b extends cn8.a {
        private ImmutableList<TasteOnboardingItem> a;
        private Boolean b;

        b() {
        }

        public cn8.a a(ImmutableList<TasteOnboardingItem> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null artists");
        }

        public cn8 b() {
            String str = this.a == null ? " artists" : "";
            if (this.b == null) {
                str = je.x0(str, " hideGenre");
            }
            if (str.isEmpty()) {
                return new xm8(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public cn8.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    xm8(ImmutableList immutableList, boolean z, a aVar) {
        this.a = immutableList;
        this.b = z;
    }

    @Override // defpackage.cn8
    public ImmutableList<TasteOnboardingItem> a() {
        return this.a;
    }

    @Override // defpackage.cn8
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cn8)) {
            return false;
        }
        cn8 cn8 = (cn8) obj;
        if (!this.a.equals(cn8.a()) || this.b != cn8.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ExpandGenreResult{artists=");
        V0.append(this.a);
        V0.append(", hideGenre=");
        return je.P0(V0, this.b, "}");
    }
}
