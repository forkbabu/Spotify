package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

public final /* synthetic */ class c implements MediaCodecUtil.f {
    public final /* synthetic */ d0 a;

    public /* synthetic */ c(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
    public final int a(Object obj) {
        try {
            return ((e) obj).e(this.a) ? 1 : 0;
        } catch (MediaCodecUtil.DecoderQueryException unused) {
            return -1;
        }
    }
}
