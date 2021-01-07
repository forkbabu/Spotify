package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        j0();
    }

    private void j0() {
        i0(1);
        c0(new Fade(2));
        c0(new ChangeBounds());
        c0(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0();
    }
}
