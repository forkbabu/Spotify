package com.google.android.exoplayer2.mediacodec;

import java.util.List;

public interface f {
    public static final f a = new a();

    static class a implements f {
        a() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.f
        public e a() {
            e d = MediaCodecUtil.d("audio/raw", false, false);
            if (d == null) {
                return null;
            }
            return e.j(d.a);
        }

        @Override // com.google.android.exoplayer2.mediacodec.f
        public List<e> b(String str, boolean z, boolean z2) {
            return MediaCodecUtil.e(str, z, z2);
        }
    }

    e a();

    List<e> b(String str, boolean z, boolean z2);
}
