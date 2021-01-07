package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.spotify.core.http.HttpConnection;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.spotify.share.sharedata.t;
import com.spotify.share.util.ShareResultReceiver;
import com.spotify.share.util.m;
import com.spotify.share.util.q;
import defpackage.b4e;
import io.reactivex.d0;
import io.reactivex.y;
import io.reactivex.z;
import java.util.ArrayList;

/* renamed from: c7e  reason: default package */
public class c7e implements i6e {
    private final Context a;
    private final q b;
    private final y c;
    private final x3e d;
    private final m e;

    public c7e(Context context, q qVar, y yVar, x3e x3e, m mVar) {
        this.a = context;
        this.b = qVar;
        this.d = x3e;
        this.c = yVar;
        this.e = mVar;
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
        return this.d.a(a2.build()).B(this.c).s(new g5e(this, z7e, j, tVar, d8e, o8e, activity));
    }

    public d0 d(z7e z7e, long j, t tVar, d8e d8e, o8e o8e, Activity activity, w3e w3e) {
        z7e.a(w3e.b(), j);
        String a2 = this.b.a(tVar, w3e.d());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", a2);
        intent.setType(HttpConnection.kDefaultContentType);
        if (Build.VERSION.SDK_INT >= 22) {
            String b2 = w3e.b();
            int a3 = o8e.a();
            Intent intent2 = new Intent(this.a, ShareResultReceiver.class);
            intent2.putExtra("session_id", z7e.f());
            intent2.putExtra(ContextTrack.Metadata.KEY_ENTITY_URI, tVar.g());
            intent2.putExtra("context_uri", tVar.a());
            intent2.putExtra("source_page_uri_legacy", z7e.g());
            intent2.putExtra("destination_index", j);
            intent2.putStringArrayListExtra("test_groups", new ArrayList<>());
            intent2.putExtra("share_id", b2);
            intent2.putExtra("source_page_id", d8e.d());
            intent2.putExtra("source_page_uri", d8e.e());
            intent2.putExtra("destination_id", a3);
            intent2.putExtra("integration_id", d8e.c());
            intent2.putExtra("destination_capability", this.e.b(tVar));
            activity.startActivity(Intent.createChooser(intent, this.a.getString(C0707R.string.share_chooser_using), PendingIntent.getBroadcast(this.a, 0, intent2, 134217728).getIntentSender()));
        } else {
            activity.startActivity(Intent.createChooser(intent, this.a.getString(C0707R.string.share_chooser_using)));
            d8e.a(tVar, o8e.a(), w3e.b(), null);
        }
        return z.z(w3e.b());
    }
}
