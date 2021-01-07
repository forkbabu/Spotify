package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: z04  reason: default package */
public class z04 {
    private final View a;

    /* renamed from: z04$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ TextView a;
        final /* synthetic */ RelativeLayout.LayoutParams b;

        a(TextView textView, RelativeLayout.LayoutParams layoutParams) {
            this.a = textView;
            this.b = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int lineCount;
            Layout layout = this.a.getLayout();
            boolean z = false;
            if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                z = true;
            }
            if (z) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e2.t(this.b, intValue);
                this.b.leftMargin = intValue;
                z04.this.a.requestLayout();
            }
        }
    }

    public z04(View view) {
        view.getClass();
        this.a = view;
    }

    public void b() {
        ValueAnimator valueAnimator;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.a.getLayoutParams();
        TextView textView = (TextView) this.a.findViewById(C0707R.id.artistspick_comment_text);
        int dimension = (int) this.a.getResources().getDimension(C0707R.dimen.mobile_artistspickrow_comment_minimum_left_margin);
        if (Build.VERSION.SDK_INT >= 17) {
            valueAnimator = ValueAnimator.ofInt(layoutParams.getMarginStart(), dimension);
        } else {
            valueAnimator = ValueAnimator.ofInt(layoutParams.leftMargin, dimension);
        }
        valueAnimator.setDuration(1000L).setStartDelay(1000);
        valueAnimator.addUpdateListener(new a(textView, layoutParams));
        valueAnimator.start();
    }
}
