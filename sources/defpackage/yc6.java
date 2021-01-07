package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: yc6  reason: default package */
public final class yc6 extends nc0 {
    private final ImageView c;

    public yc6(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(C0707R.layout.playlist_entity_home_mix_header_content_view, viewGroup, false));
        View findViewById = getView().findViewById(C0707R.id.cover_art_image);
        findViewById.getClass();
        this.c = (ImageView) findViewById;
    }

    /* access modifiers changed from: package-private */
    public ImageView getImageView() {
        return this.c;
    }
}
