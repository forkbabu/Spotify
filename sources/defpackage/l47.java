package defpackage;

import android.net.Uri;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: l47  reason: default package */
public final class l47 implements k47 {
    private final coa a;

    public l47(coa coa) {
        h.e(coa, "coverArtLoaderProvider");
        this.a = coa;
    }

    @Override // defpackage.k47
    public s<boa> a(Uri uri) {
        h.e(uri, "uri");
        s<boa> a2 = this.a.a(uri);
        h.d(a2, "coverArtLoaderProvider.getLoaderObserver(uri)");
        return a2;
    }
}
