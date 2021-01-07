package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ListFragment extends Fragment {
    private final Handler g0 = new Handler();
    private final Runnable h0 = new a();
    private final AdapterView.OnItemClickListener i0 = new b();
    ListAdapter j0;
    ListView k0;
    View l0;
    TextView m0;
    View n0;
    View o0;
    boolean p0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.k0;
            listView.focusableViewAvailable(listView);
        }
    }

    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ListFragment.this.M4((ListView) adapterView, view, i, j);
        }
    }

    private void K4() {
        if (this.k0 == null) {
            View view = this.P;
            if (view != null) {
                if (view instanceof ListView) {
                    this.k0 = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.m0 = textView;
                    if (textView == null) {
                        this.l0 = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.n0 = view.findViewById(16711682);
                    this.o0 = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.k0 = listView;
                        View view2 = this.l0;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.p0 = true;
                this.k0.setOnItemClickListener(this.i0);
                ListAdapter listAdapter = this.j0;
                if (listAdapter != null) {
                    this.j0 = null;
                    N4(listAdapter);
                } else if (this.n0 != null) {
                    O4(false, false);
                }
                this.g0.post(this.h0);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    private void O4(boolean z, boolean z2) {
        K4();
        View view = this.n0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.p0 != z) {
            this.p0 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(F2(), 17432577));
                    this.o0.startAnimation(AnimationUtils.loadAnimation(F2(), 17432576));
                } else {
                    view.clearAnimation();
                    this.o0.clearAnimation();
                }
                this.n0.setVisibility(8);
                this.o0.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(F2(), 17432576));
                this.o0.startAnimation(AnimationUtils.loadAnimation(F2(), 17432577));
            } else {
                view.clearAnimation();
                this.o0.clearAnimation();
            }
            this.n0.setVisibility(0);
            this.o0.setVisibility(8);
        }
    }

    public ListView L4() {
        K4();
        return this.k0;
    }

    public void M4(ListView listView, View view, int i, long j) {
    }

    public void N4(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.j0 != null;
        this.j0 = listAdapter;
        ListView listView = this.k0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.p0 && !z2) {
                if (m4().getWindowToken() != null) {
                    z = true;
                }
                O4(true, z);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        K4();
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context l4 = l4();
        FrameLayout frameLayout = new FrameLayout(l4);
        LinearLayout linearLayout = new LinearLayout(l4);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(l4, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(l4);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(l4);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(l4);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        this.g0.removeCallbacks(this.h0);
        this.k0 = null;
        this.p0 = false;
        this.o0 = null;
        this.n0 = null;
        this.l0 = null;
        this.m0 = null;
        super.y3();
    }
}
