package defpackage;

import com.squareup.picasso.g;

/* renamed from: dn3  reason: default package */
class dn3 implements g {
    final /* synthetic */ cn3 a;

    dn3(cn3 cn3) {
        this.a = cn3;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        cn3 cn3 = this.a;
        cn3.x.c(cn3.c(cn3));
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.a.x.d();
    }
}
