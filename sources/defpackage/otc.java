package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.podcastinteractivity.di.PollContainerPageIdProvider;

/* renamed from: otc  reason: default package */
public class otc {
    private final PollContainerPageIdProvider.ContainerPageId a;
    private View b;
    private TextView c;
    private TextView d;

    public otc(PollContainerPageIdProvider.ContainerPageId containerPageId) {
        this.a = containerPageId;
    }

    public void a(ViewGroup viewGroup) {
        int i;
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.poll_error_state_view, viewGroup, false);
        this.b = inflate;
        if (this.a == PollContainerPageIdProvider.ContainerPageId.EPISODE_PAGE) {
            i = resources.getColor(C0707R.color.poll_no_background);
        } else {
            i = resources.getColor(C0707R.color.poll_with_background);
        }
        inflate.setBackgroundColor(i);
        this.c = (TextView) this.b.findViewById(C0707R.id.poll_error_title);
        this.d = (TextView) this.b.findViewById(C0707R.id.poll_error_subtitle);
        ((Button) this.b.findViewById(C0707R.id.error_button)).setOnClickListener(new ntc(this));
        this.b.setVisibility(8);
        viewGroup.addView(this.b);
    }

    public /* synthetic */ void b(View view) {
        this.b.setVisibility(8);
    }

    public void c() {
        this.b.setVisibility(8);
    }

    public void d() {
        this.c.setText(C0707R.string.podcast_poll_error_general_error_title);
        this.d.setText(C0707R.string.podcast_poll_error_general_error_subtitle);
        this.b.setVisibility(0);
    }
}
