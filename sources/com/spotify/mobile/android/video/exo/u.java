package com.spotify.mobile.android.video.exo;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.m;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.text.i;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.s;
import com.google.android.exoplayer2.x;
import com.spotify.mobile.android.video.h0;
import com.spotify.mobile.android.video.sync.b;
import com.spotify.mobile.android.video.sync.c;
import com.spotify.mobile.android.video.t;
import java.util.ArrayList;

public class u extends x {
    private final h0 f;
    private final b g;

    public u(Context context, b bVar, int i, h0 h0Var) {
        super(context, i);
        this.f = h0Var;
        this.g = bVar;
    }

    @Override // com.google.android.exoplayer2.x, com.google.android.exoplayer2.s0
    public p0[] a(Handler handler, s sVar, m mVar, i iVar, zm zmVar, n<com.google.android.exoplayer2.drm.s> nVar) {
        p0[] a = super.a(handler, sVar, mVar, iVar, zmVar, nVar);
        h0 h0Var = this.f;
        if (h0Var != null) {
            ((t) h0Var).r0(a);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.x
    public void b(Context context, int i, f fVar, n<com.google.android.exoplayer2.drm.s> nVar, boolean z, boolean z2, AudioProcessor[] audioProcessorArr, Handler handler, m mVar, ArrayList<p0> arrayList) {
        if (this.g == null) {
            super.b(context, i, fVar, nVar, z, z2, audioProcessorArr, handler, mVar, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.x
    public void c(Context context, Handler handler, int i, ArrayList<p0> arrayList) {
        b bVar = this.g;
        if (bVar != null) {
            arrayList.add(new c(bVar));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.x
    public void d(Context context, int i, f fVar, n<com.google.android.exoplayer2.drm.s> nVar, boolean z, boolean z2, Handler handler, s sVar, long j, ArrayList<p0> arrayList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23 && i2 >= 17) {
            arrayList.add(com.google.android.video.exo.b.X0(context, true, 5000, handler, sVar, 50));
        } else {
            arrayList.add(new MediaCodecVideoRenderer(context, f.a, j, false, handler, sVar, 50));
        }
    }
}
