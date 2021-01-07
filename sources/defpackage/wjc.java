package defpackage;

import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import defpackage.onc;
import kotlin.jvm.internal.h;

/* renamed from: wjc  reason: default package */
public final class wjc {
    private final i<Episode> a;
    private final boolean b;
    private final int c;
    private final onc d;

    public wjc(i<Episode> iVar, boolean z, int i, onc onc) {
        h.e(iVar, "episodes");
        h.e(onc, "playerState");
        this.a = iVar;
        this.b = z;
        this.c = i;
        this.d = onc;
    }

    public static wjc a(wjc wjc, i iVar, boolean z, int i, onc onc, int i2) {
        i<Episode> iVar2 = (i2 & 1) != 0 ? wjc.a : null;
        if ((i2 & 2) != 0) {
            z = wjc.b;
        }
        if ((i2 & 4) != 0) {
            i = wjc.c;
        }
        if ((i2 & 8) != 0) {
            onc = wjc.d;
        }
        wjc.getClass();
        h.e(iVar2, "episodes");
        h.e(onc, "playerState");
        return new wjc(iVar2, z, i, onc);
    }

    public final i<Episode> b() {
        return this.a;
    }

    public final onc c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public final boolean e() {
        return this.a.getItems().isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjc)) {
            return false;
        }
        wjc wjc = (wjc) obj;
        return h.a(this.a, wjc.a) && this.b == wjc.b && this.c == wjc.c && h.a(this.d, wjc.d);
    }

    public final boolean f() {
        return this.b;
    }

    public int hashCode() {
        i<Episode> iVar = this.a;
        int i = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (((hashCode + i2) * 31) + this.c) * 31;
        onc onc = this.d;
        if (onc != null) {
            i = onc.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastTabPageDataModel(episodes=");
        V0.append(this.a);
        V0.append(", isUserPremium=");
        V0.append(this.b);
        V0.append(", yourEpisodesCount=");
        V0.append(this.c);
        V0.append(", playerState=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }

    public wjc(i iVar, boolean z, int i, onc onc, int i2) {
        z = (i2 & 2) != 0 ? true : z;
        i = (i2 & 4) != 0 ? 0 : i;
        onc.b bVar = (i2 & 8) != 0 ? onc.b.a : null;
        h.e(iVar, "episodes");
        h.e(bVar, "playerState");
        this.a = iVar;
        this.b = z;
        this.c = i;
        this.d = bVar;
    }
}
