package defpackage;

import com.squareup.picasso.g;

/* renamed from: ro3  reason: default package */
class ro3 implements g {
    final /* synthetic */ so3 a;

    ro3(so3 so3) {
        this.a = so3;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        so3 so3 = this.a;
        so3.l.b(so3.h);
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.a.l.c();
    }
}
