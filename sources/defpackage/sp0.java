package defpackage;

import com.spotify.inappmessaging.TriggerType;
import io.reactivex.functions.l;
import retrofit2.v;

/* renamed from: sp0  reason: default package */
public final /* synthetic */ class sp0 implements l {
    public final /* synthetic */ tp0 a;
    public final /* synthetic */ TriggerType b;
    public final /* synthetic */ String c;

    public /* synthetic */ sp0(tp0 tp0, TriggerType triggerType, String str) {
        this.a = tp0;
        this.b = triggerType;
        this.c = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, this.c, (v) obj);
    }
}
