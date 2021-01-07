package defpackage;

import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: zh4  reason: default package */
public final class zh4 extends bh4 {
    private final List<ty4> a;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends ty4> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zh4(List<? extends ty4> list) {
        super(null);
        h.e(list, "spotifyEntities");
        this.a = list;
    }

    public final List<ty4> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zh4) && h.a(this.a, ((zh4) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<ty4> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("UserSelectionReceived(spotifyEntities="), this.a, ")");
    }
}
