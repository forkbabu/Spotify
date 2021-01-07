package defpackage;

import com.spotify.mobile.android.service.media.u1;
import defpackage.zwd;
import io.reactivex.functions.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

/* renamed from: sl1  reason: default package */
public final class sl1 implements b<zwd, Throwable> {
    private static final Pattern b = Pattern.compile(",\\s*");
    private final u1 a;

    private sl1(u1 u1Var) {
        this.a = u1Var;
    }

    public static sl1 b(u1 u1Var) {
        return new sl1(u1Var);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.b
    public void a(zwd zwd, Throwable th) {
        zwd zwd2 = zwd;
        Throwable th2 = th;
        if (th2 != null) {
            this.a.onActionForbidden(Collections.singletonList(th2.getMessage()));
            return;
        }
        zwd2.getClass();
        if (zwd2 instanceof zwd.a) {
            this.a.onActionForbidden(Arrays.asList(b.split(((zwd.a) zwd2).c())));
            return;
        }
        this.a.onActionSuccess();
    }
}
