package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.z0;

/* renamed from: kgb  reason: default package */
public class kgb implements blb {
    private final Context a;
    private a b;
    private final z0 c;

    /* renamed from: kgb$a */
    interface a {
    }

    public kgb(Context context, z0 z0Var) {
        this.a = context;
        this.c = z0Var;
    }

    public /* synthetic */ void a(Intent intent, c cVar, SessionState sessionState) {
        Context context = this.a;
        context.startActivity(this.c.b(context, "spotify:internal:preferences").a());
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        if (this.b == null) {
            this.b = dgb.a;
        }
        ((dgb) this.b).getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            ((xkb) glb).d("android.intent.action.APPLICATION_PREFERENCES", "Show application preferences.", new egb(this));
        }
    }
}
