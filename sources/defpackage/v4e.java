package defpackage;

import android.app.Activity;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.share.sharedata.u;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: v4e  reason: default package */
public final /* synthetic */ class v4e implements l {
    public final /* synthetic */ h5e a;
    public final /* synthetic */ z7e b;
    public final /* synthetic */ o8e c;
    public final /* synthetic */ long f;
    public final /* synthetic */ d8e n;
    public final /* synthetic */ u o;
    public final /* synthetic */ Activity p;

    public /* synthetic */ v4e(h5e h5e, z7e z7e, o8e o8e, long j, d8e d8e, u uVar, Activity activity) {
        this.a = h5e;
        this.b = z7e;
        this.c = o8e;
        this.f = j;
        this.n = d8e;
        this.o = uVar;
        this.p = activity;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        h5e h5e = this.a;
        z7e z7e = this.b;
        o8e o8e = this.c;
        long j = this.f;
        d8e d8e = this.n;
        u uVar = this.o;
        Activity activity = this.p;
        Optional optional = (Optional) obj;
        h5e.getClass();
        if (optional.isPresent()) {
            String b2 = ((u3) optional.get()).a.b();
            b2.getClass();
            z7e.b(b2, o8e.a(), j);
            int a2 = o8e.a();
            String b3 = ((u3) optional.get()).a.b();
            b3.getClass();
            d8e.a(uVar, a2, b3, null);
            activity.startActivityForResult(((u3) optional.get()).b, 0);
            Logger.b("Starting intent: %s", ((u3) optional.get()).b);
            return z.z(((u3) optional.get()).a.b());
        }
        Logger.b("Intent to share is null", new Object[0]);
        return z.q(h5e.a(activity, o8e));
    }
}
