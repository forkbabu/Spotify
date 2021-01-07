package defpackage;

import android.net.Uri;
import com.spotify.music.features.checkout.web.k;

/* renamed from: nl4  reason: default package */
public class nl4 implements kl4 {
    private final k a;
    private final a b;

    /* renamed from: nl4$a */
    public interface a {
        void x0(String str);
    }

    public nl4(k kVar, a aVar) {
        this.a = kVar;
        this.b = aVar;
    }

    @Override // defpackage.kl4
    public void a(Uri uri) {
        this.a.a(uri);
        a aVar = this.b;
        String queryParameter = uri.getQueryParameter("reason");
        if (queryParameter == null) {
            queryParameter = "";
        }
        aVar.x0(queryParameter);
    }
}
