package com.facebook.share.internal;

import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.internal.f0;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.g;
import com.facebook.share.model.k;
import com.facebook.share.model.l;
import com.facebook.share.model.n;
import com.facebook.share.model.o;
import com.facebook.share.model.q;
import com.facebook.share.model.r;
import com.facebook.share.model.s;
import java.util.List;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class v {
    private boolean a = false;

    v(t tVar) {
    }

    public boolean a() {
        return this.a;
    }

    public void b(ShareMedia shareMedia) {
        if (shareMedia instanceof o) {
            f((o) shareMedia);
        } else if (shareMedia instanceof r) {
            h((r) shareMedia);
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", shareMedia.getClass().getSimpleName()));
        }
    }

    public void c(g gVar) {
        List<ShareMedia> h = gVar.h();
        if (h == null || h.isEmpty()) {
            throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
        } else if (h.size() <= 6) {
            for (ShareMedia shareMedia : h) {
                b(shareMedia);
            }
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", 6));
        }
    }

    public void d(l lVar) {
        this.a = true;
        k h = lVar.h();
        if (h == null) {
            throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
        } else if (!f0.C(h.f())) {
            c.b(h, this, false);
            String i = lVar.i();
            if (f0.C(i)) {
                throw new FacebookException("Must specify a previewPropertyName.");
            } else if (lVar.h().a(i) == null) {
                throw new FacebookException(je.y0("Property \"", i, "\" was not found on the action. The name of the preview property must match the name of an action property."));
            }
        } else {
            throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
        }
    }

    public void e(n nVar, boolean z) {
        c.b(nVar, this, z);
    }

    public void f(o oVar) {
        c.c(oVar, this);
    }

    public void g(q qVar) {
        c.g(qVar, this);
    }

    public void h(r rVar) {
        if (rVar != null) {
            Uri c = rVar.c();
            if (c == null) {
                throw new FacebookException("ShareVideo does not have a LocalUrl specified");
            } else if (!f0.z(c) && !f0.B(c)) {
                throw new FacebookException("ShareVideo must reference a video that is on the device");
            }
        } else {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
    }

    public void i(s sVar) {
        h(sVar.k());
        o j = sVar.j();
        if (j != null) {
            f(j);
        }
    }
}
