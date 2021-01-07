package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.m;
import com.google.android.exoplayer2.audio.u;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.text.i;
import com.google.android.exoplayer2.video.s;
import kotlin.jvm.internal.h;

/* renamed from: u31  reason: default package */
final class u31 implements s0 {
    final /* synthetic */ Context a;

    u31(Context context) {
        this.a = context;
    }

    @Override // com.google.android.exoplayer2.s0
    public final p0[] a(Handler handler, s sVar, m mVar, i iVar, zm zmVar, n<com.google.android.exoplayer2.drm.s> nVar) {
        h.e(handler, "eventHandler");
        h.e(sVar, "<anonymous parameter 1>");
        h.e(mVar, "audioRendererEventListener");
        h.e(iVar, "<anonymous parameter 3>");
        h.e(zmVar, "<anonymous parameter 4>");
        return new u[]{new u(this.a, f.a, null, false, false, handler, mVar, new DefaultAudioSink(null, new AudioProcessor[0]))};
    }
}
