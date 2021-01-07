package defpackage;

import com.spotify.playlist.models.i;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.offline.a;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

/* renamed from: ni0  reason: default package */
public final class ni0 implements i<o> {
    private static final ni0 p;
    private final a a;
    private final List<mi0> b;
    private final boolean c;
    private final int f;
    private final int n;
    private final List<o> o;

    static {
        EmptyList emptyList = EmptyList.a;
        p = new ni0(a.f.a, emptyList, false, 0, 0, emptyList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.spotify.playlist.models.o> */
    /* JADX WARN: Multi-variable type inference failed */
    public ni0(a aVar, List<mi0> list, boolean z, int i, int i2, List<? extends o> list2) {
        h.e(aVar, "offlineState");
        h.e(list, "groupHeaders");
        h.e(list2, "items");
        this.a = aVar;
        this.b = list;
        this.c = z;
        this.f = i;
        this.n = i2;
        this.o = list2;
    }

    public static final ni0 a() {
        return p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni0)) {
            return false;
        }
        ni0 ni0 = (ni0) obj;
        return h.a(this.a, ni0.a) && h.a(this.b, ni0.b) && this.c == ni0.c && this.f == ni0.f && this.n == ni0.n && h.a(this.o, ni0.o);
    }

    @Override // com.spotify.playlist.models.i
    public List<o> getItems() {
        return this.o;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnfilteredLength() {
        return this.n;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnrangedLength() {
        return this.f;
    }

    public int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<mi0> list = this.b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (((((hashCode2 + i2) * 31) + this.f) * 31) + this.n) * 31;
        List<o> list2 = this.o;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i5 + i;
    }

    @Override // com.spotify.playlist.models.i
    public boolean isLoading() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Tracks(offlineState=");
        V0.append(this.a);
        V0.append(", groupHeaders=");
        V0.append(this.b);
        V0.append(", isLoading=");
        V0.append(this.c);
        V0.append(", unrangedLength=");
        V0.append(this.f);
        V0.append(", unfilteredLength=");
        V0.append(this.n);
        V0.append(", items=");
        return je.L0(V0, this.o, ")");
    }
}
