package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.music.features.yourlibrary.musicpages.view.a0;

/* renamed from: q79  reason: default package */
public class q79 {
    private final Context a;
    private boolean b;

    /* renamed from: q79$a */
    public interface a {
    }

    public q79(Context context) {
        this.a = context;
    }

    public void a(a aVar, DialogInterface dialogInterface, int i) {
        this.b = false;
        ((a0) aVar).a.b();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface) {
        this.b = false;
    }

    public void c(String str, String str2, String str3, a aVar) {
        if (!this.b) {
            this.b = true;
            f c = m.c(this.a, str, str2);
            c.f(str3, new n79(this, aVar));
            c.a(true);
            c.h(new o79(this));
            c.b().a();
        }
    }
}
