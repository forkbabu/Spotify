package com.spotify.music.homething.settings.view;

import android.content.Context;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.music.C0707R;

public class e {
    private final Context a;
    private final g b;

    public interface a {
        void a();

        void b();
    }

    public e(Context context) {
        g gVar = new g(context);
        this.a = context;
        this.b = gVar;
    }

    public void a(a aVar) {
        f b2 = this.b.b(this.a.getString(C0707R.string.remove_device_confirmation));
        b2.e(this.a.getString(C0707R.string.remove_device_cancel_button), new a(aVar));
        b2.f(this.a.getString(C0707R.string.remove_device_confirm_button), new c(aVar));
        b2.h(new b(aVar));
        b2.b().a();
    }
}
