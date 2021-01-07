package defpackage;

import android.content.Context;
import com.spotify.music.slate.model.n;
import com.spotify.music.slate.model.p;
import java.util.Locale;

/* renamed from: l3d  reason: default package */
public class l3d {
    private final Context a;

    public l3d(Context context) {
        this.a = context;
    }

    public qud a(n nVar) {
        if (nVar instanceof p) {
            return new o3d(this.a, ((p) nVar).a());
        }
        throw new IllegalArgumentException(String.format(Locale.getDefault(), "Effect type %s could not be resolved", nVar.getClass().getCanonicalName()));
    }
}
