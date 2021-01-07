package defpackage;

import com.spotify.playlist.models.k;
import kotlin.jvm.internal.h;

/* renamed from: ph4  reason: default package */
public final class ph4 extends bh4 {
    private final k a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ph4(k kVar) {
        super(null);
        h.e(kVar, "playlistEntity");
        this.a = kVar;
    }

    public final k a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ph4) && h.a(this.a, ((ph4) obj).a);
        }
        return true;
    }

    public int hashCode() {
        k kVar = this.a;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaylistUpdated(playlistEntity=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
