package defpackage;

import android.app.Activity;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.p;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: d5e  reason: default package */
public final /* synthetic */ class d5e implements l {
    public final /* synthetic */ a6e a;
    public final /* synthetic */ z7e b;
    public final /* synthetic */ o8e c;
    public final /* synthetic */ long f;
    public final /* synthetic */ d8e n;
    public final /* synthetic */ p o;
    public final /* synthetic */ Activity p;

    public /* synthetic */ d5e(a6e a6e, z7e z7e, o8e o8e, long j, d8e d8e, p pVar, Activity activity) {
        this.a = a6e;
        this.b = z7e;
        this.c = o8e;
        this.f = j;
        this.n = d8e;
        this.o = pVar;
        this.p = activity;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        a6e a6e = this.a;
        z7e z7e = this.b;
        o8e o8e = this.c;
        long j = this.f;
        d8e d8e = this.n;
        p pVar = this.o;
        Activity activity = this.p;
        Optional optional = (Optional) obj;
        a6e.getClass();
        if (!optional.isPresent()) {
            return z.q(a6e.a(activity, o8e));
        }
        F f2 = ((u3) optional.get()).a;
        z7e.b(f2, o8e.a(), j);
        if (f2 != null) {
            d8e.a(pVar, o8e.a(), f2, null);
        }
        activity.startActivityForResult(((u3) optional.get()).b, 0);
        return z.z(f2);
    }
}
