package defpackage;

import android.graphics.Rect;

/* renamed from: m8  reason: default package */
public final class m8 {
    private final Rect a;
    private int b;

    m8(Rect rect, int i) {
        this.a = new Rect(rect);
        this.b = i;
    }

    public Rect a() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DisplayFeature{ bounds=");
        V0.append(this.a);
        V0.append(", type=");
        int i = this.b;
        return je.I0(V0, i != 1 ? i != 2 ? je.q0("Unknown feature type (", i, ")") : "HINGE" : "FOLD", " }");
    }
}
