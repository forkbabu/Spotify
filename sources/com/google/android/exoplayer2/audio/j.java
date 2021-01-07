package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import com.google.android.exoplayer2.util.f0;
import java.util.Arrays;

public final class j {
    public static final j c = new j(new int[]{2}, 8);
    private static final j d = new j(new int[]{2, 5, 6}, 8);
    private final int[] a;
    private final int b;

    public j(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public static j a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if ((f0.a >= 17 && "Amazon".equals(f0.c)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return d;
        }
        if (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return c;
        }
        return new j(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public int b() {
        return this.b;
    }

    public boolean c(int i) {
        return Arrays.binarySearch(this.a, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!Arrays.equals(this.a, jVar.a) || this.b != jVar.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AudioCapabilities[maxChannelCount=");
        V0.append(this.b);
        V0.append(", supportedEncodings=");
        V0.append(Arrays.toString(this.a));
        V0.append("]");
        return V0.toString();
    }
}
