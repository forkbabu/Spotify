package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import com.squareup.picasso.y;

/* renamed from: kwd  reason: default package */
public class kwd extends a0 {
    private final jwd a;

    public kwd(jwd jwd) {
        this.a = jwd;
    }

    @Override // com.squareup.picasso.a0
    public boolean c(y yVar) {
        Uri uri = yVar.c;
        if (uri == null) {
            return false;
        }
        return jwd.f(uri.toString());
    }

    @Override // com.squareup.picasso.a0
    public a0.a f(y yVar, int i) {
        Bitmap a2;
        Uri uri = yVar.c;
        if (uri == null || (a2 = this.a.a(uri.toString())) == null) {
            return null;
        }
        return new a0.a(a2, Picasso.LoadedFrom.DISK);
    }
}
