package com.spotify.android.paste.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.spotify.paste.widgets.internal.StateListAnimatorButton;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import com.spotify.paste.widgets.internal.StateListAnimatorImageView;
import com.spotify.paste.widgets.internal.StateListAnimatorRadioButton;
import com.spotify.paste.widgets.internal.StateListAnimatorTextView;
import com.spotify.paste.widgets.internal.StateListAnimatorToggleButton;
import com.spotify.paste.widgets.layouts.PasteConstraintLayout;
import com.spotify.paste.widgets.layouts.PasteFrameLayout;
import com.spotify.paste.widgets.layouts.PasteLinearLayout;
import com.spotify.paste.widgets.layouts.PasteRelativeLayout;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import me.grantland.widget.AutofitTextView;

public final class PasteViewFactories {
    private static final Map<String, ViewFactory> a;
    private static final Map<String, ViewFactory> b;
    private static final Map<Class<? extends View>, ViewFactory> c;

    public enum ViewFactory {
        AUTOCOMPLETETEXTVIEW(AutoCompleteTextView.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new AppCompatAutoCompleteTextView(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return C0707R.attr.pasteDefaultsAutoCompleteTextViewStyle;
            }
        },
        BUTTON(Button.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorButton(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return C0707R.attr.pasteDefaultsButtonStyle;
            }
        },
        IMAGEVIEW(ImageView.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorImageView(context, attributeSet, i);
            }
        },
        IMAGEBUTTON(ImageButton.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorImageButton(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return 16842866;
            }
        },
        TOGGLEBUTTON(ToggleButton.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorToggleButton(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return 16842827;
            }
        },
        CHECKBOX(CheckBox.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new AppCompatCheckBox(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return C0707R.attr.pasteDefaultsCheckboxStyle;
            }
        },
        CHECKEDTEXTVIEW(CheckedTextView.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new AppCompatCheckedTextView(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return C0707R.attr.pasteDefaultsCheckedTextViewStyle;
            }
        },
        EDITTEXT(EditText.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new AppCompatEditText(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return C0707R.attr.pasteDefaultsEditTextStyle;
            }
        },
        RADIOBUTTON(RadioButton.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorRadioButton(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return C0707R.attr.pasteDefaultsRadioButtonStyle;
            }
        },
        TEXTVIEW(TextView.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorTextView(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return C0707R.attr.pasteDefaultsTextStyle;
            }
        },
        SWITCHCOMPAT_VIEW(SwitchCompat.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new SwitchCompat(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return C0707R.attr.pasteDefaultsSwitchStyle;
            }
        },
        AUTOFIT_TEXTVIEW(AutofitTextView.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new AutofitTextView(context, attributeSet, i);
            }

            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public int g() {
                return C0707R.attr.pasteDefaultsTextStyle;
            }
        },
        SPOTIFY_ICON_VIEW(SpotifyIconView.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new SpotifyIconView(context, attributeSet, i);
            }
        },
        LINEAR_LAYOUT(LinearLayout.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new PasteLinearLayout(context, attributeSet, i);
            }
        },
        FRAME_LAYOUT(FrameLayout.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new PasteFrameLayout(context, attributeSet, i);
            }
        },
        RELATIVE_LAYOUT(RelativeLayout.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new PasteRelativeLayout(context, attributeSet, i);
            }
        },
        CONSTRAINT_LAYOUT(ConstraintLayout.class) {
            @Override // com.spotify.android.paste.app.PasteViewFactories.ViewFactory
            public View d(Context context, AttributeSet attributeSet, int i) {
                return new PasteConstraintLayout(context, attributeSet, i);
            }
        };
        
        public static final ViewFactory[] A = values();
        private final Class<? extends View> mName;

        ViewFactory(Class cls, a aVar) {
            this.mName = cls;
        }

        public abstract View d(Context context, AttributeSet attributeSet, int i);

        public int g() {
            return 0;
        }

        public Class<? extends View> h() {
            return this.mName;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ViewFactory[] viewFactoryArr = ViewFactory.A;
        for (ViewFactory viewFactory : viewFactoryArr) {
            hashMap3.put(viewFactory.h(), viewFactory);
            hashMap.put(viewFactory.h().getSimpleName(), viewFactory);
            hashMap2.put(viewFactory.h().getName(), viewFactory);
        }
        c = Collections.unmodifiableMap(hashMap3);
        b = Collections.unmodifiableMap(hashMap2);
        a = Collections.unmodifiableMap(hashMap);
    }

    public static ViewFactory a(Class<? extends View> cls) {
        return c.get(cls);
    }

    public static ViewFactory b(String str) {
        ViewFactory viewFactory = b.get(str);
        return viewFactory == null ? a.get(str) : viewFactory;
    }
}
