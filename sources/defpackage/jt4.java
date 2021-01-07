package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.music.C0707R;

/* renamed from: jt4  reason: default package */
public class jt4 extends BottomSheetBehavior.d {
    private final BottomSheetBehavior<?> a;
    private final View b;
    private final View c;
    private final int d;
    private Runnable e;

    public jt4(View view) {
        BottomSheetBehavior<?> o = BottomSheetBehavior.o(view.findViewById(C0707R.id.picker_mini_bottom_sheet));
        this.a = o;
        this.b = view.findViewById(C0707R.id.picker_mini_volume_container);
        this.c = view.findViewById(C0707R.id.volume_bar);
        view.findViewById(C0707R.id.picker_mini_container).setOnClickListener(new it4(this));
        this.d = view.getResources().getInteger(C0707R.integer.mini_picker_transition_ms);
        o.x(5);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public void a(View view, float f) {
        if (this.b.getVisibility() != 0) {
            return;
        }
        if (f <= 0.0f) {
            this.b.setTranslationY(Math.abs(f) * ((float) this.c.getHeight()));
            return;
        }
        this.b.setTranslationY(0.0f);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public void b(View view, int i) {
        Runnable runnable;
        if (5 == i && (runnable = this.e) != null) {
            runnable.run();
        } else if (3 == i) {
            this.a.w(true);
        }
    }

    public void c() {
        this.a.x(5);
    }

    public void d() {
        this.a.i(this);
        this.b.postDelayed(new ht4(this), (long) this.d);
    }

    public boolean e() {
        return 4 == this.a.q();
    }

    public /* synthetic */ void f() {
        this.a.x(4);
    }

    public void g(View view) {
        this.a.x(5);
    }

    public void h(Runnable runnable) {
        this.e = runnable;
    }
}
