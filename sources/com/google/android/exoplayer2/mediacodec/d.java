package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.Comparator;

public final /* synthetic */ class d implements Comparator {
    public final /* synthetic */ MediaCodecUtil.f a;

    public /* synthetic */ d(MediaCodecUtil.f fVar) {
        this.a = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MediaCodecUtil.f fVar = this.a;
        return fVar.a(obj2) - fVar.a(obj);
    }
}
