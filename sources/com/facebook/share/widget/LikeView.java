package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.internal.a0;
import com.facebook.internal.f0;
import com.facebook.internal.q;
import com.facebook.share.internal.LikeBoxCountView;
import com.facebook.share.internal.e;
import com.facebook.share.internal.n;
import com.spotify.music.C0707R;

@Deprecated
public class LikeView extends FrameLayout {
    private boolean A;
    private String a;
    private ObjectType b;
    private LinearLayout c;
    private n f;
    private LikeBoxCountView n;
    private TextView o;
    private e p;
    private c q;
    private BroadcastReceiver r;
    private a s;
    private Style t;
    private HorizontalAlignment u;
    private AuxiliaryViewPosition v;
    private int w = -1;
    private int x;
    private int y;
    private q z;

    @Deprecated
    public enum AuxiliaryViewPosition {
        BOTTOM("bottom", 0),
        INLINE("inline", 1),
        TOP("top", 2);
        
        private int intValue;
        private String stringValue;

        private AuxiliaryViewPosition(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        static int d(AuxiliaryViewPosition auxiliaryViewPosition) {
            return auxiliaryViewPosition.intValue;
        }

        static AuxiliaryViewPosition g(int i) {
            AuxiliaryViewPosition[] values = values();
            for (int i2 = 0; i2 < 3; i2++) {
                AuxiliaryViewPosition auxiliaryViewPosition = values[i2];
                if (auxiliaryViewPosition.intValue == i) {
                    return auxiliaryViewPosition;
                }
            }
            return null;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.stringValue;
        }
    }

    @Deprecated
    public enum HorizontalAlignment {
        CENTER("center", 0),
        LEFT("left", 1),
        RIGHT("right", 2);
        
        private int intValue;
        private String stringValue;

        private HorizontalAlignment(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        static int d(HorizontalAlignment horizontalAlignment) {
            return horizontalAlignment.intValue;
        }

        static HorizontalAlignment g(int i) {
            HorizontalAlignment[] values = values();
            for (int i2 = 0; i2 < 3; i2++) {
                HorizontalAlignment horizontalAlignment = values[i2];
                if (horizontalAlignment.intValue == i) {
                    return horizontalAlignment;
                }
            }
            return null;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.stringValue;
        }
    }

    @Deprecated
    public enum ObjectType {
        UNKNOWN("unknown", 0),
        OPEN_GRAPH("open_graph", 1),
        PAGE("page", 2);
        
        private int intValue;
        private String stringValue;

        private ObjectType(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static ObjectType d(int i) {
            ObjectType[] values = values();
            for (int i2 = 0; i2 < 3; i2++) {
                ObjectType objectType = values[i2];
                if (objectType.intValue == i) {
                    return objectType;
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

    @Deprecated
    public enum Style {
        STANDARD("standard", 0),
        BUTTON("button", 1),
        BOX_COUNT("box_count", 2);
        
        private int intValue;
        private String stringValue;

        private Style(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        static int d(Style style) {
            return style.intValue;
        }

        static Style g(int i) {
            Style[] values = values();
            for (int i2 = 0; i2 < 3; i2++) {
                Style style = values[i2];
                if (style.intValue == i) {
                    return style;
                }
            }
            return null;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.stringValue;
        }
    }

    /* access modifiers changed from: private */
    public class a implements e.AbstractC0076e {
        private boolean a;

        a(a aVar) {
        }

        @Override // com.facebook.share.internal.e.AbstractC0076e
        public void a(e eVar, FacebookException facebookException) {
            if (!this.a) {
                if (eVar != null) {
                    facebookException = new FacebookException("Cannot use LikeView. The device may not be supported.");
                    LikeView.b(LikeView.this, eVar);
                    LikeView.this.k();
                }
                if (!(facebookException == null || LikeView.this.q == null)) {
                    LikeView.this.q.a(facebookException);
                }
                LikeView.this.s = null;
            }
        }

        public void b() {
            this.a = true;
        }
    }

    /* access modifiers changed from: private */
    public class b extends BroadcastReceiver {
        b(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            boolean z = true;
            if (extras != null) {
                String string = extras.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                if (!f0.C(string) && !f0.b(LikeView.this.a, string)) {
                    z = false;
                }
            }
            if (z) {
                if ("com.facebook.sdk.LikeActionController.UPDATED".equals(action)) {
                    LikeView.this.k();
                } else if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(action)) {
                    if (LikeView.this.q != null) {
                        LikeView.this.q.a(a0.l(extras));
                    }
                } else if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(action)) {
                    LikeView likeView = LikeView.this;
                    likeView.i(likeView.a, LikeView.this.b);
                    LikeView.this.k();
                }
            }
        }
    }

    public interface c {
        void a(FacebookException facebookException);
    }

    @Deprecated
    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        Style style = Style.STANDARD;
        this.t = style;
        HorizontalAlignment horizontalAlignment = HorizontalAlignment.CENTER;
        this.u = horizontalAlignment;
        AuxiliaryViewPosition auxiliaryViewPosition = AuxiliaryViewPosition.BOTTOM;
        this.v = auxiliaryViewPosition;
        boolean z2 = true;
        this.A = true;
        if (!(attributeSet == null || getContext() == null || (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.facebook.common.b.a)) == null)) {
            this.a = f0.f(obtainStyledAttributes.getString(3), null);
            this.b = ObjectType.d(obtainStyledAttributes.getInt(4, ObjectType.UNKNOWN.g()));
            Style g = Style.g(obtainStyledAttributes.getInt(5, Style.d(style)));
            this.t = g;
            if (g != null) {
                AuxiliaryViewPosition g2 = AuxiliaryViewPosition.g(obtainStyledAttributes.getInt(0, AuxiliaryViewPosition.d(auxiliaryViewPosition)));
                this.v = g2;
                if (g2 != null) {
                    HorizontalAlignment g3 = HorizontalAlignment.g(obtainStyledAttributes.getInt(2, HorizontalAlignment.d(horizontalAlignment)));
                    this.u = g3;
                    if (g3 != null) {
                        this.w = obtainStyledAttributes.getColor(1, -1);
                        obtainStyledAttributes.recycle();
                    } else {
                        throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
                }
            } else {
                throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
            }
        }
        this.x = getResources().getDimensionPixelSize(C0707R.dimen.com_facebook_likeview_edge_padding);
        this.y = getResources().getDimensionPixelSize(C0707R.dimen.com_facebook_likeview_internal_padding);
        if (this.w == -1) {
            this.w = getResources().getColor(C0707R.color.com_facebook_likeview_text_color);
        }
        setBackgroundColor(0);
        this.c = new LinearLayout(context);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        e eVar = this.p;
        n nVar = new n(context, (eVar == null || !eVar.Q()) ? false : z2);
        this.f = nVar;
        nVar.setOnClickListener(new a(this));
        this.f.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(context);
        this.o = textView;
        textView.setTextSize(0, getResources().getDimension(C0707R.dimen.com_facebook_likeview_text_size));
        this.o.setMaxLines(2);
        this.o.setTextColor(this.w);
        this.o.setGravity(17);
        this.o.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        this.n = new LikeBoxCountView(context);
        this.n.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.c.addView(this.f);
        this.c.addView(this.o);
        this.c.addView(this.n);
        addView(this.c);
        i(this.a, this.b);
        k();
    }

    static void b(LikeView likeView, e eVar) {
        likeView.p = eVar;
        likeView.r = new b(null);
        e6 b2 = e6.b(likeView.getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        b2.c(likeView.r, intentFilter);
    }

    static void d(LikeView likeView) {
        if (likeView.p != null) {
            Activity activity = null;
            if (likeView.z == null) {
                activity = likeView.getActivity();
            }
            likeView.p.V(activity, likeView.z, likeView.getAnalyticsParameters());
        }
    }

    private Activity getActivity() {
        boolean z2;
        Context context = getContext();
        while (true) {
            z2 = context instanceof Activity;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z2) {
            return (Activity) context;
        }
        throw new FacebookException("Unable to get Activity.");
    }

    private Bundle getAnalyticsParameters() {
        Bundle bundle = new Bundle();
        bundle.putString("style", this.t.toString());
        bundle.putString("auxiliary_position", this.v.toString());
        bundle.putString("horizontal_alignment", this.u.toString());
        bundle.putString("object_id", f0.f(this.a, ""));
        bundle.putString("object_type", this.b.toString());
        return bundle;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i(String str, ObjectType objectType) {
        if (this.r != null) {
            e6.b(getContext()).e(this.r);
            this.r = null;
        }
        a aVar = this.s;
        if (aVar != null) {
            aVar.b();
            this.s = null;
        }
        this.p = null;
        this.a = str;
        this.b = objectType;
        if (!f0.C(str)) {
            this.s = new a(null);
            if (!isInEditMode()) {
                e.L(str, objectType, this.s);
            }
        }
    }

    private void j() {
        View view;
        e eVar;
        e eVar2;
        HorizontalAlignment horizontalAlignment = HorizontalAlignment.RIGHT;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
        HorizontalAlignment horizontalAlignment2 = this.u;
        int i = horizontalAlignment2 == HorizontalAlignment.LEFT ? 3 : horizontalAlignment2 == HorizontalAlignment.CENTER ? 1 : 5;
        layoutParams.gravity = i | 48;
        layoutParams2.gravity = i;
        this.o.setVisibility(8);
        this.n.setVisibility(8);
        if (this.t == Style.STANDARD && (eVar2 = this.p) != null && !f0.C(eVar2.O())) {
            view = this.o;
        } else if (this.t == Style.BOX_COUNT && (eVar = this.p) != null && !f0.C(eVar.N())) {
            int ordinal = this.v.ordinal();
            if (ordinal == 0) {
                this.n.setCaretPosition(LikeBoxCountView.LikeBoxCountViewCaretPosition.TOP);
            } else if (ordinal == 1) {
                this.n.setCaretPosition(this.u == horizontalAlignment ? LikeBoxCountView.LikeBoxCountViewCaretPosition.RIGHT : LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT);
            } else if (ordinal == 2) {
                this.n.setCaretPosition(LikeBoxCountView.LikeBoxCountViewCaretPosition.BOTTOM);
            }
            view = this.n;
        } else {
            return;
        }
        int i2 = 0;
        view.setVisibility(0);
        ((LinearLayout.LayoutParams) view.getLayoutParams()).gravity = i;
        LinearLayout linearLayout = this.c;
        AuxiliaryViewPosition auxiliaryViewPosition = this.v;
        AuxiliaryViewPosition auxiliaryViewPosition2 = AuxiliaryViewPosition.INLINE;
        if (auxiliaryViewPosition != auxiliaryViewPosition2) {
            i2 = 1;
        }
        linearLayout.setOrientation(i2);
        AuxiliaryViewPosition auxiliaryViewPosition3 = this.v;
        if (auxiliaryViewPosition3 == AuxiliaryViewPosition.TOP || (auxiliaryViewPosition3 == auxiliaryViewPosition2 && this.u == horizontalAlignment)) {
            this.c.removeView(this.f);
            this.c.addView(this.f);
        } else {
            this.c.removeView(view);
            this.c.addView(view);
        }
        int ordinal2 = this.v.ordinal();
        if (ordinal2 == 0) {
            int i3 = this.x;
            view.setPadding(i3, this.y, i3, i3);
        } else if (ordinal2 != 1) {
            if (ordinal2 == 2) {
                int i4 = this.x;
                view.setPadding(i4, i4, i4, this.y);
            }
        } else if (this.u == horizontalAlignment) {
            int i5 = this.x;
            view.setPadding(i5, i5, this.y, i5);
        } else {
            int i6 = this.y;
            int i7 = this.x;
            view.setPadding(i6, i7, i7, i7);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void k() {
        boolean z2 = !this.A;
        e eVar = this.p;
        if (eVar == null) {
            this.f.setSelected(false);
            this.o.setText((CharSequence) null);
            this.n.setText(null);
        } else {
            this.f.setSelected(eVar.Q());
            this.o.setText(this.p.O());
            this.n.setText(this.p.N());
            this.p.getClass();
            z2 &= false;
        }
        super.setEnabled(z2);
        this.f.setEnabled(z2);
        j();
    }

    @Deprecated
    public c getOnErrorListener() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        ObjectType objectType = ObjectType.UNKNOWN;
        String f2 = f0.f(null, null);
        if (!f0.b(f2, this.a) || objectType != this.b) {
            i(f2, objectType);
            k();
        }
        super.onDetachedFromWindow();
    }

    @Deprecated
    public void setAuxiliaryViewPosition(AuxiliaryViewPosition auxiliaryViewPosition) {
        if (auxiliaryViewPosition == null) {
            auxiliaryViewPosition = AuxiliaryViewPosition.BOTTOM;
        }
        if (this.v != auxiliaryViewPosition) {
            this.v = auxiliaryViewPosition;
            j();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setEnabled(boolean z2) {
        this.A = true;
        k();
    }

    @Deprecated
    public void setForegroundColor(int i) {
        if (this.w != i) {
            this.o.setTextColor(i);
        }
    }

    @Deprecated
    public void setFragment(Fragment fragment) {
        this.z = new q(fragment);
    }

    @Deprecated
    public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        if (horizontalAlignment == null) {
            horizontalAlignment = HorizontalAlignment.CENTER;
        }
        if (this.u != horizontalAlignment) {
            this.u = horizontalAlignment;
            j();
        }
    }

    @Deprecated
    public void setLikeViewStyle(Style style) {
        if (style == null) {
            style = Style.STANDARD;
        }
        if (this.t != style) {
            this.t = style;
            j();
        }
    }

    @Deprecated
    public void setOnErrorListener(c cVar) {
        this.q = cVar;
    }

    @Deprecated
    public void setFragment(android.app.Fragment fragment) {
        this.z = new q(fragment);
    }
}
