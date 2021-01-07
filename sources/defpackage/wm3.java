package defpackage;

import com.squareup.picasso.g;

/* renamed from: wm3  reason: default package */
class wm3 implements g {
    final /* synthetic */ vm3 a;

    wm3(vm3 vm3) {
        this.a = vm3;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        vm3 vm3 = this.a;
        vm3.y.c(vm3.v);
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.a.y.d();
    }
}
