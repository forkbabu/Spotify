package defpackage;

import android.net.Uri;
import com.google.common.base.Function;
import com.spotify.share.sharedata.p;
import java.io.File;

/* renamed from: c5e  reason: default package */
public final /* synthetic */ class c5e implements Function {
    public final /* synthetic */ a6e a;
    public final /* synthetic */ p b;
    public final /* synthetic */ w3e c;
    public final /* synthetic */ File f;

    public /* synthetic */ c5e(a6e a6e, p pVar, w3e w3e, File file) {
        this.a = a6e;
        this.b = pVar;
        this.c = w3e;
        this.f = file;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, this.f, (Uri) obj);
    }
}
