package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import java.util.Locale;
import me.grantland.widget.a;

/* renamed from: iy4  reason: default package */
public class iy4 implements tc0, qc0 {
    private final View a;
    private final EditText b;
    private final TextView c;
    private final View f;
    private final ImageView n;
    private final EditText o;
    private final TextView p;
    private final Button q;
    private final Button r;
    private final TextView s;

    public iy4(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.edit_playlist_header, viewGroup, false);
        this.a = inflate;
        View findViewById = inflate.findViewById(C0707R.id.description_container);
        findViewById.getClass();
        this.f = findViewById;
        View findViewById2 = inflate.findViewById(C0707R.id.cover_art_image);
        findViewById2.getClass();
        this.n = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C0707R.id.change_image);
        findViewById3.getClass();
        this.r = (Button) findViewById3;
        View findViewById4 = inflate.findViewById(C0707R.id.add_description_button);
        findViewById4.getClass();
        Button button = (Button) findViewById4;
        this.q = button;
        View findViewById5 = inflate.findViewById(C0707R.id.description_edit_text);
        findViewById5.getClass();
        EditText editText = (EditText) findViewById5;
        this.o = editText;
        View findViewById6 = inflate.findViewById(C0707R.id.description_text);
        findViewById6.getClass();
        this.p = (TextView) findViewById6;
        View findViewById7 = inflate.findViewById(C0707R.id.title_edit_text);
        findViewById7.getClass();
        EditText editText2 = (EditText) findViewById7;
        this.b = editText2;
        View findViewById8 = inflate.findViewById(C0707R.id.title_text);
        findViewById8.getClass();
        this.c = (TextView) findViewById8;
        View findViewById9 = inflate.findViewById(C0707R.id.character_count_text);
        findViewById9.getClass();
        this.s = (TextView) findViewById9;
        editText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        a.d(editText2).o(2, 14.0f);
        editText.setRawInputType(1);
        button.setOnClickListener(new zx4(this, ay4.a));
        editText2.clearFocus();
        editText.clearFocus();
    }

    public void A1(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
    }

    public /* synthetic */ void E(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.o.sendAccessibilityEvent(8);
    }

    public void E1(boolean z) {
        this.p.setVisibility(z ? 0 : 8);
    }

    public void I0(boolean z) {
        this.q.setVisibility(z ? 0 : 8);
    }

    public View J() {
        View view = new View(this.a.getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setOnTouchListener(new by4(this));
        return view;
    }

    public void J0(boolean z) {
        int i = 0;
        this.b.setVisibility(z ? 0 : 8);
        TextView textView = this.c;
        if (z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void P0(int i, int i2) {
        this.s.setText(String.format(Locale.US, "%d/%d", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public void S0(boolean z) {
        this.s.setVisibility(z ? 0 : 8);
    }

    public void W(View.OnClickListener onClickListener) {
        this.q.setOnClickListener(new zx4(this, onClickListener));
    }

    public void Z0(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    public Button b() {
        return this.r;
    }

    public void b1(String str) {
        this.p.setText(str);
        this.o.setText(str);
    }

    public ImageView c() {
        return this.n;
    }

    public EditText d() {
        return this.o;
    }

    @Override // defpackage.tc0
    public void e0(int i, float f2) {
        this.a.setTranslationY((float) i);
    }

    public EditText g() {
        return this.b;
    }

    @Override // defpackage.qc0, com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    public void setText(String str) {
        this.b.setText(str);
        this.c.setText(str);
    }

    public boolean w(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.b.isFocused()) {
            Rect rect = new Rect();
            this.b.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.b.clearFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) this.a.getContext().getSystemService("input_method");
                inputMethodManager.getClass();
                inputMethodManager.hideSoftInputFromWindow(this.b.getWindowToken(), 0);
                this.b.clearFocus();
            }
        }
        return false;
    }

    public void z1(boolean z) {
        int i = 0;
        this.n.setVisibility(z ? 0 : 8);
        Button button = this.r;
        if (!z) {
            i = 8;
        }
        button.setVisibility(i);
    }
}
