package defpackage;

import android.widget.ImageView;
import com.squareup.picasso.g;

/* renamed from: n65  reason: default package */
class n65 implements g {
    final /* synthetic */ ImageView a;
    final /* synthetic */ o65 b;

    n65(o65 o65, ImageView imageView) {
        this.b = o65;
        this.a = imageView;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.b.c.b(this.a);
    }
}
