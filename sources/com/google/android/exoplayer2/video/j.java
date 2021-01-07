package com.google.android.exoplayer2.video;

import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.google.android.exoplayer2.util.v;

public final class j {
    public final String a;

    private j(int i, int i2, String str) {
        this.a = str;
    }

    public static j a(v vVar) {
        String str;
        vVar.L(2);
        int x = vVar.x();
        int i = x >> 1;
        int x2 = ((vVar.x() >> 3) & 31) | ((x & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = VisualSampleEntry.TYPE7;
        } else if (i != 9) {
            return null;
        } else {
            str = VisualSampleEntry.TYPE4;
        }
        return new j(i, x2, str + ".0" + i + ".0" + x2);
    }
}
