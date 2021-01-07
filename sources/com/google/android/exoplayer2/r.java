package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.util.f0;

/* access modifiers changed from: package-private */
public final class r {
    private final AudioManager a;
    private final a b;
    private final b c;
    private int d;
    private float e = 1.0f;

    /* access modifiers changed from: private */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        private final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            this.a.post(new a(this, i));
        }
    }

    public interface b {
    }

    public r(Context context, Handler handler, b bVar) {
        this.a = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.c = bVar;
        this.b = new a(handler);
        this.d = 0;
    }

    private void a(boolean z) {
        if (this.d != 0) {
            if (f0.a < 26) {
                this.a.abandonAudioFocus(this.b);
            }
            this.d = 0;
        }
    }

    static void b(r rVar, int i) {
        rVar.getClass();
        if (i == -3) {
            rVar.d = 3;
        } else if (i == -2) {
            rVar.d = 2;
        } else if (i == -1) {
            rVar.d = -1;
        } else if (i == 1) {
            rVar.d = 1;
        } else {
            return;
        }
        int i2 = rVar.d;
        if (i2 == -1) {
            ((u0.c) rVar.c).c(-1);
            rVar.a(true);
        } else if (i2 != 0) {
            if (i2 == 1) {
                ((u0.c) rVar.c).c(1);
            } else if (i2 == 2) {
                ((u0.c) rVar.c).c(0);
            } else if (i2 != 3) {
                StringBuilder V0 = je.V0("Unknown audio focus state: ");
                V0.append(rVar.d);
                throw new IllegalStateException(V0.toString());
            }
        }
        float f = rVar.d == 3 ? 0.2f : 1.0f;
        if (rVar.e != f) {
            rVar.e = f;
            u0.y(u0.this);
        }
    }

    public float c() {
        return this.e;
    }

    public int d(boolean z) {
        if (!z) {
            return -1;
        }
        if (this.d == 0) {
            return 1;
        }
        a(true);
        return 1;
    }

    public int e(boolean z, int i) {
        int i2 = -1;
        if (!z) {
            a(false);
            return -1;
        } else if (i == 1) {
            if (z) {
                i2 = 1;
            }
            return i2;
        } else if (this.d == 0) {
            return 1;
        } else {
            a(true);
            return 1;
        }
    }

    public void f() {
        a(true);
    }
}
