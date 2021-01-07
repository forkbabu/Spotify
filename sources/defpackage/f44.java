package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: f44  reason: default package */
public final class f44 extends u34 {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f44(String str) {
        super(null);
        h.e(str, "invitationUrl");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f44) && h.a(this.a, ((f44) obj).a);
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
        return je.I0(je.V0("ShareInvitation(invitationUrl="), this.a, ")");
    }
}
