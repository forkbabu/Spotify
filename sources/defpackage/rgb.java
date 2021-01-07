package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: rgb  reason: default package */
public class rgb implements blb {
    private final Context a;

    public rgb(Context context, boolean z) {
        this.a = context;
    }

    public /* synthetic */ Intent a(Intent intent, c cVar) {
        return null;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).h(LinkType.DEBUG, "open the debug menu", new jgb(this));
    }
}
