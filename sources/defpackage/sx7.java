package defpackage;

import com.google.common.base.Charsets;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.features.ads.model.Ad;
import java.nio.charset.Charset;

/* renamed from: sx7  reason: default package */
public final class sx7 {
    private final PlayerTrack a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final String f;

    private sx7(PlayerTrack playerTrack, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = playerTrack;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        String str = playerTrack.metadata().get("iteration");
        this.f = str == null ? Ad.DEFAULT_SKIPPABLE_AD_DELAY : str;
    }

    public static sx7 a(PlayerTrack playerTrack, boolean z, boolean z2, boolean z3, boolean z4) {
        return new sx7(playerTrack, z, z2, z3, z4);
    }

    public boolean b() {
        return this.d;
    }

    public boolean c() {
        return this.e;
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx7)) {
            return false;
        }
        sx7 sx7 = (sx7) obj;
        if (z42.s(this.a, "title").equals(z42.s(sx7.a, "title")) && this.b == sx7.b && this.c == sx7.c && this.d == sx7.d && this.e == sx7.e && this.a.uid().equals(sx7.a.uid()) && this.f.equals(sx7.f)) {
            return true;
        }
        return false;
    }

    public PlayerTrack f() {
        return this.a;
    }

    public int hashCode() {
        String s = z42.s(this.a, "context_uri");
        Hasher newHasher = Hashing.murmur3_32().newHasher();
        String uid = this.a.uid();
        Charset charset = Charsets.UTF_8;
        return newHasher.putString(uid, charset).putString(this.f, charset).putString(s, charset).hash().asInt();
    }

    public String toString() {
        StringBuilder V0 = je.V0("QueueTrack{mTrack=");
        V0.append(this.a);
        V0.append(", mIsRemovable=");
        V0.append(this.b);
        V0.append(", mIsQueueable=");
        V0.append(this.c);
        V0.append(", mIsDraggable=");
        V0.append(this.d);
        V0.append(", mIsMuted=");
        return je.O0(V0, this.e, '}');
    }
}
