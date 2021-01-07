package com.spotify.music.yourlibrary.quickscroll;

import com.spotify.music.yourlibrary.quickscroll.u;

/* access modifiers changed from: package-private */
public final class i extends u.a {
    private final float a;
    private final int b;

    /* access modifiers changed from: package-private */
    public static final class b implements u.a.AbstractC0355a {
        private Float a;
        private Integer b;

        b() {
        }

        public u.a a() {
            String str = this.a == null ? " scrubbingPosition" : "";
            if (this.b == null) {
                str = je.x0(str, " scrollingPosition");
            }
            if (str.isEmpty()) {
                return new i(this.a.floatValue(), this.b.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public u.a.AbstractC0355a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public u.a.AbstractC0355a c(float f) {
            this.a = Float.valueOf(f);
            return this;
        }
    }

    i(float f, int i, a aVar) {
        this.a = f;
        this.b = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.u.a
    public int a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.u.a
    public float b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u.a)) {
            return false;
        }
        u.a aVar = (u.a) obj;
        if (Float.floatToIntBits(this.a) == Float.floatToIntBits(aVar.b()) && this.b == aVar.a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Position{scrubbingPosition=");
        V0.append(this.a);
        V0.append(", scrollingPosition=");
        return je.B0(V0, this.b, "}");
    }
}
