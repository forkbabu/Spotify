package com.spotify.music.superbird.setup.steps.downloading;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.superbird.setup.m;
import dagger.android.support.DaggerFragment;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class DownloadingFragment extends DaggerFragment implements s {
    public m h0;
    public vne i0;
    public y j0;
    public y k0;
    private final io.reactivex.disposables.a l0 = new io.reactivex.disposables.a();
    private TextView m0;
    private ProgressBar n0;

    static final class a implements View.OnClickListener {
        final /* synthetic */ DownloadingFragment a;

        a(DownloadingFragment downloadingFragment) {
            this.a = downloadingFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            m mVar = this.a.h0;
            if (mVar != null) {
                mVar.g();
            } else {
                h.k("delegate");
                throw null;
            }
        }
    }

    static final class b<T, R> implements l<Long, Long> {
        final /* synthetic */ DownloadingFragment a;

        b(DownloadingFragment downloadingFragment) {
            this.a = downloadingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
        @Override // io.reactivex.functions.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Long apply(java.lang.Long r5) {
            /*
                r4 = this;
                java.lang.Long r5 = (java.lang.Long) r5
                java.lang.String r0 = "it"
                kotlin.jvm.internal.h.e(r5, r0)
                com.spotify.music.superbird.setup.steps.downloading.DownloadingFragment r5 = r4.a
                vne r5 = r5.i0
                java.lang.String r0 = "superbirdOtaDownloadManager"
                r1 = 0
                if (r5 == 0) goto L_0x0063
                java.util.Set r5 = r5.m()
                java.lang.String r2 = "superbirdOtaDownloadManager.ongoingDownloads()"
                kotlin.jvm.internal.h.d(r5, r2)
                java.lang.String r2 = "$this$firstOrNull"
                kotlin.jvm.internal.h.e(r5, r2)
                boolean r2 = r5 instanceof java.util.List
                if (r2 == 0) goto L_0x0031
                java.util.List r5 = (java.util.List) r5
                boolean r2 = r5.isEmpty()
                if (r2 == 0) goto L_0x002b
                goto L_0x003b
            L_0x002b:
                r2 = 0
                java.lang.Object r5 = r5.get(r2)
                goto L_0x0041
            L_0x0031:
                java.util.Iterator r5 = r5.iterator()
                boolean r2 = r5.hasNext()
                if (r2 != 0) goto L_0x003d
            L_0x003b:
                r5 = r1
                goto L_0x0041
            L_0x003d:
                java.lang.Object r5 = r5.next()
            L_0x0041:
                java.lang.Long r5 = (java.lang.Long) r5
                if (r5 == 0) goto L_0x005c
                long r2 = r5.longValue()
                com.spotify.music.superbird.setup.steps.downloading.DownloadingFragment r5 = r4.a
                vne r5 = r5.i0
                if (r5 == 0) goto L_0x0058
                long r0 = r5.f(r2)
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
                goto L_0x0062
            L_0x0058:
                kotlin.jvm.internal.h.k(r0)
                throw r1
            L_0x005c:
                r0 = 0
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
            L_0x0062:
                return r5
            L_0x0063:
                kotlin.jvm.internal.h.k(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.superbird.setup.steps.downloading.DownloadingFragment.b.apply(java.lang.Object):java.lang.Object");
        }
    }

    static final class c<T> implements g<Long> {
        final /* synthetic */ DownloadingFragment a;

        c(DownloadingFragment downloadingFragment) {
            this.a = downloadingFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Long l) {
            Long l2 = l;
            DownloadingFragment.L4(this.a).setText(this.a.R2().getString(C0707R.string.downloading_progress, l2));
            DownloadingFragment.K4(this.a).setProgress((int) l2.longValue());
        }
    }

    public DownloadingFragment() {
        super(C0707R.layout.fragment_downloading);
    }

    public static final /* synthetic */ ProgressBar K4(DownloadingFragment downloadingFragment) {
        ProgressBar progressBar = downloadingFragment.n0;
        if (progressBar != null) {
            return progressBar;
        }
        h.k("progressBar");
        throw null;
    }

    public static final /* synthetic */ TextView L4(DownloadingFragment downloadingFragment) {
        TextView textView = downloadingFragment.m0;
        if (textView != null) {
            return textView;
        }
        h.k("progressTextView");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        ((ImageButton) view.findViewById(C0707R.id.button_close)).setOnClickListener(new a(this));
        View findViewById = view.findViewById(C0707R.id.download_progress);
        h.d(findViewById, "view.findViewById(R.id.download_progress)");
        this.m0 = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0707R.id.progress_bar);
        h.d(findViewById2, "view.findViewById(R.id.progress_bar)");
        this.n0 = (ProgressBar) findViewById2;
        io.reactivex.disposables.a aVar = this.l0;
        io.reactivex.s<Long> g0 = io.reactivex.s.g0(1, TimeUnit.SECONDS);
        y yVar = this.k0;
        if (yVar != null) {
            io.reactivex.s<R> j02 = g0.I0(yVar).j0(new b(this));
            y yVar2 = this.j0;
            if (yVar2 != null) {
                aVar.b(j02.o0(yVar2).subscribe(new c(this)));
            } else {
                h.k("mainScheduler");
                throw null;
            }
        } else {
            h.k("ioScheduler");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_DOWNLOADING.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b2 = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_DOWNLOADING, ViewUris.x2.toString());
        h.d(b2, "PageViewObservable.creat…NLOADING.toString()\n    )");
        return b2;
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.l0.f();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
