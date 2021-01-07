package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.ui.row.Rows;
import com.spotify.music.playlist.ui.row.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.iq6;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: jq6  reason: default package */
public final class jq6 {
    private y90 a;
    private Context b;
    private TextView c;
    private iq6 d = new iq6.a(0, 1);

    /* renamed from: jq6$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ jq6 a;
        final /* synthetic */ nmf b;

        a(jq6 jq6, Context context, ViewGroup viewGroup, nmf nmf) {
            this.a = jq6;
            this.b = nmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.b.invoke(this.a.d);
        }
    }

    private final void d() {
        View view;
        Resources resources;
        iq6 iq6 = this.d;
        if (iq6 instanceof iq6.a) {
            iq6.a aVar = (iq6.a) iq6;
            TextView textView = this.c;
            if (textView != null) {
                textView.setVisibility(8);
            }
            y90 y90 = this.a;
            if (y90 != null) {
                y90.getView().setVisibility(0);
                Context context = this.b;
                if (context != null && (resources = context.getResources()) != null) {
                    y90.setTitle(resources.getString(C0707R.string.premium_mini_playlist_add_song_title));
                    y90.setSubtitle(resources.getQuantityString(C0707R.plurals.premium_mini_playlist_add_song_subtitle, aVar.a(), Integer.valueOf(aVar.a())));
                }
            }
        } else if (h.a(iq6, iq6.b.a)) {
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            y90 y902 = this.a;
            if (y902 != null && (view = y902.getView()) != null) {
                view.setVisibility(8);
            }
        }
    }

    public final View b(Context context, ViewGroup viewGroup, nmf<? super iq6, f> nmf) {
        h.e(context, "context");
        h.e(nmf, "clickListener");
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.premium_mini_add_remove_row, viewGroup, false);
        if (inflate != null) {
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            TextView textView = (TextView) viewGroup2.findViewById(C0707R.id.premium_mini_playlist_full_textview);
            this.c = textView;
            if (textView != null) {
                textView.setText(context.getResources().getString(C0707R.string.premium_mini_playlist_full_text, 30));
            }
            e c2 = Rows.c(context, viewGroup);
            this.a = c2;
            this.b = context;
            c2.getView();
            ImageView imageView = c2.getImageView();
            Resources resources = context.getResources();
            h.d(resources, "context.resources");
            TypedValue typedValue = new TypedValue();
            resources.getValue(C0707R.dimen.premium_mini_icon_inset, typedValue, true);
            imageView.setImageDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(androidx.core.content.a.b(context, R.color.gray_15)), new com.spotify.paste.graphics.drawable.e(new SpotifyIconDrawable(context, SpotifyIconV2.PLUS_2PX, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.premium_mini_drawable_size)), typedValue.getFloat(), 0)}));
            c2.getView().setOnClickListener(new a(this, context, viewGroup, nmf));
            d();
            viewGroup2.addView(c2.getView(), new FrameLayout.LayoutParams(-1, -2));
            return viewGroup2;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void c(iq6 iq6) {
        h.e(iq6, "mode");
        this.d = iq6;
        d();
    }
}
