package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.homecomponents.loadingplaceholder.ShimmeringProgressView;
import com.spotify.pageloader.w0;

/* renamed from: ai5  reason: default package */
public class ai5 implements w0 {
    private ShimmeringProgressView a;

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.pageloader.w0
    public void h(boolean z) {
        this.a.setShimmering(z);
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.a = new ShimmeringProgressView(context);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
    }
}
