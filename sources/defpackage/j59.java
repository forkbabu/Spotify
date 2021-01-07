package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: j59  reason: default package */
public final /* synthetic */ class j59 implements g90 {
    public final /* synthetic */ ViewGroup a;

    public /* synthetic */ j59(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // com.spotify.encore.ViewProvider
    public final View getView() {
        ViewGroup viewGroup = this.a;
        return je.G(viewGroup, C0707R.layout.your_library_music_placeholder_row, viewGroup, false);
    }
}
