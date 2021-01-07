package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.common.recyclerview.f;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: kw7  reason: default package */
public class kw7 extends f<sx7> {
    private final Context a;
    private final Picasso b;
    private final nx7 c;

    public kw7(Context context, Picasso picasso, nx7 nx7) {
        context.getClass();
        this.a = context;
        picasso.getClass();
        this.b = picasso;
        nx7.getClass();
        this.c = nx7;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, java.lang.Object, int] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.f
    public void b(RecyclerView.b0 b0Var, sx7 sx7, int i) {
        View view = b0Var.a;
        int i2 = e90.i;
        y90 y90 = (y90) l70.o(view, y90.class);
        PlayerTrack f = sx7.f();
        String s = z42.s(f, "image_url");
        Uri parse = !TextUtils.isEmpty(s) ? Uri.parse(s) : Uri.EMPTY;
        ImageView imageView = y90.getImageView();
        Drawable j = yc0.j(this.a, SpotifyIcon.ALBUM_32, true);
        y90.setTitle(z42.s(f, "title"));
        y90.setSubtitle(PlayerTrackUtil.getArtists(f));
        this.b.b(imageView);
        z l = this.b.l(parse);
        l.t(j);
        l.m(imageView);
        if (PlayerTrackUtil.is19Plus(f)) {
            TextLabelUtil.a(this.a, y90.getSubtitleView(), true);
        } else {
            TextLabelUtil.b(this.a, y90.getSubtitleView(), PlayerTrackUtil.isExplicit(f));
        }
        b0Var.a.setOnClickListener(new gw7(this, f));
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.f
    public RecyclerView.b0 c(ViewGroup viewGroup) {
        h90 h0 = h90.h0(e90.d().i(viewGroup.getContext(), viewGroup));
        View view = h0.a;
        Drawable j = nud.j(view.getContext(), C0707R.attr.selectableItemBackground);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        view.setBackground(j);
        return h0;
    }

    public /* synthetic */ void d(PlayerTrack playerTrack, View view) {
        this.c.a(playerTrack);
    }
}
