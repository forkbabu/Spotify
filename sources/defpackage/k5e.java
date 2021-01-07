package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.core.http.HttpConnection;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.s;
import com.spotify.share.sharedata.t;
import com.spotify.share.util.a;
import com.spotify.share.util.q;
import defpackage.b4e;
import io.reactivex.d0;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: k5e  reason: default package */
public class k5e implements i6e {
    private final a a;
    private final q b;
    private final x3e c;
    private final y d;

    public k5e(a aVar, q qVar, y yVar, x3e x3e) {
        this.a = aVar;
        this.b = qVar;
        this.d = yVar;
        this.c = x3e;
    }

    @Override // defpackage.i6e
    public /* synthetic */ Exception a(Context context, o8e o8e) {
        return h6e.a(this, context, o8e);
    }

    @Override // defpackage.i6e
    public boolean b(t tVar) {
        return (tVar instanceof s) || (tVar instanceof r);
    }

    @Override // defpackage.i6e
    public z<String> c(Activity activity, o8e o8e, t tVar, z7e z7e, d8e d8e, long j) {
        a.C0388a a2;
        if (!o8e.d().isPresent() || (a2 = this.a.a(o8e.d().get())) == null) {
            return z.q(a(activity, o8e));
        }
        b4e.a a3 = b4e.a(tVar.g());
        a3.c(tVar.a());
        a3.d(r3e.a(tVar.c()));
        a3.a(tVar.f());
        return this.c.a(a3.build()).B(this.d).s(new y4e(this, z7e, o8e, j, d8e, tVar, a2, activity));
    }

    public /* synthetic */ d0 d(z7e z7e, o8e o8e, long j, d8e d8e, t tVar, a.C0388a aVar, Activity activity, w3e w3e) {
        z7e.b(w3e.b(), o8e.a(), j);
        d8e.a(tVar, o8e.a(), w3e.b(), null);
        Intent intent = new Intent(aVar.a());
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.b.a(tVar, w3e.d()));
        intent.setType(HttpConnection.kDefaultContentType);
        activity.startActivity(intent);
        return z.z(w3e.b());
    }
}
