package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements r0 {
    static final n z0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    private final View A;
    private final View B;
    final ImageView C;
    final ImageView D;
    final ImageView E;
    final ImageView F;
    private final View G;
    private p H;
    private Rect I;
    private Rect J;
    private int[] K;
    private int[] L;
    private final ImageView M;
    private final Drawable N;
    private final int O;
    private final int P;
    private final Intent Q;
    private final Intent R;
    private final CharSequence S;
    private l T;
    private k U;
    View.OnFocusChangeListener V;
    private m W;
    private View.OnClickListener a0;
    private boolean b0;
    private boolean c0;
    i5 d0;
    private boolean e0;
    private CharSequence f0;
    private boolean g0;
    private boolean h0;
    private int i0;
    private boolean j0;
    private CharSequence k0;
    private CharSequence l0;
    private boolean m0;
    private int n0;
    SearchableInfo o0;
    private Bundle p0;
    private final Runnable q0;
    private Runnable r0;
    private final WeakHashMap<String, Drawable.ConstantState> s0;
    private final View.OnClickListener t0;
    View.OnKeyListener u0;
    private final TextView.OnEditorActionListener v0;
    private final AdapterView.OnItemClickListener w0;
    private final AdapterView.OnItemSelectedListener x0;
    final SearchAutoComplete y;
    private TextWatcher y0;
    private final View z;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        private int f;
        private SearchView n;
        private boolean o;
        final Runnable p;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0707R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.z0.c(this);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.o) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.o = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.o) {
                removeCallbacks(this.p);
                post(this.p);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.n.F();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.n.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.n.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.o = true;
                Context context = getContext();
                n nVar = SearchView.z0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.o = false;
                removeCallbacks(this.p);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.o = false;
                removeCallbacks(this.p);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.o = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.n = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.p = new a();
            this.f = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.E(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.I();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i5 i5Var = SearchView.this.d0;
            if (i5Var instanceof b0) {
                i5Var.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.V;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.s();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.C) {
                searchView.B();
            } else if (view == searchView.E) {
                searchView.x();
            } else if (view == searchView.D) {
                searchView.C();
            } else if (view == searchView.F) {
                searchView.G();
            } else if (view == searchView.y) {
                searchView.v();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.o0 == null) {
                return false;
            }
            if (searchView.y.isPopupShowing() && SearchView.this.y.getListSelection() != -1) {
                return SearchView.this.D(i, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.y.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.w(0, null, searchView2.y.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.C();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.y(i);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.z(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean onClose();
    }

    public interface l {
        boolean a(String str);
    }

    public interface m {
        boolean a(int i);

        boolean b(int i);
    }

    /* access modifiers changed from: private */
    public static class n {
        private Method a = null;
        private Method b = null;
        private Method c = null;

        n() {
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class o extends l5 {
        public static final Parcelable.Creator<o> CREATOR = new a();
        boolean c;

        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new o[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("SearchView.SavedState{");
            V0.append(Integer.toHexString(System.identityHashCode(this)));
            V0.append(" isIconified=");
            return je.P0(V0, this.c, "}");
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.c));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class p extends TouchDelegate {
        private final View a;
        private final Rect b = new Rect();
        private final Rect c = new Rect();
        private final Rect d = new Rect();
        private final int e;
        private boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // android.view.TouchDelegate
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f
                r7.f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private void H() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.y.getText());
        int i2 = 0;
        if (!z3 && (!this.b0 || this.m0)) {
            z2 = false;
        }
        ImageView imageView = this.E;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.E.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void J() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.y;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.b0 && this.N != null) {
            double textSize = (double) searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i2 = (int) (textSize * 1.25d);
            this.N.setBounds(0, 0, i2, i2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.N), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    private void K() {
        int i2 = 0;
        if (!((this.e0 || this.j0) && !this.c0) || !(this.D.getVisibility() == 0 || this.F.getVisibility() == 0)) {
            i2 = 8;
        }
        this.B.setVisibility(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.j0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void L(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.e0
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.j0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.c0
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.j0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.D
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.L(boolean):void");
    }

    private void M(boolean z2) {
        this.c0 = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.y.getText());
        this.C.setVisibility(i3);
        L(z3);
        this.z.setVisibility(z2 ? 8 : 0);
        if (this.M.getDrawable() == null || this.b0) {
            i2 = 8;
        }
        this.M.setVisibility(i2);
        H();
        N(!z3);
        K();
    }

    private void N(boolean z2) {
        int i2 = 8;
        if (this.j0 && !this.c0 && z2) {
            this.D.setVisibility(8);
            i2 = 0;
        }
        this.F.setVisibility(i2);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0707R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0707R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.y.setText(charSequence);
        this.y.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent t(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.l0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.p0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.o0.getSearchActivity());
        return intent;
    }

    private Intent u(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.p0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* access modifiers changed from: package-private */
    public void A(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void B() {
        M(false);
        this.y.requestFocus();
        this.y.setImeVisibility(true);
        View.OnClickListener onClickListener = this.a0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        Editable text = this.y.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.T != null) {
                text.toString();
            }
            if (this.o0 != null) {
                w(0, null, text.toString());
            }
            this.y.setImeVisibility(false);
            this.y.dismissDropDown();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean D(int i2, KeyEvent keyEvent) {
        int i3;
        if (this.o0 != null && this.d0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return y(this.y.getListSelection());
            }
            if (i2 == 21 || i2 == 22) {
                if (i2 == 21) {
                    i3 = 0;
                } else {
                    i3 = this.y.length();
                }
                this.y.setSelection(i3);
                this.y.setListSelection(0);
                this.y.clearListSelection();
                this.y.a();
                return true;
            } else if (i2 != 19 || this.y.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void E(CharSequence charSequence) {
        Editable text = this.y.getText();
        this.l0 = text;
        boolean z2 = !TextUtils.isEmpty(text);
        L(z2);
        N(!z2);
        H();
        K();
        if (this.T != null && !TextUtils.equals(charSequence, this.k0)) {
            this.T.a(charSequence.toString());
        }
        this.k0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void F() {
        M(this.c0);
        post(this.q0);
        if (this.y.hasFocus()) {
            v();
        }
    }

    /* access modifiers changed from: package-private */
    public void G() {
        String str;
        SearchableInfo searchableInfo = this.o0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    Intent intent = new Intent(this.Q);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    if (searchActivity == null) {
                        str = null;
                    } else {
                        str = searchActivity.flattenToShortString();
                    }
                    intent.putExtra("calling_package", str);
                    getContext().startActivity(intent);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(u(this.R, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void I() {
        int[] iArr = this.y.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.A.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.B.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // defpackage.r0
    public void b() {
        if (!this.m0) {
            this.m0 = true;
            int imeOptions = this.y.getImeOptions();
            this.n0 = imeOptions;
            this.y.setImeOptions(imeOptions | 33554432);
            this.y.setText("");
            setIconified(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.h0 = true;
        super.clearFocus();
        this.y.clearFocus();
        this.y.setImeVisibility(false);
        this.h0 = false;
    }

    @Override // defpackage.r0
    public void f() {
        this.y.setText("");
        SearchAutoComplete searchAutoComplete = this.y;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.l0 = "";
        clearFocus();
        M(true);
        this.y.setImeOptions(this.n0);
        this.m0 = false;
    }

    public int getImeOptions() {
        return this.y.getImeOptions();
    }

    public int getInputType() {
        return this.y.getInputType();
    }

    public int getMaxWidth() {
        return this.i0;
    }

    public CharSequence getQuery() {
        return this.y.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.o0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.S;
        }
        return getContext().getText(this.o0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.P;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.O;
    }

    public i5 getSuggestionsAdapter() {
        return this.d0;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.q0);
        post(this.r0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.y;
            Rect rect = this.I;
            searchAutoComplete.getLocationInWindow(this.K);
            getLocationInWindow(this.L);
            int[] iArr = this.K;
            int i6 = iArr[1];
            int[] iArr2 = this.L;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.J;
            Rect rect3 = this.I;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            p pVar = this.H;
            if (pVar == null) {
                p pVar2 = new p(this.J, this.I, this.y);
                this.H = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.J, this.I);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.c0) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.i0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.i0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.i0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        M(oVar.c);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.c = this.c0;
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.q0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.h0 || !isFocusable()) {
            return false;
        }
        if (this.c0) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.y.requestFocus(i2, rect);
        if (requestFocus) {
            M(false);
        }
        return requestFocus;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        int i2;
        int i3;
        if (this.G.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.A.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = o0.b(this);
            if (this.b0) {
                i2 = resources.getDimensionPixelSize(C0707R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C0707R.dimen.abc_dropdownitem_icon_width);
            } else {
                i2 = 0;
            }
            this.y.getDropDownBackground().getPadding(rect);
            if (b2) {
                i3 = -rect.left;
            } else {
                i3 = paddingLeft - (rect.left + i2);
            }
            this.y.setDropDownHorizontalOffset(i3);
            this.y.setDropDownWidth((((this.G.getWidth() + rect.left) + rect.right) + i2) - paddingLeft);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.p0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            x();
        } else {
            B();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.b0 != z2) {
            this.b0 = z2;
            M(z2);
            J();
        }
    }

    public void setImeOptions(int i2) {
        this.y.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.y.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.i0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.U = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.V = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.T = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.a0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.W = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f0 = charSequence;
        J();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.g0 = z2;
        i5 i5Var = this.d0;
        if (i5Var instanceof b0) {
            ((b0) i5Var).m(z2 ? 2 : 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.o0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006f
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.y
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.y
            android.app.SearchableInfo r3 = r6.o0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.o0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.o0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.y
            r3.setInputType(r7)
            i5 r7 = r6.d0
            if (r7 == 0) goto L_0x0042
            r7.a(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.o0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006c
            androidx.appcompat.widget.b0 r7 = new androidx.appcompat.widget.b0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.o0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.s0
            r7.<init>(r3, r6, r4, r5)
            r6.d0 = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.y
            r3.setAdapter(r7)
            i5 r7 = r6.d0
            androidx.appcompat.widget.b0 r7 = (androidx.appcompat.widget.b0) r7
            boolean r3 = r6.g0
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            r7.m(r3)
        L_0x006c:
            r6.J()
        L_0x006f:
            android.app.SearchableInfo r7 = r6.o0
            r3 = 0
            if (r7 == 0) goto L_0x00a0
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x00a0
            android.app.SearchableInfo r7 = r6.o0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0085
            android.content.Intent r2 = r6.Q
            goto L_0x008f
        L_0x0085:
            android.app.SearchableInfo r7 = r6.o0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008f
            android.content.Intent r2 = r6.R
        L_0x008f:
            if (r2 == 0) goto L_0x00a0
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r6.j0 = r0
            if (r0 == 0) goto L_0x00ac
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.y
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ac:
            boolean r7 = r6.c0
            r6.M(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.e0 = z2;
        M(this.c0);
    }

    public void setSuggestionsAdapter(i5 i5Var) {
        this.d0 = i5Var;
        this.y.setAdapter(i5Var);
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.y.refreshAutoCompleteResults();
            return;
        }
        n nVar = z0;
        nVar.b(this.y);
        nVar.a(this.y);
    }

    /* access modifiers changed from: package-private */
    public void w(int i2, String str, String str2) {
        getContext().startActivity(t("android.intent.action.SEARCH", null, null, str2, i2, null));
    }

    /* access modifiers changed from: package-private */
    public void x() {
        if (!TextUtils.isEmpty(this.y.getText())) {
            this.y.setText("");
            this.y.requestFocus();
            this.y.setImeVisibility(true);
        } else if (this.b0) {
            k kVar = this.U;
            if (kVar == null || !kVar.onClose()) {
                clearFocus();
                M(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean y(int i2) {
        Uri uri;
        String h2;
        m mVar = this.W;
        if (mVar != null && mVar.b(i2)) {
            return false;
        }
        Cursor e2 = this.d0.e();
        if (e2 != null && e2.moveToPosition(i2)) {
            Intent intent = null;
            try {
                String h3 = b0.h(e2, "suggest_intent_action");
                if (h3 == null) {
                    h3 = this.o0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String h4 = b0.h(e2, "suggest_intent_data");
                if (h4 == null) {
                    h4 = this.o0.getSuggestIntentData();
                }
                if (!(h4 == null || (h2 = b0.h(e2, "suggest_intent_data_id")) == null)) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                if (h4 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(h4);
                }
                intent = t(h3, uri, b0.h(e2, "suggest_intent_extra_data"), b0.h(e2, "suggest_intent_query"), 0, null);
            } catch (RuntimeException unused) {
                try {
                    e2.getPosition();
                } catch (RuntimeException unused2) {
                }
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        this.y.setImeVisibility(false);
        this.y.dismissDropDown();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean z(int i2) {
        m mVar = this.W;
        if (mVar != null && mVar.a(i2)) {
            return false;
        }
        Editable text = this.y.getText();
        Cursor e2 = this.d0.e();
        if (e2 == null) {
            return true;
        }
        if (e2.moveToPosition(i2)) {
            CharSequence b2 = this.d0.b(e2);
            if (b2 != null) {
                setQuery(b2);
                return true;
            }
            setQuery(text);
            return true;
        }
        setQuery(text);
        return true;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.I = new Rect();
        this.J = new Rect();
        this.K = new int[2];
        this.L = new int[2];
        this.q0 = new b();
        this.r0 = new c();
        this.s0 = new WeakHashMap<>();
        f fVar = new f();
        this.t0 = fVar;
        this.u0 = new g();
        h hVar = new h();
        this.v0 = hVar;
        i iVar = new i();
        this.w0 = iVar;
        j jVar = new j();
        this.x0 = jVar;
        this.y0 = new a();
        h0 v = h0.v(context, attributeSet, h0.v, i2, 0);
        LayoutInflater.from(context).inflate(v.n(9, C0707R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0707R.id.search_src_text);
        this.y = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.z = findViewById(C0707R.id.search_edit_frame);
        View findViewById = findViewById(C0707R.id.search_plate);
        this.A = findViewById;
        View findViewById2 = findViewById(C0707R.id.submit_area);
        this.B = findViewById2;
        ImageView imageView = (ImageView) findViewById(C0707R.id.search_button);
        this.C = imageView;
        ImageView imageView2 = (ImageView) findViewById(C0707R.id.search_go_btn);
        this.D = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C0707R.id.search_close_btn);
        this.E = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C0707R.id.search_voice_btn);
        this.F = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C0707R.id.search_mag_icon);
        this.M = imageView5;
        Drawable g2 = v.g(10);
        int i3 = q4.g;
        int i4 = Build.VERSION.SDK_INT;
        findViewById.setBackground(g2);
        findViewById2.setBackground(v.g(14));
        imageView.setImageDrawable(v.g(13));
        imageView2.setImageDrawable(v.g(7));
        imageView3.setImageDrawable(v.g(4));
        imageView4.setImageDrawable(v.g(16));
        imageView5.setImageDrawable(v.g(13));
        this.N = v.g(12);
        k0.b(imageView, getResources().getString(C0707R.string.abc_searchview_description_search));
        this.O = v.n(15, C0707R.layout.abc_search_dropdown_item_icons_2line);
        this.P = v.n(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.y0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.u0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v.a(8, true));
        int f2 = v.f(1, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.S = v.p(6);
        this.f0 = v.p(11);
        int k2 = v.k(3, -1);
        if (k2 != -1) {
            setImeOptions(k2);
        }
        int k3 = v.k(2, -1);
        if (k3 != -1) {
            setInputType(k3);
        }
        setFocusable(v.a(0, true));
        v.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.Q = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.R = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.G = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        M(this.b0);
        J();
    }
}
