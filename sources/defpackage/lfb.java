package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.x3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.vocalremoval.model.VocalVolume;
import io.reactivex.s;

/* renamed from: lfb  reason: default package */
public class lfb implements x3<Void> {
    private final Context b;
    private final Resources c;
    private final e d;
    private final VocalVolume e;

    public lfb(Context context, e eVar, VocalVolume vocalVolume) {
        this.b = context;
        this.c = context.getResources();
        this.d = eVar;
        this.e = vocalVolume;
    }

    private void d(ContextMenuViewModel contextMenuViewModel, int i, String str, SpotifyIconV2 spotifyIconV2, boolean z) {
        b b2 = contextMenuViewModel.b(i, str, l70.i(this.b, spotifyIconV2));
        b2.l(true);
        b2.o(this.d);
        b2.m(z);
    }

    private ContextMenuViewModel e() {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        d(contextMenuViewModel, C0707R.id.more_vocal, this.c.getString(C0707R.string.lyrics_full_screen_sing_along_more_vocal), SpotifyIconV2.VOLUME, this.e != VocalVolume.OFF);
        d(contextMenuViewModel, C0707R.id.less_vocal, this.c.getString(C0707R.string.lyrics_full_screen_sing_along_less_vocal), SpotifyIconV2.VOLUME_ONEWAVE, this.e != VocalVolume.LOW);
        d(contextMenuViewModel, C0707R.id.report, this.c.getString(C0707R.string.lyrics_full_screen_sing_along_report), SpotifyIconV2.REPORT_ABUSE, true);
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<Void> y3Var) {
        return s.i0(e());
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<Void> y3Var) {
        return e();
    }
}
