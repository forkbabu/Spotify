package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.model.Ad;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.h0;
import com.squareup.picasso.z;

/* renamed from: gj8  reason: default package */
public class gj8 extends e<Ad> {
    private final Context C;
    private final TextView D;
    private final TextView E;
    private final ImageView F;
    private final BookmarkAdButton G;
    private final ImageButton H;
    private final Picasso I;
    private final th8 J;

    /* access modifiers changed from: private */
    /* renamed from: gj8$a */
    public static class a implements h0 {
        private final int a;

        a(int i) {
            this.a = i;
        }

        @Override // com.squareup.picasso.h0
        public String a() {
            return je.B0(je.V0("bookmark_corner_radius_"), this.a, "_px");
        }

        @Override // com.squareup.picasso.h0
        public Bitmap b(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(1.0f);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            Rect rect = new Rect(1, 1, bitmap.getWidth() - 1, bitmap.getHeight() - 1);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            RectF rectF = new RectF(rect);
            Rect rect2 = new Rect(bitmap.getWidth() / 2, 0, bitmap.getWidth(), bitmap.getHeight() / 2);
            Rect rect3 = new Rect(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth(), bitmap.getHeight());
            canvas.drawARGB(0, 0, 0, 0);
            int i = this.a;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
            canvas.drawRect(rect2, paint);
            canvas.drawRect(rect3, paint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    gj8(android.content.Context r3, com.squareup.picasso.Picasso r4, android.view.ViewGroup r5, defpackage.th8 r6) {
        /*
            r2 = this;
            r0 = 2131624883(0x7f0e03b3, float:1.8876958E38)
            r1 = 0
            android.view.View r5 = defpackage.je.G(r5, r0, r5, r1)
            r2.<init>(r5)
            r2.I = r4
            r2.C = r3
            r3 = 2131430216(0x7f0b0b48, float:1.8482127E38)
            android.view.View r3 = r5.findViewById(r3)
            r3.getClass()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r4 = 2131427484(0x7f0b009c, float:1.8476586E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.D = r4
            r4 = 2131427421(0x7f0b005d, float:1.8476458E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.E = r4
            r4 = 2131428093(0x7f0b02fd, float:1.847782E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.F = r4
            r4 = 2131427914(0x7f0b024a, float:1.8477458E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r2.H = r4
            r4 = 2131427664(0x7f0b0150, float:1.847695E38)
            android.view.View r3 = r3.findViewById(r4)
            com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton r3 = (com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton) r3
            r2.G = r3
            r2.J = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj8.<init>(android.content.Context, com.squareup.picasso.Picasso, android.view.ViewGroup, th8):void");
    }

    public /* synthetic */ void B0(Ad ad, int i, View view) {
        this.J.d(ad, i);
    }

    public /* synthetic */ void C0(Ad ad, String str, int i, View view) {
        this.J.e(ad, str, i);
    }

    public /* synthetic */ void E0(Ad ad, int i, View view) {
        this.J.f(ad, i);
    }

    /* renamed from: u0 */
    public void h0(Ad ad, int i) {
        String str;
        String str2;
        if (!ad.getImages().isEmpty()) {
            String url = ad.getImages().get(0).getUrl();
            if (url == null) {
                url = "";
            }
            z m = this.I.m(url);
            m.x(new a((int) this.C.getResources().getDimension(C0707R.dimen.bookmark_corner_radius)));
            m.m(this.F);
            this.F.setOnClickListener(new aj8(this, ad, url, i));
        }
        TextView textView = this.D;
        if (TextUtils.isEmpty(ad.advertiser())) {
            str = this.C.getString(C0707R.string.advertiser_default_name);
        } else {
            str = ad.advertiser();
        }
        textView.setText(str);
        this.D.setOnClickListener(new zi8(this, ad, i));
        TextView textView2 = this.E;
        if (TextUtils.isEmpty(ad.getButtonText())) {
            str2 = this.C.getString(C0707R.string.advertiser_default_action);
        } else {
            str2 = ad.getButtonText();
        }
        textView2.setText(str2);
        this.E.setOnClickListener(new cj8(this, ad, i));
        if (l0.z(ad.clickUrl()).q() == LinkType.DUMMY) {
            this.H.setVisibility(0);
            this.H.setOnClickListener(new bj8(this, ad, i));
        } else {
            this.H.setVisibility(4);
        }
        this.G.setActivated(true);
        this.G.setOnClickListener(new dj8(this, ad));
    }

    public /* synthetic */ void v0(Ad ad, int i, View view) {
        this.J.b(ad, i);
    }

    public /* synthetic */ void w0(Ad ad, View view) {
        this.J.g(ad, this.G);
    }
}
