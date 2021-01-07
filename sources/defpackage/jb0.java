package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.EmptyView;

@Deprecated
/* renamed from: jb0  reason: default package */
public final class jb0 {
    public gb0 a(Context context, ViewGroup viewGroup) {
        qb0 qb0 = new qb0(new EmptyView(context, null));
        if (viewGroup != null) {
            View view = qb0.getView();
            XmlResourceParser layout = context.getResources().getLayout(C0707R.layout.paste_match_parent_width_and_height);
            while (layout.nextToken() != 2) {
                try {
                } catch (Exception e) {
                    throw new AssertionError(e);
                }
            }
            view.setLayoutParams(viewGroup.generateLayoutParams(layout));
        }
        qb0.getView().setTag(C0707R.id.glue_viewholder_tag, qb0);
        return qb0;
    }

    public gb0 b(ViewStub viewStub) {
        viewStub.setLayoutResource(C0707R.layout.paste_legacy_empty_view);
        qb0 qb0 = new qb0((EmptyView) viewStub.inflate());
        qb0.getView().setTag(C0707R.id.glue_viewholder_tag, qb0);
        return qb0;
    }
}
