package com.captain.demo.socketFile;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �ļ����ͷ�������
 */
public class SocketFileServer {

    //Ĭ��Ҫ�����ļ����ļ���·��
    public final static String PATH = "D:\\study\\s";

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(1000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(serverSocket==null){
            System.out.println("����������ʧ��");
            return;
        }
        System.out.println("������������");
        while(true){
            try {
                System.out.println("�ȴ��ͻ�������... ...");
                Socket socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                new Thread(serverThread).start();
            } catch (IOException e) {
                System.out.println("�������򿪿ͻ���ʧ��");
                e.printStackTrace();
            }
        }
    }

}

