package defpackage;

import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import io.reactivex.s;

/* renamed from: coa  reason: default package */
public class coa {
    private final Picasso a;
    private final Context b;

    public coa(Picasso picasso, Context context) {
        this.a = picasso;
        this.b = context;
    }

    public s<boa> a(Uri uri) {
        return s.y(new xna(new aoa(this.a, this.b, uri)));
    }
}
