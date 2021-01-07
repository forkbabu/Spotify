package defpackage;

import android.net.Uri;

/* renamed from: k60  reason: default package */
public class k60 {
    public static final Uri a;

    static {
        Uri parse = Uri.parse("content://com.samsung.android.rubin.state");
        a = parse;
        Uri.withAppendedPath(parse, "enabled");
    }
}
