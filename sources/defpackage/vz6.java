package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

/* renamed from: vz6  reason: default package */
public final /* synthetic */ class vz6 implements n {
    public static final /* synthetic */ vz6 a = new vz6();

    private /* synthetic */ vz6() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !MoreObjects.isNullOrEmpty(((SessionState) obj).currentUserName());
    }
}
