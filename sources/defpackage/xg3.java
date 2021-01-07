package defpackage;

import android.content.Context;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: xg3  reason: default package */
public class xg3 {
    private final Context a;
    private final tg3 b;

    /* access modifiers changed from: package-private */
    /* renamed from: xg3$a */
    public interface a {
    }

    xg3(Context context, tg3 tg3) {
        this.a = context;
        this.b = tg3;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, String str, String str2) {
        sg3 b2 = this.b.b(str, str2);
        Context context = this.a;
        f c = m.c(context, context.getString(C0707R.string.explicit_track_dialog_title), this.a.getString(C0707R.string.explicit_track_dialog_subtitle));
        c.f(this.a.getString(C0707R.string.explicit_content_dialog_action), new qg3(b2, aVar));
        c.e(this.a.getString(C0707R.string.explicit_content_dialog_dismiss), new pg3(b2, aVar));
        c.a(true);
        c.h(new ng3(b2, aVar));
        c.b().a();
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar, String str, String str2) {
        sg3 b2 = this.b.b(str, str2);
        Context context = this.a;
        f c = m.c(context, context.getString(C0707R.string.explicit_track_dialog_title), this.a.getString(C0707R.string.locked_explicit_content_dialog_subtitle));
        c.f(this.a.getString(C0707R.string.locked_explicit_content_dialog_close_button), new rg3(b2, aVar));
        c.a(true);
        c.h(new og3(b2, aVar));
        c.b().a();
    }
}
