package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.music.features.playlistentity.t;
import defpackage.f86;

/* renamed from: l86  reason: default package */
final class l86 implements k86, j86 {
    private static final int o = l86.class.hashCode();
    private final b86 a;
    private final Context b;
    private final f86 c;
    private twd f;
    private DownloadHeaderView n;

    /* renamed from: l86$a */
    class a implements DownloadHeaderView.a {
        a() {
        }

        @Override // com.spotify.mobile.android.ui.view.DownloadHeaderView.a
        public void a() {
            l86.this.a.h();
        }

        @Override // com.spotify.mobile.android.ui.view.DownloadHeaderView.a
        public void b(boolean z) {
            l86.this.a.i(z);
        }
    }

    public l86(d86 d86, Context context, f86.a aVar) {
        this.a = d86.b();
        this.b = context;
        this.c = aVar.create();
    }

    @Override // defpackage.j86
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup, twd twd) {
        this.f = twd;
        DownloadHeaderView a2 = DownloadHeaderView.a(this.b, null);
        this.n = a2;
        a2.setShowConfirmationDialogOnRemoveDownload(true);
        this.n.setObserver(new a());
        twd twd2 = this.f;
        v02 v02 = new v02(this.n, true);
        int i = o;
        twd2.Z(v02, i);
        this.c.s(twd);
        this.f.i0(i);
    }

    @Override // defpackage.g8c
    public void b(com.spotify.playlist.models.offline.a aVar) {
        this.n.r(aVar);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.a.c(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        return this.a.d();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.a.c(this);
    }

    public void j(boolean z) {
        this.n.setSongsOnly(z);
    }

    public void k(boolean z) {
        if (z) {
            this.f.l0(o);
        } else {
            this.f.i0(o);
        }
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.a.j(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.a.k();
    }

    public void q(boolean z) {
        this.c.q(z);
    }
}
