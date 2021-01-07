package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.bakery.e;
import com.spotify.mobile.android.sso.k;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.z;
import java.net.HttpCookie;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.h;

/* renamed from: ve2  reason: default package */
public final class ve2 implements se2 {
    private final av1 a;
    private final e b;
    private final ze2 c;

    /* access modifiers changed from: package-private */
    /* renamed from: ve2$a */
    public static final class a<T, R> implements l<Pair<? extends k, ? extends HttpCookie>, af2> {
        final /* synthetic */ ve2 a;
        final /* synthetic */ String b;
        final /* synthetic */ AuthorizationRequest c;

        a(ve2 ve2, String str, AuthorizationRequest authorizationRequest) {
            this.a = ve2;
            this.b = str;
            this.c = authorizationRequest;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public af2 apply(Pair<? extends k, ? extends HttpCookie> pair) {
            Pair<? extends k, ? extends HttpCookie> pair2 = pair;
            h.e(pair2, "<name for destructuring parameter 0>");
            ve2 ve2 = this.a;
            String str = this.b;
            AuthorizationRequest authorizationRequest = this.c;
            h.d(authorizationRequest, "authRequest");
            return ve2.b(ve2, (k) pair2.a(), str, authorizationRequest, (HttpCookie) pair2.b());
        }
    }

    public ve2(av1 av1, e eVar, ze2 ze2) {
        h.e(av1, "authorizationRequestExecutor");
        h.e(eVar, "bakeryRequestResolver");
        h.e(ze2, "requestExecutor");
        this.a = av1;
        this.b = eVar;
        this.c = ze2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [af2] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.af2 b(defpackage.ve2 r7, com.spotify.mobile.android.sso.k r8, java.lang.String r9, com.spotify.mobile.android.sso.AuthorizationRequest r10, java.net.HttpCookie r11) {
        /*
            r7.getClass()
            af2$a r0 = defpackage.af2.a.a
            r8.getClass()
            boolean r1 = r8 instanceof com.spotify.mobile.android.sso.k.b
            if (r1 == 0) goto L_0x0027
            com.spotify.mobile.android.sso.k$b r8 = (com.spotify.mobile.android.sso.k.b) r8
            java.lang.String r7 = r8.f()
            boolean r7 = kotlin.jvm.internal.h.a(r7, r9)
            if (r7 == 0) goto L_0x007b
            af2$b r0 = new af2$b
            java.lang.String r7 = r8.d()
            java.lang.String r8 = "code()"
            kotlin.jvm.internal.h.d(r7, r8)
            r0.<init>(r7)
            goto L_0x007b
        L_0x0027:
            boolean r9 = r8 instanceof com.spotify.mobile.android.sso.k.c
            if (r9 != 0) goto L_0x002f
            boolean r8 = r8 instanceof com.spotify.mobile.android.sso.k.e
            if (r8 == 0) goto L_0x0076
        L_0x002f:
            ze2 r7 = r7.c
            ue2 r7 = (defpackage.ue2) r7
            r7.getClass()
            java.lang.String r8 = "authRequest"
            kotlin.jvm.internal.h.e(r10, r8)
            java.lang.String r8 = "cookie"
            kotlin.jvm.internal.h.e(r11, r8)
            com.spotify.music.builtinauth.authenticator.d0 r8 = new com.spotify.music.builtinauth.authenticator.d0
            java.lang.String r1 = r10.b()
            com.spotify.mobile.android.sso.AuthorizationRequest$ResponseType r2 = r10.f()
            java.lang.String r3 = r10.e()
            com.spotify.mobile.android.sso.ClientIdentity r4 = r10.c()
            java.lang.String[] r6 = r10.g()
            r0 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            te2 r9 = new te2
            r9.<init>(r7, r8)
            io.reactivex.z r7 = io.reactivex.z.g(r9)
            java.lang.String r8 = "Single.create { emitter …ctivity(intent)\n        }"
            kotlin.jvm.internal.h.d(r7, r8)
            ye2 r8 = defpackage.ye2.a
            io.reactivex.z r7 = r7.E(r8)
            java.lang.Object r7 = r7.d()
            af2 r7 = (defpackage.af2) r7
            r0 = r7
        L_0x0076:
            java.lang.String r7 = "if (response.isAuthoriza…ionResult.Error\n        }"
            kotlin.jvm.internal.h.d(r0, r7)
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve2.b(ve2, com.spotify.mobile.android.sso.k, java.lang.String, com.spotify.mobile.android.sso.AuthorizationRequest, java.net.HttpCookie):af2");
    }

    public z<af2> c() {
        String uuid = UUID.randomUUID().toString();
        h.d(uuid, "UUID.randomUUID().toString()");
        AuthorizationRequest a2 = AuthorizationRequest.a("4dddafab4d054c70a710e1605a76f639", AuthorizationRequest.ResponseType.CODE, "https://alexa.amazon.com/partner-authorization/establish", null, uuid, new String[]{"playlist-read-private", "playlist-read-collaborative", "user-follow-read", "user-library-read", "user-read-private", "streaming"}, false);
        h.d(a2, "authRequest");
        s<R> a0 = this.b.a().a0(new xe2(this, a2));
        h.d(a0, "bakeryRequestResolver\n  …          }\n            }");
        z<R> B0 = a0.j0(new a(this, uuid, a2)).B0();
        h.d(B0, "getAuthorizationResponse…         .singleOrError()");
        return B0;
    }
}
