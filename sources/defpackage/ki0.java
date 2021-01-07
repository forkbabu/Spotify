package defpackage;

import com.spotify.playlist.models.a;
import com.spotify.playlist.models.o;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: ki0  reason: default package */
public final class ki0 {
    private final List<o> a;
    private final int b;
    private final int c;
    private final a d;
    private final boolean e;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.playlist.models.o> */
    /* JADX WARN: Multi-variable type inference failed */
    public ki0(List<? extends o> list, int i, int i2, a aVar, boolean z) {
        h.e(list, "items");
        h.e(aVar, "album");
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = aVar;
        this.e = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki0)) {
            return false;
        }
        ki0 ki0 = (ki0) obj;
        return h.a(this.a, ki0.a) && this.b == ki0.b && this.c == ki0.c && h.a(this.d, ki0.d) && this.e == ki0.e;
    }

    public int hashCode() {
        List<o> list = this.a;
        int i = 0;
        int hashCode = (((((list != null ? list.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
        a aVar = this.d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AlbumEntity(items=");
        V0.append(this.a);
        V0.append(", unfilteredLength=");
        V0.append(this.b);
        V0.append(", unrangedLength=");
        V0.append(this.c);
        V0.append(", album=");
        V0.append(this.d);
        V0.append(", loading=");
        return je.P0(V0, this.e, ")");
    }
}
