package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: mz3  reason: default package */
public class mz3 implements Object<DownloadHeaderView>, pk9 {
    private final k a;
    private final yx3 b;

    mz3(k kVar, yx3 yx3) {
        this.a = kVar;
        this.b = yx3;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) view;
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) view;
        downloadHeaderView.setSongsOnly(false);
        downloadHeaderView.setObserver(new lz3(this, w51, s81));
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
        this.b.a(downloadHeaderView);
        this.a.y0(new kz3(this, downloadHeaderView));
        return downloadHeaderView;
    }
}
