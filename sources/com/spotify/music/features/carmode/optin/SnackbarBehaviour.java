package com.spotify.music.features.carmode.optin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.spotify.music.features.carmode.optin.SnackbarCoordinatedCarModeOptInButton;

public class SnackbarBehaviour extends CoordinatorLayout.Behavior<FloatingActionButton> {
    private a a;
    private State b = State.NOT_ANIMATING;

    /* access modifiers changed from: private */
    public enum State {
        NOT_ANIMATING,
        FADING_IN,
        FADING_OUT
    }

    /* access modifiers changed from: package-private */
    public interface a {
    }

    public SnackbarBehaviour(a aVar) {
        this.a = aVar;
    }

    public /* synthetic */ void a() {
        a aVar = this.a;
        if (aVar != null) {
            ((SnackbarCoordinatedCarModeOptInButton.a) aVar).a();
        }
        this.b = State.NOT_ANIMATING;
    }

    public boolean b(View view) {
        return view instanceof Snackbar.SnackbarLayout;
    }

    public boolean c(FloatingActionButton floatingActionButton, View view) {
        float f;
        State state = State.FADING_OUT;
        State state2 = State.FADING_IN;
        float max = Math.max(1.0f - (view.getTranslationY() / ((float) view.getHeight())), 0.0f);
        if (max == 1.0f && !view.isShown()) {
            a aVar = this.a;
            if (aVar == null) {
                return false;
            }
            SnackbarCoordinatedCarModeOptInButton.this.E = true;
            this.b = state;
            return false;
        } else if (max <= 0.0f || !view.isShown()) {
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setTranslationY(0.0f);
            a aVar2 = this.a;
            if (aVar2 == null || this.b != state2 || max != 0.0f) {
                return false;
            }
            ((SnackbarCoordinatedCarModeOptInButton.a) aVar2).a();
            this.b = State.NOT_ANIMATING;
            return false;
        } else {
            float f2 = 1.0f - max;
            State state3 = this.b;
            if (state3 == state) {
                f = ta0.c.getInterpolation(max);
            } else {
                f = state3 == state2 ? 1.0f - ta0.d.getInterpolation(f2) : 1.0f;
            }
            floatingActionButton.setTranslationY(f * ((float) floatingActionButton.getHeight()));
            floatingActionButton.setAlpha(f2);
            a aVar3 = this.a;
            if (aVar3 != null && max == 1.0f && this.b == state) {
                ((SnackbarCoordinatedCarModeOptInButton.a) aVar3).b();
                this.b = state2;
            }
            return true;
        }
    }

    public void d(FloatingActionButton floatingActionButton) {
        if (this.b != State.NOT_ANIMATING) {
            this.b = State.FADING_IN;
            a aVar = this.a;
            if (aVar != null) {
                SnackbarCoordinatedCarModeOptInButton.this.E = true;
            }
            floatingActionButton.animate().alpha(1.0f).translationY(0.0f).setDuration(200).withEndAction(new c(this));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        return b(view);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        return c(floatingActionButton, view);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        d(floatingActionButton);
    }

    public SnackbarBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
