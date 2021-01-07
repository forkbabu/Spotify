package defpackage;

import android.content.Context;
import androidx.fragment.app.o;
import com.spotify.android.flags.c;

/* renamed from: ln5  reason: default package */
public class ln5 {
    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public kn5 b(o oVar, Context context, c cVar) {
        a(oVar, 1);
        a(context, 2);
        a(cVar, 3);
        return new kn5(oVar, context, cVar);
    }
}
