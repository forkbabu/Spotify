package com.spotify.music.features.login.startview.cta;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.d;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.je0;
import java.util.ArrayList;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class a {
    private final ae0 a;
    private final d b;
    private final je0 c;

    public a(ae0 ae0, d dVar, je0 je0) {
        h.e(ae0, "authTracker");
        h.e(dVar, "zeroNavigator");
        h.e(je0, "trackedScreen");
        this.a = ae0;
        this.b = dVar;
        this.c = je0;
    }

    public static final void b(a aVar, fe0 fe0) {
        aVar.a.a(new ce0.c(aVar.c, fe0, ge0.k.b));
    }

    public final List<c> c(List<? extends AuthenticationButton.AuthenticationType> list, nmf<? super AuthenticationButton.AuthenticationType, ? extends nmf<? super AuthenticationButton.Events, f>> nmf) {
        nmf nmf2;
        AuthButtonOnClickProvider$onClickConsumerTrackAndNavigate$1 authButtonOnClickProvider$onClickConsumerTrackAndNavigate$1;
        Destination.Google.SupportedSourceScreen supportedSourceScreen;
        h.e(list, "authButtonTypes");
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(list, 10));
        for (T t : list) {
            if (nmf == null || (nmf2 = (nmf) nmf.invoke(t)) == null) {
                int ordinal = t.ordinal();
                if (ordinal == 1) {
                    authButtonOnClickProvider$onClickConsumerTrackAndNavigate$1 = new AuthButtonOnClickProvider$onClickConsumerTrackAndNavigate$1(this, fe0.r.b, Destination.g.a);
                } else if (ordinal == 2) {
                    nmf2 = new AuthButtonOnClickProvider$onClickFacebook$1(this);
                } else if (ordinal == 3) {
                    fe0.f fVar = fe0.f.b;
                    je0 je0 = this.c;
                    if (h.a(je0, je0.o.b)) {
                        supportedSourceScreen = Destination.Google.SupportedSourceScreen.Start;
                    } else if (h.a(je0, je0.b.b)) {
                        supportedSourceScreen = Destination.Google.SupportedSourceScreen.Chooser;
                    } else {
                        throw new IllegalStateException("Google flow started from unexpected screen");
                    }
                    authButtonOnClickProvider$onClickConsumerTrackAndNavigate$1 = new AuthButtonOnClickProvider$onClickConsumerTrackAndNavigate$1(this, fVar, new Destination.Google(supportedSourceScreen));
                } else if (ordinal == 4) {
                    nmf2 = new AuthButtonOnClickProvider$onClickConsumerTrackAndNavigate$1(this, fe0.l.b, new Destination.e(null, null, 3));
                } else if (ordinal == 7 || ordinal == 8) {
                    nmf2 = new AuthButtonOnClickProvider$onClickConsumerTrackAndNavigateForResult$1(this, fe0.v.b, 45500, Destination.h.a.a);
                } else {
                    throw new IllegalStateException("Unexpected default button");
                }
                nmf2 = authButtonOnClickProvider$onClickConsumerTrackAndNavigate$1;
            }
            arrayList.add(new c(t, nmf2));
        }
        return arrayList;
    }
}
