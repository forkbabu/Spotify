package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.s;

public class FitWindowsFrameLayout extends FrameLayout implements s {
    private s.a a;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        s.a aVar = this.a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.s
    public void setOnFitSystemWindowsListener(s.a aVar) {
        this.a = aVar;
    }
}
