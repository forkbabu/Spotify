package com.spotify.music.features.editplaylist.operations;

import android.net.Uri;
import com.spotify.music.features.editplaylist.operations.o0;

/* access modifiers changed from: package-private */
public abstract class f extends o0 {
    private final String a;
    private final Uri b;

    static class a implements o0.a {
        private String a;
        private Uri b;

        a() {
        }

        public o0 a() {
            String str = this.a == null ? " playlistUri" : "";
            if (this.b == null) {
                str = je.x0(str, " imageUri");
            }
            if (str.isEmpty()) {
                return new t(this.a, this.b);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public o0.a b(Uri uri) {
            if (uri != null) {
                this.b = uri;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        public o0.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }
    }

    f(String str, Uri uri) {
        if (str != null) {
            this.a = str;
            if (uri != null) {
                this.b = uri;
                return;
            }
            throw new NullPointerException("Null imageUri");
        }
        throw new NullPointerException("Null playlistUri");
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.o0
    public Uri a() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.o0
    public String b() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (!this.a.equals(o0Var.b()) || !this.b.equals(o0Var.a())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SetPictureOperation{playlistUri=");
        V0.append(this.a);
        V0.append(", imageUri=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
