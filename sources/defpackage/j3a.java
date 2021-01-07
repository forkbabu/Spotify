package defpackage;

import android.content.Intent;
import io.reactivex.functions.g;

/* renamed from: j3a  reason: default package */
public final /* synthetic */ class j3a implements g {
    public final /* synthetic */ s3a a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ j3a(s3a s3a, Intent intent) {
        this.a = s3a;
        this.b = intent;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, (Boolean) obj);
    }
}
