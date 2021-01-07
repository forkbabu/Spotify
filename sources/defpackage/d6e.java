package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.share.cleanup.a;
import com.spotify.share.sharedata.ShareCapability;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.t;
import com.spotify.share.sharedata.u;
import com.spotify.share.util.c;
import com.spotify.share.util.i;
import com.spotify.share.util.o;
import io.reactivex.y;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: d6e  reason: default package */
public class d6e extends h5e {
    private final w9e e;
    private final i f;
    private final c g;
    private final o h;
    private final a i;

    public d6e(y yVar, y yVar2, i iVar, c cVar, x3e x3e, w9e w9e, o oVar, a aVar) {
        super(w9e, x3e, yVar, yVar2);
        this.e = w9e;
        this.f = iVar;
        this.g = cVar;
        this.h = oVar;
        this.i = aVar;
    }

    private u3<Uri, File> e(Bitmap bitmap) {
        try {
            File a = this.h.a(this.h.b(".png"), false);
            return new u3<>(this.g.b(bitmap, a).orNull(), a);
        } catch (IOException e2) {
            Logger.d(e2.getMessage(), new Object[0]);
            return new u3<>(null, null);
        }
    }

    @Override // defpackage.i6e
    public boolean b(t tVar) {
        return tVar instanceof q;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.h5e
    public <T extends m8e> Optional<u3<w3e, Intent>> d(u<T> uVar, w3e w3e) {
        u3<Uri, File> u3Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Optional<u3<w3e, Intent>> absent = Optional.absent();
        q qVar = (q) uVar;
        u3<Uri, File> e2 = e(qVar.h().c());
        if (qVar.b() != null) {
            u3Var = e(qVar.b().c());
        } else {
            u3Var = new u3<>(null, null);
        }
        if (e2.a != null) {
            Intent a = this.e.a(w3e.d(), Optional.fromNullable(u3Var.a), e2.a, ShareCapability.IMAGE_STORY);
            this.f.b(e2.a, a, 1);
            arrayList2.add(e2.a.toString());
            F f2 = u3Var.a;
            if (f2 != null) {
                this.f.b(f2, a, 1);
                arrayList2.add(u3Var.a.toString());
            }
            absent = Optional.of(new u3(w3e, a));
        }
        S s = e2.b;
        if (s != null) {
            arrayList.add(s.getAbsolutePath());
        }
        S s2 = u3Var.b;
        if (s2 != null) {
            arrayList.add(s2.getAbsolutePath());
        }
        this.i.a(arrayList, arrayList2);
        return absent;
    }
}
