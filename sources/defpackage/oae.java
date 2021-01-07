package defpackage;

import com.spotify.mobius.e0;
import defpackage.nae;
import defpackage.sae;
import java.util.Calendar;
import java.util.Date;

/* renamed from: oae  reason: default package */
public final /* synthetic */ class oae implements ti0 {
    public final /* synthetic */ tae a;

    public /* synthetic */ oae(tae tae) {
        this.a = tae;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        tae tae = this.a;
        sae.b bVar = (sae.b) obj;
        int e = tae.e();
        int c = tae.c();
        int b = tae.b();
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(e, c, b);
        Date time = instance.getTime();
        int i = bVar.i();
        int h = bVar.h();
        int g = bVar.g();
        Calendar instance2 = Calendar.getInstance();
        instance2.clear();
        instance2.set(i, h, g);
        if (!time.equals(instance2.getTime())) {
            return e0.h();
        }
        uae f = bVar.f();
        nae.b bVar2 = (nae.b) tae.g();
        bVar2.a(f);
        return e0.f(bVar2.e());
    }
}
