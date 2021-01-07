package defpackage;

import android.widget.TextView;
import com.spotify.mobile.android.util.ui.g;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.offline.a;
import kotlin.f;

/* renamed from: iz3  reason: default package */
public final /* synthetic */ class iz3 implements nmf {
    public final /* synthetic */ TextView a;

    public /* synthetic */ iz3(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        a.g gVar = (a.g) obj;
        g.c(this.a, 0, C0707R.id.drawable_download_progress);
        return f.a;
    }
}
