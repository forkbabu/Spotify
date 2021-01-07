package androidx.core.app;

import android.app.Notification;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

public class m extends n {
    private ArrayList<CharSequence> e = new ArrayList<>();

    @Override // androidx.core.app.n
    public void a(g gVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((o) gVar).a()).setBigContentTitle(this.b);
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        Iterator<CharSequence> it = this.e.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    public m j(CharSequence charSequence) {
        this.e.add(k.c(charSequence));
        return this;
    }
}
