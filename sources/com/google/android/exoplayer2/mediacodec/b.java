package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

public final /* synthetic */ class b implements MediaCodecUtil.f {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
    public final int a(Object obj) {
        int i = MediaCodecUtil.m;
        return ((e) obj).a.startsWith("OMX.google") ? 1 : 0;
    }
}
