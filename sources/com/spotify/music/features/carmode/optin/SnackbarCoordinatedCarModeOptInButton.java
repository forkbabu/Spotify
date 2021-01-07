package com.spotify.music.features.carmode.optin;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.spotify.music.C0707R;
import com.spotify.music.features.carmode.optin.SnackbarBehaviour;
import com.spotify.music.features.carmode.optin.j;

public class SnackbarCoordinatedCarModeOptInButton extends FloatingActionButton implements j, CoordinatorLayout.b {
    public static final /* synthetic */ int G = 0;
    private final Context A;
    private final qg0<Context> B;
    private final qg0<Context> C;
    private j.a D;
    private boolean E;
    private qg0<Context> F;

    class a implements SnackbarBehaviour.a {
        a() {
        }

        private void c() {
            SnackbarCoordinatedCarModeOptInButton.this.F.accept(SnackbarCoordinatedCarModeOptInButton.this.A);
            SnackbarCoordinatedCarModeOptInButton.this.F = d.a;
        }

        public void a() {
            c();
            SnackbarCoordinatedCarModeOptInButton.this.E = false;
        }

        public void b() {
            c();
        }
    }

    public SnackbarCoordinatedCarModeOptInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean A() {
        float f;
        if (Build.VERSION.SDK_INT >= 17) {
            f = Settings.Global.getFloat(this.A.getContentResolver(), "animator_duration_scale", 1.0f);
        } else {
            f = Settings.System.getFloat(this.A.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return f != 0.0f;
    }

    public void B(View view) {
        j.a aVar = this.D;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.spotify.music.features.carmode.optin.j
    public void a(boolean z) {
        if (!A() || (!this.E && !z)) {
            this.C.accept(this.A);
        } else {
            this.F = this.C;
        }
    }

    @Override // com.spotify.music.features.carmode.optin.j
    public void b() {
        setVisibility(8);
    }

    @Override // com.spotify.music.features.carmode.optin.j
    public void c(boolean z) {
        if (!A() || (!this.E && !z)) {
            this.B.accept(this.A);
        } else {
            this.F = this.B;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new SnackbarBehaviour(new a());
    }

    @Override // com.spotify.music.features.carmode.optin.j
    public void setListener(j.a aVar) {
        this.D = aVar;
    }

    public SnackbarCoordinatedCarModeOptInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = new e(this);
        this.C = new g(this);
        this.F = h.a;
        this.A = context;
        setOnClickListener(new f(this));
        setBackgroundTintList(i0.a(context, C0707R.color.button_states));
    }
}
