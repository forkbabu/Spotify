package com.spotify.music.features.playlistentity.homemix.usertoggle;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.facepile.FaceView;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.squareup.picasso.Picasso;

public class m extends RecyclerView.b0 {
    private final ViewGroup C;
    private final FaceView D;
    private final TextView E;
    private final SwitchCompat F;
    private final Picasso G;

    /* access modifiers changed from: private */
    public class a implements CompoundButton.OnCheckedChangeListener {
        private final b a;
        private boolean b;

        public a(b bVar) {
            bVar.getClass();
            this.a = bVar;
        }

        public void a() {
            this.b = true;
            m.this.F.toggle();
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.a.l(this.b);
            } else if (this.a.k()) {
                this.a.m(this.b);
            } else {
                m.this.F.toggle();
                this.a.j();
            }
            this.b = false;
        }
    }

    public interface b {
        void j();

        boolean k();

        void l(boolean z);

        void m(boolean z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(com.squareup.picasso.Picasso r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            r0 = 2131624795(0x7f0e035b, float:1.887678E38)
            r1 = 0
            android.view.View r4 = defpackage.je.G(r4, r0, r4, r1)
            r2.<init>(r4)
            r2.G = r3
            r3 = 2131431127(0x7f0b0ed7, float:1.8483974E38)
            android.view.View r3 = r4.findViewById(r3)
            r3.getClass()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2.C = r3
            android.view.View r3 = r2.a
            r4 = 2131428454(0x7f0b0466, float:1.8478553E38)
            android.view.View r3 = r3.findViewById(r4)
            r3.getClass()
            com.spotify.libs.facepile.FaceView r3 = (com.spotify.libs.facepile.FaceView) r3
            r2.D = r3
            android.view.View r3 = r2.a
            r4 = 2131430563(0x7f0b0ca3, float:1.848283E38)
            android.view.View r3 = r3.findViewById(r4)
            r3.getClass()
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.E = r3
            android.view.View r3 = r2.a
            r4 = 2131431691(0x7f0b110b, float:1.8485118E38)
            android.view.View r3 = r3.findViewById(r4)
            r3.getClass()
            androidx.appcompat.widget.SwitchCompat r3 = (androidx.appcompat.widget.SwitchCompat) r3
            r2.F = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.playlistentity.homemix.usertoggle.m.<init>(com.squareup.picasso.Picasso, android.view.ViewGroup):void");
    }

    public void j0(HomeMixUser homeMixUser, b bVar) {
        homeMixUser.getClass();
        this.D.a(this.G, homeMixUser.getFace());
        this.E.setText(homeMixUser.getShortName());
        a aVar = new a(bVar);
        this.F.setChecked(homeMixUser.isPresent());
        this.F.setOnCheckedChangeListener(aVar);
        this.C.setOnClickListener(new h(aVar));
    }
}
