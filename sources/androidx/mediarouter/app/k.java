package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.comscore.util.log.LogLevel;
import com.spotify.music.C0707R;
import defpackage.k6;
import defpackage.n6;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class k extends p {
    static final boolean Z = Log.isLoggable("MediaRouteCtrlDialog", 3);
    j A;
    Map<String, f> B;
    n6.f C;
    Map<String, Integer> D;
    boolean E;
    boolean F;
    private boolean G;
    private boolean H;
    private ImageButton I;
    private Button J;
    private ImageView K;
    private View L;
    ImageView M;
    private TextView N;
    private TextView O;
    private String P;
    MediaControllerCompat Q;
    e R;
    MediaDescriptionCompat S;
    d T;
    Bitmap U;
    Uri V;
    boolean W;
    Bitmap X;
    int Y;
    final n6 c;
    private final g f;
    private m6 n = m6.c;
    n6.f o;
    final List<n6.f> p = new ArrayList();
    final List<n6.f> q = new ArrayList();
    final List<n6.f> r = new ArrayList();
    final List<n6.f> s = new ArrayList();
    Context t;
    private boolean u;
    private boolean v;
    private long w;
    final Handler x = new a();
    RecyclerView y;
    h z;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                k.this.n();
            } else if (i == 2) {
                k kVar = k.this;
                if (kVar.C != null) {
                    kVar.C = null;
                    kVar.o();
                }
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k.this.dismiss();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (k.this.o.y()) {
                k.this.c.o(2);
            }
            k.this.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public class d extends AsyncTask<Void, Void, Bitmap> {
        private final Bitmap a;
        private final Uri b;
        private int c;

        d() {
            MediaDescriptionCompat mediaDescriptionCompat = k.this.S;
            Uri uri = null;
            Bitmap b2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
            this.a = k.d(b2) ? null : b2;
            MediaDescriptionCompat mediaDescriptionCompat2 = k.this.S;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c() : uri;
        }

        private InputStream c(Uri uri) {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = k.this.t.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(LogLevel.NONE);
                openConnection.setReadTimeout(LogLevel.NONE);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }

        /* access modifiers changed from: package-private */
        public Bitmap a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public Uri b() {
            return this.b;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a9 A[SYNTHETIC, Splitter:B:39:0x00a9] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00af A[SYNTHETIC, Splitter:B:42:0x00af] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00cb A[ADDED_TO_REGION] */
        @Override // android.os.AsyncTask
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.Void[] r8) {
            /*
            // Method dump skipped, instructions count: 256
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.k.d.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            k kVar = k.this;
            kVar.T = null;
            if (!e2.g(kVar.U, this.a) || !e2.g(k.this.V, this.b)) {
                k kVar2 = k.this;
                kVar2.U = this.a;
                kVar2.X = bitmap2;
                kVar2.V = this.b;
                kVar2.Y = this.c;
                kVar2.W = true;
                kVar2.l();
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
            k kVar = k.this;
            kVar.W = false;
            kVar.X = null;
            kVar.Y = 0;
        }
    }

    /* access modifiers changed from: private */
    public final class e extends MediaControllerCompat.a {
        e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void a(MediaMetadataCompat mediaMetadataCompat) {
            k.this.S = mediaMetadataCompat == null ? null : mediaMetadataCompat.e();
            k.this.f();
            k.this.l();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void c() {
            k kVar = k.this;
            MediaControllerCompat mediaControllerCompat = kVar.Q;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.f(kVar.R);
                k.this.Q = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public abstract class f extends RecyclerView.b0 {
        n6.f C;
        final ImageButton D;
        final MediaRouteVolumeSlider E;

        /* access modifiers changed from: package-private */
        public class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                k kVar = k.this;
                if (kVar.C != null) {
                    kVar.x.removeMessages(2);
                }
                f fVar = f.this;
                k.this.C = fVar.C;
                int i = 1;
                boolean z = !view.isActivated();
                if (z) {
                    i = 0;
                } else {
                    f fVar2 = f.this;
                    Integer num = k.this.D.get(fVar2.C.i());
                    if (num != null) {
                        i = Math.max(1, num.intValue());
                    }
                }
                f.this.j0(z);
                f.this.E.setProgress(i);
                f.this.C.B(i);
                k.this.x.sendEmptyMessageDelayed(2, 500);
            }
        }

        f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            this.D = imageButton;
            this.E = mediaRouteVolumeSlider;
            imageButton.setImageDrawable(m.k(k.this.t));
            m.v(k.this.t, mediaRouteVolumeSlider);
        }

        /* access modifiers changed from: package-private */
        public void h0(n6.f fVar) {
            this.C = fVar;
            int q = fVar.q();
            this.D.setActivated(q == 0);
            this.D.setOnClickListener(new a());
            this.E.setTag(this.C);
            this.E.setMax(fVar.s());
            this.E.setProgress(q);
            this.E.setOnSeekBarChangeListener(k.this.A);
        }

        /* access modifiers changed from: package-private */
        public void j0(boolean z) {
            if (this.D.isActivated() != z) {
                this.D.setActivated(z);
                if (z) {
                    k.this.D.put(this.C.i(), Integer.valueOf(this.E.getProgress()));
                } else {
                    k.this.D.remove(this.C.i());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final class g extends n6.a {
        g() {
        }

        @Override // defpackage.n6.a
        public void d(n6 n6Var, n6.f fVar) {
            k.this.n();
        }

        @Override // defpackage.n6.a
        public void e(n6 n6Var, n6.f fVar) {
            boolean z;
            n6.f.a f;
            if (fVar == k.this.o && fVar.f() != null) {
                Iterator<n6.f> it = fVar.o().d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    n6.f next = it.next();
                    if (!k.this.o.j().contains(next) && (f = next.f()) != null && f.b() && !k.this.q.contains(next)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                k.this.o();
                k.this.m();
                return;
            }
            k.this.n();
        }

        @Override // defpackage.n6.a
        public void f(n6 n6Var, n6.f fVar) {
            k.this.n();
        }

        @Override // defpackage.n6.a
        public void g(n6 n6Var, n6.f fVar) {
            k kVar = k.this;
            kVar.o = fVar;
            kVar.E = false;
            kVar.o();
            k.this.m();
        }

        @Override // defpackage.n6.a
        public void h(n6 n6Var, n6.f fVar) {
            k.this.n();
        }

        @Override // defpackage.n6.a
        public void j(n6 n6Var, n6.f fVar) {
            f fVar2;
            fVar.q();
            boolean z = k.Z;
            k kVar = k.this;
            if (kVar.C != fVar && (fVar2 = kVar.B.get(fVar.i())) != null) {
                int q = fVar2.C.q();
                fVar2.j0(q == 0);
                fVar2.E.setProgress(q);
            }
        }
    }

    /* access modifiers changed from: private */
    public final class h extends RecyclerView.e<RecyclerView.b0> {
        private final ArrayList<f> c = new ArrayList<>();
        private final LayoutInflater f;
        private final Drawable n;
        private final Drawable o;
        private final Drawable p;
        private final Drawable q;
        private f r;
        private final int s;
        private final Interpolator t;

        /* access modifiers changed from: package-private */
        public class a extends Animation {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ View c;

            a(h hVar, int i, int i2, View view) {
                this.a = i;
                this.b = i2;
                this.c = view;
            }

            /* access modifiers changed from: protected */
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                int i = this.a;
                int i2 = this.b;
                k.g(this.c, i2 + ((int) (((float) (i - i2)) * f)));
            }
        }

        /* access modifiers changed from: package-private */
        public class b implements Animation.AnimationListener {
            b() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                k kVar = k.this;
                kVar.F = false;
                kVar.o();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                k.this.F = true;
            }
        }

        /* access modifiers changed from: private */
        public class c extends RecyclerView.b0 {
            final View C;
            final ImageView D;
            final ProgressBar E;
            final TextView F;
            final float G;
            n6.f H;

            c(View view) {
                super(view);
                this.C = view;
                this.D = (ImageView) view.findViewById(C0707R.id.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C0707R.id.mr_cast_group_progress_bar);
                this.E = progressBar;
                this.F = (TextView) view.findViewById(C0707R.id.mr_cast_group_name);
                this.G = m.h(k.this.t);
                m.t(k.this.t, progressBar);
            }
        }

        private class d extends f {
            private final TextView G;
            private final int H;

            d(View view) {
                super(view, (ImageButton) view.findViewById(C0707R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(C0707R.id.mr_cast_volume_slider));
                this.G = (TextView) view.findViewById(C0707R.id.mr_group_volume_route_name);
                Resources resources = k.this.t.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(C0707R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.H = (int) typedValue.getDimension(displayMetrics);
            }

            /* access modifiers changed from: package-private */
            public void l0(f fVar) {
                k.g(this.a, h.this.Z() ? this.H : 0);
                n6.f fVar2 = (n6.f) fVar.a();
                h0(fVar2);
                this.G.setText(fVar2.k());
            }

            /* access modifiers changed from: package-private */
            public int m0() {
                return this.H;
            }
        }

        private class e extends RecyclerView.b0 {
            private final TextView C;

            e(h hVar, View view) {
                super(view);
                this.C = (TextView) view.findViewById(C0707R.id.mr_cast_header_name);
            }

            /* access modifiers changed from: package-private */
            public void h0(f fVar) {
                this.C.setText(fVar.a().toString());
            }
        }

        /* access modifiers changed from: private */
        public class f {
            private final Object a;
            private final int b;

            f(h hVar, Object obj, int i) {
                this.a = obj;
                this.b = i;
            }

            public Object a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }
        }

        private class g extends f {
            final View G;
            final ImageView H;
            final ProgressBar I;
            final TextView J;
            final RelativeLayout K;
            final CheckBox L;
            final float M;
            final int N;
            final View.OnClickListener O = new a();

            class a implements View.OnClickListener {
                a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    g gVar = g.this;
                    boolean z = true;
                    boolean z2 = !gVar.l0(gVar.C);
                    boolean w = g.this.C.w();
                    if (z2) {
                        g gVar2 = g.this;
                        k.this.c.b(gVar2.C);
                    } else {
                        g gVar3 = g.this;
                        k.this.c.l(gVar3.C);
                    }
                    g.this.m0(z2, !w);
                    if (w) {
                        List<n6.f> j = k.this.o.j();
                        for (n6.f fVar : g.this.C.j()) {
                            if (j.contains(fVar) != z2) {
                                f fVar2 = k.this.B.get(fVar.i());
                                if (fVar2 instanceof g) {
                                    ((g) fVar2).m0(z2, true);
                                }
                            }
                        }
                    }
                    g gVar4 = g.this;
                    h hVar = h.this;
                    n6.f fVar3 = gVar4.C;
                    List<n6.f> j2 = k.this.o.j();
                    int max = Math.max(1, j2.size());
                    int i = -1;
                    if (fVar3.w()) {
                        for (n6.f fVar4 : fVar3.j()) {
                            if (j2.contains(fVar4) != z2) {
                                max += z2 ? 1 : -1;
                            }
                        }
                    } else {
                        if (z2) {
                            i = 1;
                        }
                        max += i;
                    }
                    boolean Z = hVar.Z();
                    int i2 = 0;
                    if (max < 2) {
                        z = false;
                    }
                    if (Z != z) {
                        RecyclerView.b0 R = k.this.y.R(0);
                        if (R instanceof d) {
                            d dVar = (d) R;
                            View view2 = dVar.a;
                            if (z) {
                                i2 = dVar.m0();
                            }
                            hVar.X(view2, i2);
                        }
                    }
                }
            }

            g(View view) {
                super(view, (ImageButton) view.findViewById(C0707R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(C0707R.id.mr_cast_volume_slider));
                this.G = view;
                this.H = (ImageView) view.findViewById(C0707R.id.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C0707R.id.mr_cast_route_progress_bar);
                this.I = progressBar;
                this.J = (TextView) view.findViewById(C0707R.id.mr_cast_route_name);
                this.K = (RelativeLayout) view.findViewById(C0707R.id.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(C0707R.id.mr_cast_checkbox);
                this.L = checkBox;
                checkBox.setButtonDrawable(m.e(k.this.t));
                m.t(k.this.t, progressBar);
                this.M = m.h(k.this.t);
                Resources resources = k.this.t.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(C0707R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
                this.N = (int) typedValue.getDimension(displayMetrics);
            }

            /* access modifiers changed from: package-private */
            public boolean l0(n6.f fVar) {
                if (fVar.y()) {
                    return true;
                }
                n6.f.a f = fVar.f();
                if (f == null || f.a() != 3) {
                    return false;
                }
                return true;
            }

            /* access modifiers changed from: package-private */
            public void m0(boolean z, boolean z2) {
                int i = 0;
                this.L.setEnabled(false);
                this.G.setEnabled(false);
                this.L.setChecked(z);
                if (z) {
                    this.H.setVisibility(4);
                    this.I.setVisibility(0);
                }
                if (z2) {
                    h hVar = h.this;
                    RelativeLayout relativeLayout = this.K;
                    if (z) {
                        i = this.N;
                    }
                    hVar.X(relativeLayout, i);
                }
            }
        }

        h() {
            this.f = LayoutInflater.from(k.this.t);
            this.n = m.g(k.this.t);
            this.o = m.q(k.this.t);
            this.p = m.m(k.this.t);
            this.q = m.n(k.this.t);
            this.s = k.this.t.getResources().getInteger(C0707R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
            this.t = new AccelerateDecelerateInterpolator();
            c0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public void K(RecyclerView.b0 b0Var, int i) {
            f fVar;
            n6.f.a f2;
            int w = w(i);
            if (i == 0) {
                fVar = this.r;
            } else {
                fVar = this.c.get(i - 1);
            }
            boolean z = true;
            if (w == 1) {
                k.this.B.put(((n6.f) fVar.a()).i(), (f) b0Var);
                ((d) b0Var).l0(fVar);
            } else if (w != 2) {
                float f3 = 1.0f;
                int i2 = 0;
                if (w == 3) {
                    k.this.B.put(((n6.f) fVar.a()).i(), (f) b0Var);
                    g gVar = (g) b0Var;
                    gVar.getClass();
                    n6.f fVar2 = (n6.f) fVar.a();
                    if (fVar2 == k.this.o && fVar2.j().size() > 0) {
                        Iterator<n6.f> it = fVar2.j().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            n6.f next = it.next();
                            if (!k.this.q.contains(next)) {
                                fVar2 = next;
                                break;
                            }
                        }
                    }
                    gVar.h0(fVar2);
                    gVar.H.setImageDrawable(h.this.Y(fVar2));
                    gVar.J.setText(fVar2.k());
                    if (k.this.o.f() != null) {
                        gVar.L.setVisibility(0);
                        boolean l0 = gVar.l0(fVar2);
                        boolean z2 = !k.this.s.contains(fVar2) && (!gVar.l0(fVar2) || k.this.o.j().size() >= 2) && (!gVar.l0(fVar2) || k.this.o.f() == null || ((f2 = fVar2.f()) != null && f2.d()));
                        gVar.L.setChecked(l0);
                        gVar.I.setVisibility(4);
                        gVar.H.setVisibility(0);
                        gVar.G.setEnabled(z2);
                        gVar.L.setEnabled(z2);
                        gVar.D.setEnabled(z2 || l0);
                        MediaRouteVolumeSlider mediaRouteVolumeSlider = gVar.E;
                        if (!z2 && !l0) {
                            z = false;
                        }
                        mediaRouteVolumeSlider.setEnabled(z);
                        gVar.G.setOnClickListener(gVar.O);
                        gVar.L.setOnClickListener(gVar.O);
                        RelativeLayout relativeLayout = gVar.K;
                        if (l0 && !gVar.C.w()) {
                            i2 = gVar.N;
                        }
                        k.g(relativeLayout, i2);
                        gVar.G.setAlpha((z2 || l0) ? 1.0f : gVar.M);
                        CheckBox checkBox = gVar.L;
                        if (!z2 && l0) {
                            f3 = gVar.M;
                        }
                        checkBox.setAlpha(f3);
                        return;
                    }
                    gVar.L.setVisibility(8);
                    gVar.I.setVisibility(4);
                    gVar.H.setVisibility(0);
                    k.g(gVar.K, gVar.N);
                    gVar.G.setAlpha(1.0f);
                } else if (w == 4) {
                    c cVar = (c) b0Var;
                    cVar.getClass();
                    n6.f fVar3 = (n6.f) fVar.a();
                    cVar.H = fVar3;
                    cVar.D.setVisibility(0);
                    cVar.E.setVisibility(4);
                    if (k.this.o.f() != null) {
                        List<n6.f> j = k.this.o.j();
                        if (j.size() == 1 && j.get(0) == fVar3) {
                            z = false;
                        }
                    }
                    View view = cVar.C;
                    if (!z) {
                        f3 = cVar.G;
                    }
                    view.setAlpha(f3);
                    cVar.C.setOnClickListener(new l(cVar));
                    cVar.D.setImageDrawable(h.this.Y(fVar3));
                    cVar.F.setText(fVar3.k());
                }
            } else {
                ((e) b0Var).h0(fVar);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new d(this.f.inflate(C0707R.layout.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i == 2) {
                return new e(this, this.f.inflate(C0707R.layout.mr_cast_header_item, viewGroup, false));
            }
            if (i == 3) {
                return new g(this.f.inflate(C0707R.layout.mr_cast_route_item, viewGroup, false));
            }
            if (i != 4) {
                return null;
            }
            return new c(this.f.inflate(C0707R.layout.mr_cast_group_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public void R(RecyclerView.b0 b0Var) {
            k.this.B.values().remove(b0Var);
        }

        /* access modifiers changed from: package-private */
        public void X(View view, int i) {
            a aVar = new a(this, i, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new b());
            aVar.setDuration((long) this.s);
            aVar.setInterpolator(this.t);
            view.startAnimation(aVar);
        }

        /* access modifiers changed from: package-private */
        public Drawable Y(n6.f fVar) {
            Uri h = fVar.h();
            if (h != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(k.this.t.getContentResolver().openInputStream(h), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    String str = "Failed to load " + h;
                }
            }
            int d2 = fVar.d();
            if (d2 == 1) {
                return this.o;
            }
            if (d2 == 2) {
                return this.p;
            }
            if (fVar.w()) {
                return this.q;
            }
            return this.n;
        }

        /* access modifiers changed from: package-private */
        public boolean Z() {
            return k.this.o.j().size() > 1;
        }

        /* access modifiers changed from: package-private */
        public void b0() {
            k.this.s.clear();
            k kVar = k.this;
            List<n6.f> list = kVar.s;
            List<n6.f> list2 = kVar.q;
            ArrayList arrayList = new ArrayList();
            if (kVar.o.f() != null) {
                for (n6.f fVar : kVar.o.o().d()) {
                    n6.f.a f2 = fVar.f();
                    if (f2 != null && f2.b()) {
                        arrayList.add(fVar);
                    }
                }
            }
            HashSet hashSet = new HashSet(list2);
            hashSet.removeAll(arrayList);
            list.addAll(hashSet);
            z();
        }

        /* access modifiers changed from: package-private */
        public void c0() {
            this.c.clear();
            k kVar = k.this;
            this.r = new f(this, kVar.o, 1);
            if (!kVar.p.isEmpty()) {
                for (n6.f fVar : k.this.p) {
                    this.c.add(new f(this, fVar, 3));
                }
            } else {
                this.c.add(new f(this, k.this.o, 3));
            }
            boolean z = false;
            if (!k.this.q.isEmpty()) {
                boolean z2 = false;
                for (n6.f fVar2 : k.this.q) {
                    if (!k.this.p.contains(fVar2)) {
                        if (!z2) {
                            k6.b e2 = k.this.o.e();
                            String j = e2 != null ? e2.j() : null;
                            if (TextUtils.isEmpty(j)) {
                                j = k.this.t.getString(C0707R.string.mr_dialog_groupable_header);
                            }
                            this.c.add(new f(this, j, 2));
                            z2 = true;
                        }
                        this.c.add(new f(this, fVar2, 3));
                    }
                }
            }
            if (!k.this.r.isEmpty()) {
                for (n6.f fVar3 : k.this.r) {
                    n6.f fVar4 = k.this.o;
                    if (fVar4 != fVar3) {
                        if (!z) {
                            k6.b e3 = fVar4.e();
                            String k = e3 != null ? e3.k() : null;
                            if (TextUtils.isEmpty(k)) {
                                k = k.this.t.getString(C0707R.string.mr_dialog_transferable_header);
                            }
                            this.c.add(new f(this, k, 2));
                            z = true;
                        }
                        this.c.add(new f(this, fVar3, 4));
                    }
                }
            }
            b0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int u() {
            return this.c.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int w(int i) {
            f fVar;
            if (i == 0) {
                fVar = this.r;
            } else {
                fVar = this.c.get(i - 1);
            }
            return fVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Comparator<n6.f> {
        static final i a = new i();

        i() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(n6.f fVar, n6.f fVar2) {
            return fVar.k().compareToIgnoreCase(fVar2.k());
        }
    }

    /* access modifiers changed from: private */
    public class j implements SeekBar.OnSeekBarChangeListener {
        j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                n6.f fVar = (n6.f) seekBar.getTag();
                f fVar2 = k.this.B.get(fVar.i());
                if (fVar2 != null) {
                    fVar2.j0(i == 0);
                }
                fVar.B(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            k kVar = k.this;
            if (kVar.C != null) {
                kVar.x.removeMessages(2);
            }
            k.this.C = (n6.f) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            k.this.x.sendEmptyMessageDelayed(2, 500);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.m.b(r2, r0, r0)
            int r0 = androidx.mediarouter.app.m.c(r2)
            r1.<init>(r2, r0)
            m6 r2 = defpackage.m6.c
            r1.n = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.p = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.q = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.r = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.s = r2
            androidx.mediarouter.app.k$a r2 = new androidx.mediarouter.app.k$a
            r2.<init>()
            r1.x = r2
            android.content.Context r2 = r1.getContext()
            r1.t = r2
            n6 r2 = defpackage.n6.f(r2)
            r1.c = r2
            androidx.mediarouter.app.k$g r0 = new androidx.mediarouter.app.k$g
            r0.<init>()
            r1.f = r0
            n6$f r0 = r2.i()
            r1.o = r0
            androidx.mediarouter.app.k$e r0 = new androidx.mediarouter.app.k$e
            r0.<init>()
            r1.R = r0
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.g()
            r1.h(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.k.<init>(android.content.Context):void");
    }

    static boolean d(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    static void g(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    private void h(MediaSessionCompat.Token token) {
        MediaMetadataCompat mediaMetadataCompat;
        MediaControllerCompat mediaControllerCompat = this.Q;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.f(this.R);
            this.Q = null;
        }
        if (token != null && this.v) {
            try {
                this.Q = new MediaControllerCompat(this.t, token);
            } catch (RemoteException e2) {
                Log.e("MediaRouteCtrlDialog", "Error creating media controller in setMediaSession.", e2);
            }
            MediaControllerCompat mediaControllerCompat2 = this.Q;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.e(this.R);
            }
            MediaControllerCompat mediaControllerCompat3 = this.Q;
            if (mediaControllerCompat3 == null) {
                mediaMetadataCompat = null;
            } else {
                mediaMetadataCompat = mediaControllerCompat3.a();
            }
            if (mediaMetadataCompat != null) {
                mediaDescriptionCompat = mediaMetadataCompat.e();
            }
            this.S = mediaDescriptionCompat;
            f();
            l();
        }
    }

    private boolean j() {
        if (this.C != null || this.E || this.F) {
            return true;
        }
        return !this.u;
    }

    public void e(List<n6.f> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            n6.f fVar = list.get(size);
            if (!(!fVar.u() && fVar.v() && fVar.z(this.n) && this.o != fVar)) {
                list.remove(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        MediaDescriptionCompat mediaDescriptionCompat = this.S;
        Uri uri = null;
        Bitmap b2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.S;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.c();
        }
        d dVar = this.T;
        Bitmap a2 = dVar == null ? this.U : dVar.a();
        d dVar2 = this.T;
        Uri b3 = dVar2 == null ? this.V : dVar2.b();
        if (a2 != b2 || (a2 == null && !e2.g(b3, uri))) {
            d dVar3 = this.T;
            if (dVar3 != null) {
                dVar3.cancel(true);
            }
            d dVar4 = new d();
            this.T = dVar4;
            dVar4.execute(new Void[0]);
        }
    }

    public void i(m6 m6Var) {
        if (m6Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.n.equals(m6Var)) {
            this.n = m6Var;
            if (this.v) {
                this.c.k(this.f);
                this.c.a(m6Var, this.f, 1);
                m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        getWindow().setLayout(g.b(this.t), !this.t.getResources().getBoolean(C0707R.bool.is_tablet) ? -1 : -2);
        this.U = null;
        this.V = null;
        f();
        l();
        n();
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (j()) {
            this.H = true;
            return;
        }
        this.H = false;
        if (!this.o.y() || this.o.u()) {
            dismiss();
        }
        CharSequence charSequence = null;
        if (!this.W || d(this.X) || this.X == null) {
            if (d(this.X)) {
                StringBuilder V0 = je.V0("Can't set artwork image with recycled bitmap: ");
                V0.append(this.X);
                V0.toString();
            }
            this.M.setVisibility(8);
            this.L.setVisibility(8);
            this.K.setImageBitmap(null);
        } else {
            this.M.setVisibility(0);
            this.M.setImageBitmap(this.X);
            this.M.setBackgroundColor(this.Y);
            this.L.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 17) {
                Bitmap bitmap = this.X;
                RenderScript create = RenderScript.create(this.t);
                Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
                Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                create2.setRadius(10.0f);
                create2.setInput(createFromBitmap);
                create2.forEach(createTyped);
                createTyped.copyTo(bitmap);
                createFromBitmap.destroy();
                createTyped.destroy();
                create2.destroy();
                create.destroy();
                this.K.setImageBitmap(bitmap);
            } else {
                this.K.setImageBitmap(Bitmap.createBitmap(this.X));
            }
        }
        this.W = false;
        this.X = null;
        this.Y = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.S;
        CharSequence h2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.h();
        boolean z2 = !TextUtils.isEmpty(h2);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.S;
        if (mediaDescriptionCompat2 != null) {
            charSequence = mediaDescriptionCompat2.g();
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(charSequence);
        if (z2) {
            this.N.setText(h2);
        } else {
            this.N.setText(this.P);
        }
        if (isEmpty) {
            this.O.setText(charSequence);
            this.O.setVisibility(0);
            return;
        }
        this.O.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public void m() {
        this.p.clear();
        this.q.clear();
        this.r.clear();
        this.p.addAll(this.o.j());
        if (this.o.f() != null) {
            for (n6.f fVar : this.o.o().d()) {
                n6.f.a f2 = fVar.f();
                if (f2 != null) {
                    if (f2.b()) {
                        this.q.add(fVar);
                    }
                    if (f2.c()) {
                        this.r.add(fVar);
                    }
                }
            }
        }
        e(this.q);
        e(this.r);
        List<n6.f> list = this.p;
        i iVar = i.a;
        Collections.sort(list, iVar);
        Collections.sort(this.q, iVar);
        Collections.sort(this.r, iVar);
        this.z.c0();
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (!this.v) {
            return;
        }
        if (SystemClock.uptimeMillis() - this.w < 300) {
            this.x.removeMessages(1);
            this.x.sendEmptyMessageAtTime(1, this.w + 300);
        } else if (j()) {
            this.G = true;
        } else {
            this.G = false;
            if (!this.o.y() || this.o.u()) {
                dismiss();
            }
            this.w = SystemClock.uptimeMillis();
            this.z.b0();
        }
    }

    /* access modifiers changed from: package-private */
    public void o() {
        if (this.G) {
            n();
        }
        if (this.H) {
            l();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = true;
        this.c.a(this.n, this.f, 1);
        m();
        h(this.c.g());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.mr_cast_dialog);
        m.s(this.t, this);
        ImageButton imageButton = (ImageButton) findViewById(C0707R.id.mr_cast_close_button);
        this.I = imageButton;
        imageButton.setColorFilter(-1);
        this.I.setOnClickListener(new b());
        Button button = (Button) findViewById(C0707R.id.mr_cast_stop_button);
        this.J = button;
        button.setTextColor(-1);
        this.J.setOnClickListener(new c());
        this.z = new h();
        RecyclerView recyclerView = (RecyclerView) findViewById(C0707R.id.mr_cast_list);
        this.y = recyclerView;
        recyclerView.setAdapter(this.z);
        this.y.setLayoutManager(new LinearLayoutManager(this.t));
        this.A = new j();
        this.B = new HashMap();
        this.D = new HashMap();
        this.K = (ImageView) findViewById(C0707R.id.mr_cast_meta_background);
        this.L = findViewById(C0707R.id.mr_cast_meta_black_scrim);
        this.M = (ImageView) findViewById(C0707R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(C0707R.id.mr_cast_meta_title);
        this.N = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(C0707R.id.mr_cast_meta_subtitle);
        this.O = textView2;
        textView2.setTextColor(-1);
        this.P = this.t.getResources().getString(C0707R.string.mr_cast_dialog_title_view_placeholder);
        this.u = true;
        k();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v = false;
        this.c.k(this.f);
        this.x.removeCallbacksAndMessages(null);
        h(null);
    }
}
