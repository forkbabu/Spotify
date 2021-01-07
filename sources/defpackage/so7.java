package defpackage;

import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.paste.app.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobius.g;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.editprofile.EditProfileActivity;
import com.spotify.music.features.profile.editprofile.p;
import com.spotify.music.features.profile.saveprofile.domain.r;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorButton;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import com.spotify.remoteconfig.s6;
import defpackage.lm7;
import io.reactivex.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: so7  reason: default package */
public class so7 implements ro7, g<mm7, lm7> {
    private final EditProfileActivity a;
    private final lqa b;
    private final s6 c;
    private final y f;
    private final StateListAnimatorImageButton n;
    private final StateListAnimatorButton o;
    private final ViewGroup p;
    private final ImageView q;
    private final Button r;
    private final EditText s;
    private final TextView t;
    private final qu7 u;
    private final p v;

    /* renamed from: so7$a */
    class a implements TextWatcher {
        final /* synthetic */ da2 a;

        a(so7 so7, da2 da2) {
            this.a = da2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null) {
                da2 da2 = this.a;
                String charSequence2 = charSequence.toString();
                h.e(charSequence2, "displayName");
                da2.accept(new lm7.k(charSequence2));
            }
        }
    }

    /* renamed from: so7$b */
    class b implements com.spotify.mobius.h<mm7> {
        final /* synthetic */ PublishSubject a;
        final /* synthetic */ io.reactivex.disposables.a b;

        b(PublishSubject publishSubject, io.reactivex.disposables.a aVar) {
            this.a = publishSubject;
            this.b = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
            if (r8.subSequence(r5, r4 + 1).toString().isEmpty() == false) goto L_0x0054;
         */
        @Override // com.spotify.mobius.h, defpackage.da2
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(java.lang.Object r8) {
            /*
                r7 = this;
                mm7 r8 = (defpackage.mm7) r8
                io.reactivex.subjects.PublishSubject r0 = r7.a
                r0.onNext(r8)
                so7 r0 = defpackage.so7.this
                com.spotify.paste.widgets.internal.StateListAnimatorButton r0 = defpackage.so7.a(r0)
                boolean r1 = r8.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0053
                com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.whitespace()
                java.lang.String r8 = r8.e()
                r1.getClass()
                int r4 = r8.length()
                r5 = 0
            L_0x0025:
                if (r5 >= r4) goto L_0x0035
                char r6 = r8.charAt(r5)
                boolean r6 = r1.matches(r6)
                if (r6 != 0) goto L_0x0032
                goto L_0x0035
            L_0x0032:
                int r5 = r5 + 1
                goto L_0x0025
            L_0x0035:
                int r4 = r4 + -1
                if (r4 <= r5) goto L_0x0043
                char r6 = r8.charAt(r4)
                boolean r6 = r1.matches(r6)
                if (r6 != 0) goto L_0x0035
            L_0x0043:
                int r4 = r4 + r2
                java.lang.CharSequence r8 = r8.subSequence(r5, r4)
                java.lang.String r8 = r8.toString()
                boolean r8 = r8.isEmpty()
                if (r8 != 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r2 = 0
            L_0x0054:
                r0.setEnabled(r2)
                so7 r8 = defpackage.so7.this
                android.widget.Button r8 = defpackage.so7.c(r8)
                so7 r0 = defpackage.so7.this
                com.spotify.remoteconfig.s6 r0 = defpackage.so7.b(r0)
                boolean r0 = r0.a()
                if (r0 == 0) goto L_0x006a
                goto L_0x006c
            L_0x006a:
                r3 = 8
            L_0x006c:
                r8.setVisibility(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.so7.b.accept(java.lang.Object):void");
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            so7.this.u.h(null, null);
            so7.this.u.d();
            this.b.dispose();
        }
    }

    public so7(EditProfileActivity editProfileActivity, LayoutInflater layoutInflater, ViewGroup viewGroup, lqa lqa, s6 s6Var, y yVar, qu7 qu7, p pVar) {
        this.a = editProfileActivity;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.activity_editprofile, viewGroup, false);
        this.p = viewGroup2;
        this.q = (ImageView) viewGroup2.findViewById(C0707R.id.edit_image);
        this.r = (Button) viewGroup2.findViewById(C0707R.id.change_photo);
        this.s = (EditText) viewGroup2.findViewById(C0707R.id.edit_displayname);
        this.t = (TextView) viewGroup2.findViewById(C0707R.id.edit_displayname_info);
        this.b = lqa;
        this.c = s6Var;
        this.f = yVar;
        this.u = qu7;
        this.v = pVar;
        com.spotify.android.goldenpath.a.b(editProfileActivity);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0707R.id.toolbar_wrapper);
        e eVar = (e) l70.c(editProfileActivity, viewGroup3);
        eVar.setTitle(editProfileActivity.getString(C0707R.string.edit_profile_title));
        d.d(eVar.getView(), editProfileActivity);
        viewGroup3.addView(eVar.getView());
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(editProfileActivity);
        this.n = stateListAnimatorImageButton;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        stateListAnimatorImageButton.setBackground(null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(editProfileActivity, SpotifyIconV2.X, (float) editProfileActivity.getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(androidx.core.content.a.b(editProfileActivity.getBaseContext(), R.color.white));
        stateListAnimatorImageButton.setImageDrawable(spotifyIconDrawable);
        stateListAnimatorImageButton.setContentDescription(editProfileActivity.getString(C0707R.string.generic_content_description_close));
        eVar.H1(ToolbarSide.START, stateListAnimatorImageButton, C0707R.id.toolbar_up_button);
        StateListAnimatorButton stateListAnimatorButton = new StateListAnimatorButton(editProfileActivity);
        this.o = stateListAnimatorButton;
        stateListAnimatorButton.setBackground(null);
        stateListAnimatorButton.setText(C0707R.string.edit_profile_save_button);
        nud.p(editProfileActivity, stateListAnimatorButton, C0707R.attr.pasteActionBarTitleTextAppearance);
        stateListAnimatorButton.setPadding(0, 0, 0, 0);
        eVar.H1(ToolbarSide.END, stateListAnimatorButton, C0707R.id.toolbar_save_button);
    }

    public static void g(so7 so7, mm7 mm7) {
        so7.getClass();
        int c2 = mm7.c() - 16777216;
        if (!mm7.h()) {
            so7.b.a(so7.q, mm7.i(), mm7.p(), mm7.e(), false, Integer.valueOf(c2));
        } else if (MoreObjects.isNullOrEmpty(mm7.j())) {
            so7.b.a(so7.q, null, mm7.p(), mm7.e(), false, Integer.valueOf(c2));
        } else {
            so7.b.a(so7.q, mm7.j(), mm7.p(), mm7.e(), false, Integer.valueOf(c2));
        }
    }

    public static void h(so7 so7, r rVar) {
        so7.u.j(rVar);
    }

    public static void i(so7 so7, String str) {
        so7.s.setText(str);
    }

    public static void o(so7 so7, boolean z) {
        so7.getClass();
        if (z && !so7.u.e()) {
            View currentFocus = so7.a.getCurrentFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) so7.a.getSystemService("input_method");
            if (!(inputMethodManager == null || currentFocus == null)) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
            so7.u.i();
        } else if (!z && so7.u.e()) {
            so7.u.d();
        }
    }

    public void e() {
        int i = this.a.getResources().getConfiguration().orientation;
        EditProfileActivity editProfileActivity = this.a;
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        editProfileActivity.setRequestedOrientation(i2);
        EditProfileActivity editProfileActivity2 = this.a;
        editProfileActivity2.getClass();
        int i3 = androidx.core.app.a.c;
        if (Build.VERSION.SDK_INT >= 21) {
            editProfileActivity2.finishAfterTransition();
        } else {
            editProfileActivity2.finish();
        }
    }

    public View f() {
        return this.p;
    }

    public /* synthetic */ void j(da2 da2, View view) {
        this.v.t();
        da2.accept(lm7.u.a);
    }

    public /* synthetic */ void k(da2 da2, View view) {
        da2.accept(lm7.n.a);
        this.v.k();
    }

    public /* synthetic */ void l(da2 da2, View view) {
        da2.accept(lm7.f.a);
        this.v.c();
    }

    public /* synthetic */ void m(View view, boolean z) {
        if (z) {
            Editable text = this.s.getText();
            int length = text.length();
            if (length > 30) {
                text.delete(30, length);
                this.t.setText(this.a.getResources().getQuantityString(C0707R.plurals.edit_profile_notice_character_cap, 30, 30));
            }
            this.s.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        }
    }

    public /* synthetic */ void n(Boolean bool) {
        this.v.h();
    }

    @Override // com.spotify.mobius.g
    public com.spotify.mobius.h<mm7> t(da2<lm7> da2) {
        this.n.setOnClickListener(new yn7(da2));
        this.o.setOnClickListener(new fo7(this, da2));
        if (this.c.a()) {
            this.q.setOnClickListener(new do7(this, da2));
        }
        this.r.setOnClickListener(new ao7(this, da2));
        this.u.h(new xn7(da2), new jo7(da2));
        this.s.setOnFocusChangeListener(new co7(this));
        this.s.addTextChangedListener(new a(this, da2));
        PublishSubject h1 = PublishSubject.h1();
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        aVar.b(h1.j0(mo7.a).Q(oo7.a).N0(1).subscribe(new go7(this)));
        aVar.b(h1.F(bo7.a).subscribe(new eo7(this)));
        aVar.b(h1.j0(pn7.a).P0(zn7.a).subscribe(new io7(this)));
        s E = h1.j0(no7.a).E().N(new ho7(this)).j0(lo7.a).E();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y yVar = this.f;
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            aVar.b(new ObservableThrottleLatest(E, 1000, timeUnit, yVar, false).subscribe(new ko7(this)));
            return new b(h1, aVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }
}
