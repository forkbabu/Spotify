package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.player.model.PlayerState;

/* access modifiers changed from: package-private */
public final class k extends r {
    private final String a;
    private final String b;
    private final PlayerState c;

    k(String str, String str2, PlayerState playerState) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (playerState != null) {
                    this.c = playerState;
                    return;
                }
                throw new NullPointerException("Null playerState");
            }
            throw new NullPointerException("Null contextUri");
        }
        throw new NullPointerException("Null trackUri");
    }

    @Override // com.spotify.music.nowplaying.common.view.contextmenu.r
    public String a() {
        return this.b;
    }

    @Override // com.spotify.music.nowplaying.common.view.contextmenu.r
    public PlayerState c() {
        return this.c;
    }

    @Override // com.spotify.music.nowplaying.common.view.contextmenu.r
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.a.equals(rVar.d()) || !this.b.equals(rVar.a()) || !this.c.equals(rVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextMenuInfo{trackUri=");
        V0.append(this.a);
        V0.append(", contextUri=");
        V0.append(this.b);
        V0.append(", playerState=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
