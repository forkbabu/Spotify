package defpackage;

import com.spotify.music.preview.z;
import kotlin.jvm.internal.h;

/* renamed from: dh4  reason: default package */
public final class dh4 {
    private final nh4 a;
    private final z b;

    public dh4() {
        this(null, null, 3);
    }

    public dh4(nh4 nh4, z zVar) {
        h.e(nh4, "playlistState");
        this.a = nh4;
        this.b = zVar;
    }

    public static dh4 a(dh4 dh4, nh4 nh4, z zVar, int i) {
        if ((i & 1) != 0) {
            nh4 = dh4.a;
        }
        if ((i & 2) != 0) {
            zVar = dh4.b;
        }
        dh4.getClass();
        h.e(nh4, "playlistState");
        return new dh4(nh4, zVar);
    }

    public final nh4 b() {
        return this.a;
    }

    public final z c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh4)) {
            return false;
        }
        dh4 dh4 = (dh4) obj;
        return h.a(this.a, dh4.a) && h.a(this.b, dh4.b);
    }

    public int hashCode() {
        nh4 nh4 = this.a;
        int i = 0;
        int hashCode = (nh4 != null ? nh4.hashCode() : 0) * 31;
        z zVar = this.b;
        if (zVar != null) {
            i = zVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CarePackageModel(playlistState=");
        V0.append(this.a);
        V0.append(", previewPlayerState=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }

    public dh4(nh4 nh4, z zVar, int i) {
        lh4 lh4 = (i & 1) != 0 ? lh4.a : null;
        int i2 = i & 2;
        h.e(lh4, "playlistState");
        this.a = lh4;
        this.b = null;
    }
}
