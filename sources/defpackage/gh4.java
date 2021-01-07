package defpackage;

import com.spotify.playlist.models.k;
import kotlin.jvm.internal.h;

/* renamed from: gh4  reason: default package */
public final class gh4 extends ah4 {
    private final k a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gh4(k kVar) {
        super(null);
        h.e(kVar, "playlistEntity");
        this.a = kVar;
    }

    public final k a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof gh4) && h.a(this.a, ((gh4) obj).a);
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
        StringBuilder V0 = je.V0("OpenAddSongsDialog(playlistEntity=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
