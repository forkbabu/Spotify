package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements a {
    private final s a;

    r(s sVar) {
        this.a = sVar;
    }

    @Override // com.google.android.gms.tasks.a
    public final Object a(g gVar) {
        this.a.getClass();
        Bundle bundle = (Bundle) gVar.o(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString(AppProtocol.LogMessage.SEVERITY_ERROR);
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String.valueOf(bundle).length();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
