package defpackage;

import android.view.View;

/* renamed from: t51  reason: default package */
public final class t51 {
    public static void a(w51 w51, View view, s81 s81) {
        view.setOnClickListener(b(s81) ? new h51(s81, w51) : null);
        boolean b = b(s81);
        view.setClickable(b);
        view.setFocusable(b);
    }

    public static boolean b(s81 s81) {
        return s81.target() != null || s81.events().containsKey("click");
    }
}
