package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;
import defpackage.vp;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: sp  reason: default package */
public final class sp extends b {
    private final v n = new v();
    private final vp.b o = new vp.b();

    public sp() {
        super("Mp4WebvttDecoder");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.text.b
    public d o(byte[] bArr, int i, boolean z) {
        this.n.I(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.n.a() > 0) {
            if (this.n.a() >= 8) {
                int h = this.n.h();
                if (this.n.h() == 1987343459) {
                    v vVar = this.n;
                    vp.b bVar = this.o;
                    int i2 = h - 8;
                    bVar.b();
                    while (i2 > 0) {
                        if (i2 >= 8) {
                            int h2 = vVar.h();
                            int h3 = vVar.h();
                            int i3 = h2 - 8;
                            String n2 = f0.n(vVar.a, vVar.b(), i3);
                            vVar.L(i3);
                            i2 = (i2 - 8) - i3;
                            if (h3 == 1937011815) {
                                wp.d(n2, bVar);
                            } else if (h3 == 1885436268) {
                                wp.e(null, n2.trim(), bVar, Collections.emptyList());
                            }
                        } else {
                            throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                        }
                    }
                    arrayList.add(bVar.a());
                } else {
                    this.n.L(h - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new tp(arrayList);
    }
}
