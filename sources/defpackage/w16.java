package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: w16  reason: default package */
public class w16 {
    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public v16 b(Context context, ViewGroup viewGroup) {
        a(context, 1);
        a(viewGroup, 2);
        return new v16(context, viewGroup);
    }
}
