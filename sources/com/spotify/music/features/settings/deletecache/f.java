package com.spotify.music.features.settings.deletecache;

import android.content.Context;
import com.spotify.glue.dialogs.d;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;

class f {
    private final Context a;
    private d b;

    /* access modifiers changed from: package-private */
    public interface a {
    }

    f(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        Context context = this.a;
        com.spotify.glue.dialogs.f c = m.c(context, context.getString(C0707R.string.settings_storage_dialog_delete_cache_title), this.a.getString(C0707R.string.settings_storage_dialog_delete_cache_text));
        c.f(this.a.getString(C0707R.string.two_button_dialog_button_delete_cache), new c(aVar));
        c.e(this.a.getString(C0707R.string.settings_dialog_cancel_button), new b(aVar));
        c.a(true);
        c.h(new a(aVar));
        d b2 = c.b();
        this.b = b2;
        b2.a();
    }
}
