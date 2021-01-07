package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.share.cleanup.a;
import com.spotify.share.sharedata.p;
import com.spotify.share.sharedata.t;
import com.spotify.share.util.c;
import com.spotify.share.util.i;
import com.spotify.share.util.o;
import com.spotify.share.util.q;
import defpackage.b4e;
import io.reactivex.y;
import io.reactivex.z;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* renamed from: a6e  reason: default package */
public class a6e implements i6e {
    private final t7e a;
    private final i b;
    private final c c;
    private final x3e d;
    private final y e;
    private final y f;
    private final q g;
    private final o h;
    private final a i;

    public a6e(y yVar, y yVar2, i iVar, c cVar, x3e x3e, q qVar, t7e t7e, o oVar, a aVar) {
        this.a = t7e;
        this.b = iVar;
        this.c = cVar;
        this.d = x3e;
        this.g = qVar;
        this.e = yVar;
        this.f = yVar2;
        this.h = oVar;
        this.i = aVar;
    }

    @Override // defpackage.i6e
    public /* synthetic */ Exception a(Context context, o8e o8e) {
        return h6e.a(this, context, o8e);
    }

    @Override // defpackage.i6e
    public boolean b(t tVar) {
        return tVar instanceof p;
    }

    @Override // defpackage.i6e
    public z<String> c(Activity activity, o8e o8e, t tVar, z7e z7e, d8e d8e, long j) {
        if (!(tVar instanceof p)) {
            return z.q(a(activity, o8e));
        }
        Logger.l("ImageShareClickHandler invoked", new Object[0]);
        p pVar = (p) tVar;
        b4e.a a2 = b4e.a(pVar.g());
        a2.c(pVar.a());
        a2.d(r3e.a(pVar.c()));
        a2.a(pVar.f());
        return this.d.a(a2.build()).A(new b5e(this, pVar)).H(this.e).B(this.f).s(new d5e(this, z7e, o8e, j, d8e, pVar, activity));
    }

    public u3 d(p pVar, w3e w3e, File file, Uri uri) {
        Intent a2 = this.a.a(uri, this.g.a(pVar, w3e.d()));
        this.b.b(uri, a2, 1);
        this.i.a(Collections.singletonList(file.getAbsolutePath()), Collections.singletonList(uri.toString()));
        return new u3(w3e.b(), a2);
    }

    public Optional e(p pVar, w3e w3e) {
        try {
            File a2 = this.h.a(this.h.b(".png"), false);
            return this.c.b(pVar.h(), a2).transform(new c5e(this, pVar, w3e, a2));
        } catch (IOException e2) {
            Logger.d(e2.getMessage(), new Object[0]);
            return Optional.absent();
        }
    }
}
