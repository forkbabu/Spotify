package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

/* renamed from: tz6  reason: default package */
public final /* synthetic */ class tz6 implements g {
    public final /* synthetic */ e07 a;

    public /* synthetic */ tz6(e07 e07) {
        this.a = e07;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((SessionState) obj);
    }
}
