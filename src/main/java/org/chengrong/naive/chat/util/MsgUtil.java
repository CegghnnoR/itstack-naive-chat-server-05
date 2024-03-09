package org.chengrong.naive.chat.util;

import org.chengrong.naive.chat.domain.MsgInfo;

public class MsgUtil {
    public static MsgInfo buildMsg(String channelId, String msgContent) {
        return new MsgInfo(channelId, msgContent);
    }
}
