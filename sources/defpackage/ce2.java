package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.ee2;
import kotlin.jvm.internal.h;

/* renamed from: ce2  reason: default package */
public final class ce2 implements zgb {
    private final de2 a;
    private final ke2 b;

    public ce2(de2 de2, ke2 ke2) {
        h.e(de2, "alexaAccountAuthorizer");
        h.e(ke2, "resultParser");
        this.a = de2;
        this.b = ke2;
    }

    @Override // defpackage.zgb
    public void a(Intent intent) {
        ee2 ee2;
        String queryParameter;
        h.e(intent, "intent");
        Uri data = intent.getData();
        if (data != null) {
            de2 de2 = this.a;
            ke2 ke2 = this.b;
            h.d(data, "data");
            ke2.getClass();
            ee2 ee22 = ee2.b.a;
            h.e(data, "input");
            if (!(!h.a(data.getAuthority(), "open.spotify.com")) && !(!h.a(data.getPath(), "/alexa-auth")) && (queryParameter = data.getQueryParameter("state")) != null) {
                h.d(queryParameter, "getQueryParameter(\"state…rizationResult.InvalidUri");
                String queryParameter2 = data.getQueryParameter("code");
                if (queryParameter2 != null) {
                    ee2 = new ee2.c(queryParameter, queryParameter2);
                    de2.b(ee2);
                }
                ee22 = new ee2.a(queryParameter, data.getQueryParameter(AppProtocol.LogMessage.SEVERITY_ERROR));
            }
            ee2 = ee22;
            de2.b(ee2);
        }
    }
}
