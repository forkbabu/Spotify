package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.base.java.logging.Logger;
import java.text.ParseException;
import java.util.Calendar;
import kotlin.jvm.internal.h;

/* renamed from: f45  reason: default package */
public final class f45 {
    private final cqe a;
    private final Context b;

    public f45(cqe cqe, Context context) {
        h.e(cqe, "clock");
        h.e(context, "context");
        this.a = cqe;
        this.b = context;
    }

    public final String a(String str) {
        h.e(str, "isoReleaseTime");
        try {
            Calendar e = this.a.e();
            h.d(e, "clock.calendar");
            c45 a2 = e45.a(str, e);
            Resources resources = this.b.getResources();
            h.d(resources, "context.resources");
            return d45.a(a2, resources);
        } catch (ParseException e2) {
            Logger.d(e2.getMessage(), new Object[0]);
            return "";
        }
    }
}
