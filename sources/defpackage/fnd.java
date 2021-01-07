package defpackage;

import android.graphics.Bitmap;
import com.spotify.base.java.logging.Logger;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.r;
import com.squareup.picasso.Picasso;
import io.reactivex.z;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: fnd  reason: default package */
public class fnd {
    private final Picasso a;
    private final i1d b;

    fnd(Picasso picasso, i1d i1d) {
        this.a = picasso;
        this.b = i1d;
    }

    private z<Bitmap> a(String str) {
        try {
            return z.z(this.a.m(str).j());
        } catch (IOException e) {
            Logger.d(e.getMessage(), new Object[0]);
            return z.q(e);
        }
    }

    public z<szc> b(r rVar, String str) {
        return z.R(a(str), this.b.a(rVar.g()), rmd.a);
    }

    /* access modifiers changed from: package-private */
    public z<q> c(r rVar, String str) {
        return z.R(a(str), this.b.a(rVar.g()), new smd(rVar));
    }
}
