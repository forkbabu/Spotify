package com.spotify.music.features.localfilesimport.view;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

public class LocalFileRow extends RecyclerView.b0 {
    private final Button C = ((Button) this.a.findViewById(16908289));
    private final TextView D;
    private final TextView E = ((TextView) this.a.findViewById(16908309));
    private final ImageView F = ((ImageView) this.a.findViewById(16908294));

    public enum Activated {
        INACTIVE,
        PARTLY,
        FULLY
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocalFileRow(android.content.Context r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r0 = 2131624551(0x7f0e0267, float:1.8876285E38)
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r4, r1)
            r2.<init>(r3)
            r4 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.D = r3
            android.view.View r3 = r2.a
            r4 = 16908309(0x1020015, float:2.3877288E-38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.E = r3
            android.view.View r3 = r2.a
            r4 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.F = r3
            android.view.View r3 = r2.a
            r4 = 16908289(0x1020001, float:2.3877232E-38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.C = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.localfilesimport.view.LocalFileRow.<init>(android.content.Context, android.view.ViewGroup):void");
    }

    public ImageView getImageView() {
        return this.F;
    }

    public TextView getSubtitleView() {
        return this.E;
    }

    public void h0(Activated activated) {
        int ordinal = activated.ordinal();
        if (ordinal == 0) {
            this.C.setBackgroundResource(C0707R.drawable.selector);
        } else if (ordinal == 1) {
            this.C.setBackgroundResource(C0707R.drawable.selector_partly_checked);
        } else if (ordinal == 2) {
            this.C.setBackgroundResource(C0707R.drawable.selector_checked);
        }
    }

    public void j0(View.OnClickListener onClickListener) {
        this.C.setOnClickListener(onClickListener);
        this.a.setOnClickListener(onClickListener);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.E.setText(charSequence);
        this.E.setVisibility(charSequence == null ? 8 : 0);
    }

    public void setTitle(CharSequence charSequence) {
        this.D.setText(charSequence);
    }
}
