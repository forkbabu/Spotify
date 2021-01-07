package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.inappmessaging.TriggerType;
import defpackage.fq0;
import io.reactivex.functions.l;
import java.util.concurrent.TimeUnit;

/* renamed from: iq0  reason: default package */
public final /* synthetic */ class iq0 implements l {
    public final /* synthetic */ tp0 a;

    public /* synthetic */ iq0(tp0 tp0) {
        this.a = tp0;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str;
        tp0 tp0 = this.a;
        fq0.a aVar = (fq0.a) obj;
        TriggerType c = aVar.c();
        if (MoreObjects.isNullOrEmpty(aVar.d())) {
            str = "spotify:home";
        } else {
            str = aVar.d();
        }
        return tp0.b(c, str, aVar.a(), aVar.b()).j0(new kq0(aVar)).R0(15, TimeUnit.SECONDS).r0(new mq0(aVar));
    }
}
