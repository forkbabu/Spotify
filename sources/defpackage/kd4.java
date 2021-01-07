package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import io.reactivex.functions.l;

/* renamed from: kd4  reason: default package */
public final /* synthetic */ class kd4 implements l {
    public final /* synthetic */ hf4 a;

    public /* synthetic */ kd4(hf4 hf4) {
        this.a = hf4;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        re4 re4 = (re4) obj;
        this.a.getClass();
        if (re4.b()) {
            return (b91) re4.a();
        }
        return HubsImmutableViewModel.EMPTY;
    }
}
