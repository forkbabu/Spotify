package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.v;
import com.spotify.encore.foundation.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: to  reason: default package */
public final class to extends wo {
    private static final int[] A = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 226, AdvertisementType.BRANDED_AS_CONTENT, 238, 244, 251};
    private static final int[] B = {193, 201, AdvertisementType.ON_DEMAND_PRE_ROLL, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, ContentType.BUMPER, 200, 202, 203, AdvertisementType.BRANDED_DURING_LIVE, 206, 207, 239, AdvertisementType.ON_DEMAND_MID_ROLL, 217, 249, 219, 171, 187};
    private static final int[] C = {195, 227, 205, 204, 236, 210, 242, AdvertisementType.ON_DEMAND_POST_ROLL, 245, 123, 125, 92, 94, 95, R.styleable.AppCompatTheme_windowNoTitle, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] D = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private static final int[] w = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] x = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] y = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] z = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL, 247, 209, 241, 9632};
    private final v g = new v();
    private final int h;
    private final int i;
    private final int j;
    private final ArrayList<a> k = new ArrayList<>();
    private a l = new a(0, 4);
    private List<com.google.android.exoplayer2.text.a> m;
    private List<com.google.android.exoplayer2.text.a> n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private byte s;
    private byte t;
    private int u = 0;
    private boolean v;

    /* access modifiers changed from: private */
    /* renamed from: to$a */
    public static class a {
        private final List<C0685a> a = new ArrayList();
        private final List<SpannableString> b = new ArrayList();
        private final StringBuilder c = new StringBuilder();
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;

        /* access modifiers changed from: private */
        /* renamed from: to$a$a  reason: collision with other inner class name */
        public static class C0685a {
            public final int a;
            public final boolean b;
            public int c;

            public C0685a(int i, boolean z, int i2) {
                this.a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public a(int i, int i2) {
            j(i);
            this.h = i2;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            boolean z = false;
            int i6 = -1;
            while (i < this.a.size()) {
                C0685a aVar = this.a.get(i);
                boolean z2 = aVar.b;
                int i7 = aVar.a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = to.y[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.c;
                i++;
                if (i8 != (i < this.a.size() ? this.a.get(i).c : length)) {
                    if (i2 != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i3, i8, 33);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        if (i5 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, i8, 33);
                        }
                        i4 = i8;
                        i5 = i6;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
            }
            if (!(i3 == -1 || i3 == length)) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
            }
            if (!(i4 == length || i5 == -1)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e(char c2) {
            this.c.append(c2);
        }

        public void f() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int size = this.a.size() - 1; size >= 0; size--) {
                    C0685a aVar = this.a.get(size);
                    int i = aVar.c;
                    if (i == length) {
                        aVar.c = i - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        public com.google.android.exoplayer2.text.a g(int i) {
            float f2;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.b.get(i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.e + this.f;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.g != 2 || (Math.abs(i6) >= 3 && length >= 0)) {
                    i = (this.g != 2 || i6 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i5 = 32 - length;
                }
                f2 = ((((float) i5) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f2 = 0.5f;
            }
            if (this.g == 1 || (i3 = this.d) > 7) {
                i3 = (this.d - 15) - 2;
                i2 = 2;
            } else {
                i2 = 0;
            }
            return new com.google.android.exoplayer2.text.a(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f2, i, -3.4028235E38f);
        }

        public boolean i() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void j(int i) {
            this.g = i;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void k() {
            this.b.add(h());
            this.c.setLength(0);
            this.a.clear();
            int min = Math.min(this.h, this.d);
            while (this.b.size() >= min) {
                this.b.remove(0);
            }
        }

        public void l(int i) {
            this.g = i;
        }

        public void m(int i) {
            this.h = i;
        }

        public void n(int i, boolean z) {
            this.a.add(new C0685a(i, z, this.c.length()));
        }
    }

    public to(String str, int i2) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i2 == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i2 == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i2 != 4) {
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        q(0);
        p();
        this.v = true;
    }

    private List<com.google.android.exoplayer2.text.a> o() {
        int size = this.k.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            com.google.android.exoplayer2.text.a g2 = this.k.get(i3).g(Integer.MIN_VALUE);
            arrayList.add(g2);
            if (g2 != null) {
                i2 = Math.min(i2, g2.f);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            com.google.android.exoplayer2.text.a aVar = (com.google.android.exoplayer2.text.a) arrayList.get(i4);
            if (aVar != null) {
                if (aVar.f != i2) {
                    aVar = this.k.get(i4).g(i2);
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private void p() {
        this.l.j(this.o);
        this.k.clear();
        this.k.add(this.l);
    }

    private void q(int i2) {
        int i3 = this.o;
        if (i3 != i2) {
            this.o = i2;
            if (i2 == 3) {
                for (int i4 = 0; i4 < this.k.size(); i4++) {
                    this.k.get(i4).l(i2);
                }
                return;
            }
            p();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.m = Collections.emptyList();
            }
        }
    }

    private void r(int i2) {
        this.p = i2;
        this.l.m(i2);
    }

    @Override // defpackage.dj
    public void d() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.wo
    public d f() {
        List<com.google.android.exoplayer2.text.a> list = this.m;
        this.n = list;
        return new xo(list);
    }

    @Override // defpackage.wo, defpackage.dj
    public void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        q(0);
        r(4);
        p();
        this.q = false;
        this.r = false;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0014 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    @Override // defpackage.wo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(com.google.android.exoplayer2.text.g r14) {
        /*
        // Method dump skipped, instructions count: 692
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to.g(com.google.android.exoplayer2.text.g):void");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.wo
    public boolean j() {
        return this.m != this.n;
    }
}
