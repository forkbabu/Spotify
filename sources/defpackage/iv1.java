package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobius.e0;
import com.spotify.music.C0707R;
import defpackage.qv1;
import defpackage.rv1;
import defpackage.tv1;

/* renamed from: iv1  reason: default package */
public final /* synthetic */ class iv1 implements ti0 {
    public final /* synthetic */ tv1 a;

    public /* synthetic */ iv1(tv1 tv1) {
        this.a = tv1;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        tv1 tv1 = this.a;
        SessionState h = ((rv1.f) obj).h();
        if (h.loggingIn() || h.loggingOut()) {
            return e0.h();
        }
        if (h.loggedIn()) {
            AuthorizationRequest a2 = tv1.a();
            a2.getClass();
            String i = a2.i();
            if (!h.canConnect()) {
                ErrorMessage errorMessage = ErrorMessage.OFFLINE_MODE_ACTIVE;
                if (i == null) {
                    i = "";
                }
                return e0.a(ImmutableSet.of(new qv1.h(errorMessage, C0707R.string.applink_offline_error_description, i)));
            } else if (!h.connected()) {
                return e0.h();
            } else {
                if (!tv1.b().isPresent()) {
                    return e0.a(ImmutableSet.of(new qv1.e()));
                }
                return e0.h();
            }
        } else if (tv1.d()) {
            return e0.h();
        } else {
            tv1.a f = tv1.f();
            f.e(true);
            return e0.g(f.b(), ImmutableSet.of(new qv1.j()));
        }
    }
}
