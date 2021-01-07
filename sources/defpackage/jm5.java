package defpackage;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.music.features.languagepicker.model.g;

/* renamed from: jm5  reason: default package */
public class jm5 extends em5 {
    private final t90 D;
    private final SwitchCompat E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jm5(android.view.ViewGroup r4, defpackage.dm5.a r5) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            ga0 r1 = defpackage.e90.d()
            t90 r4 = r1.f(r0, r4)
            androidx.appcompat.widget.SwitchCompat r1 = new androidx.appcompat.widget.SwitchCompat
            r2 = 0
            r1.<init>(r0, r2)
            r4.z0(r1)
            android.view.View r0 = r4.getView()
            r3.<init>(r0, r5)
            r3.D = r4
            android.view.View r4 = r4.W1()
            androidx.appcompat.widget.SwitchCompat r4 = (androidx.appcompat.widget.SwitchCompat) r4
            r3.E = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm5.<init>(android.view.ViewGroup, dm5$a):void");
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void s0() {
        this.E.setOnCheckedChangeListener(null);
    }

    @Override // defpackage.em5
    /* renamed from: u0 */
    public void h0(g gVar, int i) {
        this.a.setOnClickListener(new cm5(this));
        this.E.setOnCheckedChangeListener(new bm5(this, gVar));
        this.D.setText(gVar.e());
        this.E.setChecked(gVar.f());
    }

    public /* synthetic */ void w0(View view) {
        this.E.toggle();
    }
}
