package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: w44  reason: default package */
public final class w44 {
    private final v44 a;

    public w44(v44 v44) {
        h.e(v44, "mode");
        this.a = v44;
    }

    public final v44 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof w44) && h.a(this.a, ((w44) obj).a);
        }
        return true;
    }

    public int hashCode() {
        v44 v44 = this.a;
        if (v44 != null) {
            return v44.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("BlendTasteMatchModel(mode=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
