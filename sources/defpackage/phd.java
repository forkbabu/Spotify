package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;

/* renamed from: phd  reason: default package */
public class phd {
    private static final SpSharedPreferences.b<Object, Boolean> d = SpSharedPreferences.b.c("install_referrer_read");
    private final Context a;
    private final SpSharedPreferences<Object> b;
    private final String c;

    public phd(Context context, i iVar, String str) {
        this.a = context;
        this.b = iVar.a(context);
        this.c = str;
    }

    private void c(Context context, String str) {
        str.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(67108864);
        intent.setClassName(context, this.c);
        context.startActivity(intent);
    }

    public void a(String str) {
        boolean z;
        Context context = this.a;
        StringBuilder V0 = je.V0("https://r.spotify.com/");
        V0.append(Uri.decode(str));
        String sb = V0.toString();
        if (!l0.z(sb).v()) {
            z = false;
        } else {
            c(context, sb);
            z = true;
        }
        if (!z) {
            Context context2 = this.a;
            if (str != null) {
                int indexOf = str.indexOf(63);
                if (indexOf >= 0) {
                    str = str.substring(0, indexOf);
                }
                if (l0.z(str).q() != LinkType.DUMMY) {
                    c(context2, str);
                }
            }
        }
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.a(d, true);
        b2.j();
        Logger.g("Install referrer read", new Object[0]);
    }

    public boolean b() {
        return this.b.d(d, false);
    }
}
