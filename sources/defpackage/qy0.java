package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.spotify.libs.pse.model.a;
import com.spotify.libs.pse.model.e;
import com.spotify.pses.v1.proto.AuthMethod;
import com.spotify.pses.v1.proto.AuthProvider;
import com.spotify.pses.v1.proto.AuthProviderState;
import com.spotify.pses.v1.proto.Authentication;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import com.spotify.pses.v1.proto.DefaultLayout;
import com.spotify.pses.v1.proto.Header;
import com.spotify.pses.v1.proto.IntentLedLayout;
import com.spotify.pses.v1.proto.MethodLedLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: qy0  reason: default package */
public final class qy0 {
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<com.spotify.pses.v1.proto.AuthMethod> */
    /* JADX WARN: Multi-variable type inference failed */
    private static final void a(List<AuthMethod> list, AuthProvider authProvider, AuthProviderState authProviderState) {
        boolean z;
        boolean z2 = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (authProvider == ((AuthMethod) it.next()).l()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z2) {
            AuthMethod.b o = AuthMethod.o();
            o.m(authProvider);
            o.n(authProviderState);
            GeneratedMessageLite build = o.build();
            h.d(build, "AuthMethod.newBuilder()\n…\n                .build()");
            list.add(build);
        }
    }

    private static final a.c b(e eVar, DefaultLayout defaultLayout) {
        Authentication authentication;
        Authentication.b bVar;
        Authentication h;
        Authentication h2;
        if (((defaultLayout == null || (h2 = defaultLayout.h()) == null) ? 0 : h2.i()) > 0) {
            h.c(defaultLayout);
            authentication = defaultLayout.h();
        } else {
            if (defaultLayout == null || (h = defaultLayout.h()) == null || (bVar = (Authentication.b) h.toBuilder()) == null) {
                bVar = Authentication.o();
            }
            bVar.m(d(eVar));
            authentication = (Authentication) bVar.build();
        }
        h.d(authentication, "if (defaultLayout?.authe…  ).build()\n            }");
        String str = null;
        Header l = defaultLayout != null ? defaultLayout.l() : null;
        if (defaultLayout != null) {
            str = defaultLayout.m();
        }
        return new a.c(authentication, l, str);
    }

    public static final a c(e eVar, ConfigurationResponse configurationResponse) {
        a aVar;
        Authentication authentication;
        Authentication authentication2;
        h.e(eVar, "psesConfiguration");
        h.e(configurationResponse, "configurationResponse");
        ConfigurationResponse.LayoutCase p = configurationResponse.p();
        if (p != null) {
            int ordinal = p.ordinal();
            if (ordinal == 0) {
                return b(eVar, configurationResponse.m());
            }
            if (ordinal == 1) {
                IntentLedLayout o = configurationResponse.o();
                h.d(o, "configurationResponse.intentLedLayout");
                Authentication h = o.h();
                h.d(h, "intentLedLayout.authentication");
                if (h.i() > 0) {
                    authentication = o.h();
                } else {
                    Authentication.b bVar = (Authentication.b) o.h().toBuilder();
                    bVar.m(d(eVar));
                    authentication = (Authentication) bVar.build();
                }
                h.d(authentication, "if (intentLedLayout.auth…  ).build()\n            }");
                aVar = new a.C0166a(authentication, o.l(), o.m());
            } else if (ordinal == 2) {
                MethodLedLayout q = configurationResponse.q();
                h.d(q, "configurationResponse.methodLedLayout");
                Authentication h2 = q.h();
                h.d(h2, "methodLed.authentication");
                if (h2.i() > 0) {
                    authentication2 = q.h();
                } else {
                    Authentication.b bVar2 = (Authentication.b) q.h().toBuilder();
                    bVar2.m(d(eVar));
                    authentication2 = (Authentication) bVar2.build();
                }
                h.d(authentication2, "if (methodLed.authentica…  ).build()\n            }");
                aVar = new a.b(authentication2, q.l(), q.m());
            } else if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return aVar;
        }
        return b(eVar, null);
    }

    private static final List<AuthMethod> d(e eVar) {
        AuthProviderState authProviderState = AuthProviderState.AUTH_PROVIDER_STATE_LOGIN_ONLY;
        AuthMethod.b o = AuthMethod.o();
        o.m(AuthProvider.AUTH_PROVIDER_EMAIL);
        AuthProviderState authProviderState2 = AuthProviderState.AUTH_PROVIDER_STATE_LOGIN_SIGNUP;
        o.n(authProviderState2);
        GeneratedMessageLite build = o.build();
        h.d(build, "AuthMethod.newBuilder()\n…\n                .build()");
        List<AuthMethod> z = d.z((AuthMethod) build);
        if (eVar.i()) {
            a(z, AuthProvider.AUTH_PROVIDER_PHONE_NUMBER, authProviderState2);
        }
        if (eVar.f()) {
            a(z, AuthProvider.AUTH_PROVIDER_GOOGLE, eVar.g() ? authProviderState2 : authProviderState);
        }
        if (eVar.d()) {
            AuthProvider authProvider = AuthProvider.AUTH_PROVIDER_FACEBOOK;
            if (eVar.e()) {
                authProviderState = authProviderState2;
            }
            a(z, authProvider, authProviderState);
        }
        return z;
    }
}
