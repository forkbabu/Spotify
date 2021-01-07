package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.renameplaylist.RenamePlaylistLogger;
import com.spotify.playlist.endpoints.i;
import com.spotify.rxjava2.q;
import io.reactivex.a;
import io.reactivex.y;

/* renamed from: r48  reason: default package */
public class r48 implements q48 {
    private final RenamePlaylistLogger a;
    private final y b;
    private final i c;
    private final String d;
    private final q e = new q();
    private w48 f;

    public r48(RenamePlaylistLogger renamePlaylistLogger, y yVar, i iVar, n48 n48) {
        this.a = renamePlaylistLogger;
        this.b = yVar;
        this.c = iVar;
        this.d = n48.a();
    }

    @Override // defpackage.q48
    public void a() {
        this.a.b();
        ((x48) this.f).c();
    }

    @Override // defpackage.q48
    public void b() {
        this.a.a();
    }

    @Override // defpackage.q48
    public void c(String str) {
        ((x48) this.f).d(!str.isEmpty());
    }

    @Override // defpackage.q48
    public void d(w48 w48) {
        this.f = w48;
    }

    @Override // defpackage.q48
    public void e(String str) {
        this.a.d();
        if (!str.isEmpty()) {
            ((x48) this.f).d(false);
            q qVar = this.e;
            a A = this.c.g(this.d, str).A(this.b);
            w48 w48 = this.f;
            w48.getClass();
            qVar.a(A.subscribe(new p48(w48), new o48(this)));
        }
    }

    public /* synthetic */ void f(Throwable th) {
        Logger.e(th, "Failed to rename playlist", new Object[0]);
        ((x48) this.f).d(true);
    }

    @Override // defpackage.q48
    public void stop() {
        this.e.c();
    }
}
