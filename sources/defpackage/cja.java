package defpackage;

import android.os.Bundle;
import io.reactivex.z;

/* renamed from: cja  reason: default package */
public class cja implements aja {
    private final asd a;

    public cja(asd asd) {
        this.a = asd;
    }

    /* access modifiers changed from: private */
    public static bja c(String str) {
        return new zia(2, str != null ? je.E("com.spotify.music.extra.ERROR_MESSAGE", str) : null);
    }

    @Override // defpackage.aja
    public boolean a(String str) {
        return "check_denied".equals(str);
    }

    @Override // defpackage.aja
    public z<bja> b(Bundle bundle) {
        if (bundle == null) {
            return z.z(c("Extras are null"));
        }
        String string = bundle.getString("com.spotify.music.extra.PACKAGE_NAME", null);
        if (string == null) {
            return z.z(c("Missing package name extra"));
        }
        return this.a.a().A(new wia(string)).E(via.a);
    }
}
