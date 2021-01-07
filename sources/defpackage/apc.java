package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;

/* renamed from: apc  reason: default package */
public class apc implements g90 {
    private final View a;
    private final ImageView b;
    private final TextView c;
    private final TextView f;
    private final mpc n;
    private final float o;
    private final ValueAnimator p;
    private final f0 q = new a();

    /* renamed from: apc$a */
    class a implements f0 {
        a() {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            apc.this.b.setImageDrawable(apc.this.n);
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            apc.this.b.setImageDrawable(new d(bitmap, apc.this.o));
            apc.this.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (loadedFrom != Picasso.LoadedFrom.MEMORY) {
                apc.d(apc.this);
            }
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
            apc.this.b.setImageDrawable(apc.this.n);
        }
    }

    private apc(ViewGroup viewGroup, zoc zoc) {
        View G = je.G(viewGroup, C0707R.layout.episode_discovery_card, viewGroup, false);
        this.a = G;
        Resources resources = G.getResources();
        G.getLayoutParams().width = zoc.a();
        TextView textView = (TextView) G.findViewById(C0707R.id.discovery_card_title);
        this.c = textView;
        TextView textView2 = (TextView) G.findViewById(C0707R.id.discovery_card_subtitle);
        this.f = textView2;
        this.o = (float) resources.getDimensionPixelSize(C0707R.dimen.discovery_card_corner_radius);
        mpc mpc = new mpc(resources, C0707R.dimen.discovery_card_corner_radius);
        this.n = mpc;
        mpc.a(androidx.core.content.a.b(G.getContext(), C0707R.color.discovery_card_background_placeholder));
        ImageView imageView = (ImageView) G.findViewById(C0707R.id.discovery_card_bg_image);
        this.b = imageView;
        imageView.setBackground(mpc);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = ofFloat;
        ofFloat.setDuration(400L);
        ofFloat.addUpdateListener(new xoc(this));
        bvd b2 = dvd.b(G);
        b2.f(imageView);
        b2.g(textView, textView2);
        b2.a();
    }

    static void d(apc apc) {
        if (apc.p.isRunning()) {
            apc.p.cancel();
        }
        apc.b.setImageAlpha(0);
        apc.p.start();
    }

    public static apc w(ViewGroup viewGroup, zoc zoc) {
        return new apc(viewGroup, zoc);
    }

    public f0 E() {
        return this.q;
    }

    public /* synthetic */ void J(ValueAnimator valueAnimator) {
        this.b.setImageAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
    }

    public void W(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.c.setText(str.trim());
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f.setText(str2.trim());
            this.f.setVisibility(0);
            return;
        }
        this.f.setVisibility(8);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
