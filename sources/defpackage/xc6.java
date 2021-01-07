package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.music.C0707R;

/* renamed from: xc6  reason: default package */
public final class xc6 extends CoordinatorLayout {
    private View I;
    private View J;
    private View K;
    private TextView L;
    private final int[] M = new int[2];
    private final int[] N = new int[2];

    private xc6(Context context, View view, String str) {
        super(context, null);
        LayoutInflater.from(getContext()).inflate(C0707R.layout.playlist_entity_home_mix_education_view, (ViewGroup) this, true);
        this.K = findViewById(C0707R.id.arrow_view);
        this.I = findViewById(C0707R.id.frameLayout);
        TextView textView = (TextView) findViewById(C0707R.id.textSuggestion);
        this.L = textView;
        textView.setText(str);
        this.J = view;
        int i = (int) (getResources().getDisplayMetrics().density * 8.0f);
        ((CoordinatorLayout.e) this.I.getLayoutParams()).setMargins(i, 0, i, 0);
    }

    public static xc6 z(Context context, View view, String str) {
        return new xc6(context, view, str);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.J != null) {
            getLocationInWindow(this.M);
            this.J.getLocationInWindow(this.N);
            int paddingRight = this.I.getPaddingRight() + this.I.getPaddingLeft() + this.I.getMeasuredWidth();
            int paddingBottom = this.I.getPaddingBottom() + this.I.getPaddingTop() + this.I.getMeasuredHeight();
            int[] iArr = this.N;
            int measuredHeight = this.J.getMeasuredHeight() + iArr[1];
            int measuredWidth = ((this.J.getMeasuredWidth() / 2) + ((iArr[0] - this.M[0]) - i)) - (this.K.getMeasuredWidth() / 2);
            int width = (getWidth() / 2) - (paddingRight / 2);
            int measuredHeight2 = this.K.getMeasuredHeight() + this.J.getMeasuredHeight() + this.N[1];
            View view = this.K;
            view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, this.K.getMeasuredHeight() + measuredHeight);
            this.I.layout(width, measuredHeight2, paddingRight + width, paddingBottom + measuredHeight2);
        }
    }

    public void setText(String str) {
        this.L.setText(str);
    }
}
