package defpackage;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: wc  reason: default package */
public class wc implements wd<DocumentData> {
    public static final wc a = new wc();
    private static final JsonReader.a b = JsonReader.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private wc() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.wd
    public DocumentData a(JsonReader jsonReader, float f) {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.d();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (jsonReader.h()) {
            switch (jsonReader.w(b)) {
                case 0:
                    str = jsonReader.q();
                    break;
                case 1:
                    str2 = jsonReader.q();
                    break;
                case 2:
                    f2 = (float) jsonReader.l();
                    break;
                case 3:
                    int m = jsonReader.m();
                    if (m <= 2 && m >= 0) {
                        justification2 = DocumentData.Justification.values()[m];
                        break;
                    } else {
                        justification2 = justification;
                        break;
                    }
                case 4:
                    i = jsonReader.m();
                    break;
                case 5:
                    f3 = (float) jsonReader.l();
                    break;
                case 6:
                    f4 = (float) jsonReader.l();
                    break;
                case 7:
                    i2 = ed.a(jsonReader);
                    break;
                case 8:
                    i3 = ed.a(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.l();
                    break;
                case 10:
                    z = jsonReader.i();
                    break;
                default:
                    jsonReader.B();
                    jsonReader.C();
                    break;
            }
        }
        jsonReader.g();
        return new DocumentData(str, str2, f2, justification2, i, f3, f4, i2, i3, f5, z);
    }
}
