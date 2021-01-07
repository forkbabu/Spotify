package com.spotify.music.slate.model;

import android.net.Uri;

abstract class f extends v {
    private final Uri a;

    f(Uri uri) {
        if (uri != null) {
            this.a = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.slate.model.v
    public Uri a() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return this.a.equals(((v) obj).a());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("UriImageSource{uri=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
