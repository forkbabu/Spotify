package defpackage;

import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: li0  reason: default package */
public final class li0 {
    private final boolean a;
    private final b b;
    private final int c;
    private final int d;
    private final List<o> e;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.spotify.playlist.models.o> */
    /* JADX WARN: Multi-variable type inference failed */
    public li0(boolean z, b bVar, int i, int i2, List<? extends o> list) {
        h.e(bVar, "artist");
        h.e(list, "items");
        this.a = z;
        this.b = bVar;
        this.c = i;
        this.d = i2;
        this.e = list;
    }

    public final b a() {
        return this.b;
    }

    public final List<o> b() {
        return this.e;
    }

    public final boolean c() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li0)) {
            return false;
        }
        li0 li0 = (li0) obj;
        return this.a == li0.a && h.a(this.b, li0.b) && this.c == li0.c && this.d == li0.d && h.a(this.e, li0.e);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        b bVar = this.b;
        int i5 = 0;
        int hashCode = (((((i4 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31;
        List<o> list = this.e;
        if (list != null) {
            i5 = list.hashCode();
        }
        return hashCode + i5;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ArtistEntity(loading=");
        V0.append(this.a);
        V0.append(", artist=");
        V0.append(this.b);
        V0.append(", unrangedLength=");
        V0.append(this.c);
        V0.append(", unfilteredLength=");
        V0.append(this.d);
        V0.append(", items=");
        return je.L0(V0, this.e, ")");
    }
}
