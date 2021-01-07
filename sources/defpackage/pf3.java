package defpackage;

import android.net.Uri;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: pf3  reason: default package */
public final /* synthetic */ class pf3 implements l {
    public final /* synthetic */ Uri a;

    public /* synthetic */ pf3(Uri uri) {
        this.a = uri;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Uri.Builder buildUpon = this.a.buildUpon();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build();
    }
}
