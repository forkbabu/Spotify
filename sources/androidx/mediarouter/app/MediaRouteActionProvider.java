package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.n6;
import java.lang.ref.WeakReference;

public class MediaRouteActionProvider extends a4 {
    private final n6 d;
    private m6 e = m6.c;
    private f f = f.a();
    private MediaRouteButton g;

    private static final class a extends n6.a {
        private final WeakReference<MediaRouteActionProvider> a;

        public a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.a = new WeakReference<>(mediaRouteActionProvider);
        }

        private void k(n6 n6Var) {
            MediaRouteActionProvider mediaRouteActionProvider = this.a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.i();
            } else {
                n6Var.k(this);
            }
        }

        @Override // defpackage.n6.a
        public void a(n6 n6Var, n6.e eVar) {
            k(n6Var);
        }

        @Override // defpackage.n6.a
        public void b(n6 n6Var, n6.e eVar) {
            k(n6Var);
        }

        @Override // defpackage.n6.a
        public void c(n6 n6Var, n6.e eVar) {
            k(n6Var);
        }

        @Override // defpackage.n6.a
        public void d(n6 n6Var, n6.f fVar) {
            k(n6Var);
        }

        @Override // defpackage.n6.a
        public void e(n6 n6Var, n6.f fVar) {
            k(n6Var);
        }

        @Override // defpackage.n6.a
        public void f(n6 n6Var, n6.f fVar) {
            k(n6Var);
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.d = n6.f(context);
        new a(this);
    }

    @Override // defpackage.a4
    public boolean c() {
        return this.d.j(this.e, 1);
    }

    @Override // defpackage.a4
    public View d() {
        if (this.g != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        MediaRouteButton mediaRouteButton = new MediaRouteButton(a(), null);
        this.g = mediaRouteButton;
        mediaRouteButton.setCheatSheetEnabled(true);
        this.g.setRouteSelector(this.e);
        this.g.setAlwaysVisible(false);
        this.g.setDialogFactory(this.f);
        this.g.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.g;
    }

    @Override // defpackage.a4
    public boolean f() {
        MediaRouteButton mediaRouteButton = this.g;
        if (mediaRouteButton != null) {
            return mediaRouteButton.d();
        }
        return false;
    }

    @Override // defpackage.a4
    public boolean h() {
        return true;
    }
}
