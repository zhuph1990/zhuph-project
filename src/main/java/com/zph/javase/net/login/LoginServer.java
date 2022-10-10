package com.zph.javase.net.login;


import java.net.ServerSocket;
import java.net.Socket;


public class LoginServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(10000);
        while (true) {
            Socket socket = serverSocket.accept();
            LoginThread loginThread = new LoginThread(socket);
            new Thread(loginThread).start();
        }
//        serverSocket.close();
    }
}
