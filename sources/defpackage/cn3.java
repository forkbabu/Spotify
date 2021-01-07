package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.features.ads.audioplus.overlay.LeaveBehindContainerFragment;
import com.spotify.music.features.ads.audioplus.overlay.c;
import com.spotify.music.features.ads.audioplus.overlay.e;
import com.spotify.music.features.ads.audioplus.overlay.f;
import com.spotify.music.features.ads.audioplus.overlay.g;
import com.spotify.music.features.ads.audioplus.overlay.i;
import com.spotify.music.features.ads.ui.OverlayBackgroundView;
import com.spotify.music.features.ads.ui.b;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.h0;
import com.squareup.picasso.z;

/* renamed from: cn3  reason: default package */
public class cn3 implements i, b.AbstractC0214b {
    private View a;
    private View b;
    private View c;
    private View f;
    private OverlayBackgroundView n;
    private ImageView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private BookmarkAdButton s;
    private mu3 t;
    private f u;
    private e v;
    Picasso w;
    c x;
    nu3 y;
    g z;

    /* access modifiers changed from: package-private */
    /* renamed from: cn3$a */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ com.spotify.music.features.ads.ui.a a;

        a(cn3 cn3, com.spotify.music.features.ads.ui.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a();
        }
    }

    /* renamed from: cn3$b */
    private static class b implements h0 {
        public b(int i) {
        }

        @Override // com.squareup.picasso.h0
        public String a() {
            return "podcast_promo_corner_radius_16_px";
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
            canvas.drawARGB(0, 0, 0, 0);
            float f = (float) 16;
            canvas.drawRoundRect(rectF, f, f, paint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
    }

    private void h(com.spotify.music.features.ads.ui.a aVar) {
        this.u.d(this.c, this.f, this.a, this.b, new a(this, aVar));
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void M0(int[] iArr) {
        int left = this.o.getLeft();
        int top = this.o.getTop();
        int width = this.o.getWidth();
        int height = this.o.getHeight();
        if (iArr[0] >= left && iArr[0] <= left + width && iArr[1] >= top && iArr[1] <= top + height) {
            h(new tm3(this));
        }
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.i
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.leave_behind_podcast_promo, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.content_promo_view);
        this.c = inflate.findViewById(C0707R.id.podcast_promo_background);
        this.a = inflate.findViewById(C0707R.id.content_promo_header);
        this.b = inflate.findViewById(C0707R.id.content_promo_footer);
        this.f = inflate.findViewById(C0707R.id.content_promo_body);
        this.o = (ImageView) inflate.findViewById(C0707R.id.content_promo_image);
        this.p = (TextView) inflate.findViewById(C0707R.id.tv_content_promo_name);
        this.q = (TextView) inflate.findViewById(C0707R.id.tv_content_promo_entity);
        this.r = (TextView) inflate.findViewById(C0707R.id.tv_content_promo_details);
        ((TextView) inflate.findViewById(C0707R.id.tv_content_promo_details_see_more)).setOnClickListener(new rm3(this));
        this.s = (BookmarkAdButton) inflate.findViewById(C0707R.id.btn_ad_bookmark);
        Button button = (Button) inflate.findViewById(C0707R.id.btn_content_promo_info);
        pm3 pm3 = new pm3(this);
        button.setOnClickListener(new sm3(this, pm3));
        button.setOnClickListener(new om3(this, pm3));
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) inflate.findViewById(C0707R.id.content_promo_background_view);
        this.n = overlayBackgroundView;
        overlayBackgroundView.setColor(androidx.core.content.a.b(layoutInflater.getContext(), C0707R.color.leave_behind_ad_background_default_color));
        this.n.setRadius((float) nud.g(8.0f, layoutInflater.getContext().getResources()));
        this.n.setOnTouchListener(new com.spotify.music.features.ads.ui.b(findViewById, this));
        this.b.setOnClickListener(new um3(this, new qm3(this)));
        this.u = new f();
        return inflate;
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.i
    public void b(e eVar, d dVar) {
        this.v = eVar;
        this.t = this.y.a(dVar.f());
        this.z.d(this.s);
        ((lu3) this.t).c(this.n);
        z m = this.w.m(dVar.f());
        m.x(new b(16));
        m.n(this.o, new dn3(this));
        String k = dVar.k();
        String j = dVar.j();
        String i = dVar.i();
        this.p.setText(k);
        this.q.setText(j);
        this.r.setText(i);
        this.u.c(this.c, this.f, this.a, this.b);
    }

    public /* synthetic */ void d(com.spotify.music.features.ads.ui.a aVar, View view) {
        h(aVar);
    }

    public /* synthetic */ void e(com.spotify.music.features.ads.ui.a aVar, View view) {
        h(aVar);
    }

    public void f() {
        c cVar = this.x;
        e eVar = this.v;
        cVar.getClass();
        ((LeaveBehindContainerFragment) eVar).K4();
    }

    public /* synthetic */ void g(com.spotify.music.features.ads.ui.a aVar, View view) {
        h(aVar);
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void j1() {
        c cVar = this.x;
        e eVar = this.v;
        cVar.getClass();
        ((LeaveBehindContainerFragment) eVar).K4();
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void m() {
        je.g(this.a, 1.0f, 100);
        je.g(this.b, 1.0f, 100);
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void s() {
        je.g(this.a, 0.0f, 100);
        je.g(this.b, 0.0f, 100);
    }
}
