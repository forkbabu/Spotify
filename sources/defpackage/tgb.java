package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.util.l0;

/* renamed from: tgb  reason: default package */
public class tgb implements zgb {
    private final sgb a;

    public tgb(sgb sgb) {
        this.a = sgb;
    }

    @Override // defpackage.zgb
    public void a(Intent intent) {
        if ("android.intent.action.VIEW".equals(intent.getAction())) {
            this.a.a(intent, l0.z(intent.getDataString()));
        }
    }
}
