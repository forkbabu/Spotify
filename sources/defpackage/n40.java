package defpackage;

import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

@l40(tags = {19, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, R.styleable.AppCompatTheme_windowNoTitle, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, ContentType.BUMPER, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, AdvertisementType.ON_DEMAND_PRE_ROLL, AdvertisementType.ON_DEMAND_MID_ROLL, AdvertisementType.ON_DEMAND_POST_ROLL, 214, 215, 216, 217, 218, 219, 220, AdvertisementType.LIVE, 222, 223, 224, 225, 226, 227, 228, 229, 230, AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, AdvertisementType.BRANDED_AS_CONTENT, AdvertisementType.BRANDED_DURING_LIVE, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253})
/* renamed from: n40  reason: default package */
public class n40 extends g40 {
    ByteBuffer d;

    static {
        Logger.getLogger(n40.class.getName());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.g40
    public int a() {
        return this.d.remaining();
    }

    @Override // defpackage.g40
    public void e(ByteBuffer byteBuffer) {
        this.d = byteBuffer.slice();
        byteBuffer.position(this.d.remaining() + byteBuffer.position());
    }

    @Override // defpackage.g40
    public String toString() {
        StringBuilder Z0 = je.Z0("ExtensionDescriptor", "tag=");
        Z0.append(this.a);
        Z0.append(",bytes=");
        Z0.append(me.a(this.d.array()));
        Z0.append('}');
        return Z0.toString();
    }
}
