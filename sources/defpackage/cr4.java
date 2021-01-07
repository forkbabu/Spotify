package defpackage;

import android.view.View;
import kotlin.jvm.internal.h;

/* renamed from: cr4  reason: default package */
public final class cr4 {
    private final int a;
    private final String b;
    private final View c;

    public cr4(int i, String str, View view) {
        h.e(str, "label");
        h.e(view, "view");
        this.a = i;
        this.b = str;
        this.c = view;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final View c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr4)) {
            return false;
        }
        cr4 cr4 = (cr4) obj;
        return this.a == cr4.a && h.a(this.b, cr4.b) && h.a(this.c, cr4.c);
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        View view = this.c;
        if (view != null) {
            i2 = view.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AccessibilityRowAction(id=");
        V0.append(this.a);
        V0.append(", label=");
        V0.append(this.b);
        V0.append(", view=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}
