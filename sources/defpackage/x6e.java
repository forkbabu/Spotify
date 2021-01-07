package defpackage;

import android.app.Activity;
import android.content.Context;
import com.spotify.share.sharedata.t;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: x6e  reason: default package */
public class x6e {
    private final Map<Integer, List<i6e>> a;
    private final Context b;

    public x6e(Context context, Map<Integer, List<i6e>> map) {
        this.b = context;
        this.a = map;
    }

    public z<String> a(Activity activity, o8e o8e, t tVar, z7e z7e, d8e d8e, long j) {
        List<i6e> list = this.a.get(Integer.valueOf(o8e.id()));
        if (list != null) {
            for (i6e i6e : list) {
                if (i6e.b(tVar)) {
                    return i6e.c(activity, o8e, tVar, z7e, d8e, j);
                }
            }
            StringBuilder V0 = je.V0("No ShareClickHandler for ");
            V0.append(this.b.getString(o8e.c()));
            V0.append(" supports this ShareData.");
            return z.q(new UnsupportedOperationException(V0.toString()));
        }
        StringBuilder V02 = je.V0("Perform share to destination not yet implemented for ");
        V02.append(this.b.getString(o8e.c()));
        return z.q(new UnsupportedOperationException(V02.toString()));
    }
}
