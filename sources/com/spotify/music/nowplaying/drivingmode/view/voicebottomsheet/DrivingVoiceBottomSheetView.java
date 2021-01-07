package com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet.c;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.DrivingVoiceView;

public class DrivingVoiceBottomSheetView extends CoordinatorLayout implements c {
    private BottomSheetBehavior<DrivingVoiceView> I;
    private c.a J;
    private boolean K = true;

    /* access modifiers changed from: package-private */
    public class a extends BottomSheetBehavior.d {
        a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public void a(View view, float f) {
            ((b) DrivingVoiceBottomSheetView.this.J).e(f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public void b(View view, int i) {
            if (i == 5 && DrivingVoiceBottomSheetView.this.K) {
                ((b) DrivingVoiceBottomSheetView.this.J).b();
            } else if (i == 5) {
                ((b) DrivingVoiceBottomSheetView.this.J).c();
            }
        }
    }

    public DrivingVoiceBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        D(context);
    }

    private void D(Context context) {
        LayoutInflater.from(context).inflate(C0707R.layout.driving_voice_bottom_sheet_view, (ViewGroup) this, true);
        bd0.b(this, new a(this), true);
        BottomSheetBehavior<DrivingVoiceView> o = BottomSheetBehavior.o((DrivingVoiceView) findViewById(C0707R.id.driving_voice_view));
        this.I = o;
        o.w(true);
        this.I.s(new a());
    }

    public void B() {
        this.I.x(3);
    }

    public void C() {
        this.K = false;
        this.I.x(5);
    }

    public /* synthetic */ void E(DrivingVoiceBottomSheetView drivingVoiceBottomSheetView) {
        ((b) this.J).a();
    }

    public void setListener(c.a aVar) {
        this.J = aVar;
    }

    public DrivingVoiceBottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        D(context);
    }
}
