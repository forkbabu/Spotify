package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.facebook.share.model.f;
import com.facebook.share.widget.ShareDialog;
import com.spotify.share.sharedata.t;
import defpackage.b4e;
import io.reactivex.d0;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: t5e  reason: default package */
public class t5e implements i6e {
    private final h7e a;
    private final y b;
    private final x3e c;

    public t5e(h7e h7e, y yVar, x3e x3e) {
        this.a = h7e;
        this.c = x3e;
        this.b = yVar;
    }

    @Override // defpackage.i6e
    public /* synthetic */ Exception a(Context context, o8e o8e) {
        return h6e.a(this, context, o8e);
    }

    @Override // defpackage.i6e
    public boolean b(t tVar) {
        return true;
    }

    @Override // defpackage.i6e
    public z<String> c(Activity activity, o8e o8e, t tVar, z7e z7e, d8e d8e, long j) {
        b4e.a a2 = b4e.a(tVar.g());
        a2.c(tVar.a());
        a2.d(r3e.a(tVar.c()));
        a2.a(tVar.f());
        return this.c.a(a2.build()).B(this.b).s(new z4e(this, activity, z7e, o8e, j, d8e, tVar));
    }

    public d0 d(Activity activity, z7e z7e, o8e o8e, long j, d8e d8e, t tVar, w3e w3e) {
        h7e h7e = this.a;
        Uri parse = Uri.parse(w3e.d());
        h7e.getClass();
        ShareDialog shareDialog = new ShareDialog(activity);
        f.b bVar = new f.b();
        bVar.h(parse);
        shareDialog.g(bVar.j());
        z7e.b(w3e.b(), o8e.a(), j);
        d8e.a(tVar, o8e.a(), w3e.b(), null);
        return z.z(w3e.b());
    }
}
