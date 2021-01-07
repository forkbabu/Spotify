package defpackage;

import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.v;
import java.util.List;

/* renamed from: zo  reason: default package */
public final class zo extends b {
    private final ap n;

    public zo(List<byte[]> list) {
        super("DvbDecoder");
        v vVar = new v(list.get(0));
        this.n = new ap(vVar.D(), vVar.D());
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.text.b
    public d o(byte[] bArr, int i, boolean z) {
        if (z) {
            this.n.i();
        }
        return new bp(this.n.b(bArr, i));
    }
}
