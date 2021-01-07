package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: b44  reason: default package */
public final class b44 extends v34 {
    private final String a;

    public b44(String str) {
        super(null);
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b44) && h.a(this.a, ((b44) obj).a);
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
        return je.I0(je.V0("InvitationUrlReceived(invitationUrl="), this.a, ")");
    }
}
