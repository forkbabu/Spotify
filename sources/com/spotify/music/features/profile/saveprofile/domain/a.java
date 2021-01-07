package com.spotify.music.features.profile.saveprofile.domain;

import com.spotify.music.features.profile.saveprofile.domain.r;

/* access modifiers changed from: package-private */
public abstract class a extends r {
    private final SaveProfileState b;
    private final float c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.profile.saveprofile.domain.a$a  reason: collision with other inner class name */
    public static final class C0253a extends r.a {
        private SaveProfileState a;
        private Float b;

        C0253a() {
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.r.a
        public r a() {
            String str = this.a == null ? " state" : "";
            if (this.b == null) {
                str = je.x0(str, " progress");
            }
            if (str.isEmpty()) {
                return new m(this.a, this.b.floatValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.r.a
        public r.a b(float f) {
            this.b = Float.valueOf(f);
            return this;
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.r.a
        public r.a c(SaveProfileState saveProfileState) {
            if (saveProfileState != null) {
                this.a = saveProfileState;
                return this;
            }
            throw new NullPointerException("Null state");
        }
    }

    a(SaveProfileState saveProfileState, float f) {
        if (saveProfileState != null) {
            this.b = saveProfileState;
            this.c = f;
            return;
        }
        throw new NullPointerException("Null state");
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.r
    public float b() {
        return this.c;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.r
    public SaveProfileState c() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.b.equals(rVar.c()) || Float.floatToIntBits(this.c) != Float.floatToIntBits(rVar.b())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.c);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SaveProfileStatus{state=");
        V0.append(this.b);
        V0.append(", progress=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
