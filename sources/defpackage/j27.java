package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.i0;

/* renamed from: j27  reason: default package */
public class j27 extends c {
    private final i0 c;
    private final h27 f;

    public j27(i0 i0Var, h27 h27) {
        super(C0707R.id.audio_plus_impression);
        this.c = i0Var;
        this.f = h27;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c
    public void n(int i, View view, RecyclerView.b0 b0Var) {
        this.f.getClass();
        String[] stringArray = i61.f0(b0Var).d().metadata().stringArray("viewed");
        if (stringArray != null) {
            for (String str : stringArray) {
                this.c.a(str);
            }
        }
    }
}
