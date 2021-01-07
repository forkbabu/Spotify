package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.contentviewstate.view.b;
import kotlin.jvm.internal.h;

/* renamed from: ovc  reason: default package */
public final class ovc {
    private LoadingView a;
    private ViewGroup b;

    public final void a(LayoutInflater layoutInflater, View view) {
        h.e(layoutInflater, "inflater");
        h.e(view, "container");
        b bVar = LoadingView.y;
        this.a = (LoadingView) layoutInflater.inflate(C0707R.layout.loading_view, (ViewGroup) null);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0707R.id.spinner_overlay);
        this.b = viewGroup;
        if (viewGroup != null) {
            viewGroup.addView(this.a);
        }
    }

    public final void b(boolean z) {
        if (z) {
            LoadingView loadingView = this.a;
            if (loadingView != null) {
                loadingView.q();
                loadingView.s(300);
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                return;
            }
            return;
        }
        LoadingView loadingView2 = this.a;
        if (loadingView2 != null) {
            loadingView2.n();
        }
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
    }
}
