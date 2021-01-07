package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: qi9  reason: default package */
public class qi9 implements g90 {
    private final TextView a;
    private final ImageView b;
    private final View c;

    public qi9(View view) {
        this.c = view;
        this.a = (TextView) view.findViewById(16908308);
        this.b = (ImageView) view.findViewById(C0707R.id.image);
    }

    public void b() {
        this.b.setImageDrawable(null);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.c;
    }

    public void m2(SpotifyIconV2 spotifyIconV2) {
        Context context = this.c.getContext();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, context.getResources().getDimension(C0707R.dimen.sort_and_filter_list_accessory_icon_height));
        spotifyIconDrawable.r(nud.h(context, C0707R.attr.pasteColorAccessoryGreen));
        this.b.setImageDrawable(spotifyIconDrawable);
    }

    public void setText(String str) {
        this.a.setText(str);
    }
}
