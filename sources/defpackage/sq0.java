package defpackage;

import com.spotify.libs.callingcode.json.CallingCode;
import io.reactivex.functions.l;
import java.util.HashMap;
import java.util.List;

/* renamed from: sq0  reason: default package */
public final /* synthetic */ class sq0 implements l {
    public static final /* synthetic */ sq0 a = new sq0();

    private /* synthetic */ sq0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List<CallingCode> list = (List) obj;
        HashMap hashMap = new HashMap(list.size());
        for (CallingCode callingCode : list) {
            hashMap.put(callingCode.b(), callingCode);
        }
        return hashMap;
    }
}
