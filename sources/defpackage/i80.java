package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import defpackage.i1;
import io.reactivex.disposables.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i80  reason: default package */
public class i80 {
    private final n80 a;
    private final List<h80> b = new ArrayList(5);
    private b c;
    private k1 d;

    public i80(n80 n80) {
        this.a = n80;
    }

    public i80 a(h80 h80) {
        this.b.add(h80);
        return this;
    }

    public /* synthetic */ void b(Uri uri, k1 k1Var) {
        k1Var.d(uri, null, null);
        this.d = k1Var;
    }

    public void c(Activity activity, Uri uri) {
        Logger.b("openUrl %s", uri);
        i1.a aVar = new i1.a(this.d);
        for (h80 h80 : this.b) {
            h80.a(aVar);
        }
        aVar.a().a(activity, uri);
    }

    public void d(f1 f1Var) {
        this.a.c(f1Var);
    }

    public void e() {
        Logger.b(ContextTrack.TrackAction.STOP, new Object[0]);
        b bVar = this.c;
        if (bVar != null) {
            bVar.dispose();
            this.c = null;
        }
    }

    public void f(Uri uri) {
        Logger.b("warmUp %s", uri);
        this.c = this.a.a().subscribe(new b80(this, uri), c80.a);
    }
}
