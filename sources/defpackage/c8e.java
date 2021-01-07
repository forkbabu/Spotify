package defpackage;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.spotify.share.util.m;

/* renamed from: c8e  reason: default package */
public class c8e {
    private final Context a;
    private final r4e b;
    private final m c;

    public c8e(Context context, r4e r4e, m mVar) {
        this.a = context;
        this.b = r4e;
        this.c = mVar;
    }

    public d8e a(String str, String str2, String str3) {
        return new d8e(this.a, this.b, this.c, MoreObjects.nullToEmpty(str2), str, str3);
    }
}
