package defpackage;

import com.spotify.music.nowplaying.common.view.contextmenu.n;
import com.spotify.music.nowplaying.common.view.logging.c;
import com.spotify.music.nowplaying.drivingmode.view.DrivingModeFragment;

/* renamed from: xub  reason: default package */
public class xub implements n.a {
    private final c a;
    private ovb b;

    public xub(c cVar) {
        this.a = cVar;
    }

    @Override // com.spotify.music.nowplaying.common.view.contextmenu.n.a
    public void a() {
        ((DrivingModeFragment) this.b).M4();
        this.a.h();
    }

    public void b(n nVar, ovb ovb) {
        this.b = ovb;
        nVar.setListener(this);
    }
}
