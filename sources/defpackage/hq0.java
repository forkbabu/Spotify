package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.inappmessaging.TriggerType;
import defpackage.dq0;
import defpackage.eq0;

/* renamed from: hq0  reason: default package */
public abstract class hq0 {
    public static final hq0 a;

    /* renamed from: hq0$a */
    public interface a {
    }

    static {
        dq0.b bVar = new dq0.b();
        bVar.b(false);
        bVar.c(new eq0.b());
        bVar.e(ImmutableMap.of());
        a = bVar.a();
    }

    public abstract boolean a();

    public abstract eq0 b();

    public abstract String c();

    public abstract ImmutableMap<TriggerType, String> d();

    public abstract a e();

    public hq0 f(boolean z) {
        dq0.b bVar = (dq0.b) e();
        bVar.b(z);
        return bVar.a();
    }

    public hq0 g(eq0 eq0) {
        dq0.b bVar = (dq0.b) e();
        bVar.c(eq0);
        return bVar.a();
    }

    public hq0 h(String str) {
        dq0.b bVar = (dq0.b) e();
        bVar.d(str);
        return bVar.a();
    }
}
