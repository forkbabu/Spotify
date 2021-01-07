package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.contentviewstate.view.b;
import com.spotify.music.podcastinteractivity.di.PollContainerPageIdProvider;

/* renamed from: qtc  reason: default package */
public class qtc {
    private final PollContainerPageIdProvider.ContainerPageId a;
    private LoadingView b;
    private View c;

    public qtc(PollContainerPageIdProvider.ContainerPageId containerPageId) {
        this.a = containerPageId;
    }

    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        b bVar = LoadingView.y;
        this.b = (LoadingView) layoutInflater.inflate(C0707R.layout.loading_view, (ViewGroup) null);
        this.c = viewGroup.findViewById(C0707R.id.spinner_overlay);
        Resources resources = viewGroup.getResources();
        View view = this.c;
        if (this.a == PollContainerPageIdProvider.ContainerPageId.EPISODE_PAGE) {
            i = resources.getColor(C0707R.color.spinner_overlay_poll_no_background);
        } else {
            i = resources.getColor(C0707R.color.spinner_overlay_poll_with_background);
        }
        view.setBackgroundColor(i);
        viewGroup.addView(this.b);
    }

    public void b(boolean z) {
        LoadingView loadingView = this.b;
        if (loadingView == null) {
            return;
        }
        if (z) {
            loadingView.q();
            this.b.s(0);
            this.c.setVisibility(0);
            return;
        }
        loadingView.n();
        this.c.setVisibility(8);
    }
}
