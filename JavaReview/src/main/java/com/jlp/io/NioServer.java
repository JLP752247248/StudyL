package com.jlp.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class NioServer {
    public static void main(String[] args) {
        try(ServerSocketChannel serverSocketChannel=ServerSocketChannel.open()) {
            ServerSocket serverSocket=serverSocketChannel.socket();
            Selector selector =Selector.open();

            serverSocketChannel.configureBlocking(false);
            serverSocket.bind(new InetSocketAddress(9999));

            while(selector.select()>0){

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
