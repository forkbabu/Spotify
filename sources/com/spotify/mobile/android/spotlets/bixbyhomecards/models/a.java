package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import android.content.Intent;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.b;

final class a extends b {
    private final String a;
    private final Intent b;

    /* access modifiers changed from: package-private */
    public static final class b extends b.a {
        private String a;
        private Intent b;

        b() {
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.b.a
        public b a() {
            String str = this.a == null ? " text" : "";
            if (this.b == null) {
                str = je.x0(str, " deeplinkIntent");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.b.a
        public b.a b(Intent intent) {
            this.b = intent;
            return this;
        }

        public b.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null text");
        }
    }

    a(String str, Intent intent, C0192a aVar) {
        this.a = str;
        this.b = intent;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.b
    public Intent b() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.b
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.c()) || !this.b.equals(bVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("CTA{text=");
        V0.append(this.a);
        V0.append(", deeplinkIntent=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
