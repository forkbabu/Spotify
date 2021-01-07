package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.g;

/* renamed from: pr1  reason: default package */
public final /* synthetic */ class pr1 implements g {
    public final /* synthetic */ js1 a;

    public /* synthetic */ pr1(js1 js1) {
        this.a = js1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.m((AppProtocol.Status) obj);
    }
}
