package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.util.f0;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: no  reason: default package */
public abstract class no extends ho {
    private byte[] i;
    private volatile boolean j;

    public no(k kVar, m mVar, int i2, d0 d0Var, int i3, Object obj, byte[] bArr) {
        super(kVar, mVar, i2, d0Var, i3, obj, -9223372036854775807L, -9223372036854775807L);
        this.i = bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        try {
            this.h.a(this.a);
            int i2 = 0;
            int i3 = 0;
            while (i2 != -1 && !this.j) {
                byte[] bArr = this.i;
                if (bArr == null) {
                    this.i = new byte[16384];
                } else if (bArr.length < i3 + 16384) {
                    this.i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i2 = this.h.read(this.i, i3, 16384);
                if (i2 != -1) {
                    i3 += i2;
                }
            }
            if (!this.j) {
                f(this.i, i3);
            }
        } finally {
            y yVar = this.h;
            int i4 = f0.a;
            if (yVar != null) {
                try {
                    yVar.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void b() {
        this.j = true;
    }

    /* access modifiers changed from: protected */
    public abstract void f(byte[] bArr, int i2);

    public byte[] g() {
        return this.i;
    }
}
