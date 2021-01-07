package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView;

/* access modifiers changed from: package-private */
public class m implements PivotListRecyclerView.c, PivotListRecyclerView.b {
    private q a;
    private boolean b;

    m() {
    }

    private void b(q qVar) {
        TextView m0 = qVar.m0();
        qVar.j0(this.b);
        View l0 = qVar.l0();
        m0.setVisibility(4);
        m0.setScaleX(1.0f);
        m0.setScaleY(1.0f);
        l0.setVisibility(0);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView.c
    public void a(q qVar, boolean z, boolean z2) {
        this.b = z2;
        q qVar2 = this.a;
        if (qVar2 != null) {
            qVar2.j0(z2);
            View l0 = qVar2.l0();
            TextView m0 = qVar2.m0();
            l0.setVisibility(4);
            l0.setScaleX(1.0f);
            l0.setScaleY(1.0f);
            m0.setVisibility(0);
        }
        if (!z) {
            boolean z3 = this.b;
            float measuredHeight = ((float) qVar.a.getMeasuredHeight()) / 2.0f;
            qVar.j0(z3);
            View l02 = qVar.l0();
            TextView m02 = qVar.m0();
            m02.setPivotX(0.0f);
            m02.setPivotY(measuredHeight);
            l02.setPivotX(0.0f);
            l02.setPivotY(measuredHeight);
            b(qVar);
        } else {
            qVar.m0().setVisibility(4);
            qVar.j0(this.b);
            qVar.l0().setVisibility(0);
        }
        this.a = qVar;
    }

    public void c(boolean z) {
        this.b = !z;
        q qVar = this.a;
        if (qVar != null) {
            b(qVar);
        }
    }
}
