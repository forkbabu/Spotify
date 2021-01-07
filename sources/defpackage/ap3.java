package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ap3  reason: default package */
public class ap3 implements d {
    private final zo3 a;
    private final g<PlayerState> b;
    private final y c;
    private b f;

    ap3(zo3 zo3, g<PlayerState> gVar, y yVar) {
        this.a = zo3;
        this.b = gVar;
        this.c = yVar;
    }

    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.d();
        } else {
            this.a.c();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.f = this.b.O(xo3.a).s().Q(this.c).subscribe(new yo3(this));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.f.dispose();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "ComScoreWrapperUpdater";
    }
}
