package com.spotify.libs.facepile;

import com.spotify.libs.facepile.d;
import java.util.List;

/* access modifiers changed from: package-private */
public final class b extends d {
    private final List<c> a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.libs.facepile.b$b  reason: collision with other inner class name */
    public static final class C0164b implements d.a {
        private List<c> a;

        C0164b() {
        }

        public d a() {
            String str = this.a == null ? " faces" : "";
            if (str.isEmpty()) {
                return new b(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public d.a b(List<c> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null faces");
        }
    }

    b(List list, a aVar) {
        this.a = list;
    }

    @Override // com.spotify.libs.facepile.d
    public List<c> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.a.equals(((d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("FacePile{faces="), this.a, "}");
    }
}
