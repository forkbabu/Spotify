package defpackage;

import com.squareup.picasso.g;

/* renamed from: lo3  reason: default package */
class lo3 implements g {
    final /* synthetic */ mo3 a;

    lo3(mo3 mo3) {
        this.a = mo3;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        mo3 mo3 = this.a;
        mo3.g.b(mo3.e);
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.a.g.c();
    }
}
