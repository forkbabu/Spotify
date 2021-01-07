package defpackage;

import android.app.Application;
import android.content.ContentResolver;

/* renamed from: bu2  reason: default package */
public final class bu2 implements fjf<ContentResolver> {
    private final wlf<Application> a;

    public bu2(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ContentResolver contentResolver = this.a.get().getContentResolver();
        yif.g(contentResolver, "Cannot return null from a non-@Nullable @Provides method");
        return contentResolver;
    }
}
