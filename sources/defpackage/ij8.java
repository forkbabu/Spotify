package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: ij8  reason: default package */
public final class ij8 {
    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public hj8 b(LayoutInflater layoutInflater, ViewGroup viewGroup, ej8 ej8) {
        a(layoutInflater, 1);
        a(viewGroup, 2);
        a(ej8, 3);
        return new hj8(layoutInflater, viewGroup, ej8);
    }
}
