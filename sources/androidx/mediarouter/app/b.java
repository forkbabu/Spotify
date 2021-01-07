package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.OverlayListView;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;
import defpackage.n6;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class b extends androidx.appcompat.app.f {
    static final boolean x0 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    static final int y0 = ((int) TimeUnit.SECONDS.toMillis(30));
    FrameLayout A;
    private FrameLayout B;
    private ImageView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private boolean G = true;
    private LinearLayout H;
    private RelativeLayout I;
    private LinearLayout J;
    private View K;
    OverlayListView L;
    o M;
    private List<n6.f> N;
    Set<n6.f> O;
    private Set<n6.f> P;
    Set<n6.f> Q;
    SeekBar R;
    n S;
    n6.f T;
    private int U;
    private int V;
    private int W;
    private final int X;
    Map<n6.f, SeekBar> Y;
    MediaControllerCompat Z;
    l a0 = new l();
    PlaybackStateCompat b0;
    MediaDescriptionCompat c0;
    k d0;
    Bitmap e0;
    final n6 f;
    Uri f0;
    boolean g0;
    Bitmap h0;
    int i0;
    boolean j0;
    boolean k0;
    boolean l0;
    boolean m0;
    private final m n;
    boolean n0;
    final n6.f o;
    int o0;
    Context p = getContext();
    private int p0;
    private boolean q;
    private int q0;
    private boolean r;
    private Interpolator r0;
    private int s;
    private Interpolator s0;
    private Button t;
    private Interpolator t0;
    private Button u;
    private Interpolator u0;
    private ImageButton v;
    final AccessibilityManager v0;
    private ImageButton w;
    Runnable w0 = new RunnableC0039b();
    private MediaRouteExpandCollapseButton x;
    private FrameLayout y;
    private LinearLayout z;

    class a implements OverlayListView.a.AbstractC0037a {
        final /* synthetic */ n6.f a;

        a(n6.f fVar) {
            this.a = fVar;
        }
    }

    /* renamed from: androidx.mediarouter.app.b$b  reason: collision with other inner class name */
    class RunnableC0039b implements Runnable {
        RunnableC0039b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            bVar.i(true);
            bVar.L.requestLayout();
            bVar.L.getViewTreeObserver().addOnGlobalLayoutListener(new c(bVar));
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.dismiss();
        }
    }

    class d implements View.OnClickListener {
        d(b bVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PendingIntent c;
            MediaControllerCompat mediaControllerCompat = b.this.Z;
            if (mediaControllerCompat != null && (c = mediaControllerCompat.c()) != null) {
                try {
                    c.send();
                    b.this.dismiss();
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("MediaRouteCtrlDialog", c + " was not sent, it had been canceled.");
                }
            }
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            boolean z = !bVar.l0;
            bVar.l0 = z;
            if (z) {
                bVar.L.setVisibility(0);
            }
            b.this.s();
            b.this.z(true);
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ boolean a;

        g(boolean z) {
            this.a = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            b.this.A.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            b bVar = b.this;
            if (bVar.m0) {
                bVar.n0 = true;
            } else {
                bVar.A(this.a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class h extends Animation {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ View c;

        h(b bVar, int i, int i2, View view) {
            this.a = i;
            this.b = i2;
            this.c = view;
        }

        /* access modifiers changed from: protected */
        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            int i = this.a;
            b.t(this.c, i - ((int) (((float) (i - this.b)) * f)));
        }
    }

    class i implements Animation.AnimationListener {
        i() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            b.this.L.b();
            b bVar = b.this;
            bVar.L.postDelayed(bVar.w0, (long) bVar.o0);
        }
    }

    private final class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int id = view.getId();
            int i = 1;
            if (id == 16908313 || id == 16908314) {
                if (b.this.o.y()) {
                    n6 n6Var = b.this.f;
                    if (id == 16908313) {
                        i = 2;
                    }
                    n6Var.o(i);
                }
                b.this.dismiss();
            } else if (id == C0707R.id.mr_control_playback_ctrl) {
                b bVar = b.this;
                if (bVar.Z != null && (playbackStateCompat = bVar.b0) != null) {
                    int i2 = 0;
                    if (playbackStateCompat.f() != 3) {
                        i = 0;
                    }
                    if (i != 0 && b.this.o()) {
                        b.this.Z.d().a();
                        i2 = C0707R.string.mr_controller_pause;
                    } else if (i != 0 && b.this.q()) {
                        b.this.Z.d().c();
                        i2 = C0707R.string.mr_controller_stop;
                    } else if (i == 0 && b.this.p()) {
                        b.this.Z.d().b();
                        i2 = C0707R.string.mr_controller_play;
                    }
                    AccessibilityManager accessibilityManager = b.this.v0;
                    if (accessibilityManager != null && accessibilityManager.isEnabled() && i2 != 0) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                        obtain.setPackageName(b.this.p.getPackageName());
                        obtain.setClassName(j.class.getName());
                        obtain.getText().add(b.this.p.getString(i2));
                        b.this.v0.sendAccessibilityEvent(obtain);
                    }
                }
            } else if (id == C0707R.id.mr_close) {
                b.this.dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    public class k extends AsyncTask<Void, Void, Bitmap> {
        private final Bitmap a;
        private final Uri b;
        private int c;
        private long d;

        k() {
            MediaDescriptionCompat mediaDescriptionCompat = b.this.c0;
            Uri uri = null;
            Bitmap b2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
            this.a = b.n(b2) ? null : b2;
            MediaDescriptionCompat mediaDescriptionCompat2 = b.this.c0;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c() : uri;
        }

        private InputStream c(Uri uri) {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = b.this.p.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                int i = b.y0;
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }

        public Bitmap a() {
            return this.a;
        }

        public Uri b() {
            return this.b;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4 A[SYNTHETIC, Splitter:B:39:0x00a4] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00aa A[SYNTHETIC, Splitter:B:42:0x00aa] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00c6 A[ADDED_TO_REGION] */
        @Override // android.os.AsyncTask
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.Void[] r9) {
            /*
            // Method dump skipped, instructions count: 251
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.b.k.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            b bVar = b.this;
            bVar.d0 = null;
            if (!e2.g(bVar.e0, this.a) || !e2.g(b.this.f0, this.b)) {
                b bVar2 = b.this;
                bVar2.e0 = this.a;
                bVar2.h0 = bitmap2;
                bVar2.f0 = this.b;
                bVar2.i0 = this.c;
                boolean z = true;
                bVar2.g0 = true;
                long uptimeMillis = SystemClock.uptimeMillis() - this.d;
                b bVar3 = b.this;
                if (uptimeMillis <= 120) {
                    z = false;
                }
                bVar3.w(z);
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.d = SystemClock.uptimeMillis();
            b bVar = b.this;
            bVar.g0 = false;
            bVar.h0 = null;
            bVar.i0 = 0;
        }
    }

    /* access modifiers changed from: private */
    public final class l extends MediaControllerCompat.a {
        l() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void a(MediaMetadataCompat mediaMetadataCompat) {
            b.this.c0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.e();
            b.this.x();
            b.this.w(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void b(PlaybackStateCompat playbackStateCompat) {
            b bVar = b.this;
            bVar.b0 = playbackStateCompat;
            bVar.w(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void c() {
            b bVar = b.this;
            MediaControllerCompat mediaControllerCompat = bVar.Z;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.f(bVar.a0);
                b.this.Z = null;
            }
        }
    }

    private final class m extends n6.a {
        m() {
        }

        @Override // defpackage.n6.a
        public void e(n6 n6Var, n6.f fVar) {
            b.this.w(true);
        }

        @Override // defpackage.n6.a
        public void h(n6 n6Var, n6.f fVar) {
            b.this.w(false);
        }

        @Override // defpackage.n6.a
        public void j(n6 n6Var, n6.f fVar) {
            SeekBar seekBar = b.this.Y.get(fVar);
            int q = fVar.q();
            boolean z = b.x0;
            if (seekBar != null && b.this.T != fVar) {
                seekBar.setProgress(q);
            }
        }
    }

    private class n implements SeekBar.OnSeekBarChangeListener {
        private final Runnable a = new a();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                if (bVar.T != null) {
                    bVar.T = null;
                    if (bVar.j0) {
                        bVar.w(bVar.k0);
                    }
                }
            }
        }

        n() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                boolean z2 = b.x0;
                ((n6.f) seekBar.getTag()).B(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            b bVar = b.this;
            if (bVar.T != null) {
                bVar.R.removeCallbacks(this.a);
            }
            b.this.T = (n6.f) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            b.this.R.postDelayed(this.a, 500);
        }
    }

    /* access modifiers changed from: private */
    public class o extends ArrayAdapter<n6.f> {
        final float a;

        public o(Context context, List<n6.f> list) {
            super(context, 0, list);
            this.a = m.h(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2;
            int i3 = 0;
            if (view == null) {
                view = je.G(viewGroup, C0707R.layout.mr_controller_volume_item, viewGroup, false);
            } else {
                b.this.C(view);
            }
            n6.f fVar = (n6.f) getItem(i);
            if (fVar != null) {
                boolean v = fVar.v();
                TextView textView = (TextView) view.findViewById(C0707R.id.mr_name);
                textView.setEnabled(v);
                textView.setText(fVar.k());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(C0707R.id.mr_volume_slider);
                m.w(viewGroup.getContext(), mediaRouteVolumeSlider, b.this.L);
                mediaRouteVolumeSlider.setTag(fVar);
                b.this.Y.put(fVar, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.b(!v);
                mediaRouteVolumeSlider.setEnabled(v);
                if (v) {
                    if (b.this.r(fVar)) {
                        mediaRouteVolumeSlider.setMax(fVar.s());
                        mediaRouteVolumeSlider.setProgress(fVar.q());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(b.this.S);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ImageView imageView = (ImageView) view.findViewById(C0707R.id.mr_volume_item_icon);
                if (v) {
                    i2 = BitmapRenderer.ALPHA_VISIBLE;
                } else {
                    i2 = (int) (this.a * 255.0f);
                }
                imageView.setAlpha(i2);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C0707R.id.volume_item_container);
                if (b.this.Q.contains(fVar)) {
                    i3 = 4;
                }
                linearLayout.setVisibility(i3);
                Set<n6.f> set = b.this.O;
                if (set != null && set.contains(fVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return false;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 1
            android.content.Context r2 = androidx.mediarouter.app.m.b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.m.c(r2)
            r1.<init>(r2, r3)
            r1.G = r0
            androidx.mediarouter.app.b$b r3 = new androidx.mediarouter.app.b$b
            r3.<init>()
            r1.w0 = r3
            android.content.Context r3 = r1.getContext()
            r1.p = r3
            androidx.mediarouter.app.b$l r3 = new androidx.mediarouter.app.b$l
            r3.<init>()
            r1.a0 = r3
            android.content.Context r3 = r1.p
            n6 r3 = defpackage.n6.f(r3)
            r1.f = r3
            androidx.mediarouter.app.b$m r0 = new androidx.mediarouter.app.b$m
            r0.<init>()
            r1.n = r0
            n6$f r0 = r3.i()
            r1.o = r0
            android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.g()
            r1.u(r3)
            android.content.Context r3 = r1.p
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131166205(0x7f0703fd, float:1.7946649E38)
            int r3 = r3.getDimensionPixelSize(r0)
            r1.X = r3
            android.content.Context r3 = r1.p
            java.lang.String r0 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.v0 = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r3 < r0) goto L_0x0071
            r3 = 2131558412(0x7f0d000c, float:1.874214E38)
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.s0 = r3
            r3 = 2131558411(0x7f0d000b, float:1.8742137E38)
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.t0 = r2
        L_0x0071:
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.u0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.b.<init>(android.content.Context, int):void");
    }

    private void B(boolean z2) {
        int i2 = 0;
        this.K.setVisibility((this.J.getVisibility() != 0 || !z2) ? 8 : 0);
        LinearLayout linearLayout = this.H;
        if (this.J.getVisibility() == 8 && !z2) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    private void g(View view, int i2) {
        h hVar = new h(this, view.getLayoutParams().height, i2, view);
        hVar.setDuration((long) this.o0);
        if (Build.VERSION.SDK_INT >= 21) {
            hVar.setInterpolator(this.r0);
        }
        view.startAnimation(hVar);
    }

    private boolean h() {
        return (this.c0 == null && this.b0 == null) ? false : true;
    }

    private static int l(View view) {
        return view.getLayoutParams().height;
    }

    private int m(boolean z2) {
        if (!z2 && this.J.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.H.getPaddingBottom() + this.H.getPaddingTop() + 0;
        if (z2) {
            paddingBottom += this.I.getMeasuredHeight();
        }
        int measuredHeight = this.J.getVisibility() == 0 ? this.J.getMeasuredHeight() + paddingBottom : paddingBottom;
        return (!z2 || this.J.getVisibility() != 0) ? measuredHeight : measuredHeight + this.K.getMeasuredHeight();
    }

    static boolean n(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    static void t(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    private void u(MediaSessionCompat.Token token) {
        MediaMetadataCompat mediaMetadataCompat;
        MediaDescriptionCompat mediaDescriptionCompat;
        MediaControllerCompat mediaControllerCompat = this.Z;
        PlaybackStateCompat playbackStateCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.f(this.a0);
            this.Z = null;
        }
        if (token != null && this.r) {
            try {
                this.Z = new MediaControllerCompat(this.p, token);
            } catch (RemoteException e2) {
                Log.e("MediaRouteCtrlDialog", "Error creating media controller in setMediaSession.", e2);
            }
            MediaControllerCompat mediaControllerCompat2 = this.Z;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.e(this.a0);
            }
            MediaControllerCompat mediaControllerCompat3 = this.Z;
            if (mediaControllerCompat3 == null) {
                mediaMetadataCompat = null;
            } else {
                mediaMetadataCompat = mediaControllerCompat3.a();
            }
            if (mediaMetadataCompat == null) {
                mediaDescriptionCompat = null;
            } else {
                mediaDescriptionCompat = mediaMetadataCompat.e();
            }
            this.c0 = mediaDescriptionCompat;
            MediaControllerCompat mediaControllerCompat4 = this.Z;
            if (mediaControllerCompat4 != null) {
                playbackStateCompat = mediaControllerCompat4.b();
            }
            this.b0 = playbackStateCompat;
            x();
            w(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void A(boolean z2) {
        int i2;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        int l2 = l(this.H);
        t(this.H, -1);
        B(h());
        View decorView = getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        t(this.H, l2);
        if (!(this.C.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) this.C.getDrawable()).getBitmap()) == null) {
            i2 = 0;
        } else {
            i2 = k(bitmap.getWidth(), bitmap.getHeight());
            this.C.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int m2 = m(h());
        int size = this.N.size();
        int size2 = this.o.w() ? this.o.j().size() * this.V : 0;
        if (size > 0) {
            size2 += this.X;
        }
        int min = Math.min(size2, this.W);
        if (!this.l0) {
            min = 0;
        }
        int max = Math.max(i2, min) + m2;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (this.z.getMeasuredHeight() - this.A.getMeasuredHeight());
        if (i2 <= 0 || max > height) {
            if (this.H.getMeasuredHeight() + l(this.L) >= this.A.getMeasuredHeight()) {
                this.C.setVisibility(8);
            }
            max = min + m2;
            i2 = 0;
        } else {
            this.C.setVisibility(0);
            t(this.C, i2);
        }
        if (!h() || max > height) {
            this.I.setVisibility(8);
        } else {
            this.I.setVisibility(0);
        }
        B(this.I.getVisibility() == 0);
        int m3 = m(this.I.getVisibility() == 0);
        int max2 = Math.max(i2, min) + m3;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        this.H.clearAnimation();
        this.L.clearAnimation();
        this.A.clearAnimation();
        if (z2) {
            g(this.H, m3);
            g(this.L, min);
            g(this.A, height);
        } else {
            t(this.H, m3);
            t(this.L, min);
            t(this.A, height);
        }
        t(this.y, rect.height());
        List<n6.f> j2 = this.o.j();
        if (j2.isEmpty()) {
            this.N.clear();
            this.M.notifyDataSetChanged();
        } else if (new HashSet(this.N).equals(new HashSet(j2))) {
            this.M.notifyDataSetChanged();
        } else {
            if (z2) {
                OverlayListView overlayListView = this.L;
                o oVar = this.M;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                    Object item = oVar.getItem(firstVisiblePosition + i3);
                    View childAt = overlayListView.getChildAt(i3);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z2) {
                Context context = this.p;
                OverlayListView overlayListView2 = this.L;
                o oVar2 = this.M;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                    Object item2 = oVar2.getItem(firstVisiblePosition2 + i4);
                    View childAt2 = overlayListView2.getChildAt(i4);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            List<n6.f> list = this.N;
            HashSet hashSet = new HashSet(j2);
            hashSet.removeAll(list);
            this.O = hashSet;
            HashSet hashSet2 = new HashSet(this.N);
            hashSet2.removeAll(j2);
            this.P = hashSet2;
            this.N.addAll(0, this.O);
            this.N.removeAll(this.P);
            this.M.notifyDataSetChanged();
            if (z2 && this.l0) {
                if (this.P.size() + this.O.size() > 0) {
                    this.L.setEnabled(false);
                    this.L.requestLayout();
                    this.m0 = true;
                    this.L.getViewTreeObserver().addOnGlobalLayoutListener(new e(this, hashMap, hashMap2));
                    return;
                }
            }
            this.O = null;
            this.P = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void C(View view) {
        t((LinearLayout) view.findViewById(C0707R.id.volume_item_container), this.V);
        View findViewById = view.findViewById(C0707R.id.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int i2 = this.U;
        layoutParams.width = i2;
        layoutParams.height = i2;
        findViewById.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void f(Map<n6.f, Rect> map, Map<n6.f, BitmapDrawable> map2) {
        OverlayListView.a aVar;
        Set<n6.f> set = this.O;
        if (!(set == null || this.P == null)) {
            int size = set.size() - this.P.size();
            i iVar = new i();
            int firstVisiblePosition = this.L.getFirstVisiblePosition();
            boolean z2 = false;
            for (int i2 = 0; i2 < this.L.getChildCount(); i2++) {
                View childAt = this.L.getChildAt(i2);
                n6.f fVar = (n6.f) this.M.getItem(firstVisiblePosition + i2);
                Rect rect = map.get(fVar);
                int top = childAt.getTop();
                int i3 = rect != null ? rect.top : (this.V * size) + top;
                AnimationSet animationSet = new AnimationSet(true);
                Set<n6.f> set2 = this.O;
                if (set2 != null && set2.contains(fVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration((long) this.p0);
                    animationSet.addAnimation(alphaAnimation);
                    i3 = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (i3 - top), 0.0f);
                translateAnimation.setDuration((long) this.o0);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(this.r0);
                if (!z2) {
                    animationSet.setAnimationListener(iVar);
                    z2 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                map.remove(fVar);
                map2.remove(fVar);
            }
            for (Map.Entry<n6.f, BitmapDrawable> entry : map2.entrySet()) {
                n6.f key = entry.getKey();
                BitmapDrawable value = entry.getValue();
                Rect rect2 = map.get(key);
                if (this.P.contains(key)) {
                    aVar = new OverlayListView.a(value, rect2);
                    aVar.c(1.0f, 0.0f);
                    aVar.e((long) this.q0);
                    aVar.f(this.r0);
                } else {
                    OverlayListView.a aVar2 = new OverlayListView.a(value, rect2);
                    aVar2.g(this.V * size);
                    aVar2.e((long) this.o0);
                    aVar2.f(this.r0);
                    aVar2.d(new a(key));
                    this.Q.add(key);
                    aVar = aVar2;
                }
                this.L.a(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z2) {
        Set<n6.f> set;
        int firstVisiblePosition = this.L.getFirstVisiblePosition();
        for (int i2 = 0; i2 < this.L.getChildCount(); i2++) {
            View childAt = this.L.getChildAt(i2);
            n6.f fVar = (n6.f) this.M.getItem(firstVisiblePosition + i2);
            if (!z2 || (set = this.O) == null || !set.contains(fVar)) {
                ((LinearLayout) childAt.findViewById(C0707R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.L.c();
        if (!z2) {
            j(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void j(boolean z2) {
        this.O = null;
        this.P = null;
        this.m0 = false;
        if (this.n0) {
            this.n0 = false;
            z(z2);
        }
        this.L.setEnabled(true);
    }

    /* access modifiers changed from: package-private */
    public int k(int i2, int i3) {
        if (i2 >= i3) {
            return (int) (((((float) this.s) * ((float) i3)) / ((float) i2)) + 0.5f);
        }
        return (int) (((((float) this.s) * 9.0f) / 16.0f) + 0.5f);
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return (this.b0.b() & 514) != 0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
        this.f.a(m6.c, this.n, 2);
        u(this.f.g());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.f, androidx.appcompat.app.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(C0707R.layout.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        j jVar = new j();
        FrameLayout frameLayout = (FrameLayout) findViewById(C0707R.id.mr_expandable_area);
        this.y = frameLayout;
        frameLayout.setOnClickListener(new c());
        LinearLayout linearLayout = (LinearLayout) findViewById(C0707R.id.mr_dialog_area);
        this.z = linearLayout;
        linearLayout.setOnClickListener(new d(this));
        int d2 = m.d(this.p);
        Button button = (Button) findViewById(16908314);
        this.t = button;
        button.setText(C0707R.string.mr_controller_disconnect);
        this.t.setTextColor(d2);
        this.t.setOnClickListener(jVar);
        Button button2 = (Button) findViewById(16908313);
        this.u = button2;
        button2.setText(C0707R.string.mr_controller_stop_casting);
        this.u.setTextColor(d2);
        this.u.setOnClickListener(jVar);
        this.F = (TextView) findViewById(C0707R.id.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(C0707R.id.mr_close);
        this.w = imageButton;
        imageButton.setOnClickListener(jVar);
        this.B = (FrameLayout) findViewById(C0707R.id.mr_custom_control);
        this.A = (FrameLayout) findViewById(C0707R.id.mr_default_control);
        e eVar = new e();
        ImageView imageView = (ImageView) findViewById(C0707R.id.mr_art);
        this.C = imageView;
        imageView.setOnClickListener(eVar);
        findViewById(C0707R.id.mr_control_title_container).setOnClickListener(eVar);
        this.H = (LinearLayout) findViewById(C0707R.id.mr_media_main_control);
        this.K = findViewById(C0707R.id.mr_control_divider);
        this.I = (RelativeLayout) findViewById(C0707R.id.mr_playback_control);
        this.D = (TextView) findViewById(C0707R.id.mr_control_title);
        this.E = (TextView) findViewById(C0707R.id.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(C0707R.id.mr_control_playback_ctrl);
        this.v = imageButton2;
        imageButton2.setOnClickListener(jVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C0707R.id.mr_volume_control);
        this.J = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(C0707R.id.mr_volume_slider);
        this.R = seekBar;
        seekBar.setTag(this.o);
        n nVar = new n();
        this.S = nVar;
        this.R.setOnSeekBarChangeListener(nVar);
        this.L = (OverlayListView) findViewById(C0707R.id.mr_volume_group_list);
        this.N = new ArrayList();
        o oVar = new o(this.L.getContext(), this.N);
        this.M = oVar;
        this.L.setAdapter((ListAdapter) oVar);
        this.Q = new HashSet();
        m.u(this.p, this.H, this.L, this.o.w());
        m.w(this.p, (MediaRouteVolumeSlider) this.R, this.H);
        HashMap hashMap = new HashMap();
        this.Y = hashMap;
        hashMap.put(this.o, this.R);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(C0707R.id.mr_group_expand_collapse);
        this.x = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new f());
        s();
        this.o0 = this.p.getResources().getInteger(C0707R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.p0 = this.p.getResources().getInteger(C0707R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.q0 = this.p.getResources().getInteger(C0707R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.q = true;
        y();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f.k(this.n);
        u(null);
        this.r = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.f, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.o.C(i2 == 25 ? -1 : 1);
        return true;
    }

    @Override // androidx.appcompat.app.f, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 25 || i2 == 24) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return (this.b0.b() & 516) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return (this.b0.b() & 1) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean r(n6.f fVar) {
        return this.G && fVar.r() == 1;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.r0 = this.l0 ? this.s0 : this.t0;
        } else {
            this.r0 = this.u0;
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        Set<n6.f> set = this.O;
        if (set == null || set.size() == 0) {
            j(true);
            return;
        }
        d dVar = new d(this);
        int firstVisiblePosition = this.L.getFirstVisiblePosition();
        boolean z2 = false;
        for (int i2 = 0; i2 < this.L.getChildCount(); i2++) {
            View childAt = this.L.getChildAt(i2);
            o oVar = this.M;
            if (this.O.contains((n6.f) oVar.getItem(firstVisiblePosition + i2))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) this.p0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z2) {
                    alphaAnimation.setAnimationListener(dVar);
                    z2 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(boolean r9) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.b.w(boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (((r3 != null && r3.equals(r1)) || (r3 == null && r1 == null)) == false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x() {
        /*
            r6 = this;
            android.support.v4.media.MediaDescriptionCompat r0 = r6.c0
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x000b
        L_0x0007:
            android.graphics.Bitmap r0 = r0.b()
        L_0x000b:
            android.support.v4.media.MediaDescriptionCompat r2 = r6.c0
            if (r2 != 0) goto L_0x0010
            goto L_0x0014
        L_0x0010:
            android.net.Uri r1 = r2.c()
        L_0x0014:
            androidx.mediarouter.app.b$k r2 = r6.d0
            if (r2 != 0) goto L_0x001b
            android.graphics.Bitmap r2 = r6.e0
            goto L_0x001f
        L_0x001b:
            android.graphics.Bitmap r2 = r2.a()
        L_0x001f:
            androidx.mediarouter.app.b$k r3 = r6.d0
            if (r3 != 0) goto L_0x0026
            android.net.Uri r3 = r6.f0
            goto L_0x002a
        L_0x0026:
            android.net.Uri r3 = r3.b()
        L_0x002a:
            r4 = 1
            r5 = 0
            if (r2 == r0) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            if (r2 != 0) goto L_0x0045
            if (r3 == 0) goto L_0x003a
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x003a
            goto L_0x003e
        L_0x003a:
            if (r3 != 0) goto L_0x0040
            if (r1 != 0) goto L_0x0040
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 != 0) goto L_0x0049
            goto L_0x005c
        L_0x0049:
            androidx.mediarouter.app.b$k r0 = r6.d0
            if (r0 == 0) goto L_0x0050
            r0.cancel(r4)
        L_0x0050:
            androidx.mediarouter.app.b$k r0 = new androidx.mediarouter.app.b$k
            r0.<init>()
            r6.d0 = r0
            java.lang.Void[] r1 = new java.lang.Void[r5]
            r0.execute(r1)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.b.x():void");
    }

    /* access modifiers changed from: package-private */
    public void y() {
        int a2 = g.a(this.p);
        getWindow().setLayout(a2, -2);
        View decorView = getWindow().getDecorView();
        this.s = (a2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.p.getResources();
        this.U = resources.getDimensionPixelSize(C0707R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.V = resources.getDimensionPixelSize(C0707R.dimen.mr_controller_volume_group_list_item_height);
        this.W = resources.getDimensionPixelSize(C0707R.dimen.mr_controller_volume_group_list_max_height);
        this.e0 = null;
        this.f0 = null;
        x();
        w(false);
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z2) {
        this.A.requestLayout();
        this.A.getViewTreeObserver().addOnGlobalLayoutListener(new g(z2));
    }
}
