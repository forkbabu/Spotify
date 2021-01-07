package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.model.Ad;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

class b0 extends k5 implements View.OnClickListener {
    private ColorStateList A;
    private int B = -1;
    private int C = -1;
    private int D = -1;
    private int E = -1;
    private int F = -1;
    private int G = -1;
    private final SearchView u;
    private final SearchableInfo v;
    private final Context w;
    private final WeakHashMap<String, Drawable.ConstantState> x;
    private final int y;
    private int z = 1;

    /* access modifiers changed from: private */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(C0707R.id.edit_query);
        }
    }

    public b0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.u = searchView;
        this.v = searchableInfo;
        this.y = searchView.getSuggestionCommitIconResId();
        this.w = context;
        this.x = weakHashMap;
    }

    public static String h(Cursor cursor, String str) {
        return l(cursor, cursor.getColumnIndex(str));
    }

    private Drawable j(String str) {
        Drawable drawable;
        Uri parse;
        InputStream openInputStream;
        Drawable drawable2;
        Drawable drawable3 = null;
        if (str != null && !str.isEmpty() && !Ad.DEFAULT_SKIPPABLE_AD_DELAY.equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + this.w.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = this.x.get(str2);
                if (constantState == null) {
                    drawable2 = null;
                } else {
                    drawable2 = constantState.newDrawable();
                }
                if (drawable2 != null) {
                    return drawable2;
                }
                Drawable d = androidx.core.content.a.d(this.w, parseInt);
                if (d != null) {
                    this.x.put(str2, d.getConstantState());
                }
                return d;
            } catch (NumberFormatException unused) {
                Drawable.ConstantState constantState2 = this.x.get(str);
                if (constantState2 == null) {
                    drawable = null;
                } else {
                    drawable = constantState2.newDrawable();
                }
                if (drawable != null) {
                    return drawable;
                }
                parse = Uri.parse(str);
                try {
                    if ("android.resource".equals(parse.getScheme())) {
                        try {
                            drawable3 = i(parse);
                        } catch (Resources.NotFoundException unused2) {
                            throw new FileNotFoundException("Resource does not exist: " + parse);
                        }
                    } else {
                        openInputStream = this.w.getContentResolver().openInputStream(parse);
                        if (openInputStream != null) {
                            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                            try {
                                openInputStream.close();
                            } catch (IOException e) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e);
                            }
                            drawable3 = createFromStream;
                        } else {
                            throw new FileNotFoundException("Failed to open " + parse);
                        }
                    }
                } catch (FileNotFoundException e2) {
                    String str3 = "Icon not found: " + parse + ", " + e2.getMessage();
                }
                if (drawable3 != null) {
                    this.x.put(str, drawable3.getConstantState());
                }
            } catch (Resources.NotFoundException unused3) {
                return null;
            } catch (Throwable th) {
                try {
                    openInputStream.close();
                } catch (IOException e3) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e3);
                }
                throw th;
            }
        }
        return drawable3;
    }

    private static String l(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private void n(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // defpackage.i5, defpackage.j5.a
    public void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.B = cursor.getColumnIndex("suggest_text_1");
                this.C = cursor.getColumnIndex("suggest_text_2");
                this.D = cursor.getColumnIndex("suggest_text_2_url");
                this.E = cursor.getColumnIndex("suggest_icon_1");
                this.F = cursor.getColumnIndex("suggest_icon_2");
                this.G = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // defpackage.i5, defpackage.j5.a
    public CharSequence b(Cursor cursor) {
        String l;
        String l2;
        if (cursor == null) {
            return null;
        }
        String l3 = l(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (l3 != null) {
            return l3;
        }
        if (this.v.shouldRewriteQueryFromData() && (l2 = l(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return l2;
        }
        if (!this.v.shouldRewriteQueryFromText() || (l = l(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return l;
    }

    @Override // defpackage.j5.a
    public Cursor c(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.u.getVisibility() == 0 && this.u.getWindowVisibility() == 0) {
            try {
                Cursor k = k(this.v, charSequence2, 50);
                if (k != null) {
                    k.getCount();
                    return k;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012e  */
    @Override // defpackage.i5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.view.View r19, android.content.Context r20, android.database.Cursor r21) {
        /*
        // Method dump skipped, instructions count: 419
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.d(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // defpackage.k5, defpackage.i5
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View g = super.g(context, cursor, viewGroup);
        g.setTag(new a(g));
        ((ImageView) g.findViewById(C0707R.id.edit_query)).setImageResource(this.y);
        return g;
    }

    @Override // defpackage.i5, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View f = f(this.f, this.c, viewGroup);
            if (f != null) {
                ((a) f.getTag()).a.setText(e.toString());
            }
            return f;
        }
    }

    @Override // defpackage.i5, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View g = g(this.f, this.c, viewGroup);
            ((a) g.getTag()).a.setText(e.toString());
            return g;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public Drawable i(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    public Cursor k(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    public void m(int i) {
        this.z = i;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        n(e());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        n(e());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.u.A((CharSequence) tag);
        }
    }
}
