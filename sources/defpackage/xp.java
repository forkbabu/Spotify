package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.v;
import defpackage.vp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xp  reason: default package */
public final class xp extends b {
    private final wp n = new wp();
    private final v o = new v();
    private final vp.b p = new vp.b();
    private final rp q = new rp();
    private final List<up> r = new ArrayList();

    public xp() {
        super("WebvttDecoder");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.text.b
    public d o(byte[] bArr, int i, boolean z) {
        this.o.I(bArr, i);
        this.p.b();
        this.r.clear();
        try {
            yp.e(this.o);
            do {
            } while (!TextUtils.isEmpty(this.o.j()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                v vVar = this.o;
                char c = 65535;
                int i2 = 0;
                while (c == 65535) {
                    i2 = vVar.b();
                    String j = vVar.j();
                    if (j == null) {
                        c = 0;
                    } else if ("STYLE".equals(j)) {
                        c = 2;
                    } else {
                        c = j.startsWith("NOTE") ? (char) 1 : 3;
                    }
                }
                vVar.K(i2);
                if (c == 0) {
                    return new zp(arrayList);
                }
                if (c == 1) {
                    do {
                    } while (!TextUtils.isEmpty(this.o.j()));
                } else if (c == 2) {
                    if (arrayList.isEmpty()) {
                        this.o.j();
                        this.r.addAll(this.q.a(this.o));
                    } else {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                } else if (c == 3 && this.n.b(this.o, this.p, this.r)) {
                    arrayList.add(this.p.a());
                    this.p.b();
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException(e);
        }
    }
}
