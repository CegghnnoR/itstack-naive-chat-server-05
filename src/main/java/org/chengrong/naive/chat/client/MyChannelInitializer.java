package org.chengrong.naive.chat.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import org.chengrong.naive.chat.codec.ObjDecoder;
import org.chengrong.naive.chat.codec.ObjEncoder;
import org.chengrong.naive.chat.domain.MsgInfo;

public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        // 对象传输处理
        ch.pipeline().addLast(new ObjDecoder(MsgInfo.class));
        ch.pipeline().addLast(new ObjEncoder(MsgInfo.class));
        // 在管道中添加自定义的接收数据实现方法
        ch.pipeline().addLast(new MyClientHandler());
    }
}
