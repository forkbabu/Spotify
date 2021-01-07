package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

/* renamed from: ogd  reason: default package */
public final /* synthetic */ class ogd implements g {
    public final /* synthetic */ zgd a;
    public final /* synthetic */ Context b;

    public /* synthetic */ ogd(zgd zgd, Context context) {
        this.a = zgd;
        this.b = context;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.p(this.b, (SessionState) obj);
    }
}
