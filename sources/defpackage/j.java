package defpackage;

import android.net.Uri;
import android.provider.BaseColumns;

/* renamed from: j  reason: default package */
public class j {
    public static final Uri a = Uri.parse("content://com.samsung.android.customizationservice.context.tpocontext");

    /* renamed from: j$a */
    public static final class a implements BaseColumns {
        public static final Uri a;

        static {
            Uri uri = j.a;
            Uri.withAppendedPath(uri, "tpo_context_event");
            a = Uri.withAppendedPath(uri, "tpo_context_event/snapshot");
        }
    }
}
