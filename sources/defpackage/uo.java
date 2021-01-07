package defpackage;

import android.text.Layout;
import com.google.android.exoplayer2.text.a;

/* access modifiers changed from: package-private */
/* renamed from: uo  reason: default package */
public final class uo extends a implements Comparable<uo> {
    public final int o;

    public uo(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.o = i5;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(uo uoVar) {
        int i = uoVar.o;
        int i2 = this.o;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
