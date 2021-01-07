package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: q44  reason: default package */
public final class q44 extends t44 {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q44(String str) {
        super(null);
        h.e(str, "playlistUri");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof q44) && h.a(this.a, ((q44) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.I0(je.V0("BlendCreated(playlistUri="), this.a, ")");
    }
}
