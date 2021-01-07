package defpackage;

import com.spotify.playlist.models.offline.a;
import kotlin.jvm.internal.h;

/* renamed from: vh0  reason: default package */
public final class vh0 {
    private final int a;
    private final int b;
    private final a c;

    public vh0(int i, int i2, a aVar) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
    }

    public final int a() {
        return this.b;
    }

    public final a b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh0)) {
            return false;
        }
        vh0 vh0 = (vh0) obj;
        return this.a == vh0.a && this.b == vh0.b && h.a(this.c, vh0.c);
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        a aVar = this.c;
        return i + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("CollectionListMetadata(unfilteredLength=");
        V0.append(this.a);
        V0.append(", length=");
        V0.append(this.b);
        V0.append(", offlineState=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}
