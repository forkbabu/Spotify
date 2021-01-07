package com.spotify.music.features.showentity;

import android.os.Bundle;
import com.spotify.playlist.models.Show;

final class q extends u {
    private final String a;
    private final Bundle b;
    private final Show.MediaType c;
    private final boolean d;

    q(String str, Bundle bundle, Show.MediaType mediaType, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = bundle;
            if (mediaType != null) {
                this.c = mediaType;
                this.d = z;
                return;
            }
            throw new NullPointerException("Null mediaType");
        }
        throw new NullPointerException("Null uri");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.showentity.u
    public Show.MediaType a() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.showentity.u
    public Bundle b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.showentity.u
    public boolean c() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.showentity.u
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        Bundle bundle;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.a.equals(uVar.d()) || ((bundle = this.b) != null ? !bundle.equals(uVar.b()) : uVar.b() != null) || !this.c.equals(uVar.a()) || this.d != uVar.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Bundle bundle = this.b;
        return ((((hashCode ^ (bundle == null ? 0 : bundle.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShowEntityResolution{uri=");
        V0.append(this.a);
        V0.append(", navigationExtras=");
        V0.append(this.b);
        V0.append(", mediaType=");
        V0.append(this.c);
        V0.append(", showProgressIndicator=");
        return je.P0(V0, this.d, "}");
    }
}
