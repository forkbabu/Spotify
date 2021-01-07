package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.text.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* access modifiers changed from: package-private */
/* renamed from: lp  reason: default package */
public final class lp {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final np f;
    private final String[] g;
    public final String h;
    public final String i;
    private final HashMap<String, Integer> j;
    private final HashMap<String, Integer> k;
    private List<lp> l;

    private lp(String str, String str2, long j2, long j3, np npVar, String[] strArr, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = npVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j2;
        this.e = j3;
        str3.getClass();
        this.h = str3;
        this.j = new HashMap<>();
        this.k = new HashMap<>();
    }

    public static lp b(String str, long j2, long j3, np npVar, String[] strArr, String str2, String str3) {
        return new lp(str, null, j2, j3, npVar, strArr, str2, str3);
    }

    public static lp c(String str) {
        return new lp(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null);
    }

    private void g(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        boolean equals2 = "div".equals(this.a);
        if (z || equals || (equals2 && this.i != null)) {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.l.get(i2).g(treeSet, z || equals);
            }
        }
    }

    private static SpannableStringBuilder i(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    private void k(long j2, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (!j(j2) || !"div".equals(this.a) || this.i == null) {
            for (int i2 = 0; i2 < e(); i2++) {
                d(i2).k(j2, str, list);
            }
            return;
        }
        list.add(new Pair<>(str, this.i));
    }

    private void l(long j2, Map<String, np> map, Map<String, SpannableStringBuilder> map2) {
        int i2;
        if (j(j2)) {
            Iterator<Map.Entry<String, Integer>> it = this.k.entrySet().iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.j.containsKey(key) ? this.j.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    SpannableStringBuilder spannableStringBuilder = map2.get(key);
                    np npVar = this.f;
                    String[] strArr = this.g;
                    if (npVar == null && strArr == null) {
                        npVar = null;
                    } else if (npVar == null && strArr.length == 1) {
                        npVar = map.get(strArr[0]);
                    } else if (npVar == null && strArr.length > 1) {
                        npVar = new np();
                        int length = strArr.length;
                        while (i2 < length) {
                            npVar.a(map.get(strArr[i2]));
                            i2++;
                        }
                    } else if (npVar != null && strArr != null && strArr.length == 1) {
                        npVar.a(map.get(strArr[0]));
                    } else if (!(npVar == null || strArr == null || strArr.length <= 1)) {
                        int length2 = strArr.length;
                        while (i2 < length2) {
                            npVar.a(map.get(strArr[i2]));
                            i2++;
                        }
                    }
                    if (npVar != null) {
                        if (npVar.h() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(npVar.h()), intValue, intValue2, 33);
                        }
                        if (npVar.l()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (npVar.m()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (npVar.k()) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(npVar.c()), intValue, intValue2, 33);
                        }
                        if (npVar.j()) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(npVar.b()), intValue, intValue2, 33);
                        }
                        if (npVar.d() != null) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(npVar.d()), intValue, intValue2, 33);
                        }
                        if (npVar.i() != null) {
                            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(npVar.i()), intValue, intValue2, 33);
                        }
                        int f2 = npVar.f();
                        if (f2 == 1) {
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) npVar.e(), true), intValue, intValue2, 33);
                        } else if (f2 == 2) {
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(npVar.e()), intValue, intValue2, 33);
                        } else if (f2 == 3) {
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(npVar.e() / 100.0f), intValue, intValue2, 33);
                        }
                    }
                }
            }
            while (i2 < e()) {
                d(i2).l(j2, map, map2);
                i2++;
            }
        }
    }

    private void m(long j2, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.j.clear();
        this.k.clear();
        if (!"metadata".equals(this.a)) {
            if (!"".equals(this.h)) {
                str = this.h;
            }
            if (this.c && z) {
                i(str, map).append((CharSequence) this.b);
            } else if ("br".equals(this.a) && z) {
                i(str, map).append('\n');
            } else if (j(j2)) {
                for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                    this.j.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
                }
                boolean equals = "p".equals(this.a);
                for (int i2 = 0; i2 < e(); i2++) {
                    d(i2).m(j2, z || equals, str, map);
                }
                if (equals) {
                    SpannableStringBuilder i3 = i(str, map);
                    int length = i3.length();
                    do {
                        length--;
                        if (length < 0) {
                            break;
                        }
                    } while (i3.charAt(length) == ' ');
                    if (length >= 0 && i3.charAt(length) != '\n') {
                        i3.append('\n');
                    }
                }
                for (Map.Entry<String, SpannableStringBuilder> entry2 : map.entrySet()) {
                    this.k.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
                }
            }
        }
    }

    public void a(lp lpVar) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(lpVar);
    }

    public lp d(int i2) {
        List<lp> list = this.l;
        if (list != null) {
            return list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public int e() {
        List<lp> list = this.l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<a> f(long j2, Map<String, np> map, Map<String, mp> map2, Map<String, String> map3) {
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        k(j2, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        m(j2, false, this.h, treeMap);
        l(j2, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                mp mpVar = map2.get(pair.first);
                arrayList2.add(new a(decodeByteArray, mpVar.b, 0, mpVar.c, mpVar.e, mpVar.f, mpVar.g));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            mp mpVar2 = map2.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            int length = spannableStringBuilder.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (spannableStringBuilder.charAt(i4) == ' ') {
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                        i6++;
                    }
                    int i7 = i6 - i5;
                    if (i7 > 0) {
                        spannableStringBuilder.delete(i4, i4 + i7);
                        length -= i7;
                    }
                }
            }
            if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
                length--;
            }
            int i8 = 0;
            while (true) {
                i2 = length - 1;
                if (i8 >= i2) {
                    break;
                }
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == ' ') {
                        spannableStringBuilder.delete(i9, i8 + 2);
                        length = i2;
                    }
                }
                i8++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i2) == ' ') {
                spannableStringBuilder.delete(i2, length);
                length = i2;
            }
            int i10 = 0;
            while (true) {
                i3 = length - 1;
                if (i10 >= i3) {
                    break;
                }
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    if (spannableStringBuilder.charAt(i11) == '\n') {
                        spannableStringBuilder.delete(i10, i11);
                        length = i3;
                    }
                }
                i10++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i3) == '\n') {
                spannableStringBuilder.delete(i3, length);
            }
            arrayList2.add(new a(spannableStringBuilder, (Layout.Alignment) null, mpVar2.c, mpVar2.d, mpVar2.e, mpVar2.b, Integer.MIN_VALUE, mpVar2.f, mpVar2.h, mpVar2.i));
        }
        return arrayList2;
    }

    public long[] h() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i2 = 0;
        g(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        return jArr;
    }

    public boolean j(long j2) {
        long j3 = this.d;
        return (j3 == -9223372036854775807L && this.e == -9223372036854775807L) || (j3 <= j2 && this.e == -9223372036854775807L) || ((j3 == -9223372036854775807L && j2 < this.e) || (j3 <= j2 && j2 < this.e));
    }
}
