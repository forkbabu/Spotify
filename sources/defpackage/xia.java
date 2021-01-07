package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.mobile.android.sso.m;
import com.spotify.music.builtinauth.authenticator.f0;
import com.spotify.music.builtinauth.authenticator.h0;
import com.spotify.music.builtinauth.model.a;
import io.reactivex.z;

/* renamed from: xia  reason: default package */
public class xia implements aja {
    private final h0 a;
    private final m b;
    private final Context c;

    public xia(f0 f0Var, m mVar, Context context) {
        this.a = f0Var;
        this.b = mVar;
        this.c = context;
    }

    /* access modifiers changed from: private */
    public static bja c(int i, String str) {
        return new zia(i, str != null ? je.E("com.spotify.music.extra.ERROR_MESSAGE", str) : null);
    }

    @Override // defpackage.aja
    public boolean a(String str) {
        return "preflight_auth".equals(str);
    }

    @Override // defpackage.aja
    public z<bja> b(Bundle bundle) {
        a aVar;
        if (bundle == null) {
            return z.z(c(3, "Extras are null"));
        }
        ClientIdentity clientIdentity = null;
        String string = bundle.getString("com.spotify.music.extra.CLIENT_ID", null);
        String string2 = bundle.getString("com.spotify.music.extra.REDIRECT_URI", null);
        String str = "com.spotify.music.extra.PACKAGE_NAME";
        String string3 = bundle.getString(str, null);
        if (string == null || string2 == null || string3 == null) {
            StringBuilder V0 = je.V0("Missing extras: ");
            V0.append(string == null ? "com.spotify.music.extra.CLIENT_ID, " : "");
            V0.append(string2 == null ? "com.spotify.music.extra.REDIRECT_URI, " : "");
            if (string3 != null) {
                str = "";
            }
            V0.append(str);
            return z.z(c(3, V0.toString()));
        }
        boolean z = bundle.getBoolean("com.spotify.music.extra.SHOW_AUTH_VIEW", false);
        try {
            m mVar = this.b;
            Context context = this.c;
            mVar.getClass();
            clientIdentity = ClientIdentity.c(context, string3);
        } catch (ClientIdentity.ValidationException unused) {
        }
        ImmutableMap of = ImmutableMap.of("redirect_uri", string2, "show_auth_view", String.valueOf(z), "scopes", "app-remote-control");
        ImmutableList of2 = ImmutableList.of("com.spotify.mobile.android.spotlets.appprotocol.model.APP_ID");
        if (clientIdentity != null) {
            aVar = a.b(string, of, of2, clientIdentity);
        } else {
            aVar = a.a(string, of, of2);
        }
        try {
            this.a.a(aVar);
            return this.a.b(aVar).O(uia.a).E(tia.a);
        } catch (Exception e) {
            return z.z(c(3, e.getMessage()));
        }
    }
}
