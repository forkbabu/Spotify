package defpackage;

import android.os.Bundle;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.music.lyrics.share.assetpicker.ui.LyricsShareAssetPickerFragment;
import kotlin.jvm.internal.h;

/* renamed from: eeb  reason: default package */
public final class eeb implements deb {
    private final o a;

    public eeb(o oVar) {
        h.e(oVar, "fragmentManager");
        this.a = oVar;
    }

    @Override // defpackage.deb
    public void a(Bundle bundle) {
        h.e(bundle, "bundle");
        h.e(bundle, "bundle");
        LyricsShareAssetPickerFragment lyricsShareAssetPickerFragment = new LyricsShareAssetPickerFragment();
        lyricsShareAssetPickerFragment.r4(bundle);
        x i = this.a.i();
        i.d(lyricsShareAssetPickerFragment, LyricsShareAssetPickerFragment.class.getSimpleName());
        i.i();
    }
}
