package com.spotify.libs.onboarding.allboarding.picker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.navigation.e;
import com.spotify.libs.onboarding.allboarding.c;
import com.spotify.music.C0707R;
import dagger.android.support.DaggerDialogFragment;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class SkipDialogFragment extends DaggerDialogFragment {
    public rw0 v0;
    private final e w0 = new e(j.b(x.class), new SkipDialogFragment$$special$$inlined$navArgs$1(this));

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        public a(int i, Object obj, Object obj2) {
            this.a = i;
            this.b = obj;
            this.c = obj2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                SkipDialogFragment.b5((SkipDialogFragment) this.b, ((b) this.c).d());
                rw0 rw0 = ((SkipDialogFragment) this.b).v0;
                if (rw0 != null) {
                    rw0.j();
                } else {
                    h.k("pickerLogger");
                    throw null;
                }
            } else if (i == 1) {
                SkipDialogFragment.a5((SkipDialogFragment) this.b);
                rw0 rw02 = ((SkipDialogFragment) this.b).v0;
                if (rw02 != null) {
                    rw02.h();
                } else {
                    h.k("pickerLogger");
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    private static final class b {
        private final Integer a;
        private final int b;
        private final int c;
        private final Integer d;
        private final boolean e;

        public b(Integer num, int i, int i2, Integer num2, boolean z) {
            this.a = null;
            this.b = i;
            this.c = i2;
            this.d = null;
            this.e = z;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }

        public final Integer c() {
            return this.d;
        }

        public final boolean d() {
            return this.e;
        }

        public final Integer e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && h.a(this.d, bVar.d) && this.e == bVar.e;
        }

        public int hashCode() {
            Integer num = this.a;
            int i = 0;
            int hashCode = (((((num != null ? num.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
            Integer num2 = this.d;
            if (num2 != null) {
                i = num2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SkipDialogData(title=");
            V0.append(this.a);
            V0.append(", body=");
            V0.append(this.b);
            V0.append(", primaryBtn=");
            V0.append(this.c);
            V0.append(", secondaryBtn=");
            V0.append(this.d);
            V0.append(", shouldSendSkipped=");
            return je.P0(V0, this.e, ")");
        }

        public b(Integer num, int i, int i2, Integer num2, boolean z, int i3) {
            num = (i3 & 1) != 0 ? null : num;
            num2 = (i3 & 8) != 0 ? null : num2;
            z = (i3 & 16) != 0 ? true : z;
            this.a = num;
            this.b = i;
            this.c = i2;
            this.d = num2;
            this.e = z;
        }
    }

    public static final void a5(SkipDialogFragment skipDialogFragment) {
        skipDialogFragment.c5(false);
    }

    public static final void b5(SkipDialogFragment skipDialogFragment, boolean z) {
        skipDialogFragment.c5(z);
    }

    private final void c5(boolean z) {
        androidx.navigation.h h = c.e(this).h();
        h.c(h);
        h.d(h, "findNavController()\n    ….previousBackStackEntry!!");
        h.d().e("skipDialogResult", Boolean.valueOf(z));
        M4();
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        b bVar;
        h.e(view, "contentView");
        rw0 rw0 = this.v0;
        if (rw0 != null) {
            rw0.k();
            if (((x) this.w0.getValue()).a()) {
                bVar = new b(Integer.valueOf((int) C0707R.string.allboarding_skip_dialog_title), C0707R.string.allboarding_skip_dialog_body, C0707R.string.allboarding_skip_dialog_skip, Integer.valueOf((int) C0707R.string.allboarding_skip_dialog_continue), false, 16);
            } else {
                bVar = new b(null, C0707R.string.allboarding_lo_skip_dialog_body, C0707R.string.allboarding_lo_skip_dialog_continue, null, false);
            }
            TextView textView = (TextView) view.findViewById(C0707R.id.allboarding_skip_dialog_title);
            h.d(textView, "title");
            int i = 0;
            textView.setVisibility(bVar.e() != null ? 0 : 8);
            Integer e = bVar.e();
            if (e != null) {
                textView.setText(e.intValue());
            }
            ((TextView) view.findViewById(C0707R.id.allboarding_skip_dialog_body)).setText(bVar.a());
            Button button = (Button) view.findViewById(C0707R.id.allboarding_skip_dialog_skip_button);
            button.setText(bVar.b());
            button.setOnClickListener(new a(0, this, bVar));
            rw0 rw02 = this.v0;
            if (rw02 != null) {
                rw02.i();
                Button button2 = (Button) view.findViewById(C0707R.id.allboarding_skip_dialog_continue_button);
                h.d(button2, "secondary");
                if (!(bVar.c() != null)) {
                    i = 8;
                }
                button2.setVisibility(i);
                Integer c = bVar.c();
                if (c != null) {
                    button2.setText(c.intValue());
                }
                button2.setOnClickListener(new a(1, this, bVar));
                rw0 rw03 = this.v0;
                if (rw03 != null) {
                    rw03.g();
                } else {
                    h.k("pickerLogger");
                    throw null;
                }
            } else {
                h.k("pickerLogger");
                throw null;
            }
        } else {
            h.k("pickerLogger");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        V4(0, C0707R.style.res_2132083498_theme_glue_dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        return layoutInflater.inflate(C0707R.layout.allboarding_skip_dialog, viewGroup, false);
    }
}
