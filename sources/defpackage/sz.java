package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.v;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* renamed from: sz  reason: default package */
public class sz {
    private static final com.google.firebase.encoders.a a;
    public static final /* synthetic */ int b = 0;

    /* access modifiers changed from: private */
    /* renamed from: sz$a */
    public interface a<T> {
        T a(JsonReader jsonReader);
    }

    static {
        m10 m10 = new m10();
        ((com.google.firebase.crashlytics.internal.model.a) com.google.firebase.crashlytics.internal.model.a.a).a(m10);
        m10.f(true);
        a = m10.e();
    }

    static CrashlyticsReport.d.AbstractC0117d.a.b.e b(JsonReader jsonReader) {
        CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0125a a2 = CrashlyticsReport.d.AbstractC0117d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(g(jsonReader, rz.b()));
                    break;
                case 1:
                    a2.d(jsonReader.nextString());
                    break;
                case 2:
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static <T> v<T> g(JsonReader jsonReader, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return v.c(arrayList);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d h(android.util.JsonReader r12) {
        /*
        // Method dump skipped, instructions count: 832
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz.h(android.util.JsonReader):com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d");
    }

    private static CrashlyticsReport.d.AbstractC0117d.a.b.c i(JsonReader jsonReader) {
        CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a a2 = CrashlyticsReport.d.AbstractC0117d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.c(g(jsonReader, qz.b()));
                    break;
                case 1:
                    a2.e(jsonReader.nextString());
                    break;
                case 2:
                    a2.f(jsonReader.nextString());
                    break;
                case 3:
                    a2.b(i(jsonReader));
                    break;
                case 4:
                    a2.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* access modifiers changed from: private */
    public static CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b j(JsonReader jsonReader) {
        CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a a2 = CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.d(jsonReader.nextLong());
                    break;
                case 1:
                    a2.f(jsonReader.nextString());
                    break;
                case 2:
                    a2.e(jsonReader.nextLong());
                    break;
                case 3:
                    a2.b(jsonReader.nextString());
                    break;
                case 4:
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static CrashlyticsReport k(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        CrashlyticsReport.a b2 = CrashlyticsReport.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    CrashlyticsReport.c.a a2 = CrashlyticsReport.c.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals("files")) {
                            a2.b(g(jsonReader, mz.b()));
                        } else if (!nextName2.equals("orgId")) {
                            jsonReader.skipValue();
                        } else {
                            a2.c(jsonReader.nextString());
                        }
                    }
                    jsonReader.endObject();
                    b2.f(a2.a());
                    break;
                case 1:
                    b2.h(jsonReader.nextString());
                    break;
                case 2:
                    b2.b(jsonReader.nextString());
                    break;
                case 3:
                    b2.d(jsonReader.nextString());
                    break;
                case 4:
                    b2.e(jsonReader.nextString());
                    break;
                case 5:
                    b2.g(jsonReader.nextInt());
                    break;
                case 6:
                    b2.c(jsonReader.nextString());
                    break;
                case 7:
                    CrashlyticsReport.d.b a3 = CrashlyticsReport.d.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.hashCode();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = '\n';
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
                                a3.l(jsonReader.nextLong());
                                break;
                            case 1:
                                a3.j(Base64.decode(jsonReader.nextString(), 2));
                                break;
                            case 2:
                                a3.e(Long.valueOf(jsonReader.nextLong()));
                                break;
                            case 3:
                                CrashlyticsReport.d.c.a a4 = CrashlyticsReport.d.c.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.hashCode();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            a4.i(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            a4.e(jsonReader.nextString());
                                            break;
                                        case 2:
                                            a4.h(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            a4.b(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            a4.d(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            a4.c(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            a4.f(jsonReader.nextString());
                                            break;
                                        case 7:
                                            a4.j(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            a4.g(jsonReader.nextString());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                a3.d(a4.a());
                                break;
                            case 4:
                                a3.f(g(jsonReader, lz.b()));
                                break;
                            case 5:
                                CrashlyticsReport.d.e.a a5 = CrashlyticsReport.d.e.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.hashCode();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    if (c4 == 0) {
                                        a5.b(jsonReader.nextString());
                                    } else if (c4 == 1) {
                                        a5.c(jsonReader.nextBoolean());
                                    } else if (c4 == 2) {
                                        a5.e(jsonReader.nextString());
                                    } else if (c4 != 3) {
                                        jsonReader.skipValue();
                                    } else {
                                        a5.d(jsonReader.nextInt());
                                    }
                                }
                                jsonReader.endObject();
                                a3.k(a5.a());
                                break;
                            case 6:
                                CrashlyticsReport.d.a.AbstractC0116a a6 = CrashlyticsReport.d.a.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.hashCode();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c5 = 0;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c5 = 1;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c5 = 2;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c5 = 3;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        default:
                                            c5 = 65535;
                                            break;
                                    }
                                    if (c5 == 0) {
                                        a6.c(jsonReader.nextString());
                                    } else if (c5 == 1) {
                                        a6.e(jsonReader.nextString());
                                    } else if (c5 == 2) {
                                        a6.d(jsonReader.nextString());
                                    } else if (c5 != 3) {
                                        jsonReader.skipValue();
                                    } else {
                                        a6.b(jsonReader.nextString());
                                    }
                                }
                                jsonReader.endObject();
                                a3.b(a6.a());
                                break;
                            case 7:
                                CrashlyticsReport.d.f.a a7 = CrashlyticsReport.d.f.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName7 = jsonReader.nextName();
                                    nextName7.hashCode();
                                    if (!nextName7.equals("identifier")) {
                                        jsonReader.skipValue();
                                    } else {
                                        a7.b(jsonReader.nextString());
                                    }
                                }
                                jsonReader.endObject();
                                a3.m(a7.a());
                                break;
                            case '\b':
                                a3.g(jsonReader.nextString());
                                break;
                            case '\t':
                                a3.c(jsonReader.nextBoolean());
                                break;
                            case '\n':
                                a3.h(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    b2.i(a3.a());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b2.a();
    }

    public CrashlyticsReport.d.AbstractC0117d e(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport.d.AbstractC0117d h = h(jsonReader);
                jsonReader.close();
                return h;
            } catch (Throwable unused) {
            }
            throw th;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String f(CrashlyticsReport.d.AbstractC0117d dVar) {
        return a.b(dVar);
    }

    public CrashlyticsReport l(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport k = k(jsonReader);
                jsonReader.close();
                return k;
            } catch (Throwable unused) {
            }
            throw th;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String m(CrashlyticsReport crashlyticsReport) {
        return a.b(crashlyticsReport);
    }
}
