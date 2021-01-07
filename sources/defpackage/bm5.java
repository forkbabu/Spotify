package defpackage;

import android.widget.CompoundButton;
import com.spotify.music.features.languagepicker.model.g;

/* renamed from: bm5  reason: default package */
public final /* synthetic */ class bm5 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ jm5 a;
    public final /* synthetic */ g b;

    public /* synthetic */ bm5(jm5 jm5, g gVar) {
        this.a = jm5;
        this.b = gVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        jm5 jm5 = this.a;
        g gVar = this.b;
        jm5.getClass();
        if (z != gVar.f() && !jm5.v0()) {
            compoundButton.setChecked(gVar.f());
        }
    }
}
