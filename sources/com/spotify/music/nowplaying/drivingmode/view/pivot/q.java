package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon;

public class q extends RecyclerView.b0 {
    private final TextView C;
    private final TextView D;
    private final TextView E;
    private final View F;
    private final View G;

    q(View view) {
        super(view);
        this.C = (TextView) view.findViewById(C0707R.id.label_unselected);
        this.D = (TextView) view.findViewById(C0707R.id.label_selected_title);
        this.E = (TextView) view.findViewById(C0707R.id.label_selected_subtitle);
        this.G = view.findViewById(C0707R.id.label_selected_icon);
        this.F = view.findViewById(C0707R.id.label_selected_container);
    }

    /* access modifiers changed from: package-private */
    public void h0(l lVar) {
        this.D.setText(lVar.k());
        this.E.setText(lVar.j());
        this.C.setText(lVar.k());
        if (!this.E.getText().toString().isEmpty()) {
            this.E.setVisibility(0);
            if (lVar.i() == PivotSubtitleIcon.DOWNLOADED) {
                this.G.setBackground(fvb.v(this.a.getContext()));
                this.G.setVisibility(0);
            } else if (lVar.i() == PivotSubtitleIcon.SHUFFLE) {
                this.G.setBackground(fvb.w(this.a.getContext()));
                this.G.setVisibility(0);
            } else {
                this.G.setVisibility(8);
            }
            this.D.setTextSize(2, 34.0f);
            this.C.setTextSize(2, 34.0f);
            return;
        }
        this.E.setVisibility(8);
        this.G.setVisibility(8);
        this.D.setTextSize(2, 40.0f);
        this.C.setTextSize(2, 40.0f);
    }

    /* access modifiers changed from: package-private */
    public void j0(boolean z) {
        if (z) {
            this.D.setTextColor(this.a.getContext().getResources().getColor(R.color.green_light));
            TextView textView = this.E;
            Resources resources = this.a.getContext().getResources();
            int i = R.color.white;
            textView.setTextColor(resources.getColor(i));
            if (this.G.getBackground() != null) {
                this.G.getBackground().setColorFilter(this.a.getContext().getResources().getColor(i), PorterDuff.Mode.SRC_ATOP);
                return;
            }
            return;
        }
        this.D.setTextColor(this.a.getContext().getResources().getColor(R.color.white));
        TextView textView2 = this.E;
        Resources resources2 = this.a.getContext().getResources();
        int i2 = R.color.white_70;
        textView2.setTextColor(resources2.getColor(i2));
        if (this.G.getBackground() != null) {
            this.G.getBackground().setColorFilter(this.a.getContext().getResources().getColor(i2), PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* access modifiers changed from: package-private */
    public View l0() {
        return this.F;
    }

    /* access modifiers changed from: package-private */
    public TextView m0() {
        return this.C;
    }
}
