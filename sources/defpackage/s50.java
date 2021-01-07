package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.threeten.bp.zone.a;
import org.threeten.bp.zone.b;
import org.threeten.bp.zone.c;

/* access modifiers changed from: package-private */
/* renamed from: s50  reason: default package */
public final class s50 extends b {
    private final Context c;

    s50(Context context) {
        this.c = context;
    }

    /* access modifiers changed from: protected */
    @Override // org.threeten.bp.zone.b
    public void b() {
        InputStream inputStream = null;
        try {
            inputStream = this.c.getAssets().open("org/threeten/bp/TZDB.dat");
            a aVar = new a(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            c.e(aVar);
        } catch (IOException e) {
            throw new IllegalStateException("TZDB.dat missing from assets.", e);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
