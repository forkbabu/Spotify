package com.spotify.music.features.playlistentity.story.header;

import com.spotify.music.features.playlistentity.story.header.f0;

/* access modifiers changed from: package-private */
public final class d0 extends f0 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final b66 g;

    /* access modifiers changed from: package-private */
    public static final class b implements f0.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private b66 g;

        b() {
        }

        @Override // com.spotify.music.features.playlistentity.story.header.f0.a
        public f0.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.playlistentity.story.header.f0.a
        public f0.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.playlistentity.story.header.f0.a
        public f0 build() {
            String str = this.a == null ? " showPlayButton" : "";
            if (this.b == null) {
                str = je.x0(str, " showShuffleLabel");
            }
            if (this.c == null) {
                str = je.x0(str, " showFollowButton");
            }
            if (this.d == null) {
                str = je.x0(str, " showLikesInsteadOfFollowers");
            }
            if (this.e == null) {
                str = je.x0(str, " useRoundPlayButton");
            }
            if (this.f == null) {
                str = je.x0(str, " hideShuffleBadgeWhenRound");
            }
            if (this.g == null) {
                str = je.x0(str, " playButtonBehavior");
            }
            if (str.isEmpty()) {
                return new d0(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.playlistentity.story.header.f0.a
        public f0.a c(b66 b66) {
            if (b66 != null) {
                this.g = b66;
                return this;
            }
            throw new NullPointerException("Null playButtonBehavior");
        }

        @Override // com.spotify.music.features.playlistentity.story.header.f0.a
        public f0.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.playlistentity.story.header.f0.a
        public f0.a e(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.playlistentity.story.header.f0.a
        public f0.a f(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.playlistentity.story.header.f0.a
        public f0.a g(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    d0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, b66 b66, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = b66;
    }

    @Override // com.spotify.music.features.playlistentity.story.header.f0
    public boolean b() {
        return this.f;
    }

    @Override // com.spotify.music.features.playlistentity.story.header.f0
    public b66 c() {
        return this.g;
    }

    @Override // com.spotify.music.features.playlistentity.story.header.f0
    public boolean d() {
        return this.c;
    }

    @Override // com.spotify.music.features.playlistentity.story.header.f0
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.a == f0Var.f() && this.b == f0Var.g() && this.c == f0Var.d() && this.d == f0Var.e() && this.e == f0Var.h() && this.f == f0Var.b() && this.g.equals(f0Var.c())) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.features.playlistentity.story.header.f0
    public boolean f() {
        return this.a;
    }

    @Override // com.spotify.music.features.playlistentity.story.header.f0
    public boolean g() {
        return this.b;
    }

    @Override // com.spotify.music.features.playlistentity.story.header.f0
    public boolean h() {
        return this.e;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return ((i2 ^ i) * 1000003) ^ this.g.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("StoryHeaderConfiguration{showPlayButton=");
        V0.append(this.a);
        V0.append(", showShuffleLabel=");
        V0.append(this.b);
        V0.append(", showFollowButton=");
        V0.append(this.c);
        V0.append(", showLikesInsteadOfFollowers=");
        V0.append(this.d);
        V0.append(", useRoundPlayButton=");
        V0.append(this.e);
        V0.append(", hideShuffleBadgeWhenRound=");
        V0.append(this.f);
        V0.append(", playButtonBehavior=");
        V0.append(this.g);
        V0.append("}");
        return V0.toString();
    }
}
