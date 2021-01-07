package defpackage;

import defpackage.fab;

/* renamed from: aab  reason: default package */
final class aab extends fab {
    private final boolean a;

    /* renamed from: aab$b */
    static final class b extends fab.a {
        private Boolean a;

        b() {
        }

        public fab a() {
            String str = this.a == null ? " liveVideoInternalEnabled" : "";
            if (str.isEmpty()) {
                return new aab(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public fab.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    aab(boolean z, a aVar) {
        this.a = z;
    }

    @Override // defpackage.fab
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fab) || this.a != ((fab) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("MusicLibsVideoProperties{liveVideoInternalEnabled="), this.a, "}");
    }
}
