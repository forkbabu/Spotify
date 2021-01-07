package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;

/* renamed from: xa9  reason: default package */
public class xa9 implements g90 {
    private a a;
    private final Context b;
    private final ViewGroup c;

    /* renamed from: xa9$a */
    public interface a {
    }

    private xa9(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.b = context;
        this.c = (ViewGroup) LayoutInflater.from(context).inflate(C0707R.layout.your_library_music_row_chip_cloud, viewGroup, false);
        getView().setTag(C0707R.id.glue_viewholder_tag, this);
    }

    public static xa9 b(ViewGroup viewGroup) {
        return new xa9(viewGroup);
    }

    public void c(va9 va9, View view) {
        ((o49) this.a).a.l(va9);
    }

    public void d(List<va9> list) {
        this.c.removeAllViews();
        Context context = this.b;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.X, (float) nud.g(12.0f, context.getResources()));
        spotifyIconDrawable.s(androidx.core.content.a.c(this.b, R.color.gray_70));
        for (va9 va9 : list) {
            Button button = (Button) LayoutInflater.from(this.b).inflate(C0707R.layout.your_library_music_chip_button, this.c, false);
            button.setText(va9.c());
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, spotifyIconDrawable, (Drawable) null);
            button.setOnClickListener(new ua9(this, va9));
            this.c.addView(button);
        }
    }

    public void g(a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.c;
    }
}
