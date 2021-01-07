package com.spotify.music.playlist.ui;

import com.spotify.music.playlist.ui.l0;

final class b0 extends l0.c {
    private final boolean a;

    /* access modifiers changed from: package-private */
    public static final class b implements l0.c.a {
        private Boolean a;

        b() {
        }

        public l0.c.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public l0.c b() {
            String str = this.a == null ? " appearsAsDisabled" : "";
            if (str.isEmpty()) {
                return new b0(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    b0(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.music.playlist.ui.l0.c
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l0.c) || this.a != ((l0.c) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("Result{appearsAsDisabled="), this.a, "}");
    }
}
