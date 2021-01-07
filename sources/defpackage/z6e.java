package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import com.spotify.core.http.HttpConnection;
import com.spotify.music.C0707R;
import com.spotify.share.sharedata.t;
import com.spotify.share.util.q;
import defpackage.b4e;
import io.reactivex.d0;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: z6e  reason: default package */
public class z6e implements i6e {
    private final Context a;
    private final y b;
    private final q c;
    private final a d;
    private final x3e e;

    /* renamed from: z6e$a */
    public static class a {
    }

    public z6e(Context context, y yVar, q qVar, a aVar, x3e x3e) {
        this.a = context;
        this.b = yVar;
        this.c = qVar;
        this.d = aVar;
        this.e = x3e;
    }

    @Override // defpackage.i6e
    public /* synthetic */ Exception a(Context context, o8e o8e) {
        return h6e.a(this, context, o8e);
    }

    @Override // defpackage.i6e
    public boolean b(t tVar) {
        return true;
    }

    @Override // defpackage.i6e
    public z<String> c(Activity activity, o8e o8e, t tVar, z7e z7e, d8e d8e, long j) {
        b4e.a a2 = b4e.a(tVar.g());
        a2.c(tVar.a());
        a2.d(r3e.a(tVar.c()));
        a2.a(tVar.f());
        return this.e.a(a2.build()).B(this.b).s(new f5e(this, tVar, z7e, j, d8e, o8e, activity));
    }

    public d0 d(t tVar, z7e z7e, long j, d8e d8e, o8e o8e, Activity activity, w3e w3e) {
        String a2 = this.c.a(tVar, w3e.d());
        if (Build.VERSION.SDK_INT >= 19) {
            a aVar = this.d;
            Context context = this.a;
            aVar.getClass();
            context.getClass();
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage != null) {
                z7e.i(w3e.b(), j);
                d8e.a(tVar, o8e.a(), w3e.b(), null);
                a2.getClass();
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType(HttpConnection.kDefaultContentType);
                intent.putExtra("android.intent.extra.TEXT", a2);
                intent.setPackage(defaultSmsPackage);
                activity.startActivity(intent);
                return z.z(w3e.b());
            }
        }
        z7e.h(w3e.b(), j);
        d8e.a(tVar, o8e.a(), w3e.b(), null);
        a2.getClass();
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        intent2.putExtra("sms_body", a2);
        activity.startActivity(Intent.createChooser(intent2, this.a.getString(C0707R.string.share_chooser_sms)));
        return z.z(w3e.b());
    }
}
