package defpackage;

import android.view.View;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: iqb  reason: default package */
public class iqb {
    private final g<Ad> a;
    private final p b = new p();
    private View c;

    public iqb(g<Ad> gVar) {
        this.a = gVar;
    }

    public static void a(iqb iqb, Ad ad) {
        iqb.getClass();
        int i = 0;
        boolean z = l0.z(ad.clickUrl()).q() == LinkType.ADS_MIC_PERMISSIONS;
        View view = iqb.c;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void b(View view) {
        this.c = view;
        view.setOnClickListener(tpb.a);
        this.b.b(this.a.subscribe(new upb(this)));
    }

    public void c() {
        this.b.a();
    }
}
