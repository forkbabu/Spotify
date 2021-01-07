package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.Assertion;
import kotlin.jvm.internal.h;

/* renamed from: h2e  reason: default package */
public class h2e {
    private final a a;

    /* renamed from: h2e$a */
    public interface a {
        void a(Context context, Intent intent, String str, Object... objArr);

        void b(Intent intent);
    }

    public h2e(a aVar) {
        h.e(aVar, "mDelegate");
        this.a = aVar;
    }

    public void a(Intent intent) {
        if (intent != null) {
            this.a.b(intent);
        } else {
            Assertion.g("Service acknowledge foreground start with null intent.");
        }
    }

    public void b(Context context, Intent intent, String str, Object... objArr) {
        h.e(context, "context");
        h.e(intent, "intent");
        h.e(str, "tag");
        h.e(objArr, "serviceStartMetadata");
        this.a.a(context, intent, str, objArr);
    }
}
