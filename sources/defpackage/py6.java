package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.j;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;

/* renamed from: py6  reason: default package */
public class py6 implements oy6 {
    private final SnackbarManager a;
    private final i b;
    private final v c;

    public py6(SnackbarManager snackbarManager, i iVar, v vVar) {
        this.a = snackbarManager;
        this.b = iVar;
        this.c = vVar;
    }

    @Override // defpackage.oy6
    public void a(boolean z) {
        je.e(z ? C0707R.string.playlist_snackbar_now_collaborative : C0707R.string.playlist_snackbar_now_uncollaborative, this.a);
    }

    @Override // defpackage.oy6
    public a b(j jVar, boolean z) {
        return this.b.b(jVar.getUri(), z).d(a.n(new ny6(this, z, jVar)));
    }

    public /* synthetic */ e c(boolean z, j jVar) {
        if (z) {
            return this.c.b(jVar.getUri(), false);
        }
        return b.a;
    }
}
