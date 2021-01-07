package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: l7c  reason: default package */
public class l7c {
    private final g<ContextTrack> a;
    private final p b = new p();
    private n7c c;

    public l7c(g<ContextTrack> gVar) {
        this.a = gVar;
    }

    public static void a(l7c l7c, ContextTrack contextTrack) {
        l7c.c.setTitle(InterruptionUtil.isInterruptionUri(contextTrack.uri()) ? C0707R.string.sas_interruption_title : C0707R.string.advertisement_title);
    }

    public void b(n7c n7c) {
        this.c = n7c;
        this.b.b(this.a.subscribe(new w6c(this)));
    }

    public void c() {
        this.b.a();
    }
}
