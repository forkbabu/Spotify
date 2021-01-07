package com.spotify.music.features.login.startview.cta;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.libs.pse.model.a;
import com.spotify.loginflow.navigation.d;
import com.spotify.pses.v1.proto.AuthMethod;
import com.spotify.pses.v1.proto.AuthProvider;
import defpackage.ce0;
import defpackage.ge0;
import defpackage.je0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class e implements d {
    private final ae0 a;
    private final d b;
    private final a c;
    private final boolean d;

    public e(ae0 ae0, d dVar, a aVar, boolean z) {
        h.e(ae0, "authTracker");
        h.e(dVar, "zeroNavigator");
        h.e(aVar, "authButtonOnClickProvider");
        this.a = ae0;
        this.b = dVar;
        this.c = aVar;
        this.d = z;
    }

    public static final void d(e eVar, fe0 fe0) {
        eVar.a.a(new ce0.c(je0.o.b, fe0, ge0.k.b));
    }

    private final void e(List<sn5> list, AuthenticationButton.AuthenticationType authenticationType, nmf<? super AuthenticationButton.Events, f> nmf, boolean z) {
        list.add(new sn5(new AuthenticationButton.Model(authenticationType, z), nmf));
    }

    @Override // com.spotify.music.features.login.startview.cta.d
    public List<sn5> a(a aVar) {
        ArrayList arrayList;
        AuthenticationButton.AuthenticationType authenticationType;
        AuthenticationButton.AuthenticationType authenticationType2;
        boolean z;
        AuthenticationButton.AuthenticationType authenticationType3;
        h.e(aVar, "blueprint");
        boolean z2 = true;
        if (aVar instanceof a.c) {
            List<AuthMethod> l = ((a.c) aVar).a().l();
            h.d(l, "authentication.authMethodsList");
            h.e(l, "authMethods");
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (T t : l) {
                if (on5.a(t)) {
                    arrayList2.add(t);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AuthMethod authMethod = (AuthMethod) it.next();
                switch (authMethod.l().ordinal()) {
                    case 1:
                        if (on5.b(authMethod)) {
                            if (this.d) {
                                authenticationType3 = AuthenticationButton.AuthenticationType.EMAIL_SIGNUP_PREMIUM;
                                break;
                            } else {
                                authenticationType3 = AuthenticationButton.AuthenticationType.EMAIL_SIGNUP_LEGACY;
                                break;
                            }
                        }
                    case 0:
                    case 3:
                    case 6:
                        authenticationType3 = null;
                        break;
                    case 2:
                        authenticationType3 = AuthenticationButton.AuthenticationType.FACEBOOK;
                        break;
                    case 4:
                        authenticationType3 = AuthenticationButton.AuthenticationType.PHONE_NUMBER;
                        break;
                    case 5:
                        authenticationType3 = AuthenticationButton.AuthenticationType.GOOGLE;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (authenticationType3 != null) {
                    arrayList3.add(authenticationType3);
                }
            }
            Iterator it2 = ((ArrayList) this.c.c(arrayList3, null)).iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    c cVar = (c) next;
                    e(arrayList, cVar.a(), cVar.b(), i == 0);
                    i = i2;
                } else {
                    kotlin.collections.d.L();
                    throw null;
                }
            }
            if (!l.isEmpty()) {
                Iterator<T> it3 = l.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        T next2 = it3.next();
                        if (next2.l() != AuthProvider.AUTH_PROVIDER_EMAIL || !on5.a(next2)) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                        }
                    }
                }
            }
            z2 = false;
            if (z2) {
                e(arrayList, AuthenticationButton.AuthenticationType.EMAIL_LOGIN_LEGACY, new StartButtonProviderImpl$traditional$$inlined$apply$lambda$1(this, l), false);
            }
        } else if (aVar instanceof a.C0166a) {
            arrayList = new ArrayList();
            if (this.d) {
                authenticationType2 = AuthenticationButton.AuthenticationType.EMAIL_SIGNUP_PREMIUM;
            } else {
                authenticationType2 = AuthenticationButton.AuthenticationType.EMAIL_SIGNUP_LEGACY;
            }
            e(arrayList, authenticationType2, new StartButtonProviderImpl$intentLed$$inlined$apply$lambda$1(this), true);
            e(arrayList, AuthenticationButton.AuthenticationType.EMAIL_LOG_IN, new StartButtonProviderImpl$intentLed$$inlined$apply$lambda$2(this), false);
        } else if (aVar instanceof a.b) {
            List<AuthMethod> d2 = ((a.b) aVar).d();
            h.e(d2, "authMethods");
            arrayList = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (T t2 : d2) {
                if (on5.a(t2)) {
                    arrayList4.add(t2);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                switch (((AuthMethod) it4.next()).l().ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                        authenticationType = null;
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
                    arrayList5.add(authenticationType);
                }
            }
            Iterator it5 = ((ArrayList) this.c.c(arrayList5, new StartButtonProviderImpl$methodLed$$inlined$apply$lambda$1(arrayList, this, d2))).iterator();
            int i3 = 0;
            while (it5.hasNext()) {
                Object next3 = it5.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    c cVar2 = (c) next3;
                    e(arrayList, cVar2.a(), cVar2.b(), i3 == 0);
                    i3 = i4;
                } else {
                    kotlin.collections.d.L();
                    throw null;
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return arrayList;
    }
}
