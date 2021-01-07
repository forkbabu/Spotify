package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import com.google.android.exoplayer2.util.f0;

public final class i {
    public static final i f = new i(0, 0, 1, 1, null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private AudioAttributes e;

    i(int i, int i2, int i3, int i4, a aVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public AudioAttributes a() {
        if (this.e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            if (f0.a >= 29) {
                usage.setAllowedCapturePolicy(this.d);
            }
            this.e = usage.build();
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a == iVar.a && this.b == iVar.b && this.c == iVar.c && this.d == iVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
