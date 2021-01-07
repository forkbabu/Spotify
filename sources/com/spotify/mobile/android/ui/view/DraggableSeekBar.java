package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

public class DraggableSeekBar extends SeekBar {
    private boolean a = false;
    private Drawable b;
    private b c;
    private SeekBar.OnSeekBarChangeListener f;
    private final SeekBar.OnSeekBarChangeListener n;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                DraggableSeekBar.a(DraggableSeekBar.this);
            }
            if (DraggableSeekBar.this.f != null) {
                DraggableSeekBar.this.f.onProgressChanged(seekBar, i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            if (DraggableSeekBar.this.f != null) {
                DraggableSeekBar.this.f.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (DraggableSeekBar.this.f != null) {
                DraggableSeekBar.this.f.onStopTrackingTouch(seekBar);
            }
        }
    }

    public interface b {
        void a(int i, int i2);

        void b(SeekBar seekBar);

        void c(int i, int i2);

        void d(SeekBar seekBar);

        void e(SeekBar seekBar, int i);
    }

    public DraggableSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a();
        this.n = aVar;
        super.setOnSeekBarChangeListener(aVar);
    }

    static void a(DraggableSeekBar draggableSeekBar) {
        b bVar = draggableSeekBar.c;
        if (bVar != null) {
            bVar.e(draggableSeekBar, draggableSeekBar.getProgress());
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect((getPaddingLeft() + (this.b.getBounds().left - 20)) - getThumbOffset(), getPaddingTop() + (this.b.getBounds().top - 20), (getPaddingLeft() + (this.b.getBounds().right + 20)) - getThumbOffset(), getPaddingTop() + this.b.getBounds().bottom + 20);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                super.onTouchEvent(motionEvent);
                this.a = true;
                b bVar2 = this.c;
                if (bVar2 != null) {
                    bVar2.b(this);
                }
            } else {
                float x = motionEvent.getX();
                if (this.c != null) {
                    int round = Math.round(((x - ((float) getPaddingLeft())) * ((float) getMax())) / ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())));
                    if (x < rect.exactCenterX()) {
                        this.c.c(getProgress(), round);
                    } else {
                        this.c.a(getProgress(), round);
                    }
                }
                return false;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.a && (bVar = this.c) != null) {
                bVar.d(this);
            }
            this.a = false;
            return false;
        } else {
            super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setDraggableSeekBarListener(b bVar) {
        this.c = bVar;
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f = onSeekBarChangeListener;
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        super.setThumb(drawable);
        this.b = drawable;
    }

    public DraggableSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.n = aVar;
        super.setOnSeekBarChangeListener(aVar);
    }
}
