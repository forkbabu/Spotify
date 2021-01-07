package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.util.l0;

/* renamed from: vyc  reason: default package */
public final /* synthetic */ class vyc implements c4e {
    public static final /* synthetic */ vyc a = new vyc();

    private /* synthetic */ vyc() {
    }

    @Override // defpackage.c4e
    public final String a(String str) {
        l0 z = l0.z(str);
        if (Uri.EMPTY.equals(z.a)) {
            return null;
        }
        StringBuilder V0 = je.V0("https://open.spotify.com/");
        V0.append(z.a.getEncodedPath());
        return V0.toString();
    }
}
