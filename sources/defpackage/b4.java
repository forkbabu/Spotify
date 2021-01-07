package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* renamed from: b4  reason: default package */
public final class b4 {
    private final Object a;

    private b4(Object obj) {
        this.a = obj;
    }

    static b4 e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new b4(obj);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetBottom();
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b4.class != obj.getClass()) {
            return false;
        }
        b4 b4Var = (b4) obj;
        Object obj2 = this.a;
        if (obj2 != null) {
            return obj2.equals(b4Var.a);
        }
        if (b4Var.a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return je.G0(je.V0("DisplayCutoutCompat{"), this.a, "}");
    }
}
