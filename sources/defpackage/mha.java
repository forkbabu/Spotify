package defpackage;

import android.content.Context;
import com.spotify.android.paste.app.a;
import com.spotify.music.C0707R;

/* renamed from: mha  reason: default package */
public final class mha {
    private a a;

    public a b(Context context) {
        a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        a.C0151a aVar2 = new a.C0151a(context, C0707R.style.res_2132083498_theme_glue_dialog);
        aVar2.l(C0707R.string.itgc_failure_dialog_title);
        aVar2.d(C0707R.string.itgc_failure_dialog_body);
        aVar2.j(C0707R.string.itgc_failure_dialog_dismiss_button, new lha(this));
        a c = aVar2.c();
        this.a = c;
        c.show();
        return this.a;
    }
}
