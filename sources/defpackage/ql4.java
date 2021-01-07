package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: ql4  reason: default package */
public class ql4 implements kl4 {
    private final PackageManager a;
    private final a b;

    /* renamed from: ql4$a */
    public interface a {
        void f2(Intent intent);
    }

    public ql4(PackageManager packageManager, a aVar) {
        this.a = packageManager;
        this.b = aVar;
    }

    @Override // defpackage.kl4
    public void a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (!this.a.queryIntentActivities(intent, 0).isEmpty()) {
            this.b.f2(intent);
        }
    }
}
