package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.intentrouter.h;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import com.spotify.music.navigation.l;
import defpackage.alb;
import defpackage.elb;

/* renamed from: zkb  reason: default package */
public class zkb {
    private final alb.b a;
    private final l b;
    private final qg0<Intent> c;

    public zkb(alb.b bVar, l lVar, qg0<Intent> qg0) {
        this.a = bVar;
        this.b = lVar;
        this.c = qg0;
    }

    public /* synthetic */ void a(Intent intent) {
        this.c.accept(intent);
    }

    public /* synthetic */ void b(elb.c cVar, Intent intent) {
        this.b.a(cVar.e(), intent);
    }

    public /* synthetic */ void c(k kVar, Intent intent, c cVar, SessionState sessionState) {
        this.b.a(kVar.a(intent, l0.z(intent.getDataString()), intent.getStringExtra("title"), cVar, sessionState), intent);
    }

    public h<hlb> d(vkb vkb, String str) {
        return this.a.b(new nkb(this, vkb), str, okb.a);
    }

    public h<hlb> e(k kVar, String str) {
        return this.a.a(new pkb(this, kVar), je.y0("Push ", str, " to the backstack"), kkb.a);
    }
}
