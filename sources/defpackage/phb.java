package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.s;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import defpackage.ohb;
import defpackage.pzc;
import kotlin.jvm.internal.h;

/* renamed from: phb  reason: default package */
public final class phb implements ohb.a {
    private final a a = new a(this);
    private final Context b;
    private final Picasso c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final jzc j;

    /* renamed from: phb$a */
    public static final class a implements f0 {
        final /* synthetic */ phb a;

        /* renamed from: phb$a$a  reason: collision with other inner class name */
        public static final class C0668a implements rzc {
            final /* synthetic */ a b;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C0668a(a aVar) {
                this.b = aVar;
            }

            @Override // defpackage.rzc
            public void a() {
            }

            @Override // defpackage.rzc
            public void b(Throwable th) {
                h.e(th, "throwable");
                Toast.makeText(this.b.a.b, (int) C0707R.string.share_failed, 0).show();
            }

            @Override // defpackage.rzc
            public void c() {
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(phb phb) {
            this.a = phb;
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            h.e(bitmap, "bitmap");
            r build = r.h(this.a.e).build();
            s j = s.j(build, this.a.f);
            q k = q.k(build, bitmap, Optional.absent());
            pzc.a c = pzc.c(this.a.g, this.a.h, this.a.i, build);
            c.c(j);
            c.a(k);
            pzc build2 = c.build();
            h.d(build2, "ShareMenuData.builder(\n …\n                .build()");
            this.a.j.a(build2, new C0668a(this), this.a.b.getString(C0707R.string.integration_id_marketing_format, this.a.e));
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    public phb(Context context, Picasso picasso, String str, String str2, String str3, String str4, String str5, String str6, jzc jzc) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        h.e(str, "shareImageUri");
        h.e(str2, "entityUri");
        h.e(str3, "shareMessageText");
        h.e(str4, "dialogImageUri");
        h.e(str5, "dialogTitle");
        h.e(str6, "dialogSubtitle");
        h.e(jzc, "shareFlow");
        this.b = context;
        this.c = picasso;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = jzc;
    }

    @Override // defpackage.ohb.a
    public void a() {
        this.c.m(this.d).o(this.a);
    }
}
