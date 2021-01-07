package com.spotify.music.offlinetrials.limited.trackentity;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.n;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.music.C0707R;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixInteractionLogger;
import com.spotify.music.offlinetrials.limited.logging.c;
import com.spotify.music.offlinetrials.limited.trackentity.endpoint.a;
import com.spotify.music.offlinetrials.limited.uicomponents.u;
import defpackage.s51;
import io.reactivex.disposables.b;
import io.reactivex.y;
import java.util.EnumSet;

public class j implements Object<DownloadHeaderView>, pk9 {
    private final n a;
    private final n b;
    private final u c;
    private final String f;
    private final a n;
    private final y o;
    private final OfflineUserMixInteractionLogger p;
    private b q;

    j(n nVar, n nVar2, u uVar, String str, a aVar, y yVar, c cVar, com.spotify.music.libs.viewuri.c cVar2, com.spotify.instrumentation.a aVar2) {
        this.a = nVar;
        this.b = nVar2;
        this.c = uVar;
        this.f = str;
        this.n = aVar;
        this.o = yVar;
        this.p = cVar.b(cVar2, aVar2);
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) view;
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) view;
        downloadHeaderView.setSongsOnly(false);
        downloadHeaderView.setObserver(new i(this, w51, s81, downloadHeaderView));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.row_download_toggle;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) je.G(viewGroup, C0707R.layout.header_download, viewGroup, false);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        downloadHeaderView.setBackground(null);
        this.b.A().a(new OfflineSwitchHubsComponentBinder$1(this, downloadHeaderView));
        return downloadHeaderView;
    }
}
