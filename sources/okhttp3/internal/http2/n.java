package okhttp3.internal.http2;

import com.spotify.mobile.android.core.internal.AudioDriver;
import java.util.Arrays;

public final class n {
    private int a;
    private final int[] b = new int[10];

    /* access modifiers changed from: package-private */
    public void a() {
        this.a = 0;
        Arrays.fill(this.b, 0);
    }

    /* access modifiers changed from: package-private */
    public int b(int i) {
        return this.b[i];
    }

    /* access modifiers changed from: package-private */
    public int c() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return (this.a & 128) != 0 ? this.b[7] : AudioDriver.SPOTIFY_MAX_VOLUME;
    }

    /* access modifiers changed from: package-private */
    public int e(int i) {
        return (this.a & 16) != 0 ? this.b[4] : i;
    }

    /* access modifiers changed from: package-private */
    public int f(int i) {
        return (this.a & 32) != 0 ? this.b[5] : i;
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i) {
        return ((1 << i) & this.a) != 0;
    }

    /* access modifiers changed from: package-private */
    public void h(n nVar) {
        for (int i = 0; i < 10; i++) {
            boolean z = true;
            if (((1 << i) & nVar.a) == 0) {
                z = false;
            }
            if (z) {
                i(i, nVar.b[i]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public n i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Integer.bitCount(this.a);
    }
}
