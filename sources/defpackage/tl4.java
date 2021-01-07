package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: tl4  reason: default package */
public class tl4 implements kl4 {
    private final a a;

    /* renamed from: tl4$a */
    public interface a {
        void s0(Intent intent);
    }

    public tl4(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.kl4
    public void a(Uri uri) {
        this.a.s0(new Intent("android.intent.action.VIEW", uri));
    }
}
