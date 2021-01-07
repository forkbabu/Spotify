package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.h0;
import com.spotify.music.C0707R;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    private i a;
    private ImageView b;
    private RadioButton c;
    private TextView f;
    private CheckBox n;
    private TextView o;
    private ImageView p;
    private ImageView q;
    private LinearLayout r;
    private Drawable s;
    private int t;
    private Context u;
    private boolean v;
    private Drawable w;
    private boolean x;
    private LayoutInflater y;
    private boolean z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.listMenuViewStyle);
    }

    private void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C0707R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.n = checkBox;
        LinearLayout linearLayout = this.r;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    private void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C0707R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.c = radioButton;
        LinearLayout linearLayout = this.r;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    private LayoutInflater getInflater() {
        if (this.y == null) {
            this.y = LayoutInflater.from(getContext());
        }
        return this.y;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.q;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.q.getLayoutParams();
            rect.top = this.q.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public void c(boolean z2) {
        int i = (!z2 || !this.a.v()) ? 8 : 0;
        if (i == 0) {
            this.o.setText(this.a.g());
        }
        if (this.o.getVisibility() != i) {
            this.o.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i) {
        this.a = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.h(this));
        setCheckable(iVar.isCheckable());
        boolean v2 = iVar.v();
        iVar.f();
        c(v2);
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean h() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.s;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(C0707R.id.title);
        this.f = textView;
        int i3 = this.t;
        if (i3 != -1) {
            textView.setTextAppearance(this.u, i3);
        }
        this.o = (TextView) findViewById(C0707R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(C0707R.id.submenuarrow);
        this.p = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.w);
        }
        this.q = (ImageView) findViewById(C0707R.id.group_divider);
        this.r = (LinearLayout) findViewById(C0707R.id.content);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.b != null && this.v) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z2 || this.c != null || this.n != null) {
            if (this.a.l()) {
                if (this.c == null) {
                    b();
                }
                compoundButton2 = this.c;
                compoundButton = this.n;
            } else {
                if (this.n == null) {
                    a();
                }
                compoundButton2 = this.n;
                compoundButton = this.c;
            }
            if (z2) {
                compoundButton2.setChecked(this.a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.n;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.a.l()) {
            if (this.c == null) {
                b();
            }
            compoundButton = this.c;
        } else {
            if (this.n == null) {
                a();
            }
            compoundButton = this.n;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.z = z2;
        this.v = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.q;
        if (imageView != null) {
            imageView.setVisibility((this.x || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.a.n.getClass();
        boolean z2 = this.z;
        if (z2 || this.v) {
            ImageView imageView = this.b;
            if (imageView != null || drawable != null || this.v) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(C0707R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.b = imageView2;
                    LinearLayout linearLayout = this.r;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.v) {
                    ImageView imageView3 = this.b;
                    if (!z2) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.b.getVisibility() != 0) {
                        this.b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f.setText(charSequence);
            if (this.f.getVisibility() != 0) {
                this.f.setVisibility(0);
            }
        } else if (this.f.getVisibility() != 8) {
            this.f.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        h0 v2 = h0.v(getContext(), attributeSet, h0.s, i, 0);
        this.s = v2.g(5);
        this.t = v2.n(1, -1);
        this.v = v2.a(7, false);
        this.u = context;
        this.w = v2.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0707R.attr.dropDownListViewStyle, 0);
        this.x = obtainStyledAttributes.hasValue(0);
        v2.w();
        obtainStyledAttributes.recycle();
    }
}
