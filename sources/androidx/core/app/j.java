package androidx.core.app;

import android.app.Notification;
import android.os.Build;

public class j extends n {
    private CharSequence e;

    @Override // androidx.core.app.n
    public void a(g gVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((o) gVar).a()).setBigContentTitle(this.b).bigText(this.e);
        if (this.d) {
            bigText.setSummaryText(this.c);
        }
    }

    public j j(CharSequence charSequence) {
        this.e = k.c(charSequence);
        return this;
    }
}
