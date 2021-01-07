package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.share.cleanup.a;
import com.spotify.share.sharedata.t;
import com.spotify.share.sharedata.u;
import com.spotify.share.util.c;
import com.spotify.share.util.i;
import com.spotify.share.util.o;
import io.reactivex.y;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: x5e  reason: default package */
public class x5e extends h5e {
    private final w9e e;
    private final i f;
    private final c g;
    private final o h;
    private final a i;

    public x5e(y yVar, y yVar2, i iVar, c cVar, x3e x3e, w9e w9e, o oVar, a aVar) {
        super(w9e, x3e, yVar, yVar2);
        this.e = w9e;
        this.f = iVar;
        this.g = cVar;
        this.h = oVar;
        this.i = aVar;
    }

    @Override // defpackage.i6e
    public boolean b(t tVar) {
        return tVar instanceof com.spotify.share.sharedata.o;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.h5e
    public <T extends m8e> Optional<u3<w3e, Intent>> d(u<T> uVar, w3e w3e) {
        u3 u3Var;
        String str;
        Logger.b("Building intent for %s", w3e.d());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Optional<u3<w3e, Intent>> absent = Optional.absent();
        com.spotify.share.sharedata.o oVar = (com.spotify.share.sharedata.o) uVar;
        if (uVar.b() != null) {
            Bitmap c = uVar.b().c();
            try {
                File a = this.h.a(this.h.b(".png"), false);
                u3Var = new u3(this.g.b(c, a).orNull(), a);
            } catch (IOException e2) {
                Logger.d(e2.getMessage(), new Object[0]);
                u3Var = new u3(null, null);
            }
        } else {
            u3Var = new u3(null, null);
        }
        F f2 = u3Var.a;
        if (f2 != null) {
            Logger.b("Sticker saved to %s", f2.toString());
            String str2 = oVar.h().b().get(0);
            k8e h2 = oVar.h();
            if (h2.b().size() > 1) {
                str = h2.b().get(1);
            } else {
                str = h2.b().get(0);
            }
            Intent d = this.e.d(w3e.d(), u3Var.a, str2, str);
            this.f.b(u3Var.a, d, 1);
            arrayList2.add(u3Var.a.toString());
            absent = Optional.of(new u3(w3e, d));
        }
        S s = u3Var.b;
        if (s != null) {
            arrayList.add(s.getAbsolutePath());
        }
        this.i.a(arrayList, arrayList2);
        return absent;
    }
}