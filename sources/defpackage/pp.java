package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: pp  reason: default package */
public final class pp extends b {
    private final v n = new v();
    private boolean o;
    private int p;
    private int q;
    private String r;
    private float s;
    private int t;

    public pp(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.p = bArr[24];
            this.q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.r = "Serif".equals(f0.n(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.t = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.o = z;
            if (z) {
                float f = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i);
                this.s = f;
                this.s = f0.g(f, 0.0f, 0.95f);
                return;
            }
            this.s = 0.85f;
            return;
        }
        this.p = 0;
        this.q = -1;
        this.r = str;
        this.o = false;
        this.s = 0.85f;
    }

    private static void q(boolean z) {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void r(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.text.b
    public d o(byte[] bArr, int i, boolean z) {
        String str;
        char d;
        this.n.I(bArr, i);
        v vVar = this.n;
        int i2 = 1;
        q(vVar.a() >= 2);
        int D = vVar.D();
        if (D == 0) {
            str = "";
        } else if (vVar.a() < 2 || !((d = vVar.d()) == 65279 || d == 65534)) {
            str = vVar.v(D, Charset.forName(Constants.ENCODING));
        } else {
            str = vVar.v(D, Charset.forName("UTF-16"));
        }
        if (str.isEmpty()) {
            return qp.b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        r(spannableStringBuilder, this.p, 0, 0, spannableStringBuilder.length(), 16711680);
        int i3 = this.q;
        int length = spannableStringBuilder.length();
        if (i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i3 >>> 8) | ((i3 & BitmapRenderer.ALPHA_VISIBLE) << 24)), 0, length, 16711713);
        }
        String str2 = this.r;
        int length2 = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length2, 16711713);
        }
        float f = this.s;
        while (this.n.a() >= 8) {
            int b = this.n.b();
            int h = this.n.h();
            int h2 = this.n.h();
            if (h2 == 1937013100) {
                q(this.n.a() >= 2);
                int D2 = this.n.D();
                int i4 = 0;
                while (i4 < D2) {
                    v vVar2 = this.n;
                    q(vVar2.a() >= 12);
                    int D3 = vVar2.D();
                    int D4 = vVar2.D();
                    vVar2.L(2);
                    int x = vVar2.x();
                    vVar2.L(i2);
                    int h3 = vVar2.h();
                    r(spannableStringBuilder, x, this.p, D3, D4, 0);
                    if (h3 != this.q) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan((h3 >>> 8) | ((h3 & BitmapRenderer.ALPHA_VISIBLE) << 24)), D3, D4, 33);
                    }
                    i4++;
                    i2 = 1;
                }
            } else if (h2 == 1952608120 && this.o) {
                q(this.n.a() >= 2);
                f = f0.g(((float) this.n.D()) / ((float) this.t), 0.0f, 0.95f);
            }
            this.n.K(b + h);
            i2 = 1;
        }
        return new qp(new a(spannableStringBuilder, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f));
    }
}
