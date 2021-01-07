package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: yz8  reason: default package */
public final class yz8 {
    private final String a;
    private final int b;

    public yz8(String str, int i) {
        h.e(str, "text");
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz8)) {
            return false;
        }
        yz8 yz8 = (yz8) obj;
        return h.a(this.a, yz8.a) && this.b == yz8.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("StoryColoredText(text=");
        V0.append(this.a);
        V0.append(", color=");
        return je.B0(V0, this.b, ")");
    }
}
