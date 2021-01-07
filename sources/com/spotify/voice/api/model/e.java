package com.spotify.voice.api.model;

import com.spotify.player.model.PlayerState;

/* access modifiers changed from: package-private */
public final class e extends k {
    private final PlayerState a;
    private final String b;
    private final boolean c;

    e(PlayerState playerState, String str, boolean z) {
        if (playerState != null) {
            this.a = playerState;
            if (str != null) {
                this.b = str;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null authToken");
        }
        throw new NullPointerException("Null playerState");
    }

    @Override // com.spotify.voice.api.model.k
    public String a() {
        return this.b;
    }

    @Override // com.spotify.voice.api.model.k
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.voice.api.model.k
    public PlayerState d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.a.equals(kVar.d()) || !this.b.equals(kVar.a()) || this.c != kVar.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SpeechProxyDependenciesHolder{playerState=");
        V0.append(this.a);
        V0.append(", authToken=");
        V0.append(this.b);
        V0.append(", nftDisabled=");
        return je.P0(V0, this.c, "}");
    }
}
