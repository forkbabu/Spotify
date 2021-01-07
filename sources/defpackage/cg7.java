package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: cg7  reason: default package */
public final class cg7 extends fg7 {
    private final ag7 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cg7(ag7 ag7) {
        super(null);
        h.e(ag7, "event");
        this.a = ag7;
    }

    public final ag7 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof cg7) && h.a(this.a, ((cg7) obj).a);
        }
        return true;
    }

    public int hashCode() {
        ag7 ag7 = this.a;
        if (ag7 != null) {
            return ag7.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LogInteractionEvent(event=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
