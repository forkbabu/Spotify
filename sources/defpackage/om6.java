package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.offlinetrials.limited.uicomponents.TrackDownloadButton;
import com.spotify.music.offlinetrials.limited.uicomponents.u;
import com.spotify.playlist.models.offline.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: om6  reason: default package */
public class om6 {
    private final u a;
    private final ajf<b4<ContextMenuItem>> b;
    private final c c;

    public om6(u uVar, ajf<b4<ContextMenuItem>> ajf, c cVar) {
        this.a = uVar;
        this.b = ajf;
        this.c = cVar;
    }

    public List<View> a(View.OnClickListener onClickListener, RecyclerView.b0 b0Var, ContextMenuItem contextMenuItem, a aVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        Context context = b0Var.a.getContext();
        TrackDownloadButton trackDownloadButton = new TrackDownloadButton(context, null);
        aVar.getClass();
        trackDownloadButton.setDownloadState(aVar instanceof a.C0377a);
        trackDownloadButton.setListener(new cm6(this, trackDownloadButton, onClickListener));
        if (z) {
            arrayList.add(trackDownloadButton);
        }
        arrayList.add(p42.b(context, z42.e(context, SpotifyIconV2.MORE_ANDROID), this.b.get(), contextMenuItem, this.c));
        return arrayList;
    }

    public /* synthetic */ void b(TrackDownloadButton trackDownloadButton, View.OnClickListener onClickListener) {
        this.a.f(dm6.a, new bm6(trackDownloadButton, onClickListener));
    }
}
