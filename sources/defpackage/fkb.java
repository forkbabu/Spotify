package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.z;

/* renamed from: fkb  reason: default package */
public final /* synthetic */ class fkb implements vkb {
    public final /* synthetic */ flb a;

    public /* synthetic */ fkb(flb flb) {
        this.a = flb;
    }

    @Override // defpackage.vkb
    public final z a(Intent intent, c cVar, SessionState sessionState) {
        return z.z(this.a.a(intent, cVar, sessionState));
    }
}
