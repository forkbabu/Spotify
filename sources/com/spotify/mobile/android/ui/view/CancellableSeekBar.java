package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

public class CancellableSeekBar extends AppCompatSeekBar {
    private boolean b;
    private boolean c;
    private boolean f;
    private int n;
    private b o;
    private float p;
    private final Object q;

    public interface a extends SeekBar.OnSeekBarChangeListener {
        void a(SeekBar seekBar);
    }

    /* access modifiers changed from: private */
    public static class b implements a {
        private final SeekBar.OnSeekBarChangeListener a;
        private boolean b;

        public b(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
            this.a = onSeekBarChangeListener;
        }

        @Override // com.spotify.mobile.android.ui.view.CancellableSeekBar.a
        public void a(SeekBar seekBar) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.a;
            if (onSeekBarChangeListener instanceof a) {
                ((a) onSeekBarChangeListener).a(seekBar);
            }
        }

        public void b() {
            this.b = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.a.onProgressChanged(seekBar, i, z);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.a.onStartTrackingTouch(seekBar);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.b) {
                this.b = false;
            } else {
                this.a.onStopTrackingTouch(seekBar);
            }
        }
    }

    public CancellableSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    public void a() {
        if (this.c) {
            onTouchEvent(MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0));
            this.b = true;
            this.c = false;
            synchronized (this.q) {
                setProgress(this.n);
            }
            b bVar = this.o;
            if (bVar != null) {
                bVar.a(this);
            }
        }
    }

    public float getCancelDistance() {
        return this.p;
    }

    /* JADX INFO: finally extract failed */
    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        try {
            this.f = true;
            int action = motionEvent.getAction();
            if (this.b) {
                if (action == 1 || action == 3) {
                    this.b = false;
                    this.c = false;
                }
                this.f = false;
                return true;
            }
            if (action == 0) {
                this.c = true;
                synchronized (this.q) {
                    this.n = getProgress();
                }
            }
            if (motionEvent.getY() < (-this.p) || motionEvent.getY() > ((float) getHeight()) + this.p) {
                this.b = true;
                motionEvent.setAction(3);
                b bVar = this.o;
                if (bVar != null) {
                    bVar.b();
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                synchronized (this.q) {
                    setProgress(this.n);
                }
                b bVar2 = this.o;
                if (bVar2 != null) {
                    bVar2.a(this);
                }
                this.f = false;
                return onTouchEvent;
            }
            if (action == 1) {
                this.c = false;
            }
            boolean onTouchEvent2 = super.onTouchEvent(motionEvent);
            this.f = false;
            return onTouchEvent2;
        } catch (Throwable th) {
            this.f = false;
            throw th;
        }
    }

    public void setCancelDistance(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.p = f2;
    }

    public void setOnSeekBarChangeListener(a aVar) {
        if (aVar == null) {
            this.o = null;
        } else {
            this.o = new b(aVar);
        }
        super.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this.o);
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (!this.f && this.c && !this.b) {
            this.n = i;
        } else {
            super.setProgress(i);
        }
    }

    public CancellableSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a52.c);
        this.p = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (onSeekBarChangeListener == null) {
            this.o = null;
        } else {
            this.o = new b(onSeekBarChangeListener);
        }
        super.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this.o);
    }
}
