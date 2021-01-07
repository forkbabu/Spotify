package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import defpackage.h2e;
import java.util.Arrays;
import kotlin.jvm.internal.h;

/* renamed from: c2e  reason: default package */
public final class c2e implements h2e.a {
    private final cqe a;
    private final a b;

    /* renamed from: c2e$a */
    public interface a {
        void a(long j, String str);

        void b(long j);
    }

    public c2e(cqe cqe, a aVar) {
        h.e(cqe, "clock");
        h.e(aVar, "tracker");
        this.a = cqe;
        this.b = aVar;
    }

    @Override // defpackage.h2e.a
    public void a(Context context, Intent intent, String str, Object... objArr) {
        h.e(context, "context");
        h.e(intent, "intent");
        h.e(str, "tag");
        h.e(objArr, "serviceStartMetadata");
        Logger.g("Starting foreground service for %s", intent);
        h.e(intent, "intent");
        intent.putExtra("needs_foreground_start", true);
        long c = this.a.c();
        StringBuilder Z0 = je.Z0(str, ", meta=");
        String arrays = Arrays.toString(objArr);
        h.d(arrays, "java.util.Arrays.toString(this)");
        Z0.append(arrays);
        this.b.a(c, Z0.toString());
        intent.putExtra("ServiceGraveyardCaretaker.INTENT_KEY_ID", c);
        context.startForegroundService(intent);
    }

    @Override // defpackage.h2e.a
    public void b(Intent intent) {
        h.e(intent, "startIntent");
        Logger.g("Acknowledging foreground service for intent %s", intent.toUri(0));
        Bundle extras = intent.getExtras();
        if (extras != null) {
            h.d(extras, "startIntent.extras ?: return");
            Object obj = extras.get("ServiceGraveyardCaretaker.INTENT_KEY_ID");
            if (!(obj instanceof Long)) {
                obj = null;
            }
            Long l = (Long) obj;
            if (l != null) {
                this.b.b(l.longValue());
            }
        }
    }
}
