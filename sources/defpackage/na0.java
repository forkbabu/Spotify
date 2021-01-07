package defpackage;

import android.view.View;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* access modifiers changed from: package-private */
/* renamed from: na0  reason: default package */
public class na0 extends ja0 implements ma0 {
    private final ImageButton o;

    public na0(View view) {
        super(view);
        this.o = (ImageButton) view.findViewById(C0707R.id.icon);
    }

    @Override // defpackage.ma0
    public void Q0(SpotifyIcon spotifyIcon) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getView().getContext(), spotifyIcon);
        float g = (float) nud.g(24.0f, getView().getResources());
        spotifyIconDrawable.w(g);
        spotifyIconDrawable.s(nud.i(getView().getContext(), C0707R.attr.pasteColorAccessory));
        this.o.setBaseline((int) ((Math.abs(getTitleView().getPaint().getFontMetrics().ascent) + g) / 2.0f));
        this.o.setImageDrawable(spotifyIconDrawable);
    }

    @Override // defpackage.ma0
    public void u2(View.OnClickListener onClickListener) {
        this.o.setOnClickListener(onClickListener);
    }
}
