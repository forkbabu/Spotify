package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.share.cleanup.a;
import com.spotify.share.sharedata.ShareCapability;
import com.spotify.share.sharedata.t;
import com.spotify.share.sharedata.u;
import com.spotify.share.sharedata.w;
import com.spotify.share.util.c;
import com.spotify.share.util.i;
import com.spotify.share.util.k;
import com.spotify.share.util.o;
import io.reactivex.y;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: e7e  reason: default package */
public class e7e extends h5e {
    private final w9e e;
    private final o f;
    private final i g;
    private final a h;
    private final c i;
    private final gae j;
    private final k k;

    public e7e(w9e w9e, x3e x3e, o oVar, i iVar, a aVar, c cVar, gae gae, k kVar, y yVar, y yVar2) {
        super(w9e, x3e, yVar, yVar2);
        this.e = w9e;
        this.f = oVar;
        this.g = iVar;
        this.h = aVar;
        this.i = cVar;
        this.j = gae;
        this.k = kVar;
    }

    @Override // defpackage.i6e
    public boolean b(t tVar) {
        return tVar instanceof w;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.h5e
    public <T extends m8e> Optional<u3<w3e, Intent>> d(u<T> uVar, w3e w3e) {
        u3 u3Var;
        u3 u3Var2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Optional<u3<w3e, Intent>> absent = Optional.absent();
        Uri b = ((w) uVar).h().b();
        if (b.getPath() != null) {
            String b2 = this.f.b(".mp4");
            try {
                File file = new File(b.getPath());
                File a = this.f.a(b2, false);
                this.j.a(file, a, 15);
                boolean delete = file.delete();
                Uri a2 = this.k.a(a);
                Logger.b("Raw file was deleted: %b", Boolean.valueOf(delete));
                u3Var = new u3(a2, a);
            } catch (Exception e2) {
                Logger.d(e2.getMessage(), new Object[0]);
                u3Var = new u3(null, null);
            }
            if (uVar.b() != null) {
                Bitmap c = uVar.b().c();
                try {
                    File a3 = this.f.a(this.f.b(".png"), false);
                    u3Var2 = new u3(this.i.b(c, a3).orNull(), a3);
                } catch (IOException e3) {
                    Logger.d(e3.getMessage(), new Object[0]);
                    u3Var2 = new u3(null, null);
                }
            } else {
                u3Var2 = new u3(null, null);
            }
            if (u3Var.a != null) {
                Intent a4 = this.e.a(w3e.d(), Optional.fromNullable(u3Var2.a), u3Var.a, ShareCapability.VIDEO_STORY);
                this.g.b(u3Var.a, a4, 1);
                arrayList2.add(u3Var.a.toString());
                F f2 = u3Var2.a;
                if (f2 != null) {
                    this.g.b(f2, a4, 1);
                    arrayList2.add(u3Var2.a.toString());
                }
                absent = Optional.of(new u3(w3e, a4));
            }
            S s = u3Var.b;
            if (s != null) {
                arrayList.add(s.getAbsolutePath());
            }
            S s2 = u3Var2.b;
            if (s2 != null) {
                arrayList.add(s2.getAbsolutePath());
            }
            this.h.a(arrayList, arrayList2);
            return absent;
        }
        throw new IllegalStateException("Video uri is null");
    }
}
