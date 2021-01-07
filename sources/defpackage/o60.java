package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

/* renamed from: o60  reason: default package */
public final class o60 {
    private static final Uri a;
    private static volatile o60 b = null;

    static {
        Uri parse = Uri.parse("content://com.samsung.android.app.spage.provider");
        a = parse;
        Uri.withAppendedPath(parse, AppProtocol.LogMessage.SEVERITY_INFO);
        Uri.withAppendedPath(parse, "card");
        Uri.withAppendedPath(parse, "instant");
        Uri.withAppendedPath(parse, "customize");
        Uri.withAppendedPath(parse, "change");
    }

    private o60() {
    }

    public static o60 a() {
        if (b == null) {
            synchronized (o60.class) {
                if (b == null) {
                    b = new o60();
                }
                o60.class.notifyAll();
            }
        }
        return b;
    }
}
