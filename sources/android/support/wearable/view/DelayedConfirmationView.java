package android.support.wearable.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

@Deprecated
public class DelayedConfirmationView extends CircledImageView {
    private long P;
    private long Q;
    private b R;
    private long S;
    private long T;
    private final Handler U;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DelayedConfirmationView.this.T = SystemClock.elapsedRealtime();
            DelayedConfirmationView.this.invalidate();
            if (DelayedConfirmationView.this.T - DelayedConfirmationView.this.S < DelayedConfirmationView.this.P) {
                DelayedConfirmationView.this.U.sendEmptyMessageDelayed(0, DelayedConfirmationView.this.Q);
            } else if (DelayedConfirmationView.this.S > 0 && DelayedConfirmationView.this.R != null) {
                DelayedConfirmationView.this.R.a(DelayedConfirmationView.this);
            }
        }
    }

    public interface b {
        void a(View view);

        void b(View view);
    }

    public DelayedConfirmationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.wearable.view.CircledImageView, android.view.View
    public void onDraw(Canvas canvas) {
        long j = this.S;
        if (j > 0) {
            setProgress(((float) (this.T - j)) / ((float) this.P));
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        int action = motionEvent.getAction();
        if ((action != 0 && action != 2) || (bVar = this.R) == null) {
            return false;
        }
        bVar.b(this);
        return false;
    }

    public void setListener(b bVar) {
        this.R = bVar;
    }

    public void setStartTimeMs(long j) {
        this.S = j;
        invalidate();
    }

    public void setTotalTimeMs(long j) {
        this.P = j;
    }

    public DelayedConfirmationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Q = 0;
        this.U = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i, i, 0);
        this.Q = (long) obtainStyledAttributes.getInteger(0, 33);
        setProgress(0.0f);
        obtainStyledAttributes.recycle();
    }
}
