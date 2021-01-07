package com.spotify.music.features.login.startview.blueprint;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.libs.pse.model.a;
import com.spotify.libs.pse.model.e;
import com.spotify.loginflow.navigation.d;
import com.spotify.music.features.login.startview.cta.a;
import com.spotify.music.features.login.startview.cta.c;
import com.spotify.pses.v1.proto.AuthMethod;
import defpackage.ce0;
import defpackage.ge0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class BlueprintActionsButtonProviderImpl implements b {
    private final a a;
    private final d b;
    private final e c;
    private final ae0 d;
    private final je0 e;

    public BlueprintActionsButtonProviderImpl(a aVar, d dVar, e eVar, ae0 ae0, je0 je0) {
        h.e(aVar, "authButtonOnClickProvider");
        h.e(dVar, "zeroNavigator");
        h.e(eVar, "psesConfiguration");
        h.e(ae0, "authTracker");
        h.e(je0, "trackedScreen");
        this.a = aVar;
        this.b = dVar;
        this.c = eVar;
        this.d = ae0;
        this.e = je0;
    }

    public static final void e(BlueprintActionsButtonProviderImpl blueprintActionsButtonProviderImpl, fe0 fe0) {
        blueprintActionsButtonProviderImpl.d.a(new ce0.c(blueprintActionsButtonProviderImpl.e, fe0, ge0.k.b));
    }

    private final void f(List<sn5> list, AuthenticationButton.AuthenticationType authenticationType, nmf<? super AuthenticationButton.Events, f> nmf, boolean z) {
        list.add(new sn5(new AuthenticationButton.Model(authenticationType, z), nmf));
    }

    @Override // com.spotify.music.features.login.startview.blueprint.b
    public List<sn5> a(a.C0166a aVar) {
        h.e(aVar, "intentLed");
        ArrayList arrayList = new ArrayList();
        List<AuthMethod> l = aVar.a().l();
        h.d(l, "authentication.authMethodsList");
        ArrayList arrayList2 = new ArrayList();
        for (T t : l) {
            if (on5.a(t)) {
                arrayList2.add(t);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            AuthenticationButton.AuthenticationType authenticationType = null;
            if (it.hasNext()) {
                switch (((AuthMethod) it.next()).l().ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                        break;
                    case 1:
                        authenticationType = AuthenticationButton.AuthenticationType.EMAIL;
                        break;
                    case 2:
                        authenticationType = AuthenticationButton.AuthenticationType.FACEBOOK;
                        break;
                    case 4:
                        authenticationType = AuthenticationButton.AuthenticationType.PHONE_NUMBER;
                        break;
                    case 5:
                        authenticationType = AuthenticationButton.AuthenticationType.GOOGLE;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (authenticationType != null) {
                    arrayList3.add(authenticationType);
                }
            } else {
                Iterator it2 = ((ArrayList) this.a.c(arrayList3, null)).iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        c cVar = (c) next;
                        f(arrayList, cVar.a(), cVar.b(), i == 0);
                        i = i2;
                    } else {
                        kotlin.collections.d.L();
                        throw null;
                    }
                }
                return arrayList;
            }
        }
    }

    @Override // com.spotify.music.features.login.startview.blueprint.b
    public List<sn5> b(a.C0166a aVar) {
        h.e(aVar, "intentLed");
        ArrayList arrayList = new ArrayList();
        List<AuthMethod> l = aVar.a().l();
        h.d(l, "authentication.authMethodsList");
        ArrayList arrayList2 = new ArrayList();
        for (T t : l) {
            if (on5.b(t)) {
                arrayList2.add(t);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            AuthenticationButton.AuthenticationType authenticationType = null;
            if (it.hasNext()) {
                switch (((AuthMethod) it.next()).l().ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                        break;
                    case 1:
                        authenticationType = AuthenticationButton.AuthenticationType.EMAIL;
                        break;
                    case 2:
                        authenticationType = AuthenticationButton.AuthenticationType.FACEBOOK;
                        break;
                    case 4:
                        authenticationType = AuthenticationButton.AuthenticationType.PHONE_NUMBER;
                        break;
                    case 5:
                        authenticationType = AuthenticationButton.AuthenticationType.GOOGLE;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (authenticationType != null) {
                    arrayList3.add(authenticationType);
                }
            } else {
                Iterator it2 = ((ArrayList) this.a.c(arrayList3, new BlueprintActionsButtonProviderImpl$intentSignup$$inlined$apply$lambda$1(arrayList, this, aVar))).iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        c cVar = (c) next;
                        f(arrayList, cVar.a(), cVar.b(), i == 0);
                        i = i2;
                    } else {
                        kotlin.collections.d.L();
                        throw null;
                    }
                }
                return arrayList;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
    @Override // com.spotify.music.features.login.startview.blueprint.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<defpackage.sn5> c(com.spotify.libs.pse.model.a.b r9) {
        /*
            r8 = this;
            com.spotify.pses.v1.proto.AuthProvider r0 = com.spotify.pses.v1.proto.AuthProvider.AUTH_PROVIDER_EMAIL
            java.lang.String r1 = "methodLed"
            kotlin.jvm.internal.h.e(r9, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.spotify.libs.pse.model.e r2 = r8.c
            boolean r2 = r2.m()
            if (r2 == 0) goto L_0x0017
            com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton$AuthenticationType r2 = com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton.AuthenticationType.EMAIL_SIGNUP_PREMIUM
            goto L_0x0019
        L_0x0017:
            com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton$AuthenticationType r2 = com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton.AuthenticationType.EMAIL_SIGNUP_LEGACY
        L_0x0019:
            java.util.List r3 = r9.d()
            boolean r4 = r3.isEmpty()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0026
            goto L_0x0049
        L_0x0026:
            java.util.Iterator r3 = r3.iterator()
        L_0x002a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r3.next()
            com.spotify.pses.v1.proto.AuthMethod r4 = (com.spotify.pses.v1.proto.AuthMethod) r4
            com.spotify.pses.v1.proto.AuthProvider r7 = r4.l()
            if (r7 != r0) goto L_0x0044
            boolean r4 = defpackage.on5.b(r4)
            if (r4 == 0) goto L_0x0044
            r4 = 1
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            if (r4 == 0) goto L_0x002a
            r3 = 1
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            if (r3 == 0) goto L_0x0054
            com.spotify.music.features.login.startview.blueprint.BlueprintActionsButtonProviderImpl$continueWithEmail$$inlined$apply$lambda$1 r3 = new com.spotify.music.features.login.startview.blueprint.BlueprintActionsButtonProviderImpl$continueWithEmail$$inlined$apply$lambda$1
            r3.<init>(r8, r9)
            r8.f(r1, r2, r3, r5)
        L_0x0054:
            java.util.List r2 = r9.d()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x005f
            goto L_0x0081
        L_0x005f:
            java.util.Iterator r2 = r2.iterator()
        L_0x0063:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0081
            java.lang.Object r3 = r2.next()
            com.spotify.pses.v1.proto.AuthMethod r3 = (com.spotify.pses.v1.proto.AuthMethod) r3
            com.spotify.pses.v1.proto.AuthProvider r4 = r3.l()
            if (r4 != r0) goto L_0x007d
            boolean r3 = defpackage.on5.a(r3)
            if (r3 == 0) goto L_0x007d
            r3 = 1
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            if (r3 == 0) goto L_0x0063
            goto L_0x0082
        L_0x0081:
            r5 = 0
        L_0x0082:
            if (r5 == 0) goto L_0x008e
            com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton$AuthenticationType r0 = com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton.AuthenticationType.EMAIL_LOG_IN
            com.spotify.music.features.login.startview.blueprint.BlueprintActionsButtonProviderImpl$continueWithEmail$$inlined$apply$lambda$2 r2 = new com.spotify.music.features.login.startview.blueprint.BlueprintActionsButtonProviderImpl$continueWithEmail$$inlined$apply$lambda$2
            r2.<init>(r8, r9)
            r8.f(r1, r0, r2, r6)
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.login.startview.blueprint.BlueprintActionsButtonProviderImpl.c(com.spotify.libs.pse.model.a$b):java.util.List");
    }
}
