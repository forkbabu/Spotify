package defpackage;

import com.squareup.picasso.g;

/* renamed from: dm3  reason: default package */
class dm3 implements g {
    final /* synthetic */ cm3 a;

    dm3(cm3 cm3) {
        this.a = cm3;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        cm3 cm3 = this.a;
        cm3.x.c(cm3.u);
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.a.x.d();
    }
}
