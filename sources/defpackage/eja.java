package defpackage;

import android.os.Bundle;
import com.google.protobuf.u;
import com.spotify.messages.ClientAuthEventRequest;
import com.spotify.remoteconfig.AndroidMediaBrowserServiceProperties;
import io.reactivex.z;

/* renamed from: eja  reason: default package */
public class eja implements aja {
    private final AndroidMediaBrowserServiceProperties a;
    private final gl0<u> b;

    public eja(AndroidMediaBrowserServiceProperties androidMediaBrowserServiceProperties, gl0<u> gl0) {
        this.a = androidMediaBrowserServiceProperties;
        this.b = gl0;
    }

    private static bja c(String str) {
        if (str != null) {
            new Bundle().putString("com.spotify.music.extra.ERROR_MESSAGE", str);
        }
        return new zia(2, null);
    }

    @Override // defpackage.aja
    public boolean a(String str) {
        return "com.spotify.music.command.COMMAND_REMOTE_CONFIG".equals(str);
    }

    @Override // defpackage.aja
    public z<bja> b(Bundle bundle) {
        if (bundle == null) {
            return z.z(c("Extras are null"));
        }
        if (!bundle.containsKey("com.spotify.music.extra.GOOGLE_ANALYTICS_IDENTIFIER")) {
            return z.z(c("Missing extra com.spotify.music.extra.GOOGLE_ANALYTICS_IDENTIFIER"));
        }
        if (!bundle.containsKey("com.spotify.music.extra.CLIENT_ID")) {
            return z.z(c("Missing extra com.spotify.music.extra.CLIENT_ID"));
        }
        if (!bundle.containsKey("com.spotify.music.extra.REMOTE_PROPERTY")) {
            return z.z(c("Missing extra com.spotify.music.extra.REMOTE_PROPERTY"));
        }
        String string = bundle.getString("com.spotify.music.extra.REMOTE_PROPERTY", null);
        if (!string.equals("bypass_auth_hadouken")) {
            return z.z(c(je.x0("Unknown property ", string)));
        }
        AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck a2 = this.a.a();
        if (!a2.equals(AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck.NOT_INITIALIZED)) {
            String string2 = bundle.getString("com.spotify.music.extra.GOOGLE_ANALYTICS_IDENTIFIER");
            String string3 = bundle.getString("com.spotify.music.extra.CLIENT_ID");
            ClientAuthEventRequest.b l = ClientAuthEventRequest.l();
            l.m(string2);
            l.n(string3);
            this.b.c(l.build());
        }
        return z.z(new zia(1, je.E("bypass_auth_hadouken", String.valueOf(a2.equals(AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck.TRUE)))));
    }
}
