package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import defpackage.vp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: zp  reason: default package */
final class zp implements d {
    private final List<vp> a;
    private final int b;
    private final long[] c;
    private final long[] f;

    public zp(List<vp> list) {
        this.a = list;
        int size = list.size();
        this.b = size;
        this.c = new long[(size * 2)];
        for (int i = 0; i < this.b; i++) {
            vp vpVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.c;
            jArr[i2] = vpVar.o;
            jArr[i2 + 1] = vpVar.p;
        }
        long[] jArr2 = this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.exoplayer2.text.d
    public int d(long j) {
        int b2 = f0.b(this.f, j, false, false);
        if (b2 < this.f.length) {
            return b2;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.d
    public List<a> g(long j) {
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = null;
        vp vpVar = null;
        for (int i = 0; i < this.b; i++) {
            long[] jArr = this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                vp vpVar2 = this.a.get(i);
                if (!(vpVar2.b == -3.4028235E38f && vpVar2.c == 0.5f)) {
                    arrayList.add(vpVar2);
                } else if (vpVar == null) {
                    vpVar = vpVar2;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    CharSequence charSequence = vpVar.a;
                    charSequence.getClass();
                    SpannableStringBuilder append = spannableStringBuilder.append(charSequence).append((CharSequence) "\n");
                    CharSequence charSequence2 = vpVar2.a;
                    charSequence2.getClass();
                    append.append(charSequence2);
                } else {
                    SpannableStringBuilder append2 = spannableStringBuilder.append((CharSequence) "\n");
                    CharSequence charSequence3 = vpVar2.a;
                    charSequence3.getClass();
                    append2.append(charSequence3);
                }
            }
        }
        if (spannableStringBuilder != null) {
            vp.b bVar = new vp.b();
            bVar.j(spannableStringBuilder);
            arrayList.add(bVar.a());
        } else if (vpVar != null) {
            arrayList.add(vpVar);
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.text.d
    public long h(int i) {
        boolean z = true;
        g.a(i >= 0);
        if (i >= this.f.length) {
            z = false;
        }
        g.a(z);
        return this.f[i];
    }

    @Override // com.google.android.exoplayer2.text.d
    public int i() {
        return this.f.length;
    }
}
