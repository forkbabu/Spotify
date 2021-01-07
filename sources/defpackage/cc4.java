package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.navigation.t;

/* renamed from: cc4  reason: default package */
public class cc4 implements blb {
    private final t a;

    public cc4(t tVar) {
        this.a = tVar;
    }

    public void a(Intent intent, c cVar, SessionState sessionState) {
        t tVar = this.a;
        oxa oxa = new oxa();
        String stringExtra = intent.getStringExtra("query");
        if (stringExtra != null) {
            oxa.c(stringExtra);
        }
        tVar.d(oxa.a());
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        zb4 zb4 = zb4.a;
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.FIND, "Page presenting the top level find content as an entry point to search and genres.", zb4);
        xkb.i(LinkType.BROWSE_ROOT, "Page presenting the top level find content as an entry point to search and genres.", zb4);
        xkb.i(LinkType.BROWSE_GENRES, "Page presenting a browse genre.", zb4);
        xkb.i(LinkType.SPECIAL, "Page presenting special content in the scope of browse.", zb4);
        xkb.d("android.intent.action.SEARCH", "Open Find if NPT is enabled or Search if not.", new ac4(this));
    }
}
