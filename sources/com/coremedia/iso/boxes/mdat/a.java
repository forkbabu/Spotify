package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.b;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import java.util.AbstractList;
import java.util.List;

public class a extends AbstractList<w30> {
    List<w30> a;

    public a(TrackBox trackBox, ne... neVarArr) {
        b parent = ((com.coremedia.iso.boxes.a) trackBox.getParent()).getParent();
        if (!trackBox.getParent().getBoxes(MovieExtendsBox.class).isEmpty()) {
            this.a = new b40(trackBox.getTrackHeaderBox().getTrackId(), parent, neVarArr);
        } else if (neVarArr.length <= 0) {
            this.a = new z30(trackBox.getTrackHeaderBox().getTrackId(), parent);
        } else {
            throw new RuntimeException("The TrackBox comes from a standard MP4 file. Only use the additionalFragments param if you are dealing with ( fragmented MP4 files AND additional fragments in standalone files )");
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        return this.a.size();
    }
}
