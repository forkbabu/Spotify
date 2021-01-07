package defpackage;

import android.content.Context;
import android.view.View;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

/* renamed from: sn2  reason: default package */
public class sn2 extends tu1 {
    private final Context d;

    public sn2(Context context) {
        super(true);
        this.d = context;
    }

    @Override // defpackage.uu1
    public Integer b() {
        return Integer.valueOf(a.b(this.d, R.color.white));
    }

    @Override // defpackage.tu1, defpackage.uu1
    public Integer c() {
        return Integer.valueOf(this.d.getResources().getDimensionPixelOffset(C0707R.dimen.tooltip_anchor_distance));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public int l() {
        return C0707R.layout.tooltip_carmode_voice;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public void n(View view) {
        view.findViewById(C0707R.id.tooltip_close_btn).setOnClickListener(new qn2(this));
    }

    public /* synthetic */ void o(View view) {
        m();
    }
}
