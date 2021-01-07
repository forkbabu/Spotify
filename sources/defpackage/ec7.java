package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.libs.podcast.download.DownloadDialogLifecycleAwareUtil;
import com.spotify.playlist.models.offline.a;
import defpackage.dc7;
import defpackage.mpa;
import java.util.List;

/* renamed from: ec7  reason: default package */
public class ec7 implements dc7 {
    private final ajf<dc7.a> a;
    private final apa b;
    private final DownloadDialogLifecycleAwareUtil c;
    private LottieAnimationView d;

    public ec7(ajf<dc7.a> ajf, apa apa, DownloadDialogLifecycleAwareUtil downloadDialogLifecycleAwareUtil) {
        this.a = ajf;
        this.b = apa;
        this.c = downloadDialogLifecycleAwareUtil;
    }

    @Override // defpackage.dc7
    public void a(g77 g77) {
        vqc vqc;
        Object tag = this.d.getTag();
        if (tag instanceof vqc) {
            vqc = (vqc) tag;
        } else {
            vqc = this.b.a();
        }
        this.d.setTag(vqc);
        String i = g77.i();
        a o = g77.o();
        mpa.a b2 = mpa.b();
        b2.e(o);
        b2.g(this.d);
        b2.f(vqc);
        b2.b(i);
        b2.a(g77.f());
        lpa.a(b2.build());
        this.d.setOnClickListener(new yb7(this, o, i));
    }

    @Override // defpackage.dc7
    public void b(int i) {
        LottieAnimationView lottieAnimationView = this.d;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(i);
        }
    }

    @Override // defpackage.dc7
    public void c(LottieAnimationView lottieAnimationView) {
        lottieAnimationView.getClass();
        this.d = lottieAnimationView;
    }

    public void d(a aVar, String str, View view) {
        this.c.b(aVar, str, new ac7(this, str), new zb7(this, str));
    }

    public /* synthetic */ void e(String str) {
        this.a.get().a(str);
    }

    public /* synthetic */ void f(String str, List list) {
        this.a.get().b(str, list);
    }
}
