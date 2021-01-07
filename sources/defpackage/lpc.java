package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.d;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.gqc;

/* renamed from: lpc  reason: default package */
public class lpc implements kpc {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final ImageView e;
    private final ProgressBar f;
    private final Resources g;
    private jqc h;
    private final mpc i;
    private final SpotifyIconDrawable j;
    private ipc k;
    private npc l;

    /* renamed from: lpc$a */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) lpc.this.g.getDimensionPixelSize(C0707R.dimen.episode_card_podcast_corner_radius));
        }
    }

    public lpc(hpc hpc, Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.episode_image_card, viewGroup, false);
        this.a = inflate;
        Resources resources = context.getResources();
        this.g = resources;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.title);
        this.b = textView;
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.metadata);
        this.c = textView2;
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.podcast_cover_art);
        this.d = imageView;
        ImageView imageView2 = (ImageView) inflate.findViewById(C0707R.id.episode_cover_art);
        this.e = imageView2;
        this.f = (ProgressBar) inflate.findViewById(C0707R.id.progress_bar);
        mpc mpc = new mpc(resources, C0707R.dimen.episode_card_podcast_corner_radius);
        this.i = mpc;
        mpc.a(-10395295);
        imageView.setBackground(mpc);
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setOutlineProvider(new a());
        }
        TextView textView3 = (TextView) LayoutInflater.from(context).inflate(C0707R.layout.episode_image_card_description, (ViewGroup) inflate, false);
        inflate.getLayoutParams().width = hpc.a();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = hpc.f();
        layoutParams.height = hpc.f();
        textView3.setTextSize(0, (float) hpc.b());
        c.n(textView, hpc.h());
        textView.setTextColor(androidx.core.content.a.b(inflate.getContext(), hpc.i()));
        textView2.setVisibility(hpc.d());
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
        layoutParams2.setMargins(0, hpc.j(), 0, 0);
        textView.setLayoutParams(layoutParams2);
        ipc ipc = new ipc(inflate.getContext(), textView3.getPaint(), hpc.g());
        this.k = ipc;
        this.l = new npc();
        this.k = ipc;
        imageView2.setImageDrawable(ipc);
        this.j = new SpotifyIconDrawable(imageView.getContext(), SpotifyIconV2.PODCASTS, (float) hpc.e());
        bvd b2 = dvd.b(inflate);
        b2.f(imageView2, imageView);
        b2.g(textView, textView2);
        b2.a();
    }

    public View b() {
        return this.a;
    }

    public void c(gqc.d dVar) {
        this.d.setImageDrawable(this.j);
        this.d.setScaleType(ImageView.ScaleType.CENTER);
        this.i.a(-10395295);
        this.l.b(this);
    }

    public void d(jqc jqc, gqc.c cVar) {
        gqc g2 = this.h.g();
        g2.getClass();
        if (!(g2 instanceof gqc.c)) {
            d dVar = new d(cVar.b(), (float) this.g.getDimensionPixelSize(C0707R.dimen.episode_card_podcast_corner_radius));
            this.d.setImageDrawable(dVar);
            this.d.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (cVar.c()) {
                this.l.a(dVar);
            }
        }
        gqc d2 = jqc.d();
        d2.getClass();
        if ((d2 instanceof gqc.a) || (d2 instanceof gqc.b)) {
            int f2 = jqc.f();
            boolean z = true;
            if ((jqc.i() >= 0) && s2.b(f2, -1) < 2.0d) {
                z = false;
            }
            if (z) {
                this.k.b(f2, jqc.h(), cVar.c());
            } else {
                this.k.c(f2, jqc.h(), cVar.c());
            }
        }
    }

    public void e(gqc.b bVar) {
        this.l.c();
        this.d.setImageDrawable(this.j);
        this.d.setScaleType(ImageView.ScaleType.CENTER);
        this.i.a(-10395295);
    }

    public /* synthetic */ void f(gqc.a aVar) {
        this.l.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
        if ((r0 instanceof defpackage.gqc.c) == false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(defpackage.jqc r8) {
        /*
            r7 = this;
            jqc r0 = r7.h
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            android.widget.TextView r0 = r7.b
            boolean r1 = r8.c()
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = r8.j()
            android.widget.TextView r2 = r7.b
            android.content.Context r2 = r2.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.l70.b(r2)
            java.lang.CharSequence r1 = defpackage.l70.n(r1, r2)
            goto L_0x002a
        L_0x0026:
            java.lang.String r1 = r8.j()
        L_0x002a:
            r0.setText(r1)
            ipc r0 = r7.k
            java.lang.String r1 = r8.b()
            r0.f(r1)
            android.widget.TextView r0 = r7.c
            java.lang.String r1 = r8.e()
            r0.setText(r1)
            int r0 = r8.i()
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L_0x004d
            r3 = 100
            if (r0 > r3) goto L_0x004d
            r0 = 1
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 == 0) goto L_0x005f
            android.widget.ProgressBar r0 = r7.f
            int r3 = r8.i()
            r0.setProgress(r3)
            android.widget.ProgressBar r0 = r7.f
            r0.setVisibility(r2)
            goto L_0x0066
        L_0x005f:
            android.widget.ProgressBar r0 = r7.f
            r3 = 8
            r0.setVisibility(r3)
        L_0x0066:
            gqc r0 = r8.g()
            dpc r3 = new dpc
            r3.<init>(r7)
            epc r4 = new epc
            r4.<init>(r7, r8)
            cpc r5 = new cpc
            r5.<init>(r7)
            fpc r6 = new fpc
            r6.<init>(r7)
            r0.a(r3, r4, r5, r6)
            gqc r0 = r8.d()
            r0.getClass()
            boolean r0 = r0 instanceof defpackage.gqc.c
            if (r0 == 0) goto L_0x009a
            jqc r0 = r7.h
            gqc r0 = r0.d()
            r0.getClass()
            boolean r0 = r0 instanceof defpackage.gqc.c
            if (r0 != 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r1 = 0
        L_0x009b:
            if (r1 == 0) goto L_0x00b3
            gqc r0 = r8.d()
            r0.getClass()
            gqc$c r0 = (defpackage.gqc.c) r0
            ipc r1 = r7.k
            android.graphics.Bitmap r2 = r0.b()
            boolean r0 = r0.c()
            r1.e(r2, r0)
        L_0x00b3:
            r7.h = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpc.g(jqc):void");
    }

    public void h() {
        this.k.a();
        this.e.setImageDrawable(this.k);
    }

    public void i(int i2) {
        this.i.a(i2);
    }
}
