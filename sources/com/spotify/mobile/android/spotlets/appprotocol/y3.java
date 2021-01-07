package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.util.b;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.appprotocol.api.NotAuthorizedException;
import com.spotify.music.appprotocol.api.a;
import io.reactivex.s;
import java.util.LinkedHashMap;
import java.util.Map;

public final class y3 implements x3 {
    private final Runnable a;
    private final qg0<Integer> b;
    private final b c;
    private final Map<String, bf2<? extends JacksonModel, ? extends JacksonModel>> d = new LinkedHashMap(35);

    public y3(Runnable runnable, qg0<Integer> qg0, b bVar, a aVar) {
        this.a = runnable;
        this.b = qg0;
        this.c = bVar;
        aVar.a(new s3(this));
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.x3
    public s<? extends JacksonModel> a(oq1 oq1) {
        try {
            this.a.run();
            String h = oq1.h();
            Logger.l("Resolving IAP endpoint for URI: \"%s\".", h);
            try {
                bf2<? extends JacksonModel, ? extends JacksonModel> bf2 = this.d.get(h);
                if (bf2 == null) {
                    String format = String.format("No IAP endpoint for URI: \"%s\".", h);
                    Logger.d(format, new Object[0]);
                    return s.P(new IapException(format, "wamp.error.invalid_uri"));
                }
                this.b.accept(Integer.valueOf(bf2.b()));
                return bf2.a(this.c.a(oq1, bf2));
            } catch (IapException e) {
                Logger.e(e, "Exception calling IAP endpoint on URI: \"%s\".", h);
                return s.P(e);
            } catch (Exception e2) {
                Logger.e(e2, "Exception calling IAP endpoint on URI: \"%s\".", h);
                return s.P(new IapException(e2, e2.getClass(), "wamp.error"));
            }
        } catch (NotAuthorizedException e3) {
            return s.P(e3);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(bf2<? extends JacksonModel, ? extends JacksonModel> bf2) {
        if (this.d.containsKey(bf2.getUri())) {
            Assertion.g(String.format("Endpoint already registered for URI: \"%s\".", bf2.getUri()));
        } else {
            this.d.put(bf2.getUri(), bf2);
        }
    }
}
