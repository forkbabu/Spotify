package com.spotify.mobile.android.ui.contextmenu;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.Toast;
import androidx.appcompat.app.p;
import androidx.fragment.app.x;
import com.google.common.base.Charsets;
import com.spotify.android.glue.patterns.contextmenu.glue.l;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.navigation.logger.f;
import com.spotify.instrumentation.navigation.logger.m;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.connection.g;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.squareup.picasso.Picasso;
import dagger.android.support.DaggerAppCompatDialogFragment;
import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeoutException;

public class ContextMenuFragment extends DaggerAppCompatDialogFragment {
    public static final /* synthetic */ int J0 = 0;
    public y A0;
    Picasso B0;
    ere C0;
    cqe D0;
    private ContextMenuViewModel E0;
    private va0 F0;
    private final Handler G0 = new Handler();
    private String H0;
    private boolean I0;
    private b v0;
    private r3 w0;
    public m x0;
    public jz1 y0;
    public s<g> z0;

    class a implements DialogInterface.OnKeyListener {
        private boolean a;

        a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4 || this.a) {
                return false;
            }
            if (keyEvent.getAction() == 1) {
                this.a = true;
                ContextMenuFragment.a5(ContextMenuFragment.this);
            }
            return true;
        }
    }

    static void a5(ContextMenuFragment contextMenuFragment) {
        m mVar = contextMenuFragment.x0;
        f.a aVar = f.a.a;
        mVar.g(aVar);
        contextMenuFragment.x0.c(aVar, "ContextMenuFragment");
        contextMenuFragment.F0.b();
    }

    public static <T> ContextMenuFragment b5(Context context, b4<T> b4Var, T t, c cVar) {
        return f5(b4Var.p0(t), (androidx.fragment.app.c) context, cVar);
    }

    public static ContextMenuFragment f5(r3 r3Var, androidx.fragment.app.c cVar, c cVar2) {
        cVar.getClass();
        r3Var.getClass();
        String str = null;
        if (r3Var == r3.b) {
            return null;
        }
        aj9 aj9 = (aj9) cVar;
        if (!aj9.k0()) {
            return null;
        }
        ContextMenuFragment contextMenuFragment = new ContextMenuFragment();
        contextMenuFragment.w0 = r3Var;
        if (cVar2 != null) {
            str = cVar2.toString();
        }
        contextMenuFragment.H0 = str;
        x i = cVar.v0().i();
        i.d(contextMenuFragment, "ContextMenuFragment");
        i.r(new f(contextMenuFragment, r3Var, aj9, str));
        i.i();
        return contextMenuFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        M4();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        r3 r3Var = this.w0;
        if (r3Var == null) {
            this.I0 = true;
            return new p(F2(), Q4());
        }
        y3<?> c = r3Var.c();
        String str = this.H0;
        jz1 jz1 = this.y0;
        if (Build.VERSION.SDK_INT >= 23) {
            if (!c.m()) {
                str = c.j();
            }
            jz1.a(new ca1(null, kfd.e1.getName(), str, 0, 0, ViewUris.k2.toString(), "scannable", null, (double) this.D0.d()));
        }
        this.F0 = new l(B2(), new d(this), this.B0, new c(this));
        b bVar = this.v0;
        if (bVar != null) {
            bVar.dispose();
        }
        ContextMenuViewModel d = this.w0.d();
        d.A(true);
        this.E0 = d;
        this.F0.a(d);
        this.v0 = this.w0.b(this.z0).N(new g(this)).E().o0(this.A0).subscribe(new b(this), new a(this));
        Dialog d2 = ((l) this.F0).d();
        d2.setOnKeyListener(new a());
        return d2;
    }

    public /* synthetic */ void c5(ContextMenuViewModel contextMenuViewModel) {
        this.E0 = contextMenuViewModel;
    }

    public void d5(ContextMenuViewModel contextMenuViewModel) {
        try {
            String j = this.w0.c().j();
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 23) {
                LinkType q = l0.z(j).q();
                if (!(q == LinkType.TRACK || q == LinkType.ALBUM || q == LinkType.ARTIST || q == LinkType.PROFILE_PLAYLIST || q == LinkType.PLAYLIST_V2 || q == LinkType.SHOW_EPISODE || q == LinkType.SHOW_SHOW)) {
                    z = false;
                }
                if (z && contextMenuViewModel.J()) {
                    String d = gf0.d(j, Charsets.UTF_8);
                    Uri parse = Uri.parse("https://scannables.scdn.co/uri/800/" + d);
                    if (l0.z(j).q() == LinkType.ARTIST) {
                        contextMenuViewModel.z(false);
                    }
                    contextMenuViewModel.x(parse);
                    contextMenuViewModel.y(ContextMenuViewModel.HeaderViewType.LARGE_IMAGE);
                }
            }
        } catch (UnsupportedOperationException unused) {
            Logger.n("There is no uri in the model", new Object[0]);
        }
        this.F0.a(contextMenuViewModel);
        ((l) this.F0).c(contextMenuViewModel.p());
    }

    public /* synthetic */ void e5(Throwable th) {
        Logger.c(th, "Failed to load context menu", new Object[0]);
        if ((th instanceof TimeoutException) || (th instanceof IllegalArgumentException)) {
            Toast.makeText(B2(), (int) C0707R.string.failed_to_load_context_menu, 0).show();
            this.G0.post(new e(this));
            return;
        }
        throw new RuntimeException(th);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void m3(Bundle bundle) {
        super.m3(bundle);
        if (this.I0) {
            M4();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        b bVar = this.v0;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void z3() {
        super.z3();
        ((zi9) j4()).K();
    }
}
