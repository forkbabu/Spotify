package defpackage;

import android.os.Build;
import android.view.View;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.e0;
import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.r;
import com.spotify.mobile.android.video.s;
import com.spotify.mobile.android.video.t;
import kotlin.jvm.internal.h;

/* renamed from: hib  reason: default package */
public abstract class hib<D> extends e<D> {
    private final VideoSurfaceView C;
    private r D;
    private final String E;
    private final s F;
    private final q G;
    private final sda H;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hib(View view, int i, String str, s sVar, q qVar, sda sda, VideoSurfaceView.ScaleType scaleType, int i2) {
        this(view, i, str, sVar, qVar, sda, (i2 & 64) != 0 ? VideoSurfaceView.ScaleType.ASPECT_FILL : null);
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void l0() {
        r rVar = this.D;
        if (rVar != null) {
            rVar.L(this.C);
            rVar.seekTo(0);
            rVar.resume();
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void m0() {
        r rVar = this.D;
        if (rVar != null) {
            rVar.pause();
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void s0() {
        r rVar = this.D;
        if (rVar != null) {
            rVar.d();
        }
    }

    public final void u0(String str) {
        if (str != null) {
            if ((Build.VERSION.SDK_INT >= 26) && !this.H.a()) {
                this.C.setVisibility(0);
                s sVar = this.F;
                sVar.d(this.E);
                sVar.j(this.C);
                sVar.h(this.G);
                r a = sVar.a();
                t tVar = (t) a;
                tVar.P(true);
                tVar.a0(true);
                e0.a a2 = e0.a();
                a2.d(false);
                a2.e(false);
                a2.f(str);
                e0 b = a2.b();
                a0.a a3 = a0.a();
                a3.e(true);
                tVar.t(b, a3.b());
                this.D = a;
                return;
            }
        }
        this.C.setVisibility(8);
        this.D = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hib(View view, int i, String str, s sVar, q qVar, sda sda, VideoSurfaceView.ScaleType scaleType) {
        super(view);
        h.e(view, "itemView");
        h.e(str, "featureIdentifier");
        h.e(sVar, "betamaxPlayerBuilder");
        h.e(qVar, "betamaxCacheStorage");
        h.e(sda, "dataSaverActiveModeUtils");
        h.e(scaleType, "scaleType");
        this.E = str;
        this.F = sVar;
        this.G = qVar;
        this.H = sda;
        View G2 = q4.G(view, i);
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) G2;
        videoSurfaceView.setBufferingThrobberEnabled(false);
        videoSurfaceView.setScaleType(scaleType);
        h.d(G2, "requireViewById<VideoSur…Type(scaleType)\n        }");
        this.C = (VideoSurfaceView) G2;
    }
}
