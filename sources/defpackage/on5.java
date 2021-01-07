package defpackage;

import com.spotify.android.flags.c;
import com.spotify.music.features.localfilesimport.util.a;
import com.spotify.pses.v1.proto.AuthMethod;
import com.spotify.pses.v1.proto.AuthProviderState;
import kotlin.jvm.internal.h;

/* renamed from: on5  reason: default package */
public final class on5 implements fjf<qn5> {
    public static final boolean a(AuthMethod authMethod) {
        h.e(authMethod, "$this$canLogin");
        return b(authMethod) || authMethod.n() == AuthProviderState.AUTH_PROVIDER_STATE_LOGIN_ONLY;
    }

    public static final boolean b(AuthMethod authMethod) {
        h.e(authMethod, "$this$canRegister");
        return authMethod.n() == AuthProviderState.AUTH_PROVIDER_STATE_LOGIN_SIGNUP;
    }

    public static boolean c(c cVar) {
        return ((Integer) cVar.M0(a.c)).intValue() == 1;
    }
}
