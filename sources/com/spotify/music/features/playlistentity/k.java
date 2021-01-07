package com.spotify.music.features.playlistentity;

import android.content.Intent;
import com.spotify.music.features.playlistentity.h;

final class k extends h.a {
    private final int a;
    private final int b;
    private final Intent c;

    k(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // com.spotify.music.features.playlistentity.h.a
    public Intent a() {
        return this.c;
    }

    @Override // com.spotify.music.features.playlistentity.h.a
    public int b() {
        return this.a;
    }

    @Override // com.spotify.music.features.playlistentity.h.a
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h.a)) {
            return false;
        }
        h.a aVar = (h.a) obj;
        if (this.a == aVar.b() && this.b == aVar.c()) {
            Intent intent = this.c;
            if (intent == null) {
                if (aVar.a() == null) {
                    return true;
                }
            } else if (intent.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003;
        Intent intent = this.c;
        return i ^ (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("Pending{requestCode=");
        V0.append(this.a);
        V0.append(", resultCode=");
        V0.append(this.b);
        V0.append(", data=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
