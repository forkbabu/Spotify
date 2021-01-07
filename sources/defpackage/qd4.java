package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.functions.l;

/* renamed from: qd4  reason: default package */
public final /* synthetic */ class qd4 implements l {
    public final /* synthetic */ ne4 a;

    public /* synthetic */ qd4(ne4 ne4) {
        this.a = ne4;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.l("%s completed", this.a.toString());
        return re4.c((HubsJsonViewModel) obj);
    }
}
