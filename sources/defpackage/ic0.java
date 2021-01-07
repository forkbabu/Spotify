package defpackage;

import com.spotify.android.glue.components.toolbar.c;

/* renamed from: ic0  reason: default package */
public final class ic0 {
    private final c a;
    private float b = -1.0f;

    public ic0(c cVar) {
        this.a = cVar;
    }

    public void a(float f) {
        float max = Math.max(0.0f, (f * 4.0f) - 1.0f) / 3.0f;
        if (Math.abs(this.b - max) >= 0.01f) {
            this.b = max;
            this.a.o(max);
        }
    }
}
