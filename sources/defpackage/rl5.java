package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import defpackage.ql5;

/* renamed from: rl5  reason: default package */
public abstract class rl5 {

    /* renamed from: rl5$a */
    public interface a {
        a a(b91 b91);

        rl5 build();
    }

    public static a a() {
        ql5.b bVar = new ql5.b();
        bVar.a(HubsImmutableViewModel.EMPTY);
        ql5.b bVar2 = bVar;
        bVar2.b(false);
        ql5.b bVar3 = bVar2;
        bVar3.c(false);
        return bVar3;
    }

    public abstract b91 b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract a e();
}
