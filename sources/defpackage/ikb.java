package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.Assertion;
import defpackage.glb;

/* renamed from: ikb  reason: default package */
public final /* synthetic */ class ikb implements glb.a {
    public static final /* synthetic */ ikb a = new ikb();

    private /* synthetic */ ikb() {
    }

    @Override // defpackage.glb.a
    public final void a(Object obj, Object obj2, Object obj3) {
        Intent intent = (Intent) obj;
        c cVar = (c) obj2;
        SessionState sessionState = (SessionState) obj3;
        int i = ykb.a;
        Logger.d("Unprocessed %s", intent);
        Logger.d("Broken url/uri is '%s'", intent.getDataString());
        Assertion.g("If you end up here, SpotifyLink is broken.");
    }
}
