package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.pageloader.skeleton.SkeletonLayout;
import com.spotify.music.pageloader.skeleton.c;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.w0;
import java.util.Arrays;

/* renamed from: fbc  reason: default package */
public final class fbc {

    /* renamed from: fbc$a */
    static class a implements s0 {
        private View a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.spotify.pageloader.s0
        public View getView() {
            return this.a;
        }

        @Override // com.spotify.pageloader.s0
        public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
            View inflate = layoutInflater.inflate(C0707R.layout.default_placeholder_not_found, viewGroup, false);
            this.a = inflate;
            TextView textView = (TextView) inflate.findViewById(C0707R.id.not_found_title);
            TextView textView2 = (TextView) this.a.findViewById(C0707R.id.not_found_subtitle);
            TextView[] textViewArr = {textView, textView2};
            vc0.i(textViewArr);
            vc0.h(textViewArr);
            vc0.e(textView, nud.q(24.0f, context.getResources()));
            vc0.f(textView2, nud.q(26.0f, context.getResources()));
            vc0.g(this.a);
            textView.setText(this.b);
            textView2.setText(this.c);
        }

        @Override // com.spotify.pageloader.s0
        public void start() {
        }

        @Override // com.spotify.pageloader.s0
        public void stop() {
        }
    }

    /* renamed from: fbc$b */
    static class b implements w0 {
        private LoadingView a;

        b() {
        }

        @Override // com.spotify.pageloader.s0
        public View getView() {
            return this.a;
        }

        @Override // com.spotify.pageloader.w0
        public void h(boolean z) {
            LoadingView loadingView = this.a;
            if (loadingView == null) {
                return;
            }
            if (z && !loadingView.p()) {
                this.a.q();
                this.a.r();
            } else if (!z) {
                this.a.n();
            }
        }

        @Override // com.spotify.pageloader.s0
        public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
            com.spotify.music.contentviewstate.view.b bVar = LoadingView.y;
            this.a = (LoadingView) layoutInflater.inflate(C0707R.layout.loading_view, (ViewGroup) null);
        }

        @Override // com.spotify.pageloader.s0
        public void start() {
        }

        @Override // com.spotify.pageloader.s0
        public void stop() {
            LoadingView loadingView = this.a;
            if (loadingView != null) {
                loadingView.n();
                this.a = null;
            }
        }
    }

    private fbc() {
    }

    public static w0 a() {
        return new b();
    }

    public static s0 b(int i, int i2) {
        return new a(i, i2);
    }

    public static w0 c(SkeletonLayout.b... bVarArr) {
        return new c(Arrays.asList(bVarArr));
    }
}
