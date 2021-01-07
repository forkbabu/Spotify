package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.facebook.appevents.i;
import com.facebook.e;
import com.facebook.h;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.f0;
import com.facebook.internal.n;
import com.facebook.k;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.o;
import com.facebook.login.t;
import com.facebook.login.widget.ToolTipPopup;
import com.facebook.r;
import com.spotify.music.C0707R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoginButton extends h {
    private ToolTipPopup A;
    private e B;
    private o C;
    private boolean r;
    private String s;
    private String t;
    private b u = new b();
    private String v = "fb_login_view_usage";
    private boolean w;
    private ToolTipPopup.Style x = ToolTipPopup.Style.BLUE;
    private ToolTipMode y;
    private long z = 6000;

    public enum ToolTipMode {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        private int intValue;
        private String stringValue;

        private ToolTipMode(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static ToolTipMode d(int i) {
            ToolTipMode[] values = values();
            for (int i2 = 0; i2 < 3; i2++) {
                ToolTipMode toolTipMode = values[i2];
                if (toolTipMode.intValue == i) {
                    return toolTipMode;
                }
            }
            return null;
        }

        public int g() {
            return this.intValue;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.stringValue;
        }
    }

    class a extends e {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.e
        public void c(com.facebook.a aVar, com.facebook.a aVar2) {
            LoginButton.this.p();
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {
        private DefaultAudience a = DefaultAudience.FRIENDS;
        private List<String> b = Collections.emptyList();
        private LoginBehavior c = LoginBehavior.NATIVE_WITH_FALLBACK;
        private String d = "rerequest";

        b() {
        }

        public String b() {
            return this.d;
        }

        public DefaultAudience c() {
            return this.a;
        }

        public LoginBehavior d() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public List<String> e() {
            return this.b;
        }

        public void f(String str) {
            this.d = str;
        }

        public void g(DefaultAudience defaultAudience) {
            this.a = defaultAudience;
        }

        public void h(LoginBehavior loginBehavior) {
            this.c = loginBehavior;
        }

        public void i(List<String> list) {
            this.b = list;
        }
    }

    /* access modifiers changed from: protected */
    public class c implements View.OnClickListener {

        /* access modifiers changed from: package-private */
        public class a implements DialogInterface.OnClickListener {
            final /* synthetic */ o a;

            a(c cVar, o oVar) {
                this.a = oVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.a.j();
            }
        }

        protected c() {
        }

        /* access modifiers changed from: protected */
        public o a() {
            o b = o.b();
            b.n(LoginButton.this.getDefaultAudience());
            b.o(LoginButton.this.getLoginBehavior());
            b.m(LoginButton.this.getAuthType());
            return b;
        }

        /* access modifiers changed from: protected */
        public void b() {
            o a2 = a();
            if (LoginButton.this.getFragment() != null) {
                a2.g(LoginButton.this.getFragment(), LoginButton.this.u.b);
            } else if (LoginButton.this.getNativeFragment() != null) {
                a2.f(LoginButton.this.getNativeFragment(), LoginButton.this.u.b);
            } else {
                a2.e(LoginButton.this.getActivity(), LoginButton.this.u.b);
            }
        }

        /* access modifiers changed from: protected */
        public void c(Context context) {
            String str;
            o a2 = a();
            if (LoginButton.this.r) {
                String string = LoginButton.this.getResources().getString(C0707R.string.com_facebook_loginview_log_out_action);
                String string2 = LoginButton.this.getResources().getString(C0707R.string.com_facebook_loginview_cancel_action);
                r c = r.c();
                if (c == null || c.getName() == null) {
                    str = LoginButton.this.getResources().getString(C0707R.string.com_facebook_loginview_logged_in_using_facebook);
                } else {
                    str = String.format(LoginButton.this.getResources().getString(C0707R.string.com_facebook_loginview_logged_in_as), c.getName());
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(str).setCancelable(true).setPositiveButton(string, new a(this, a2)).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
                builder.create().show();
                return;
            }
            a2.j();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!uf.c(this)) {
                try {
                    LoginButton.this.d(view);
                    com.facebook.a e = com.facebook.a.e();
                    if (com.facebook.a.p()) {
                        c(LoginButton.this.getContext());
                    } else {
                        b();
                    }
                    i iVar = new i(LoginButton.this.getContext());
                    Bundle bundle = new Bundle();
                    int i = 0;
                    bundle.putInt("logging_in", e != null ? 0 : 1);
                    if (com.facebook.a.p()) {
                        i = 1;
                    }
                    bundle.putInt("access_token_expired", i);
                    iVar.g(LoginButton.this.v, bundle);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    static void f(LoginButton loginButton, n nVar) {
        loginButton.getClass();
        if (nVar != null && nVar.i() && loginButton.getVisibility() == 0) {
            loginButton.n(nVar.h());
        }
    }

    private void n(String str) {
        ToolTipPopup toolTipPopup = new ToolTipPopup(str, this);
        this.A = toolTipPopup;
        toolTipPopup.f(this.x);
        this.A.e(this.z);
        this.A.g();
    }

    private int o(String str) {
        return getCompoundPaddingRight() + getCompoundDrawablePadding() + getCompoundPaddingLeft() + ((int) Math.ceil((double) getPaint().measureText(str)));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        Resources resources = getResources();
        if (isInEditMode() || !com.facebook.a.p()) {
            String str = this.s;
            if (str != null) {
                setText(str);
                return;
            }
            String string = resources.getString(C0707R.string.com_facebook_loginview_log_in_button_continue);
            int width = getWidth();
            if (width != 0 && o(string) > width) {
                string = resources.getString(C0707R.string.com_facebook_loginview_log_in_button);
            }
            setText(string);
            return;
        }
        String str2 = this.t;
        if (str2 == null) {
            str2 = resources.getString(C0707R.string.com_facebook_loginview_log_out_button);
        }
        setText(str2);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public void e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.e(context, attributeSet, i, i2);
        setInternalOnClickListener(getNewLoginClickListener());
        ToolTipMode toolTipMode = ToolTipMode.AUTOMATIC;
        this.y = toolTipMode;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t.a, i, i2);
        try {
            this.r = obtainStyledAttributes.getBoolean(0, true);
            this.s = obtainStyledAttributes.getString(1);
            this.t = obtainStyledAttributes.getString(2);
            this.y = ToolTipMode.d(obtainStyledAttributes.getInt(3, toolTipMode.g()));
            obtainStyledAttributes.recycle();
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(C0707R.color.com_facebook_blue));
                this.s = "Continue with Facebook";
            } else {
                this.B = new a();
            }
            p();
            setCompoundDrawablesWithIntrinsicBounds(i0.b(getContext(), C0707R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public String getAuthType() {
        return this.u.b();
    }

    public DefaultAudience getDefaultAudience() {
        return this.u.c();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public int getDefaultRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Login.d();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public int getDefaultStyleResource() {
        return C0707R.style.com_facebook_loginview_default_style;
    }

    public LoginBehavior getLoginBehavior() {
        return this.u.d();
    }

    /* access modifiers changed from: package-private */
    public o getLoginManager() {
        if (this.C == null) {
            this.C = o.b();
        }
        return this.C;
    }

    /* access modifiers changed from: protected */
    public c getNewLoginClickListener() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public List<String> getPermissions() {
        return this.u.e();
    }

    public long getToolTipDisplayTime() {
        return this.z;
    }

    public ToolTipMode getToolTipMode() {
        return this.y;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.B;
        if (eVar != null && !eVar.b()) {
            this.B.d();
            p();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.B;
        if (eVar != null) {
            eVar.e();
        }
        ToolTipPopup toolTipPopup = this.A;
        if (toolTipPopup != null) {
            toolTipPopup.d();
            this.A = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.w && !isInEditMode()) {
            this.w = true;
            int ordinal = this.y.ordinal();
            if (ordinal == 0) {
                k.l().execute(new a(this, f0.q(getContext())));
            } else if (ordinal == 1) {
                n(getResources().getString(C0707R.string.com_facebook_tooltip_default));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        p();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        int compoundPaddingBottom = getCompoundPaddingBottom() + getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.bottom) + Math.abs(fontMetrics.top))));
        Resources resources = getResources();
        String str = this.s;
        if (str == null) {
            str = resources.getString(C0707R.string.com_facebook_loginview_log_in_button_continue);
            int o = o(str);
            if (Button.resolveSize(o, i) < o) {
                str = resources.getString(C0707R.string.com_facebook_loginview_log_in_button);
            }
        }
        int o2 = o(str);
        String str2 = this.t;
        if (str2 == null) {
            str2 = resources.getString(C0707R.string.com_facebook_loginview_log_out_button);
        }
        setMeasuredDimension(Button.resolveSize(Math.max(o2, o(str2)), i), compoundPaddingBottom);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        ToolTipPopup toolTipPopup;
        super.onVisibilityChanged(view, i);
        if (i != 0 && (toolTipPopup = this.A) != null) {
            toolTipPopup.d();
            this.A = null;
        }
    }

    public void setAuthType(String str) {
        this.u.f(str);
    }

    public void setDefaultAudience(DefaultAudience defaultAudience) {
        this.u.g(defaultAudience);
    }

    public void setLoginBehavior(LoginBehavior loginBehavior) {
        this.u.h(loginBehavior);
    }

    /* access modifiers changed from: package-private */
    public void setLoginManager(o oVar) {
        this.C = oVar;
    }

    public void setLoginText(String str) {
        this.s = str;
        p();
    }

    public void setLogoutText(String str) {
        this.t = str;
        p();
    }

    public void setPermissions(List<String> list) {
        this.u.i(list);
    }

    /* access modifiers changed from: package-private */
    public void setProperties(b bVar) {
        this.u = bVar;
    }

    public void setPublishPermissions(List<String> list) {
        this.u.i(list);
    }

    public void setReadPermissions(List<String> list) {
        this.u.i(list);
    }

    public void setToolTipDisplayTime(long j) {
        this.z = j;
    }

    public void setToolTipMode(ToolTipMode toolTipMode) {
        this.y = toolTipMode;
    }

    public void setToolTipStyle(ToolTipPopup.Style style) {
        this.x = style;
    }

    public void setPermissions(String... strArr) {
        this.u.i(Arrays.asList(strArr));
    }

    public void setPublishPermissions(String... strArr) {
        this.u.i(Arrays.asList(strArr));
    }

    public void setReadPermissions(String... strArr) {
        this.u.i(Arrays.asList(strArr));
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }
}
