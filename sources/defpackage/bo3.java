package defpackage;

import com.squareup.picasso.g;

/* access modifiers changed from: package-private */
/* renamed from: bo3  reason: default package */
public class bo3 implements g {
    final /* synthetic */ String a;
    final /* synthetic */ co3 b;

    bo3(co3 co3, String str) {
        this.b = co3;
        this.a = str;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        this.b.H.c(this.a);
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.b.H.d(this.a);
    }
}
