package com.spotify.music.features.connectui.picker.frictionlessjoin.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a;
import defpackage.d5;
import defpackage.f5;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class GroupSessionViewImpl extends ConstraintLayout implements a {
    private SwitchCompat a;
    private View b;
    private TextView c;
    private TextView f;

    static final class a implements View.OnClickListener {
        final /* synthetic */ cmf a;

        a(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements f5 {
        final /* synthetic */ GroupSessionViewImpl a;

        b(GroupSessionViewImpl groupSessionViewImpl) {
            this.a = groupSessionViewImpl;
        }

        @Override // defpackage.f5
        public final boolean a(View view, f5.a aVar) {
            h.e(view, "<anonymous parameter 0>");
            return this.a.a.performClick();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupSessionViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        ViewGroup.inflate(getContext(), C0707R.layout.group_session_view, this);
        View findViewById = findViewById(C0707R.id.toggle_switch);
        h.d(findViewById, "findViewById(R.id.toggle_switch)");
        this.a = (SwitchCompat) findViewById;
        View findViewById2 = findViewById(C0707R.id.picker_device_leave_button);
        h.d(findViewById2, "findViewById(R.id.picker_device_leave_button)");
        this.b = findViewById2;
        View findViewById3 = findViewById(C0707R.id.tv_title);
        h.d(findViewById3, "findViewById(R.id.tv_title)");
        this.c = (TextView) findViewById3;
        View findViewById4 = findViewById(C0707R.id.tv_message);
        h.d(findViewById4, "findViewById(R.id.tv_message)");
        this.f = (TextView) findViewById4;
    }

    private final void E() {
        String str;
        if (this.a.isChecked()) {
            str = getContext().getString(C0707R.string.accessibility_action_toggle_off);
        } else {
            str = getContext().getString(C0707R.string.accessibility_action_toggle_on);
        }
        h.d(str, "if (isChecked) {\n       …ibility_action_toggle_on)");
        q4.E(this, d5.a.g, str, new b(this));
    }

    private final void setUpAccessibilityForMode(a.AbstractC0219a aVar) {
        if (aVar instanceof a.AbstractC0219a.C0220a) {
            E();
        } else if (aVar instanceof a.AbstractC0219a.b) {
            String string = getContext().getString(C0707R.string.accessibility_action_leave_button);
            h.d(string, "context.getString(R.stri…lity_action_leave_button)");
            q4.E(this, d5.a.g, string, new d(this));
        }
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a
    public void a() {
        setVisibility(0);
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a
    public void b() {
        setVisibility(8);
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a
    public void d(String str) {
        h.e(str, "title");
        this.c.setText(str);
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a
    public void j(a.AbstractC0219a aVar) {
        h.e(aVar, "mode");
        if (aVar instanceof a.AbstractC0219a.C0220a) {
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        } else if (aVar instanceof a.AbstractC0219a.b) {
            this.a.setVisibility(8);
            this.b.setVisibility(0);
        }
        setUpAccessibilityForMode(aVar);
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a
    public void setGroupSessionOn(boolean z) {
        this.a.setChecked(z);
        E();
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a
    public void setOnGroupSessionLeaveClickListener(cmf<f> cmf) {
        h.e(cmf, "function");
        this.b.setOnClickListener(new a(cmf));
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a
    public void setOnGroupSessionSwitchListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        h.e(onCheckedChangeListener, "listener");
        this.a.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a
    public void x(String str) {
        h.e(str, "message");
        this.f.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupSessionViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        ViewGroup.inflate(getContext(), C0707R.layout.group_session_view, this);
        View findViewById = findViewById(C0707R.id.toggle_switch);
        h.d(findViewById, "findViewById(R.id.toggle_switch)");
        this.a = (SwitchCompat) findViewById;
        View findViewById2 = findViewById(C0707R.id.picker_device_leave_button);
        h.d(findViewById2, "findViewById(R.id.picker_device_leave_button)");
        this.b = findViewById2;
        View findViewById3 = findViewById(C0707R.id.tv_title);
        h.d(findViewById3, "findViewById(R.id.tv_title)");
        this.c = (TextView) findViewById3;
        View findViewById4 = findViewById(C0707R.id.tv_message);
        h.d(findViewById4, "findViewById(R.id.tv_message)");
        this.f = (TextView) findViewById4;
    }
}
