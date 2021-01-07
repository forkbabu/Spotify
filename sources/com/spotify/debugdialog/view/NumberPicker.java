package com.spotify.debugdialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.spotify.music.C0707R;
import java.util.Locale;

public class NumberPicker extends FrameLayout {
    private float a;
    private float b;
    private float c;
    private SeekBar f;
    private TextView n;
    private TextView o;
    private d p = new a(this);

    class a implements d {
        a(NumberPicker numberPicker) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements SeekBar.OnSeekBarChangeListener {
        b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            NumberPicker.this.e();
            if (z) {
                d dVar = NumberPicker.this.p;
                NumberPicker.this.getValue();
                ((a) dVar).getClass();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ((a) NumberPicker.this.p).getClass();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ((a) NumberPicker.this.p).getClass();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements ViewTreeObserver.OnPreDrawListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            NumberPicker.this.n.getViewTreeObserver().removeOnPreDrawListener(this);
            NumberPicker.this.e();
            return true;
        }
    }

    public interface d {
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private float getNormalizedValue() {
        return ((float) this.f.getProgress()) / ((float) this.f.getMax());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getValue() {
        float f2 = this.b;
        float f3 = this.a;
        return ((f2 - f3) * getNormalizedValue()) + f3;
    }

    public void d() {
        LayoutInflater.from(getContext()).inflate(C0707R.layout.int_picker, (ViewGroup) this, true);
        this.f = (SeekBar) findViewById(C0707R.id.seek_bar);
        this.n = (TextView) findViewById(C0707R.id.text);
        this.o = (TextView) findViewById(C0707R.id.title);
        this.a = 0.0f;
        this.b = 1.0f;
        this.c = 0.01f;
        this.f.setMax((int) 100.0f);
        e();
        this.f.setOnSeekBarChangeListener(new b());
        this.n.getViewTreeObserver().addOnPreDrawListener(new c());
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.n.setText(String.format(Locale.US, "%.2f", Float.valueOf(getValue())));
        int g = nud.g(16.0f, getResources());
        int width = this.n.getWidth();
        int thumbOffset = this.f.getThumbOffset() + this.f.getLeft() + g;
        this.n.setX((float) ((int) (((((float) ((this.f.getMeasuredWidth() - (this.f.getThumbOffset() * 2)) - (g * 2))) * getNormalizedValue()) + ((float) thumbOffset)) - ((float) (width / 2)))));
    }

    public void setListener(d dVar) {
        this.p = dVar;
    }

    public void setTitle(String str) {
        this.o.setText(str);
    }

    public void setValue(float f2) {
        float f3 = this.a;
        SeekBar seekBar = this.f;
        seekBar.setProgress((int) (((f2 - f3) / (this.b - f3)) * ((float) seekBar.getMax())));
        e();
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }
}
