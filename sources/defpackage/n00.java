package defpackage;

import com.adjust.sdk.Constants;
import com.google.android.datatransport.d;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;

/* renamed from: n00  reason: default package */
final /* synthetic */ class n00 implements d {
    private static final n00 a = new n00();

    private n00() {
    }

    public static d a() {
        return a;
    }

    @Override // com.google.android.datatransport.d
    public Object apply(Object obj) {
        return o00.b.m((CrashlyticsReport) obj).getBytes(Charset.forName(Constants.ENCODING));
    }
}
