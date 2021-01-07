package defpackage;

import android.view.View;
import com.spotify.base.java.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: geb  reason: default package */
public final class geb implements View.OnClickListener {
    public static final geb a = new geb();

    geb() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.b("Something while sharing went wrong", new Object[0]);
    }
}
