package defpackage;

import com.spotify.playlist.models.k;
import kotlin.jvm.internal.h;

/* renamed from: sh4  reason: default package */
public final class sh4 extends ah4 {
    private final k a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sh4(k kVar) {
        super(null);
        h.e(kVar, "playlistEntity");
        this.a = kVar;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof sh4) && h.a(this.a, ((sh4) obj).a);
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
        StringBuilder V0 = je.V0("SharePlaylist(playlistEntity=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
