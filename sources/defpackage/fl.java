package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.EOFException;

/* renamed from: fl  reason: default package */
final class fl {
    public int a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public final int[] g = new int[BitmapRenderer.ALPHA_VISIBLE];
    private final v h = new v((int) BitmapRenderer.ALPHA_VISIBLE);

    fl() {
    }

    public boolean a(nj njVar, boolean z) {
        this.h.F();
        b();
        if (!(njVar.c() == -1 || njVar.c() - njVar.d() >= 27) || !njVar.f(this.h.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.h.z() == 1332176723) {
            int x = this.h.x();
            this.a = x;
            if (x == 0) {
                this.b = this.h.x();
                this.c = this.h.l();
                this.h.n();
                this.h.n();
                this.h.n();
                int x2 = this.h.x();
                this.d = x2;
                this.e = x2 + 27;
                this.h.F();
                njVar.f(this.h.a, 0, this.d, false);
                for (int i = 0; i < this.d; i++) {
                    this.g[i] = this.h.x();
                    this.f += this.g[i];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new ParserException("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new ParserException("expected OggS capture pattern at begin of page");
        }
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }
}
