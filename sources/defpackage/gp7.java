package defpackage;

import android.net.Uri;
import com.spotify.mobius.e0;
import defpackage.mp7;
import defpackage.np7;

/* renamed from: gp7  reason: default package */
public final /* synthetic */ class gp7 implements nmf {
    public final /* synthetic */ np7 a;

    public /* synthetic */ gp7(np7 np7) {
        this.a = np7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        np7 np7 = this.a;
        String a2 = ((mp7.h) obj).a();
        if (a2.equals(Uri.EMPTY.toString())) {
            return e0.h();
        }
        np7.a n = np7.n();
        n.n(a2);
        return e0.f(n.a());
    }
}
