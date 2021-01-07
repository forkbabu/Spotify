package defpackage;

import android.content.Context;
import android.content.Intent;
import defpackage.h2e;
import kotlin.jvm.internal.h;

/* renamed from: d2e  reason: default package */
public final class d2e implements h2e.a {
    @Override // defpackage.h2e.a
    public void a(Context context, Intent intent, String str, Object... objArr) {
        h.e(context, "context");
        h.e(intent, "intent");
        h.e(str, "tag");
        h.e(objArr, "serviceStartMetadata");
        context.startService(intent);
    }

    @Override // defpackage.h2e.a
    public void b(Intent intent) {
        h.e(intent, "startIntent");
    }
}
