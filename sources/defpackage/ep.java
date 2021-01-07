package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.v;
import defpackage.gp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ep  reason: default package */
public final class ep extends b {
    private static final Pattern s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean n;
    private final fp o;
    private Map<String, gp> p;
    private float q = -3.4028235E38f;
    private float r = -3.4028235E38f;

    public ep(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.n = false;
            this.o = null;
            return;
        }
        this.n = true;
        String m = f0.m(list.get(0));
        g.a(m.startsWith("Format:"));
        fp a = fp.a(m);
        a.getClass();
        this.o = a;
        s(new v(list.get(1)));
    }

    private static int q(long j, List<Long> list, List<List<a>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (list.get(size).longValue() == j) {
                return size;
            } else {
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i != 0) {
            arrayList = new ArrayList(list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    private static float r(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private void s(v vVar) {
        gp b;
        while (true) {
            String j = vVar.j();
            if (j == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(j)) {
                while (true) {
                    String j2 = vVar.j();
                    if (j2 == null || (vVar.a() != 0 && vVar.e() == 91)) {
                        break;
                    }
                    String[] split = j2.split(":");
                    if (split.length == 2) {
                        String Q = f0.Q(split[0].trim());
                        Q.hashCode();
                        if (Q.equals("playresx")) {
                            this.q = Float.parseFloat(split[1].trim());
                        } else if (Q.equals("playresy")) {
                            try {
                                this.r = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(j)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                gp.a aVar = null;
                while (true) {
                    String j3 = vVar.j();
                    if (j3 == null || (vVar.a() != 0 && vVar.e() == 91)) {
                        break;
                    } else if (j3.startsWith("Format:")) {
                        aVar = gp.a.a(j3);
                    } else if (!(!j3.startsWith("Style:") || aVar == null || (b = gp.b(j3, aVar)) == null)) {
                        linkedHashMap.put(b.a, b);
                    }
                }
                this.p = linkedHashMap;
            } else if (!"[V4 Styles]".equalsIgnoreCase(j) && "[Events]".equalsIgnoreCase(j)) {
                return;
            }
        }
    }

    private static long t(String str) {
        Matcher matcher = s.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = f0.a;
        long parseLong = (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + parseLong;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.text.b
    public d o(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        float f;
        float f2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        v vVar = new v(bArr, i);
        if (!this.n) {
            s(vVar);
        }
        fp fpVar = this.n ? this.o : null;
        while (true) {
            String j = vVar.j();
            if (j == null) {
                return new hp(arrayList, arrayList2);
            }
            if (j.startsWith("Format:")) {
                fpVar = fp.a(j);
            } else if (j.startsWith("Dialogue:") && fpVar != null) {
                g.a(j.startsWith("Dialogue:"));
                String[] split = j.substring(9).split(",", fpVar.e);
                if (split.length == fpVar.e) {
                    long t = t(split[fpVar.a]);
                    if (t != -9223372036854775807L) {
                        long t2 = t(split[fpVar.b]);
                        if (t2 != -9223372036854775807L) {
                            Map<String, gp> map = this.p;
                            int i5 = -1;
                            gp gpVar = (map == null || (i4 = fpVar.c) == -1) ? null : map.get(split[i4].trim());
                            String str = split[fpVar.d];
                            gp.b a = gp.b.a(str);
                            String replaceAll = gp.b.c(str).replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n");
                            float f3 = this.q;
                            float f4 = this.r;
                            int i6 = a.a;
                            if (i6 != -1) {
                                i5 = i6;
                            } else if (gpVar != null) {
                                i5 = gpVar.b;
                            }
                            switch (i5) {
                                case 1:
                                case 4:
                                case 7:
                                    i2 = 0;
                                    break;
                                case 2:
                                case 5:
                                case 8:
                                    i2 = 1;
                                    break;
                                case 3:
                                case 6:
                                case 9:
                                    i2 = 2;
                                    break;
                                default:
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            switch (i5) {
                                case 1:
                                case 2:
                                case 3:
                                    i3 = 2;
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    i3 = 1;
                                    break;
                                case 7:
                                case 8:
                                case 9:
                                    i3 = 0;
                                    break;
                                default:
                                    i3 = Integer.MIN_VALUE;
                                    break;
                            }
                            PointF pointF = a.b;
                            if (pointF == null || f4 == -3.4028235E38f || f3 == -3.4028235E38f) {
                                f = r(i2);
                                f2 = r(i3);
                            } else {
                                float f5 = pointF.x / f3;
                                f2 = pointF.y / f4;
                                f = f5;
                            }
                            switch (i5) {
                                case 1:
                                case 4:
                                case 7:
                                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                                    alignment = alignment2;
                                    break;
                                case 2:
                                case 5:
                                case 8:
                                    alignment2 = Layout.Alignment.ALIGN_CENTER;
                                    alignment = alignment2;
                                    break;
                                case 3:
                                case 6:
                                case 9:
                                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                                    alignment = alignment2;
                                    break;
                                default:
                                    alignment = null;
                                    break;
                            }
                            a aVar = new a(replaceAll, alignment, f2, 0, i3, f, i2, -3.4028235E38f);
                            int q2 = q(t2, arrayList2, arrayList);
                            for (int q3 = q(t, arrayList2, arrayList); q3 < q2; q3++) {
                                ((List) arrayList.get(q3)).add(aVar);
                            }
                        }
                    }
                }
            }
        }
    }
}
