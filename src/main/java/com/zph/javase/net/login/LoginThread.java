package com.zph.javase.net.login;

import com.zph.javase.net.client.User;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;


public class LoginThread implements Runnable {

    private Socket socket;

    public LoginThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            User user = (User) objectInputStream.readObject();
            String str = "";
            if ("messi".equals(user.getUsername()) && "football".equals(user.getPassword())) {
                System.out.println("欢迎你：" + user.getUsername());
                str = "登录成功";
            } else {
                str = "登录失败";
            }
            socket.shutdownInput();
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(str);
            socket.shutdownOutput();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
                objectInputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
