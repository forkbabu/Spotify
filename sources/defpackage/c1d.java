package defpackage;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.share.logging.ShareMenuLogger;
import java.util.List;

/* renamed from: c1d  reason: default package */
public class c1d {
    private final Context a;
    private final List<o8e> b;
    private final ShareMenuLogger c;

    public c1d(Context context, List<o8e> list, ShareMenuLogger shareMenuLogger) {
        this.a = context;
        this.b = list;
        this.c = shareMenuLogger;
    }

    public r3 a(r0d r0d, z7e z7e) {
        return r3.f(new e1d(this.a, r0d, z7e, this.b, this.c));
    }
}
