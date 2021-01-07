package defpackage;

import android.text.Layout;
import com.facebook.login.s;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: kp  reason: default package */
public final class kp extends com.google.android.exoplayer2.text.b {
    private static final Pattern o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b u = new b(30.0f, 1, 1);
    private static final a v = new a(32, 15);
    private final XmlPullParserFactory n;

    /* access modifiers changed from: private */
    /* renamed from: kp$a */
    public static final class a {
        final int a;

        a(int i, int i2) {
            this.a = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: kp$b */
    public static final class b {
        final float a;
        final int b;
        final int c;

        b(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: kp$c */
    public static final class c {
        final int a;
        final int b;

        c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public kp() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private c A(XmlPullParser xmlPullParser) {
        String a2 = s.a(xmlPullParser, "extent");
        if (a2 == null) {
            return null;
        }
        Matcher matcher = s.matcher(a2);
        if (!matcher.matches()) {
            return null;
        }
        try {
            return new c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private np q(np npVar) {
        return npVar == null ? new np() : npVar;
    }

    private static boolean r(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private a s(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1));
            int parseInt2 = Integer.parseInt(matcher.group(2));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            return aVar;
        }
    }

    private static void t(String str, np npVar) {
        Matcher matcher;
        int i = f0.a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = q.matcher(str);
        } else if (split.length == 2) {
            matcher = q.matcher(split[1]);
        } else {
            throw new SubtitleDecoderException(je.B0(je.V0("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.hashCode();
            group.hashCode();
            char c2 = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    npVar.s(3);
                    break;
                case 1:
                    npVar.s(2);
                    break;
                case 2:
                    npVar.s(1);
                    break;
                default:
                    throw new SubtitleDecoderException(je.y0("Invalid unit for fontSize: '", group, "'."));
            }
            npVar.r(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        throw new SubtitleDecoderException(je.y0("Invalid expression for fontSize: '", str, "'."));
    }

    private b u(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = f0.a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        b bVar = u;
        int i2 = bVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new b(((float) parseInt) * f, i2, i3);
    }

    private Map<String, np> v(XmlPullParser xmlPullParser, Map<String, np> map, a aVar, c cVar, Map<String, mp> map2, Map<String, String> map3) {
        String a2;
        String a3;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        do {
            xmlPullParser.next();
            if (s.c(xmlPullParser, "style")) {
                String a4 = s.a(xmlPullParser, "style");
                np x = x(xmlPullParser, new np());
                if (a4 != null) {
                    for (String str : y(a4)) {
                        x.a(map.get(str));
                    }
                }
                if (x.g() != null) {
                    map.put(x.g(), x);
                }
            } else if (s.c(xmlPullParser, "region")) {
                String a5 = s.a(xmlPullParser, "id");
                mp mpVar = null;
                if (!(a5 == null || (a3 = s.a(xmlPullParser, "origin")) == null)) {
                    Pattern pattern = r;
                    Matcher matcher = pattern.matcher(a3);
                    Pattern pattern2 = s;
                    Matcher matcher2 = pattern2.matcher(a3);
                    if (matcher.matches()) {
                        try {
                            f2 = Float.parseFloat(matcher.group(1)) / 100.0f;
                            f = Float.parseFloat(matcher.group(2)) / 100.0f;
                        } catch (NumberFormatException unused) {
                        }
                    } else if (matcher2.matches() && cVar != null) {
                        int parseInt = Integer.parseInt(matcher2.group(1));
                        int parseInt2 = Integer.parseInt(matcher2.group(2));
                        float f6 = ((float) parseInt) / ((float) cVar.a);
                        f = ((float) parseInt2) / ((float) cVar.b);
                        f2 = f6;
                    }
                    String a6 = s.a(xmlPullParser, "extent");
                    if (a6 != null) {
                        Matcher matcher3 = pattern.matcher(a6);
                        Matcher matcher4 = pattern2.matcher(a6);
                        if (matcher3.matches()) {
                            f3 = Float.parseFloat(matcher3.group(2)) / 100.0f;
                            f4 = Float.parseFloat(matcher3.group(1)) / 100.0f;
                        } else if (matcher4.matches() && cVar != null) {
                            int parseInt3 = Integer.parseInt(matcher4.group(1));
                            float parseInt4 = ((float) Integer.parseInt(matcher4.group(2))) / ((float) cVar.b);
                            f4 = ((float) parseInt3) / ((float) cVar.a);
                            f3 = parseInt4;
                        }
                        String a7 = s.a(xmlPullParser, "displayAlign");
                        if (a7 != null) {
                            String Q = f0.Q(a7);
                            Q.hashCode();
                            if (Q.equals("center")) {
                                f5 = (f3 / 2.0f) + f;
                                i = 1;
                            } else if (Q.equals("after")) {
                                f5 = f + f3;
                                i = 2;
                            }
                            mpVar = new mp(a5, f2, f5, 0, i, f4, f3, 1, 1.0f / ((float) aVar.a));
                        }
                        f5 = f;
                        i = 0;
                        mpVar = new mp(a5, f2, f5, 0, i, f4, f3, 1, 1.0f / ((float) aVar.a));
                    }
                }
                if (mpVar != null) {
                    map2.put(mpVar.a, mpVar);
                }
            } else if (s.c(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (s.c(xmlPullParser, "image") && (a2 = s.a(xmlPullParser, "id")) != null) {
                        map3.put(a2, xmlPullParser.nextText());
                    }
                } while (!s.b(xmlPullParser, "metadata"));
            }
        } while (!s.b(xmlPullParser, "head"));
        return map;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private lp w(XmlPullParser xmlPullParser, lp lpVar, Map<String, mp> map, b bVar) {
        long j;
        long j2;
        char c2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser.getAttributeCount();
        np x = x(xmlPullParser2, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        int i = 0;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        while (i < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i);
            String attributeValue = xmlPullParser2.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 != 0) {
                if (c2 == 1) {
                    j5 = z(attributeValue, bVar);
                } else if (c2 == 2) {
                    j4 = z(attributeValue, bVar);
                } else if (c2 == 3) {
                    j3 = z(attributeValue, bVar);
                } else if (c2 == 4) {
                    String[] y = y(attributeValue);
                    if (y.length > 0) {
                        strArr = y;
                    }
                } else if (c2 == 5 && attributeValue.startsWith("#")) {
                    str = attributeValue.substring(1);
                }
            } else if (map.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
            i++;
            xmlPullParser2 = xmlPullParser;
        }
        if (lpVar != null) {
            long j6 = lpVar.d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (j4 == j) {
            if (j5 != j) {
                j2 = j3 + j5;
            } else if (lpVar != null) {
                long j7 = lpVar.e;
                if (j7 != j) {
                    j2 = j7;
                }
            }
            return lp.b(xmlPullParser.getName(), j3, j2, x, strArr, str2, str);
        }
        j2 = j4;
        return lp.b(xmlPullParser.getName(), j3, j2, x, strArr, str2, str);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private np x(XmlPullParser xmlPullParser, np npVar) {
        char c2;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            char c3 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    npVar = q(npVar);
                    npVar.u("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    npVar = q(npVar);
                    npVar.q(attributeValue);
                    break;
                case 2:
                    String Q = f0.Q(attributeValue);
                    Q.hashCode();
                    switch (Q.hashCode()) {
                        case -1364013995:
                            if (Q.equals("center")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 100571:
                            if (Q.equals("end")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 3317767:
                            if (Q.equals("left")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 108511772:
                            if (Q.equals("right")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 109757538:
                            if (Q.equals("start")) {
                                c3 = 4;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (c3 != 2) {
                                if (c3 != 3) {
                                    if (c3 != 4) {
                                        break;
                                    } else {
                                        npVar = q(npVar);
                                        npVar.w(Layout.Alignment.ALIGN_NORMAL);
                                        break;
                                    }
                                } else {
                                    npVar = q(npVar);
                                    npVar.w(Layout.Alignment.ALIGN_OPPOSITE);
                                    break;
                                }
                            } else {
                                npVar = q(npVar);
                                npVar.w(Layout.Alignment.ALIGN_NORMAL);
                                break;
                            }
                        } else {
                            npVar = q(npVar);
                            npVar.w(Layout.Alignment.ALIGN_OPPOSITE);
                            break;
                        }
                    } else {
                        npVar = q(npVar);
                        npVar.w(Layout.Alignment.ALIGN_CENTER);
                        break;
                    }
                case 3:
                    String Q2 = f0.Q(attributeValue);
                    Q2.hashCode();
                    switch (Q2.hashCode()) {
                        case -1461280213:
                            if (Q2.equals("nounderline")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (Q2.equals("underline")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 913457136:
                            if (Q2.equals("nolinethrough")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (Q2.equals("linethrough")) {
                                c3 = 3;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (c3 != 2) {
                                if (c3 != 3) {
                                    break;
                                } else {
                                    npVar = q(npVar);
                                    npVar.v(true);
                                    break;
                                }
                            } else {
                                npVar = q(npVar);
                                npVar.v(false);
                                break;
                            }
                        } else {
                            npVar = q(npVar);
                            npVar.x(true);
                            break;
                        }
                    } else {
                        npVar = q(npVar);
                        npVar.x(false);
                        break;
                    }
                case 4:
                    npVar = q(npVar);
                    npVar.o("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        npVar = q(npVar);
                        npVar.t(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    npVar = q(npVar);
                    npVar.p(k.c(attributeValue));
                    break;
                case 7:
                    npVar = q(npVar);
                    t(attributeValue, npVar);
                    break;
                case '\b':
                    npVar = q(npVar);
                    try {
                        npVar.n(k.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        break;
                    }
            }
        }
        return npVar;
    }

    private String[] y(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i = f0.a;
        return trim.split("\\s+", -1);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b1, code lost:
        if (r13.equals("ms") == false) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long z(java.lang.String r13, defpackage.kp.b r14) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp.z(java.lang.String, kp$b):long");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.text.b
    public d o(byte[] bArr, int i, boolean z) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.n.newPullParser();
            Map<String, np> hashMap = new HashMap<>();
            HashMap hashMap2 = new HashMap();
            Map<String, String> hashMap3 = new HashMap<>();
            hashMap2.put("", new mp(null, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = u;
            a aVar = v;
            op opVar = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                lp lpVar = (lp) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = u(newPullParser);
                            aVar = s(newPullParser, v);
                            cVar = A(newPullParser);
                        }
                        if (!r(name)) {
                            newPullParser.getName();
                            i2++;
                            bVar = bVar2;
                        } else if ("head".equals(name)) {
                            bVar = bVar2;
                            v(newPullParser, hashMap, aVar, cVar, hashMap2, hashMap3);
                        } else {
                            bVar = bVar2;
                            try {
                                lp w = w(newPullParser, lpVar, hashMap2, bVar);
                                arrayDeque.push(w);
                                if (lpVar != null) {
                                    lpVar.a(w);
                                }
                            } catch (SubtitleDecoderException unused) {
                                i2++;
                            }
                        }
                        bVar2 = bVar;
                        cVar = cVar;
                        aVar = aVar;
                    } else if (eventType == 4) {
                        lpVar.a(lp.c(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            opVar = new op((lp) arrayDeque.peek(), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            return opVar;
        } catch (XmlPullParserException e) {
            throw new SubtitleDecoderException("Unable to decode source", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        }
    }
}
