package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.music.spotlets.scannables.ScannablesActivity;

/* renamed from: rd8  reason: default package */
public class rd8 implements qd8 {
    private final Fragment a;

    public rd8(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.qd8
    public void a() {
        Fragment fragment = this.a;
        Context l4 = fragment.l4();
        int i = ScannablesActivity.K;
        fragment.H4(new Intent(l4, ScannablesActivity.class), ContentMediaFormat.FULL_CONTENT_GENERIC, null);
    }
}
