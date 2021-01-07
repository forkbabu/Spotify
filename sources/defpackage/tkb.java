package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.glb;
import io.reactivex.functions.a;

/* renamed from: tkb  reason: default package */
public final /* synthetic */ class tkb implements a {
    public final /* synthetic */ glb.a a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ c c;
    public final /* synthetic */ SessionState d;

    public /* synthetic */ tkb(glb.a aVar, Intent intent, c cVar, SessionState sessionState) {
        this.a = aVar;
        this.b = intent;
        this.c = cVar;
        this.d = sessionState;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
