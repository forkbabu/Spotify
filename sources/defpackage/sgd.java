package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

/* renamed from: sgd  reason: default package */
public final /* synthetic */ class sgd implements g {
    public final /* synthetic */ zgd a;
    public final /* synthetic */ Context b;

    public /* synthetic */ sgd(zgd zgd, Context context) {
        this.a = zgd;
        this.b = context;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.o(this.b, (SessionState) obj);
    }
}
