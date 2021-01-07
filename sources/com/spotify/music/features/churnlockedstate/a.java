package com.spotify.music.features.churnlockedstate;

import com.spotify.music.features.churnlockedstate.r;

/* access modifiers changed from: package-private */
public abstract class a extends r {
    private final boolean a;

    /* renamed from: com.spotify.music.features.churnlockedstate.a$a  reason: collision with other inner class name */
    static class C0216a extends r.a {
        private Boolean a;

        C0216a() {
        }

        public r a() {
            String str = this.a == null ? " premiumOnlyMarket" : "";
            if (str.isEmpty()) {
                return new p(this.a.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public r.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    a(boolean z) {
        this.a = z;
    }

    @Override // com.spotify.music.features.churnlockedstate.r
    public boolean a() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r) || this.a != ((r) obj).a()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.P0(je.V0("ChurnLockedStateConfiguration{premiumOnlyMarket="), this.a, "}");
    }
}
