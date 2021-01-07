package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

/* renamed from: q14  reason: default package */
public final /* synthetic */ class q14 implements g {
    public final /* synthetic */ u14 a;

    public /* synthetic */ q14(u14 u14) {
        this.a = u14;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((SessionState) obj);
    }
}
