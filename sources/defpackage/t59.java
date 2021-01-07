package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: t59  reason: default package */
public final /* synthetic */ class t59 implements g90 {
    public final /* synthetic */ ViewGroup a;

    public /* synthetic */ t59(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // com.spotify.encore.ViewProvider
    public final View getView() {
        ViewGroup viewGroup = this.a;
        return je.G(viewGroup, C0707R.layout.your_library_music_loading_indicator_row, viewGroup, false);
    }
}
