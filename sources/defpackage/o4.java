package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: o4  reason: default package */
public final class o4 {
    private Object a;

    private o4(Object obj) {
        this.a = obj;
    }

    public static o4 b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new o4(PointerIcon.getSystemIcon(context, i));
        }
        return new o4(null);
    }

    public Object a() {
        return this.a;
    }
}
