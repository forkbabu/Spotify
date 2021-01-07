package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.q;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ip  reason: default package */
public final class ip extends b {
    private static final Pattern p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*");
    private static final Pattern q = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder n = new StringBuilder();
    private final ArrayList<String> o = new ArrayList<>();

    public ip() {
        super("SubripDecoder");
    }

    static float q(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long r(Matcher matcher, int i) {
        long parseLong = (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000);
        return (Long.parseLong(matcher.group(i + 4)) + (Long.parseLong(matcher.group(i + 3)) * 1000) + parseLong) * 1000;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.text.b
    public d o(byte[] bArr, int i, boolean z) {
        v vVar;
        a aVar;
        char c;
        char c2;
        ip ipVar = this;
        ArrayList arrayList = new ArrayList();
        q qVar = new q();
        v vVar2 = new v(bArr, i);
        while (true) {
            String j = vVar2.j();
            if (j != null) {
                if (j.length() != 0) {
                    try {
                        Integer.parseInt(j);
                        String j2 = vVar2.j();
                        if (j2 != null) {
                            Matcher matcher = p.matcher(j2);
                            if (matcher.matches()) {
                                qVar.a(r(matcher, 1));
                                qVar.a(r(matcher, 6));
                                ipVar.n.setLength(0);
                                ipVar.o.clear();
                                for (String j3 = vVar2.j(); !TextUtils.isEmpty(j3); j3 = vVar2.j()) {
                                    if (ipVar.n.length() > 0) {
                                        ipVar.n.append("<br>");
                                    }
                                    StringBuilder sb = ipVar.n;
                                    ArrayList<String> arrayList2 = ipVar.o;
                                    String trim = j3.trim();
                                    StringBuilder sb2 = new StringBuilder(trim);
                                    Matcher matcher2 = q.matcher(trim);
                                    int i2 = 0;
                                    while (matcher2.find()) {
                                        String group = matcher2.group();
                                        arrayList2.add(group);
                                        int start = matcher2.start() - i2;
                                        int length = group.length();
                                        sb2.replace(start, start + length, "");
                                        i2 += length;
                                    }
                                    sb.append(sb2.toString());
                                }
                                Spanned fromHtml = Html.fromHtml(ipVar.n.toString());
                                String str = null;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < ipVar.o.size()) {
                                        String str2 = ipVar.o.get(i3);
                                        if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                            str = str2;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                                if (str == null) {
                                    aVar = new a(fromHtml);
                                    vVar = vVar2;
                                } else {
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (str.equals("{\\an1}")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620679:
                                            if (str.equals("{\\an2}")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620648:
                                            if (str.equals("{\\an3}")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620617:
                                            if (str.equals("{\\an4}")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620586:
                                            if (str.equals("{\\an5}")) {
                                                c = 7;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620555:
                                            if (str.equals("{\\an6}")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620524:
                                            if (str.equals("{\\an7}")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620493:
                                            if (str.equals("{\\an8}")) {
                                                c = '\b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620462:
                                            if (str.equals("{\\an9}")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    vVar = vVar2;
                                    int i4 = (c == 0 || c == 1 || c == 2) ? 0 : (c == 3 || c == 4 || c == 5) ? 2 : 1;
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (str.equals("{\\an1}")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620679:
                                            if (str.equals("{\\an2}")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620648:
                                            if (str.equals("{\\an3}")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620617:
                                            if (str.equals("{\\an4}")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620586:
                                            if (str.equals("{\\an5}")) {
                                                c2 = 7;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620555:
                                            if (str.equals("{\\an6}")) {
                                                c2 = '\b';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620524:
                                            if (str.equals("{\\an7}")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620493:
                                            if (str.equals("{\\an8}")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620462:
                                            if (str.equals("{\\an9}")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    int i5 = (c2 == 0 || c2 == 1 || c2 == 2) ? 2 : (c2 == 3 || c2 == 4 || c2 == 5) ? 0 : 1;
                                    aVar = new a(fromHtml, null, q(i5), 0, i5, q(i4), i4, -3.4028235E38f);
                                }
                                arrayList.add(aVar);
                                arrayList.add(a.n);
                                ipVar = this;
                                vVar2 = vVar;
                            }
                            vVar = vVar2;
                            ipVar = this;
                            vVar2 = vVar;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        a[] aVarArr = new a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return new jp(aVarArr, qVar.d());
    }
}
