package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.SquareImageView;
import com.spotify.remoteconfig.q6;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.z97;

/* renamed from: aa7  reason: default package */
public class aa7 implements z97 {
    private final q6 a;
    private final ajf<z97.a> b;
    private final Picasso c;
    private View d;
    private Group e;
    private SquareImageView f;
    private TextView g;
    private View h;
    private Button i;

    public aa7(q6 q6Var, Picasso picasso, ajf<z97.a> ajf) {
        this.a = q6Var;
        this.b = ajf;
        this.c = picasso;
    }

    public /* synthetic */ void a(k87 k87, View view) {
        this.b.get().a(k87.e());
    }

    public /* synthetic */ void b(View view) {
        this.b.get().b();
    }

    @Override // defpackage.z97
    public void c(k87 k87) {
        SquareImageView squareImageView;
        if (k87 == null || k87.f().isEmpty()) {
            Group group = this.e;
            if (group != null) {
                group.setVisibility(8);
            }
        } else if (this.a.a()) {
            if (!(this.c == null || (squareImageView = this.f) == null)) {
                Drawable o = yc0.o(squareImageView.getContext());
                if (k87.c().isPresent()) {
                    z m = this.c.m(k87.c().get());
                    m.t(o);
                    m.g(o);
                    m.m(this.f);
                } else {
                    this.f.setImageDrawable(o);
                }
            }
            TextView textView = this.g;
            if (textView != null) {
                textView.setText(k87.d());
            }
            this.e.setVisibility(0);
            View view = this.d;
            if (view != null) {
                view.setOnClickListener(new t97(this, k87));
            }
            if (this.h != null && this.i != null) {
                if (k87.a()) {
                    this.h.setVisibility(0);
                    this.i.setOnClickListener(new u97(this));
                    return;
                }
                this.h.setVisibility(8);
            }
        }
    }

    @Override // defpackage.z97
    public void d(TextView textView, View view, View view2, Group group) {
        this.e = group;
        if (this.a.a()) {
            this.d = view;
            ((SquareImageView) view.findViewById(C0707R.id.segment_linked_page_link)).setImageDrawable(new SpotifyIconDrawable(textView.getContext(), SpotifyIconV2.CHEVRON_RIGHT, (float) textView.getResources().getDimensionPixelSize(C0707R.dimen.std_24dp)));
            this.f = (SquareImageView) view.findViewById(C0707R.id.tracklist_item_image);
            this.g = (TextView) view.findViewById(C0707R.id.tracklist_link_artists);
            this.e.setVisibility(0);
            this.h = view2.findViewById(C0707R.id.free_experience_banner);
            this.i = (Button) view2.findViewById(C0707R.id.free_experience_banner_button);
            return;
        }
        this.e.setVisibility(8);
    }
}
