package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.facebook.k;
import com.spotify.share.sharedata.p;
import com.spotify.share.util.g;
import io.reactivex.b;
import io.reactivex.d;
import java.io.File;
import kotlin.jvm.internal.h;

/* renamed from: m5e  reason: default package */
final class m5e implements d {
    final /* synthetic */ r5e a;
    final /* synthetic */ Activity b;
    final /* synthetic */ p c;

    /* renamed from: m5e$a */
    static final class a implements MediaScannerConnection.OnScanCompletedListener {
        final /* synthetic */ m5e a;

        a(m5e m5e) {
            this.a = m5e;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public final void onScanCompleted(String str, Uri uri) {
            g gVar = this.a.a.c;
            Activity activity = this.a.b;
            h.d(uri, "uri");
            gVar.b(activity, uri);
        }
    }

    m5e(r5e r5e, Activity activity, p pVar) {
        this.a = r5e;
        this.b = activity;
        this.c = pVar;
    }

    @Override // io.reactivex.d
    public final void subscribe(b bVar) {
        h.e(bVar, "emitter");
        this.a.c.a(this.b);
        if (Build.VERSION.SDK_INT >= 29) {
            String b2 = this.a.a.b(".png");
            this.a.a.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", b2);
            contentValues.put("mime_type", "image/png");
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            Uri c2 = this.a.b.c(this.c.h(), contentValues);
            if (c2 != null) {
                this.a.c.b(this.b, c2);
            }
            bVar.onComplete();
            return;
        }
        File a2 = this.a.a.a(this.a.a.b(".png"), true);
        h.d(a2, "shareFileProvider.create…), true\n                )");
        this.a.b.d(this.c.h(), a2);
        MediaScannerConnection.scanFile(k.d(), new String[]{a2.getAbsolutePath()}, null, new a(this));
        bVar.onComplete();
    }
}
